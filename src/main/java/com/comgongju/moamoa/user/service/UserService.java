package com.comgongju.moamoa.user.service;

import org.springframework.stereotype.Service;

import com.comgongju.moamoa.user.entity.UserVO;
import com.comgongju.moamoa.user.repository.UserMapper;


@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

	public void insertUserItems(UserVO user) {
		UserVO userItems = new UserVO();
		
		userItems.setUserIdx(user.getUserIdx());
		userItems.setUserKakaoID(user.getUserKakaoID());
		userItems.setUserName(user.getUserName());
		userItems.setUserImage(user.getUserImage());
		
		userMapper.insertUserItems(userItems);
		
	}


}
