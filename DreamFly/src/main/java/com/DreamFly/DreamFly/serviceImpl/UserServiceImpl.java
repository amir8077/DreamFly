package com.DreamFly.DreamFly.serviceImpl;
import com.DreamFly.DreamFly.entities.User;
import com.DreamFly.DreamFly.repositories.UserRepository;
import com.DreamFly.DreamFly.serviecs_interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }


    // Add other user-related service methods as needed
}
