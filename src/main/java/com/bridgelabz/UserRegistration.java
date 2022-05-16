package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean validMobileNumber() {
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex4 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(phoneNo);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
        return r4;
    }
}
