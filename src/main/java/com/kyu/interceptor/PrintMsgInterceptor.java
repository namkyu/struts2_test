package com.kyu.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @FileName : PrintMsgInterceptor.java
 * @Project : struts2_test
 * @Date : 2013. 9. 2.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class PrintMsgInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	/**
	 * <pre>
	 * destroy
	 *
	 * <pre>
	 */
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	/**
	 * <pre>
	 * init
	 *
	 * <pre>
	 */
	@Override
	public void init() {
		System.out.println("init");
	}

	/**
	 * <pre>
	 * intercept
	 *
	 * <pre>
	 * @param invocation
	 * @return
	 * @throws Exception
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("before invoke");
		String result = invocation.invoke();
		System.out.println("invoke result=" + result);
		System.out.println("after invoke");
		return result;
	}

}
