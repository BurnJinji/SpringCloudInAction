package com.burning8393.cloud.microservicesimpleprovideruser.controller;

import com.burning8393.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.burning8393.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController class
 *
 * @author : Pangxw
 * @date : 2019/3/2 11:15
 * @description :
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
