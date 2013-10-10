package com.kyu.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : MultiMethodAction.java
 * @Project : struts2_test
 * @Date : 2013. 10. 10.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class MultiMethodAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

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

	public String methodA() {
		System.out.println("methodA~~");
		return SUCCESS;
	}

	public String methodB() {
		System.out.println("methodB~~");
		return SUCCESS;
	}

	public String sayHello() {
		System.out.println("sayHello~~");
		return "sayHello";
	}
}
