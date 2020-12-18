package com.bankvision.bankvision.services;

import com.bankvision.bankvision.models.User;
import com.bankvision.bankvision.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public User createOrUpdateUser(User newUser){
        return userRepository.save(newUser);
    }

    public void deleteUser(int id){
        userRepository.delete(getUserById(id));
    }
}
