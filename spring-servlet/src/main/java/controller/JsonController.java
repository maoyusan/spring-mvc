package controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

@RestController
public class JsonController {


    @RequestMapping(value = "/json" )
    public String jsonPath() {
        User user = new User("小明", 18);

        return new Gson().toJson(user);
    }
}
