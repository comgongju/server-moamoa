package com.comgongju.moamoa.user.entity;


import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class UserVO {
	@NotNull(message = "User Index cannot be null.")
	private int userIdx;
	@NotNull(message = "userKakaoID cannot be null.")
	private String userKakaoID;
	@NotNull(message = "userName cannot be null.")
	private String userName;
	@NotNull(message = "userImage cannot be null.")
	private String userImage;
}
