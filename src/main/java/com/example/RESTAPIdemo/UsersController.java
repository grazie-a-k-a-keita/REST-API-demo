package com.example.RESTAPIdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTAPIdemo.model.Users;

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
        return userRepository.findAll();
    }

    /**
     * 指定した性別のユーザーリストを取得
     * 
     * @return ユーザーリスト(指定した性別のユーザー)
     */
    @GetMapping("/users/{gender}")
    public @ResponseBody ResponseEntity<?> getUsersByGender(@PathVariable String gender) {
        if (!gender.equals("M") && !gender.equals("F")) {
            return new ResponseEntity<>("input invalid", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userRepository.findByGender(gender), HttpStatus.OK);
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
