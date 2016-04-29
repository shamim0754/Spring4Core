
package com.javaaround.spring;

import com.javaaround.domain.EmployeeAddress;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("employee") 
public class Employee {

 	@Autowired
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