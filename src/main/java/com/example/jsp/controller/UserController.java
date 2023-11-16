package com.example.jsp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.example.jsp.service.IUserService;
import com.example.jsp.entity.User;


import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tanlang
 * @since 2023-11-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

        @Resource
        private IUserService userService;

        @PostMapping("/add")
        public Boolean save(@RequestBody User user) {
            return userService.saveOrUpdate(user);
        }

        @DeleteMapping("/{id}")
        public Boolean delete(@PathVariable Integer id) {
            return userService.removeById(id);
        }

        @PostMapping("/del/batch")
        public boolean deleteBatch(@RequestBody List<Integer> ids){
                return userService.removeByIds(ids);
        }

        @GetMapping
        public List<User> findAll() {
            return userService.list();
        }

        @GetMapping("/{id}")
        public User findOne(@PathVariable Integer id) {
            return userService.getById(id);
        }

        @GetMapping("/page")
        public Page<User> findPage(@RequestParam Integer pageNum,
        @RequestParam Integer pageSize) {
            return userService.page(new Page<>(pageNum, pageSize));
        }

}
