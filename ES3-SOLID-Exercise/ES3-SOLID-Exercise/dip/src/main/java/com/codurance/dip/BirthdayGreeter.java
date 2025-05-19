package com.codurance.dip;


import java.time.MonthDay;
import java.util.List;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final DeviceInterface clock;
    private final BirthdayGreeterSenderInterface emailSender;

    public BirthdayGreeter(EmployeeRepository employeeRepository, DeviceInterface clock, BirthdayGreeterSenderInterface emailSender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.emailSender = emailSender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        List<Employee> empList = employeeRepository.findEmployeesBornOn(today);
        for(Employee e: empList){
            Email email = emailFor(e);
            emailSender.send(email);
        }
    }

    private Email emailFor(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }

}