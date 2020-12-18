package com.bankvision.bankvision.controllers;

import com.bankvision.bankvision.models.User;
import com.bankvision.bankvision.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        // formatoJSON {"id":"1001","apellido":"Jimenez","celular":"320300","nombre":"David"}
        return userService.createOrUpdateUser(newUser);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User updateUser) {
        // formatoJSON {"id":"1001","apellido":"Jimenez","celular":"320444","nombre":"David"}
        return userService.createOrUpdateUser(updateUser);
    }

    @DeleteMapping("/users/{id}")
    public void removeUserById(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
