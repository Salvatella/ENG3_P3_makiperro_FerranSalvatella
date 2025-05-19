

package com.codurance.ocp;
import java.util.ArrayList;
import java.util.List;


public class EmployeeManager extends  EmployeeTemplate {

    private int bonus;

    @Override
    public int payAmount() {
        // TODO Auto-generated method stub

        return salary + bonus;
    }

    
   
    }