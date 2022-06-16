package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {

    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
    @Test
    void givenFirstNameWhenValidatesShouldReturnTrue() {
        boolean result = userRegistrationProblem.validFirstName("Kiran");
        Assert.assertTrue(result);
    }

    @Test
    void givenLastNameWhenValidatesShouldReturnTrue() {
        boolean result = userRegistrationProblem.validLastName("Kumar");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmailWhenValidatesShouldReturnTrue() {
        boolean result = userRegistrationProblem.validEmail("kiranmcehsn@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenPhoneNumberWhenValidatesShouldReturnTrue() {
        boolean result = userRegistrationProblem.validPhoneNumber("91-9535368200");
        Assert.assertTrue(result);
    }

    @Test
    void givenPasswordWhenValidatesShouldReturnTrue() {
        boolean result = userRegistrationProblem.validPassword("Kiran@1234");
        Assert.assertTrue(result);
    }
}