package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {

        //Test cases to check and validate the name must be "True"

        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result= userRegistration.validFirstName();
            Assertions.assertTrue(result);
        }

        //Test cases to check and validate the name must be "False"
        @Test
        public void givenFirstName_WhenProper_ShouldReturnFalse() {
            UserRegistration userRegistration=new UserRegistration();
            boolean result= userRegistration.validFirstName();
            Assertions.assertFalse(result);
        }
}
