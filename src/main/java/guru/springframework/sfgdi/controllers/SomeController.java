package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
