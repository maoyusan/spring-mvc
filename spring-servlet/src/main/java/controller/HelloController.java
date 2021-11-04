package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @PostMapping(value = "/hello")
    public String hello(String  name, Model model) {
        System.out.println("被调用了");
        //封装数据
        model.addAttribute("msg", name);
        return "hello";
    }

}