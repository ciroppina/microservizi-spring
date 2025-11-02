package it.ciroppina.employee_service.controller;

import it.ciroppina.employee_service.entity.Employee;
import it.ciroppina.employee_service.service.EmployeeService;
// all Spring annotations !!!
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST endpoints for creating, retrieving, and deleting employees are exposed
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

	// Constructor-based dependency injection of EmployeeService
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted with id: " + id;
    }
}