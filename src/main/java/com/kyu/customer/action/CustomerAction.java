package com.kyu.customer.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @FileName : CustomAction.java
 * @Project : struts2_test
 * @Date : 2013. 9. 2.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private static final long serialVersionUID = 1L;
	private Customer customer = new Customer();

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
	 * getModel
	 *
	 * <pre>
	 * @return
	 */
	@Override
	public Customer getModel() {
		return customer;
	}

}
