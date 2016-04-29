
package com.javaaround.spring;

import com.javaaround.domain.EmployeeAddress;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("employee") 
public class Employee {
	
 	@Resource(name="employeeAddress")
    private EmployeeAddress address;
 
    public EmployeeAddress getAddress() {
        return address;
    }
 
    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
}