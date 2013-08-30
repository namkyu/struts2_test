package com.kyu.user.action;


/**
 * @FileName : UserAction.java
 * @Project : struts2_test
 * @Date : 2013. 8. 30.
 * @작성자 : nklee
 * @프로그램설명 : xml 설정 파일을 이용한 테스트
 */
public class UserAction {

	private String username;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * <pre>
	 * execute
	 * all struts logic here
	 * <pre>
	 * @return
	 */
	public String execute() {
		System.out.println("test");
		return "SUCCESS";
	}
}
