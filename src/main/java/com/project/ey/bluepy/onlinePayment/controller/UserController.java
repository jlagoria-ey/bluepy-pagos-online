package com.project.ey.bluepy.onlinePayment.controller;

import com.project.ey.bluepy.onlinePayment.entities.User;
import com.project.ey.bluepy.onlinePayment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user")
    public List<User> getAllUsers() {
        List<User> users = userService.getAll();
        return users;
    }

    @GetMapping("user/{personaNumber}")
    public ResponseEntity<User> getUserByPersonaNumber(@PathVariable Long personaNumber) throws ServerException {
        User userReturned = userService.findByPersonaNumber(personaNumber);
        if (userReturned == null) {
            throw new ServerException("No existe usuario con ese numero");
        } else {
            return new ResponseEntity<>(userReturned, HttpStatus.CREATED);
        }
    }

    @PostMapping(path = "user",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> saveUser(@RequestBody User user) throws ServerException {

        User userSaved = userService.save(user);

        if (userSaved == null) {
            throw new ServerException("Error de datos");
        } else {
            return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
        }
    }
}
