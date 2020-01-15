package example.controller.view;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

}
