package com.kh.msg.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginImpl   {
 
    private String id;
    String pw;
    String sessionid;
    private static int loginUserCount=0;
         
  
	public static int getLoginUserCount() {
		return loginUserCount;
	}

	public static void setLoginUserCount(int loginUserCount) {
		LoginImpl.loginUserCount = loginUserCount;
	}


 
}