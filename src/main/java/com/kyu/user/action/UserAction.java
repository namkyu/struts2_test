package com.kyu.user.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @FileName : UserAction.java
 * @Project : struts2_test
 * @Date : 2013. 8. 30.
 * @작성자 : nklee
 * @프로그램설명 : xml 설정 파일을 이용한 테스트
 */
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

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
	@Override
	public String execute() {
		return SUCCESS;
	}

	/**
	 * <pre>
	 * validate
	 *
	 * <pre>
	 */
	@Override
	public void validate() {
		if ("".equals(username)) {
			addFieldError("username", getText("username.required"));
		}

		if ("".equals(password)) {
			addFieldError("password", getText("password.required"));
		}
	}
}
