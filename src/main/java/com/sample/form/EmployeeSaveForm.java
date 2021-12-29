package com.sample.form;

import com.sample.vo.Employee;

/* WEB-INF/jsp/employee/form.jsp의 폼 입력값을 저장하는 객체에 대한 클래스다.
 * 폼 요소의 이름과 같은 이름을 가진 멤버변수로 구성된 클래스다.
 * 기본 생성자, getter/setter 메소드를 포함해야 한다.
 */
public class EmployeeSaveForm {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public EmployeeSaveForm() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee toEmployees() {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setPhoneNumber(phoneNumber);
		employee.setEmail(email);
		
		return employee;
	}
}
