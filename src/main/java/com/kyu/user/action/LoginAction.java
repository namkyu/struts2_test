package com.kyu.user.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : LoginAction.java
 * @Project : struts2_test
 * @Date : 2013. 8. 30.
 * @작성자 : nklee
 * @프로그램설명 : 애노테이션 테스트 struts.xml 파일 없어도 됨
 *
 * scanning work (4가지)
 * 패키지 이름이 sturts, struts2, action or actions
 * Action 인터페이스 구현 클래스
 * ActionSupport 클래스를 상속한 클래스
 * 파일 이름이 Action으로 끝나는 클래스
 */
@Namespace("/user")
//@ResultPath(value = "/")
@Result(name = "success", location = "login.jsp")
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

}
