package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegisterationTest {

        //Test cases to check and validate the Password must be "True"

        @Test
        public void givenPassword_WhenProper_ShouldReturnTrue() {
            UserRegistration userRegistration = new UserRegistration();
            boolean result5 = userRegistration.validPassword();
            Assertions.assertTrue(result5);
        }

        //Test cases to check and validate the Password must be "False"
        @Test
        public void givenPassword_WhenProper_ShouldReturnFalse() {
            UserRegistration userRegistration=new UserRegistration();
            boolean result5 = userRegistration.validPassword();
            Assertions.assertFalse(result5);
        }
}
