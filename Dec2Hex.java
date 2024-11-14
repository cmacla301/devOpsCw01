import java.util.Scanner;

class Dec2Hex {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: No input argument provided. Please provide an integer to convert.");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Non-integer input detected. Please provide a valid integer.");
            return;
        }

        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";

        if (num == 0) {
            hexadecimal = "0";
        } else {
            int tempNum = num;
            while (tempNum != 0) {
                int rem = tempNum % 16;
                hexadecimal = hexDigits[rem] + hexadecimal;
                tempNum = tempNum / 16;
            }
        }

        System.out.println(" test Hexadecimal representation is: " + hexadecimal);
    }
}
