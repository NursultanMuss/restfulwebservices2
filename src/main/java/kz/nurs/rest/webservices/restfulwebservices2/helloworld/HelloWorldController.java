package kz.nurs.rest.webservices.restfulwebservices2.helloworld;

import org.springframework.web.bind.annotation.*;

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

    ///hello-world/path-variable/in28minutes
    @GetMapping( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }
}
