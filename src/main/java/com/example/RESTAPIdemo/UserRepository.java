package com.example.RESTAPIdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 指定された性別のユーザーを返却する
     * 
     * @param M 男性
     * @param F 女性
     * @return ユーザーリスト(Parameters)
     */
    @Query(value = "select * from user where gender = ?1", nativeQuery = true)
    List<User> findByGender(String gender);
}
