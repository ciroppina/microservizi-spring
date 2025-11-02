package it.ciroppina.department_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ciroppina.department_service.model.Employee;
import it.ciroppina.department_service.service.DepartmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/departments")
public class DepartmentController //implements EmployeeClientInterface 
{

    private final DepartmentService departmentService;
    
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return departmentService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return departmentService.getEmployeeById(id);
    }
}