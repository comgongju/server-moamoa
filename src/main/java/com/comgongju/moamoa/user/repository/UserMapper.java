package com.comgongju.moamoa.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.comgongju.moamoa.user.entity.UserVO;

@Mapper
@Repository
public interface UserMapper {

	void insertUserItems(UserVO userItems);

	
}
