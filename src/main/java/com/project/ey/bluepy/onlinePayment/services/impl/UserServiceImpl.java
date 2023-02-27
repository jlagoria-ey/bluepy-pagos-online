package com.project.ey.bluepy.onlinePayment.services.impl;

import com.project.ey.bluepy.onlinePayment.entities.User;
import com.project.ey.bluepy.onlinePayment.repositories.UserRepository;
import com.project.ey.bluepy.onlinePayment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.insert(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public User findByPersonaNumber(Long personaNumber) {
        return userRepository.findUserByPersonaNumber(personaNumber);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
