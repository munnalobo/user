package com.munna.ecommerce.user.services;

import com.munna.ecommerce.user.modelsAndEntities.User;
import com.munna.ecommerce.user.repositoryInterfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void setUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll()
                .forEach(userList::add);    //findAll is an interable so convert this into list to send it back
        return userList;
    }

    /*public User getUserByUserNameandPassword(String userName, String password)
    {
        return userRepository.findByIdandPassword(userId,password);
    }*/

}
