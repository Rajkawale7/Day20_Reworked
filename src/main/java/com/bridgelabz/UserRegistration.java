package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validEmail() {
        System.out.print("Enter the EmailID : ");
        String email = scanner.next();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p3 = Pattern.compile(regex);
        Matcher m3 = p3.matcher(email);
        boolean r3 = m3.matches();

        if (r3)
            System.out.println("Email_ID is valid");
        else
            System.out.println("Email_ID is !Invalid");
        return r3;
     }
}