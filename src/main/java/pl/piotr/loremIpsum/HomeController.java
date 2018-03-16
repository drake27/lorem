package pl.piotr.loremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gosc on 16.03.2018.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "form";
    }

}
