package com.kyu.process.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : LongProcessAction.java
 * @Project : struts2_test
 * @Date : 2013. 9. 2.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class LongProcessAction extends ActionSupport {

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
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}

		return SUCCESS;
	}
}
