package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void foundWithID1(){
        Employee data = new Employee("Tanya from DB", "Mookki from DB");
        repository.save(data);

        Employee employee1 =  repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("Tanya from DB", employee1.getFirstName());
        assertEquals("Mookki from DB", employee1.getLastName());
    }

    @Test
    public void foundWithID2(){
        Employee data = new Employee("Tanya from DB", "Mookki from DB");
        repository.save(data);

        Employee employee1 =  repository.getById(2);
        assertEquals(1, employee1.getId());
        assertEquals("Tanya from DB", employee1.getFirstName());
        assertEquals("Mookki from DB", employee1.getLastName());
    }

}