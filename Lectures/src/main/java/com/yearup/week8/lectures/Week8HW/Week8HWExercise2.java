package com.yearup.week8.lectures.Week8HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week8HWExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = Integer.valueOf(sc.nextLine());

        for (int i=1; i<=n; i++) {
            System.out.println("Enter string # " + i);
            String input = sc.nextLine();

            if(checkIfValidEmail(input)) {
                continue;
            }

            if(checkIfPhoneNumber(input)) {
                System.out.println("you entered a phone number");
                continue;
            }

            if(checkIfAddress(input)) {
                System.out.println("It’s an address");
            }
            else {
                System.out.println("No match");
            }

        }

    }

    public static boolean checkIfValidEmail(String str) {
        Pattern p = Pattern.compile("(\\w+)@\\w+.[a-z]{3}");
        Matcher m = p.matcher(str);
        while(m.find()) {
            String username = m.group(1);
            System.out.println("It's " + username + " email");
            return true;
        }

        return false;
    }

    public static boolean checkIfPhoneNumber(String str) {

        Pattern p = Pattern.compile("\\((\\d{3})\\)\\d{3}-\\d{4}");
        Matcher m = p.matcher(str);
        while(m.find()) {
            String areaCode = m.group(1);
            System.out.println("It’s a phone number with area code " + areaCode);
            return true;
        }

        return false;
    }

    public static boolean checkIfAddress(String str) {
        return Pattern.matches("^[1-9][0-9]*\\s[A-Za-z\\s0-9]+,[A-Za-z\\s0-9]+,\\s[A-Z]{2}\\s[0-9]{5}", str);
    }

}
