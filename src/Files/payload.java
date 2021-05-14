package Files;

public class payload {

    public static String AddPlace(){
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.483494,\n" +
                "    \"lng\": 34.427362\n" +
                "  },\n" +
                "  \"accuracy\": 45,\n" +
                "  \"name\": \"Demo ABC house\",\n" +
                "  \"phone_number\": \"(+91) 000 456 7890\",\n" +
                "  \"address\": \"Testing address 1000\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://rahulshettyacademy.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";

    }

    public static String courses(){

        return "{\r\n" +
        "  \"dashboard\": {\r\n" +
                "    \"purchaseAmount\": 4267,\r\n" +
                "    \"website\": \"rahulshettyacademy.com\"\r\n" +
                "  },\r\n" +
                "  \"courses\": [\r\n" +
                "    {\r\n" +
                "      \"title\": \"Selenium Python\",\r\n" +
                "      \"price\": 50,\r\n" +
                "      \"copies\": 6\r\n" +
                "    },\r\n" +
                "    {\r\n" +
                "      \"title\": \"Cypress\",\r\n" +
                "      \"price\": 40,\r\n" +
                "      \"copies\": 4\r\n" +
                "    },\r\n" +
                "    {\r\n" +
                "      \"title\": \"RPA\",\r\n" +
                "      \"price\": 45,\r\n" +
                "      \"copies\": 79\r\n" +
                "    },\r\n" +
                "     {\r\n" +
                "      \"title\": \"Appium\",\r\n" +
                "      \"price\": 36,\r\n" +
                "      \"copies\": 7\r\n" +
                "    }\r\n" +
                "    \r\n" +
                "    \r\n" +
                "    \r\n" +
                "  ]\r\n" +
                "}\r\n" +
                "";
    }

    public static String AddBook(String isbn, String aisle){
        String payload= "{\r\n\r\n\"name\":\"Learn Appium Automation with Java\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"John foe\"\r\n}\r\n \r\n";
        return payload;
    }

    public static String DeleteBook(String isbn, String aisle){
        String id= "{\r\n \r\n\"ID\" : \"a23h345122332\"\r\n \r\n}\r\n}";
        return id;
    }

}
