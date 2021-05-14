import Files.payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfCourses(){

        int sum=0;
        JsonPath js=new JsonPath(payload.courses());
        int count=js.getInt("courses.size()");
        int totalAmount=js.getInt("dashboard.purchaseAmount");
        System.out.println("totalAmount = " + totalAmount);

        for(int i=0 ; i<count ; i++){

           int price =js.getInt("courses["+i+"].price");
           int copies =js.getInt("courses["+i+"].copies");
             int amount =price*copies;
            System.out.println("SumValidation.sumOfCourses");
            System.out.println("amount = " + amount);
            sum=sum+amount;
        }
        System.out.println("sum = " + sum);
        Assert.assertEquals(sum,totalAmount);


    }
}
