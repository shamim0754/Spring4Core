package com.javaaround.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.javaaround.dao.EmployeeDao;
import com.javaaround.domain.Employee;
 
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
 
    @Autowired
    private DateService dateService;
     
    @Autowired
    private EmployeeDao employeeDao;
     
 
    public void registerEmployee(Employee employee) {
        employee.setAssessmentDate(dateService.getNextAssessmentDate());
        employeeDao.saveInDatabase(employee);
    }
     
}