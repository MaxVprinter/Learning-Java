public class Terminal_work {
    public static void main(String[] args) {
                    System.out.println(" ");
        System.out.println("Welcome to the terminal, A pre set confirmation code has been generated please confirm it.");

        // Create a Scanner object to read user input
        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
    
        int Number = 65; // Pre-set number
        System.out.println(" ");
        System.out.println("enter the confirmation code: ");
            System.out.println(" ");

        // read the number
        String OrignalNum = scanner1.nextLine();
        
        if ( OrignalNum.equals(String.valueOf(Number))) {
                        System.out.println(" ");
            System.out.println("Great! You confirmed the number: " );
             System.out.println("script successfully executed");
        } else {
         System.out.println(" ");
          System.out.println("The numbers do not match. Please run the program again to enter the correct number.");
 System.out.println(" ");
        }
           
        // Close the scanner
        scanner1.close();


}
}
