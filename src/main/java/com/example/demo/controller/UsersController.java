package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

@RestController
@RequestMapping("/demo")
public class UsersController {
    @Autowired
    private UsersRepository userRepository;

    /**
     * ユーザーリストを全件取得
     * 
     * @return ユーザーリスト(全ユーザー)
     */
    @GetMapping("/users")
    public List<Users> getAllUser() {
        return userRepository.findAll(Sort.by("id"));
    }

    /**
     * 指定したidのユーザーを取得
     * 
     * @return ユーザーリスト(指定した性別のユーザー)
     */
    @GetMapping("/users/{id}")
    public Optional<Users> getUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    /**
     * 指定したユーザーの登録
     * 
     * @param user ユーザー情報
     * @return 登録したユーザー情報
     */
    @PostMapping("/user")
    public Users saveUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    /**
     * 指定したユーザー情報の更新
     * 
     * @param id   更新するユーザーのID
     * @param user ユーザー情報
     * @return 更新したユーザー情報
     */
    @PutMapping("/user/{id}")
    public Users updateUser(@PathVariable int id, @RequestBody Users user) {
        user.setId(id);
        return userRepository.save(user);
    }

    /**
     * 指定したユーザーの削除
     * 
     * @param id 削除するユーザーのID
     */
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id) {
        Optional<Users> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.deleteById(id);
        }
    }
}
