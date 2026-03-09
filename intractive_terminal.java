public class intractive_terminal {

    public static void main(String[] args) {
        System.out.println("Welcome to the interactive terminal!");
        System.out.println("Please enter your name:");
        
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Read the user's name
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "! Nice to meet you.");
        
        // Close the scanner
        scanner.close();
    }
}