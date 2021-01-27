package ru.goryachev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OneController {

    @GetMapping("/one")                 //adress in browser
    public String welcome () {            //just method name
        return "pageone";                   //name of page jsp (or html, etc)
    }

    @GetMapping("/two")
    public String hello () {
        return "pagetwo";
    }

}
