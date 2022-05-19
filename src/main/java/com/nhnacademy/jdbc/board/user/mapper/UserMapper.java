package com.nhnacademy.jdbc.board.user.mapper;

import com.nhnacademy.jdbc.board.user.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface UserMapper {
    Optional<User> getUser(@Param("id") String id, @Param("password") String password);
}
