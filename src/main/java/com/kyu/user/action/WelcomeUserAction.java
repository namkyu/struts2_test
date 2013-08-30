package com.kyu.user.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : WelcomeUserAction.java
 * @Project : struts2_test
 * @Date : 2013. 8. 30.
 * @작성자 : nklee
 * @프로그램설명 :
 */
@Namespace("/user")
public class WelcomeUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
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
	 *
	 * <pre>
	 * @return
	 * @throws Exception
	 */
	@Override
	@Action(value = "welcome", results = {
		@Result(name = "success", location = "welcome_user.jsp")
	})
	public String execute() throws Exception {
		return SUCCESS;
	}
}
