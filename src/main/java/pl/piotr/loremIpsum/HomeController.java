package pl.piotr.loremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HomeController {
    @GetMapping("/")
    public String form(){
        return "form";
    }
    @GetMapping("/result")
    public  String getResult(@RequestParam String type,
                             @RequestParam Integer number, ModelMap modelMap){
return ";";
    }


}
