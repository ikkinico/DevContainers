package com.devfest.devC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyRestController {
    
    @RequestMapping(value = "/hello", method=RequestMethod.GET)
    public @ResponseBody String helloworld() {
        return "hello devfest";
    }
    
}
