package it.ciroppina.department_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private Long id;
    private String name;
    private String department;

    // Constructors, getters, and setters
}