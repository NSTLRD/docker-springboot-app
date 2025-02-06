/**
 * @author Starling Diaz on 2/5/2025.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version docker-springboot-app 1.0
 * @since 2/5/2025.
 */

package com.mentorly.dockerspringbootapp.controller;

import com.mentorly.dockerspringbootapp.entity.User;
import com.mentorly.dockerspringbootapp.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
