package com.munna.ecommerce.user.controllers;

import com.munna.ecommerce.user.services.UserService;
import com.munna.ecommerce.user.contrllerInterfaces.UserControllerInterface;
import com.munna.ecommerce.user.modelsAndEntities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController implements UserControllerInterface {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<?> addUser(@RequestBody @Validated User user) {
        userService.setUser(user);
        return new ResponseEntity<>("New User Created", HttpStatus.OK );
    }

    @Override
    public ResponseEntity<?> GetUser(String Id) {
       return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
}