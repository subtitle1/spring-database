package com.sample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.EmployeeService;
import com.sample.vo.Employee;

public class EmployeeInsertApplication {

	public static void main(String[] args) {
		
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		// 인터페이스 타입으로 정의하였지만 실제 설정파일에서 정의된 클래스는 service의 구현객체인 EmployeeServiceImpl이다.
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		Employee employee = new Employee();
		employee.setFirstName("홍");
		employee.setLastName("길동");
		employee.setPhoneNumber("010-1234-5678");
		employee.setEmail("hong@gmail.com");
		
		service.addNewEmployee(employee);
	}
}
