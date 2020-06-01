package com.abhin.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Abhin Prasad Acharya
 * Date: 5/30/20
 * Time: 7:15 PM
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
}
