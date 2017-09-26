package com.mvillafuertem.mymvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mvillafuertem on 9/25/17.
 */
@Controller
public class MyController {

    @GetMapping(value = "/users",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MyUser> get() {

        MyUser user = new MyUser.Builder(1L, "Pepe").build();

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
