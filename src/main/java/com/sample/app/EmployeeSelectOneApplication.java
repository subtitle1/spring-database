package com.sample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.EmployeeService;
import com.sample.vo.Employee;

public class EmployeeSelectOneApplication {

	public static void main(String[] args) {
		
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		Employee employee = service.getEmployeeDetail(100);
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getPhoneNumber());
		System.out.println(employee.getJobId());
		System.out.println(employee.getHireDate());
		System.out.println(employee.getSalary());
		System.out.println(employee.getCommissionPct());
	}
}
