package com.mvillafuertem.mymvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mvillafuertem on 9/25/17.
 */
@Controller
@RequestMapping("/mymvc")
public class MyController {

    @GetMapping
    public MyModel getModel() {

        final Long id = 1L;
        final String name = "Pepe";
        return new MyModel.Builder(id, name)
                          .build();
    }
}
