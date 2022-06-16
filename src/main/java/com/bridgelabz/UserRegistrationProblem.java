package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

    static Scanner input = new Scanner(System.in);
    private static final String firstNamePattern = "(^[A-Z]){1,}([a-zA-Z]*)$";
    private static final String lastNamePattern = "(^[A-Z]){1,}([a-zA-Z]*)$";
    private static final String emailPattern = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
    private static final String phoneNumberPattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
    private static final String passwordPattern = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

    public boolean validFirstName(String firstName) {
        Pattern pattern= Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validLastName(String lastName) {
        Pattern pattern= Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validEmail(String email) {
        Pattern pattern= Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern= Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean validPassword(String password) {
        Pattern pattern= Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

        System.out.println("Validating User Entries");
        System.out.println(userRegistrationProblem.validFirstName("Kiran"));
        System.out.println(userRegistrationProblem.validLastName("Kumar"));
        System.out.println(userRegistrationProblem.validEmail("kiranmcehsn@gmail.com"));
        System.out.println(userRegistrationProblem.validPhoneNumber("91-9535368200"));
        System.out.println(userRegistrationProblem.validPassword("Kiran@123"));
    }
}
