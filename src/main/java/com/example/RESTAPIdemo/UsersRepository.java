package com.example.RESTAPIdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RESTAPIdemo.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    /**
     * 指定された性別のユーザーを返却する
     * 
     * @param M 男性
     * @param F 女性
     * @return ユーザーリスト(Parameters)
     */
    @Query(value = "select * from users where gender = CAST(?1 AS gender)", nativeQuery = true)
    List<Users> findByGender(String gender);
}
