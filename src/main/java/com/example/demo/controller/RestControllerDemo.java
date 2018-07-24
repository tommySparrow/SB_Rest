package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/24
 * @ Description： rest 风格
 * @ throws
 */
@RestController
public class RestControllerDemo {

    @GetMapping("/findone/{id}")
    public String findUserRestful(@PathVariable("id") Integer id){
        return "get请求==="+id;
    }

    @PostMapping("/addone")
    public void addUserRestful(User user) {
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user);
    }
    @DeleteMapping("/deleteone/{id}")
    public void deleteUserRestful(@PathVariable("id") Integer id) {
        System.out.println("删除===="+id);
    }

    @PutMapping("/updateone")
    public void updateUserRestful(@RequestBody User user) {
        System.err.println(user);
    }
}
