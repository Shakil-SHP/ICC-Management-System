package com.shakil.service;

import com.shakil.config.HibernateConfig;
import com.shakil.model.User;
import com.shakil.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class UserService{

    private final UserRepository userRepository;



    public List<User> allUsers(){
//        var criteriaBuilder = hibernateConfig.getCriteriaBuilder();
//        var criteriaQuery = criteriaBuilder.createQuery(User.class);
//        var root = criteriaQuery.from(User.class);
//        criteriaQuery.select(root);
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }


}
