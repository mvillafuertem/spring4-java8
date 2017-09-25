package com.mvillafuertem.mymvc;

import org.springframework.stereotype.Controller;

/**
 * Created by mvillafuertem on 9/25/17.
 */
@Controller
public class MyController {

    // TODO:
    public MyModel getModel() {

        final Long id = 1L;
        final String name = "Pepe";

        final MyModel myModel = new MyModel.Builder(id, name)
                                           .build();
        return myModel;
    }
}
