package com.kristyn.blogchallenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/github")
    public String github(){
        return "github";
    }
    @RequestMapping("/java")
    public String java(){
        return "java";
    }
    @RequestMapping("/htmlcss")
    public String htmlcss(){
        return "htmlcss";
    }
    @RequestMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }
    @RequestMapping("/github2")
    public String github2(){
        return "github2";
    }
    @RequestMapping("/java2")
    public String java2(){
        return "java2";
    }
    @RequestMapping("/htmlcss2")
    public String htmlcss2(){
        return "htmlcss2";
    }

}
