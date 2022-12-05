package Tools;

import java.util.Scanner;

public class MyTool {
    public static final Scanner sc = new Scanner(System.in);

    public static String getString(String mess) {
        String input;
        while (true) {
            System.out.print(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty() || input.length() == 0) {
                System.out.println("No blank and space");
            } else {
                return input;
            }
        }
    }

    public static int getInt(String mess) {
        while (true) {
            try {
                System.out.print(mess);
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number!!!");
            }
        }
    }

    public static boolean confirmYesNo(String mess) {
        while (true) {
            System.out.print(mess);
            String result = sc.nextLine();
            // check user input y/Y or n/N
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
        }
    }
}
