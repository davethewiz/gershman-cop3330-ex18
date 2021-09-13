/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App
{
    public static void f_to_c() {
        double f = Input.GetDouble("Please enter the temperature in Fahrenheit: ");
        double c = (f - 32d) * 5d / 9d;

        System.out.printf("The temperature in Celsius is %.0f.", c);
    }

    public static void c_to_f() {
        double c = Input.GetDouble("Please enter the temperature in Celsius: ");
        double f = (c * 9d / 5d) + 32;

        System.out.printf("The temperature in Fahrenheit is %.0f.", f);
    }

    public static void main( String[] args )
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String convertType = Input.GetString("Your choice: ").toLowerCase();

        if (convertType.equals("c"))
            f_to_c();
        else if (convertType.equals("f"))
            c_to_f();
    }
}