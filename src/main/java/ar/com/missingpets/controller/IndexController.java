package ar.com.missingpets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    
    //Vista principal o index
    @GetMapping
    public String index(){
        return "index/index.html";
    }
    
}
