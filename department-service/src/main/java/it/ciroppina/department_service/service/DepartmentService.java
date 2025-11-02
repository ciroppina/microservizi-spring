package it.ciroppina.department_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.ciroppina.department_service.client.EmployeeClientImpl;
import it.ciroppina.department_service.client.EmployeeClientInterface;
import it.ciroppina.department_service.model.Employee;

/**
 * DepartmentService handles the logic for retrieving employee data from employee_service
 */
@Service
public class DepartmentService {

	private final EmployeeClientInterface employeeClient;
	
	// constructor based dependency injection, necessario un param concreto, 
	// non una interface
    public DepartmentService(EmployeeClientImpl employeeClient) {
        this.employeeClient = employeeClient;
    }

    public List<Employee> getAllEmployees() {
        return employeeClient.getAllEmployees();
    }

    public Employee getEmployeeById(Long id) {
        return employeeClient.getEmployeeById(id);
    }
}