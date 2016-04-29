
package com.javaaround.spring;

import com.javaaround.domain.EmployeeAddress;
public class Employee {
 
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