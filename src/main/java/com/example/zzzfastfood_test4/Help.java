
package com.example.zzzfastfood_test4;

import java.util.Scanner;

public class Help {
    public static void about() {

        Scanner enter = new Scanner(System.in);
        /** Displays the about page representing the function of this application
         */

        String aboutText = "This is a self service kiosk designed for restaurant customers to \n" +
                "to place their own orders. " + "When the customer \n" +
                "presses the checkout button, the total price of the order including the \n" +
                "the sales tax will populate, prompting the user for payment.\n" +
                "This revision was simplified to meet the parameters defined by the instructor.";

        System.out.println("About:\n" + aboutText + "\n\nPress enter to continue");
        enter.nextLine();
    }
}
