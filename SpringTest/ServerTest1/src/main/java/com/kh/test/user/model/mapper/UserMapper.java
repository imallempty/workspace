package com.kh.test.user.model.mapper;

import java.lang.reflect.Member;

import org.apache.ibatis.annotations.Mapper;

import com.kh.test.user.model.dto.User;

@Mapper
public interface UserMapper {

	User searchUser(String inputId);

}
