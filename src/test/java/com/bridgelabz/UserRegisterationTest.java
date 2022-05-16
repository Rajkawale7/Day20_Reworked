package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {

        //Test cases to check and validate the last name must be "True"

        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result= userRegistration.validLastName();
            Assertions.assertTrue(result);
        }

        //Test cases to check and validate the last name must be "False"
        @Test
        public void givenFirstName_WhenProper_ShouldReturnFalse() {
            UserRegistration userRegistration=new UserRegistration();
            boolean result= userRegistration.validLastName();
            Assertions.assertFalse(result);
        }
}
