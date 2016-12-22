package Gup.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ContactController {

    @ModelAttribute("module")
    String module() {
        return "contact";
    }

    @GetMapping("/contact")
    String about() {
        return "home/contact";
    }
}