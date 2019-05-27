package com.munna.ecommerce.user;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserControllerInterface {

    @RequestMapping(value = "/user" , method = RequestMethod.POST)
    ResponseEntity<?> addUser(@RequestBody @Validated User user);

    @RequestMapping(value = "/user/{Id}", method = RequestMethod.GET)
    ResponseEntity<?> GetUser(@RequestParam String Id);


}
