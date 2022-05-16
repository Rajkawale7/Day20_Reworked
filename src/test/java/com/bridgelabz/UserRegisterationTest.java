package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {

        //Test cases to check and validate the Email must be "True"

        @Test
        public void givenEmail_WhenProper_ShouldReturnTrue() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result= userRegistration.validEmail();
            Assertions.assertTrue(result);
        }

        //Test cases to check and validate the Email must be "False"
        @Test
        public void givenEmail_WhenProper_ShouldReturnFalse() {
            UserRegistration userRegistration=new UserRegistration();
            boolean result= userRegistration.validEmail();
            Assertions.assertFalse(result);
        }
}
