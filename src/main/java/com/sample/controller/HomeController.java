package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*
	 * home.do라는 요청이 오면 home.jsp를 응답으로 보낸다는 의미이다.
	 * "http://localhost/home.do" URL 요청이 오면 실행되는 요청핸들러 메소드다.
	 * 요청핸들러 메소드가 반환하는 문자열은 뷰페이지(jsp 페이지)의 이름이다.
	 * 실제 home.jsp 페이지의 실제 경로는 /WEB-INF/jsp/home.jsp이지만, home.jsp만 적어도 된다. (context-web.xml에서 prefix 해줘서 가능한 것)
	 */
	
	// 컨트롤러는 메소드를 여러 개 가질 수 있는데, 매개변수, 메소드명에 아무런 제약이 없다.
	// 일반적으로는 반환타입이 거의 String이다. 왜? view page의 이름이기 때문에!
	@RequestMapping(path = "/home.do")
	public String home() {
		return "home.jsp";
	}
}
