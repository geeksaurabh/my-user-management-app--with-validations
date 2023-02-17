package com.example.usermanagementapp.Service;

import com.example.usermanagementapp.Dao.UserRepository;

import com.example.usermanagementapp.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
   public UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findUserById(String userId) {
        return repository.findById(Integer.valueOf(userId)).get();
    }

    public User deleteUserById(Integer userId) {

         repository.deleteById(userId);
         return null;
    }

    public void updateUserById(String userId,User newUser) {
        User user=findUserById(userId);
        user.setUserId(newUser.getUserId());
        user.setUserName(newUser.getUserName());
    }
}
