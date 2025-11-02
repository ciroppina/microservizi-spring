package it.ciroppina.employee_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import it.ciroppina.employee_service.repository.EmployeeRepository;
import it.ciroppina.employee_service.service.EmployeeService;

@SpringBootTest
class EmployeeServiceApplicationTests {

	/**
	 * added by chatGPT,
	 * to resorve  error: 
	 * NoSuchBeanDefinitionException: 
	 * No qualifying bean of type available: 
	 * expected at least 1 bean which qualifies as autowire candidate
	 */
    @MockBean
    //private EmployeeRepository employeeRepository;
    //@Autowired
    private EmployeeService empService;
    
	@Test
	void contextLoads() {
	}

}
