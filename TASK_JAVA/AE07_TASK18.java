package JAVA_PROGRAMMING.TASK_JAVA;
//HOLLOW PYRAMID
public class AE07_TASK18 {
    public static void main(String[] args) {
        int i; // Loop variable for rows
        int j; // Loop variable for columns
        for(i = 1; i <= 5; i++) { // Loop through each row
            // Print leading spaces
            for(j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // Print spaces to align the triangle
            }
            
            // Print the hollow part
            for(j = 1; j <= i; j++) {
                // Conditions to print '*' or space
                if(i == 1 || j == 1 || j == i || i == 5) {
                    System.out.print("*" + " "); // Print '*' for the first row, first column, last column, and last row
                } else {
                    System.out.print("  "); // Print two spaces for hollow effect
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
