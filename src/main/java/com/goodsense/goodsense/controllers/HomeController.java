package com.goodsense.goodsense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
Created by Rachel Skwerer
 */

@Controller
@RequestMapping("")
public class HomeController {

    @ResponseBody
    @GetMapping("")
    public String displayHeader(){
        return "Good Sense, LLC";
    }


}
