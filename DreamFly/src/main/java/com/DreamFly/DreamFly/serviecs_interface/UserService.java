package com.DreamFly.DreamFly.serviecs_interface;

import com.DreamFly.DreamFly.entities.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    User getUserById(Long userId);

    void deleteUser(Long userId);

    List<User> getAllUsers();

}
