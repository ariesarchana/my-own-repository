package com.rest.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@SuppressWarnings("deprecation")
@Path("/webservice")
public class WebController {

	private static Map<String, Employee> employees = new HashMap<String, Employee>();

	static {

		Employee employee1 = new Employee();
		employee1.setEmployeeId("11111");
		employee1.setEmployeeName("Dineh Rajput");
		employee1.setJobType("Sr.Software Engineer");
		employee1.setSalary(70000l);
		employee1.setAddress("Noida");
		employees.put(employee1.getEmployeeId(), employee1);

		Employee employee2 = new Employee();
		employee2.setEmployeeId("22222");
		employee2.setEmployeeName("Abhishek");
		employee2.setJobType("Marketing");
		employee2.setSalary(50000l);
		employee2.setAddress("New Delhi");
		employees.put(employee2.getEmployeeId(), employee2);

	}

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello World by Archana!";
	}

	@GET
	@Path("/message/{message}")
	@Produces(MediaType.TEXT_PLAIN)
	public String showMsg(@PathParam("message") String message) {
		return message;
	}

	@GET
	@Path("/employees")
	@Produces(MediaType.TEXT_XML)
	public List<Employee> listEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	@GET
	@Path("/employee/{employeeId}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee(@PathParam("employeeId") String id) {
		return employees.get(id);

	}

	@GET
	@Path("/json/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> listJsonEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	@GET
	@Path("/json/employee/{employeeid}")
	@Produces("application/json")
	public Employee getEmployeeJSON(@PathParam("employeeid") String employeeId) {
		return employees.get(employeeId);
	}
}
