package com.example.demospringbootwithjenkinsx;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="helloworld")
public class HelloWorld {

    @RequestMapping(value="printHello", method= RequestMethod.GET)
    public String helloWolrd() {
        return "Hello World3!";
    }

    @RequestMapping(value="printMessage/{message}", method = RequestMethod.GET)
    public String print(@PathVariable String message) {
        return "The message is: " + message;
    }


}
