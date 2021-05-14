import Files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {


    public static void main(String[] args) {
        JsonPath js = new JsonPath(payload.courses());

        //Print No of Courses Returned by the API
        int count = js.getInt("courses.size()");
        System.out.println(count);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        //Print Purchase Amount

        int totalAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmount);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        //Print Title of First Course
//        String titleFirstCourse=js.get("courses.title[2]"); // Just use GET method to get details returned in String
        String titleFirstCourse2 = js.get("courses[1].title"); // Just use GET method to get details returned in String
        System.out.println(titleFirstCourse2 + "  " + titleFirstCourse2);
//        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        //Print All Courses and their Respective Prices
//        String courseName[];
        int coursePrice[];
        int coursesize = js.getInt("courses.size()");
        for (int i = 0; i < coursesize; i++) {

            System.out.println("Coursename of [" + i + "] is" + js.getString("courses[" + i + "].title"));
            System.out.println("Coursename of [" + i + "] is" + js.getString("courses[" + i + "].price"));
            System.out.println("CoursePrice of [" + i + "] is" + js.getString("courses[0].price"));

            String courseTitle = js.get("courses[" + i + "].title");
            int coursePrices = js.getInt("courses[" + i + "].price");
            System.out.println(courseTitle);
            System.out.println(coursePrices);
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
        }

        //Print no of Copies sold by any one of the course . Ex> RPA
        System.out.println("Copies sold by Cypress");
        for (int i = 0; i < coursesize; i++) {
            String courseTitles = js.get("courses[" + i + "].title");
            if (courseTitles.equalsIgnoreCase("Cypress")) {

                //copies sold
                int courseCopies = js.getInt("courses[" + i + "].copies");
                System.out.println(courseCopies);
                break;
            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        //Getting the Total amount = Number of Copies * Price of each
        for (int j = 0; j < coursesize; j++) {
            String courseTitles = js.get("courses[" + j + "].title");
            if (courseTitles.equalsIgnoreCase("Appium")) {

                //copies sold
                int courseCopies = js.getInt("courses[" + j + "].copies");
                System.out.println(courseCopies);
                break;
            }
        }
    }
}
