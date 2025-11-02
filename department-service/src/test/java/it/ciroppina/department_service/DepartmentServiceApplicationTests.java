package it.ciroppina.department_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import it.ciroppina.department_service.client.EmployeeClientInterface;
import it.ciroppina.department_service.service.DepartmentService;

@SpringBootTest
class DepartmentServiceApplicationTests {

	/**
	 * added by chatGPT,
	 * to resorve  error: 
	 * NoSuchBeanDefinitionException: 
	 * No qualifying bean of type available: 
	 * expected at least 1 bean which qualifies as autowire candidate
	 */
    @MockBean
    //private EmployeeClientInterface employeeClient;
    //@Autowired
    private DepartmentService departmentService;

    @Test
	void contextLoads() {
	}

}
