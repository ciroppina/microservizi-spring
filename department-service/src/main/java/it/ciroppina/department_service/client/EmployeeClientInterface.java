package it.ciroppina.department_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.ciroppina.department_service.model.Employee;

/**
 * this is a client to the employee_service; like a kafka messenger
 */
@FeignClient(name = "employee_service", url = "${employee.service.url}")
public interface EmployeeClientInterface {

    @GetMapping
    public List<Employee> getAllEmployees();

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id);
}