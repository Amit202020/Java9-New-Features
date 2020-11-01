package pp;

import java.util.ArrayList;

class Employee {

	private String empId;
	private String empName;
	private String empEmail;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Employee(String empId, String empName, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + "]";
	}

}

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee("1234", "srini", "srini@gmail.com"));
		arr.add(new Employee("1235", "sonai", "sonai@gmail.com"));
		arr.add(new Employee("1236", "paro", "paro@gmail.com"));
		arr.add(new Employee("1237", "max", "max@gmail.com"));
		
	    
		arr.stream().filter(  p  ->  p.getEmpEmail().startsWith("p")).forEach(p -> System.out.println(p.getEmpName()));

	}

}













