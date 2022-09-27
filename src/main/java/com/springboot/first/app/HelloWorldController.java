package com.springboot.first.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//On applying RestController annotation our class can handle web request

public class HelloWorldController {
    //Get HTTP Method
    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")//setting uri for rest api
    //using this in order to serve this method as api
    public String helloWorld(){
        return "(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ. * Hello World! =^..^= ";
    }

}
