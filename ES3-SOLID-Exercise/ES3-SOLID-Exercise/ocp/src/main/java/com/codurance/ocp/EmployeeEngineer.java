package com.codurance.ocp;

public class EmployeeEngineer extends EmployeeTemplate {


    public EmployeeEngineer(int salary) {
        this.salary = salary;
    }

    @Override
    public int payAmount() {
        return salary;
    }
    
}
