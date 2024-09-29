
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SimplePrograms {
    public static void main(String args[]) {
        String url = "https://jsonplaceholder.typicode.com/todos";
        RestAssured.given().when().get(url).then().assertThat().statusCode(200);
        System.out.println(RestAssured.given().when().get(url).getBody().asPrettyString());

        Todo todo = RestAssured.given().when().get(url + "/1").getBody().as(Todo.class);
        System.out.println(todo.getId() + " " + todo.getSecond_id() + " " + todo.getName() + " " + todo.isStatus());

        Todo todo2=new Todo();
        todo2.setId(1111);
        todo2.setSecond_id(2222);
        todo2.setName("Title here");
        todo2.setStatus(true);
        RestAssured.given().when().body(todo2).post(url).then().assertThat().statusCode(201);

        Todo todo3=new Todo();
        todo3.setId(11111);
//        todo3.setSecond_id(2222);
//        todo3.setName("Title here");
//        todo3.setStatus(true);
        RestAssured.given().when().body(todo2).patch(url+"/1").then().assertThat().statusCode(200);

        Todo todo4=new Todo();
        todo4.setId(22222);
        todo4.setSecond_id(3333);
        todo4.setName("Title here");
        todo4.setStatus(true);
        RestAssured.given().when().body(todo2).put(url+"/1").then().assertThat().statusCode(200);
    }

}
