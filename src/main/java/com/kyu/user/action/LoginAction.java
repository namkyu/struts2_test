package com.kyu.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : LoginAction.java
 * @Project : struts2_test
 * @Date : 2013. 9. 2.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class LoginAction extends ActionSupport {

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
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <pre>
	 * execute
	 *
	 * <pre>
	 * @return
	 * @throws Exception
	 */
	@Override
	public String execute() throws Exception {
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
		if ("test".equals(username)) {
			addActionMessage("You are valid user!");
		} else {
			addActionError("I don't know you, dont try to hack me!");
		}
	}

}
