package com.codurance.dip;

public class EmailSender implements BirthdayGreeterSenderInterface {
    @Override
    public void send(Email email) {
        System.out.print("To:"+email.getTo()+", Subject: "+email.getSubject()+", Message: "+email.getMessage());
    }
}
