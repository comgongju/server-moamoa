package com.comgongju.moamoa.user.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comgongju.moamoa.user.entity.UserVO;
import com.comgongju.moamoa.user.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//   sql접속 테스트
    @GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
    
	@PostMapping()
	public ResponseEntity<List<UserVO>> insertUser(@RequestBody UserVO user) {
		ResponseEntity<List<UserVO>> userInsert = null;
		
		userService.insertUserItems(user);
		
		userInsert = new ResponseEntity("success", HttpStatus.OK);
		
		return userInsert;
	}
}
