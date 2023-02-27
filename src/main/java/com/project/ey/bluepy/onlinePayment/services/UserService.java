package com.project.ey.bluepy.onlinePayment.services;

import com.project.ey.bluepy.onlinePayment.entities.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> saveUsers(List<User> users);
    User findByPersonaNumber(Long personaNumber);
    List<User> getAll();
}
