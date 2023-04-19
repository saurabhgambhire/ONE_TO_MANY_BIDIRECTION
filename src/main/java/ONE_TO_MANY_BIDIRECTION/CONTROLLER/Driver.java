package ONE_TO_MANY_BIDIRECTION.CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import ONE_TO_MANY_BIDIRECTION.DAO.Dao;
import ONE_TO_MANY_BIDIRECTION.DTO.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		Company company = new Company();
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		
		
		company.setId(1);
		company.setName("Google");
		company.setLocation("Pune");
//		----------------------------------------------
		
		employee.setEmp_Id(1);
		employee.setEmp_Name("rakesh");
		employee.setCompany(company);
		
		employee2.setEmp_Id(2);
		employee2.setEmp_Name("Aniket");
		employee2.setCompany(company);
		
//		-----------------------------------------------
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		company.setEmployees(employees);
//		-----------------------------------------------
		Dao dao = new Dao();
		dao.saveCompany(company);
		
	}

}
