package com.SpringBoot.First;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MyController {

    @GetMapping("/Vishal")
 public  String helloVishal(){
     return "hello Ayay Kumar ";
 }
}
