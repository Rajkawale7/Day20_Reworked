package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {

        //Test cases to check and validate the Contact Number must be "True"

        @Test
        public void givenContact_WhenProper_ShouldReturnTrue() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result4 = userRegistration.validMobileNumber();
            Assertions.assertTrue(result4);
        }

        //Test cases to check and validate the Email must be "False"
        @Test
        public void givenEmail_WhenProper_ShouldReturnFalse() {
            UserRegistration userRegistration=new UserRegistration();
            boolean result4 = userRegistration.validMobileNumber();
            Assertions.assertFalse(result4);
        }
}
