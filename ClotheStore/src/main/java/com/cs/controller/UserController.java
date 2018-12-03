package com.cs.controller;

import com.cs.entity.User;
import com.cs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(userService.selectAll());
    }

    @PostMapping(value = "/user" ,produces = "application/json;charset=utf-8")
    public ResponseEntity insert(User user){
        return userService.insert(user) >0 ? ResponseEntity.ok("添加成功") : ResponseEntity.ok("添加失败");
    }

    @GetMapping(value = "/user/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity selectByPrimaryKey(@PathVariable("id") int userId){
        return ResponseEntity.ok(userService.selectByPrimaryKey(userId));
    }

    @GetMapping(value = "/userDel/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity deleteByPrimaryKey(@PathVariable("id") int userId){
        return userService.deleteByPrimaryKey(userId) >0 ? ResponseEntity.ok("删除成功！") : ResponseEntity.ok("删除失败！");
    }

    @GetMapping(value = "update/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity updateByPrimaryKey(@PathVariable("id") int userId){
        return userService.deleteByPrimaryKey(userId) >0 ? ResponseEntity.ok("修改成功！") : ResponseEntity.ok("删除失败！");
    }
}
