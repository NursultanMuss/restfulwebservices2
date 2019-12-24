package kz.nurs.rest.webservices.restfulwebservices2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method to return HelloWorld
    @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World1111");
    }
}
