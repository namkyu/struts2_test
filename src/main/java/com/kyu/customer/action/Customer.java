package com.kyu.customer.action;

/**
 * @FileName : Customer.java
 * @Project : struts2_test
 * @Date : 2013. 9. 2.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class Customer {

	private String name;
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
