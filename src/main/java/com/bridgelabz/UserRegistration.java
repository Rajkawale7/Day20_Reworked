package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validPassword() {
        System.out.print("Enter your Password : ");
        String Password = scanner.nextLine();
        String regex5 = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(Password);
        boolean r5 = m5.matches();
        if (r5)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
        return r5;
    }
}
