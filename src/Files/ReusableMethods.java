package Files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {

    public static JsonPath rawToJson(String response)
    {
        JsonPath js=new JsonPath(response);
        return js;
    }
}
//    public static JsonPath rawToNew_Json(Response response){
//        JsonPath js1=new JsonPath(response);
//        return js1;
//    }
//
//
//
//
//
//}
