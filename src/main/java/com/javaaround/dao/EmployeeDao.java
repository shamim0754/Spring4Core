package com.javaaround.dao;
 
import com.javaaround.domain.Employee;
 
public interface EmployeeDao {
 
    void saveInDatabase(Employee employee);
}