package de.julesfehr.springbootexample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Define as RestController with Annotation
@RestController
public class HelloWorldController {

    // @RequestMapping maps the method to a specific API path
    // @RequestParam takes parameter from URL: ‘http://localhost:8080/hello?name=World’ will show hello world message
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

}
