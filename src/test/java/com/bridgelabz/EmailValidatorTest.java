package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidatorTest {

    private String inputEmail;
    private Boolean expectedResult;
    private EmailValidator emailValidator;

    @Before
    public void initialize() {
        emailValidator = new EmailValidator();
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method
    public EmailValidatorTest(String inputEmail, Boolean expectedResult) {
        this.inputEmail = inputEmail;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { "abc@yahoo.com", true },
                { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true },
                { "abc111@abc.com", true },
                { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true },
                { "abc@1.com", true },
                { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true }
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testEmailChecker() {
        System.out.println("Parameterized Number is : " + inputEmail);
        Assert.assertEquals(expectedResult, emailValidator.validateEmail(inputEmail));
    }
}