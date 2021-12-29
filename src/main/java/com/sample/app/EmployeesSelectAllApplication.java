package com.sample.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.EmployeeService;
import com.sample.vo.Employee;

public class EmployeesSelectAllApplication {

	public static void main(String[] args) {
		
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		// 인터페이스 타입으로 정의하였지만 실제 설정파일에서 정의된 클래스는 service의 구현객체인 EmployeeServiceImpl이다.
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		List<Employee> employeeList = service.getAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp.getId());
		}
	}
}
