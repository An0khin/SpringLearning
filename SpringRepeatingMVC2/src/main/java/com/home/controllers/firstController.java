package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class firstController {
    @GetMapping("first")
    public String first(HttpServletRequest request, Model model) { //always return "first"
        //System.out.println(request.getParameter("name"));
        model.addAttribute("mes", "Name is " + request.getParameter("name")); //model to html page
        return "first";
    }

//    @GetMapping("first")
//    public String first(@RequestParam("name") String param) { //return "first" if url has "name" parameter
//        System.out.println(param);
//        return "first";
//    }

}
