package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    public HelloController() {
        System.out.println("被调用了");
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("被调用了");
        //封装数据
        model.addAttribute("msg", "Hello SpringMVCAnnotation");
        return "hello";
    }
}