public class I_Try_terminal {

    public static void main(String[] args) {
        System.out.println("Welcome to the terminal enter a number.");


        // Create a Scanner object to read user input
        java.util.Scanner scanner1 = new java.util.Scanner(System.in);

        // read the number 

        String OrignalNum = scanner1.nextLine();

        System.out.println("You entered: " + OrignalNum);

        System.out.println("is this correct? (yes/no)");
        String answer = scanner1.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Great! You confirmed the number: " + OrignalNum);
             System.out.println("script successfully executed");
        } else {
             System.out.println("please re-enter the number to confirm it is correct");
            String ConfirmNum = scanner1.nextLine();
            if (ConfirmNum.equals(OrignalNum)) {
                System.out.println("Number confirmed successfully: " + ConfirmNum);
            } else {
                System.out.println("The numbers do not match. Please run the program again to enter the correct number.");
            }
        }

       
        // Close the scanner
        scanner1.close();

       
    }
    
}
