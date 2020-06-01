package com.abhin.springdemo.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Abhin Prasad Acharya
 * Date: 5/30/20
 * Time: 6:15 PM
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public  String showPage(){
        return "main-menu";
    }
}
