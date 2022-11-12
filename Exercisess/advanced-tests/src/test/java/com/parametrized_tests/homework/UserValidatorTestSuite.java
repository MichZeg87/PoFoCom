package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;


import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"aaa", "AAA", "019", ".-_", "LoKeskywaLkeR_12-02-1995."})
    public void shouldValidateUsernameTrueForCorrectValue(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @CsvSource(value = {"a", "aa ", "A", "!@#$%", "^&*()+=", "[{}]:;|", "|?/><||"})
    public void shouldValidateUsernameFalseForIncorrectValue(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldValidateUsernameFalseIfStringIsEmpty(String userName) { // pusty string("")
        assertFalse(userValidator.validateUsername(userName));
    }


    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsEmptyOrNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"a.Z@9.Z", "a-A_09.Z-z_09@Za-zA9.ZafIrA", "Ar2-D2.C-3_PO@Sta-WR.Cosmos",
            "aaaaaa.aaaaaa@aaaaaa.aaaaaa", "1.12@123.abcd"})
    public void shouldValidateEmailTrueForCorrectValue(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {".@.", "a-A_09a.Z-z_09a@Za-zA9a.ZafIrAa", "Ar2-D2.C-3_PO@Sta-WR.Cosmo2", "Aa_1-", "null", " . @ . ",
            "aaaaaa.aaaaaa.aaaaaa.aaaaaa", "123456@123456@123456.abcdef", "1234.12345.123@12", "1@1@1@a"})
    public void shouldValidateEmailFalseForInCorrectValue(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}