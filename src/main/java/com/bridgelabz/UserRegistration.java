package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validLastName() {
        System.out.print("Enter the Last Name : ");
        String l_name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(l_name);
        boolean r = m.matches();

        if (r)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is !Invalid");
        return r;
     }
}