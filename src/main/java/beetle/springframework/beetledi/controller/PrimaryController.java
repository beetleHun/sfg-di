package beetle.springframework.beetledi.controller;

import beetle.springframework.beetledi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
