package beetle.springframework.beetledi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    public String sayHello() {
        LOGGER.info("Hi");

        return "Hi!";
    }

}
