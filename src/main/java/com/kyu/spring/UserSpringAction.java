package com.kyu.spring;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : UserSpringAction.java
 * @Project : struts2_test
 * @Date : 2013. 9. 3.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class UserSpringAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userService;

	/**
	 *
	 */
	public UserSpringAction() {
		System.out.println("UserSpringAction 객체 초기화 : " + getClass().hashCode());
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
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
		userService.printUser();
		UserService userServiceBean = getBean("userService", UserService.class);
		userServiceBean.printUser();
		return SUCCESS;
	}

	/**
	 * <pre>
	 * getBean
	 *
	 * <pre>
	 * @param beanName
	 * @param clazz
	 * @return
	 */
	public <T> T getBean(String beanName, Class<T> clazz) {
		WebApplicationContext context = getSpringContext();
		return context.getBean(beanName, clazz);
	}

	/**
	 * <pre>
	 * getBean
	 *
	 * <pre>
	 * @param beanName
	 * @return
	 */
	public Object getBean(String beanName) {
		WebApplicationContext context = getSpringContext();
		return context.getBean(beanName);
	}

	/**
	 * <pre>
	 * getSpringContext
	 *
	 * <pre>
	 * @return
	 */
	private WebApplicationContext getSpringContext() {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		return context;
	}
}
