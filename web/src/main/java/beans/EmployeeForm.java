package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import domain.Employee;

@ManagedBean
@RequestScoped
public class EmployeeForm {

	private Employee employee = new Employee();

	@ManagedProperty("#{employeeList}")
	private EmployeeList employeeList;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeList getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(EmployeeList employeeList) {
		this.employeeList = employeeList;
	}

	public String saveEmployee() {
		employeeList.addEmployee(employee);
		return "employeeList?faces-redirect=true";
	}

}
