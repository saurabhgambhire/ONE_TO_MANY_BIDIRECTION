package ONE_TO_MANY_BIDIRECTION.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int emp_Id;
	private String emp_Name;
	@ManyToOne
	@JoinColumn
	private Company company;

	public int getEmp_Id() {
		return emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public Company getCompany() {
		return company;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name +  "]";
	}

}
