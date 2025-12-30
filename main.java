package Lab06;

//------------------------------------------------------------
//Class Name: Main
//Description:
//This class is the entry point of the program.
//It is responsible for creating objects and demonstrating how
//the Subject and Session classes work together.
//This class does NOT contain business logic — only execution logic.
//
//Author: Kong Sophanha
//Date: 30/12/2025
//------------------------------------------------------------

public class main {

    // -------------------- MAIN METHOD --------------------

    public static void main(String[] args) {
        // Initialize and display objects
        displaySubjectInformation();
        displaySessionInformation();
        
        // Optional: Add exception handling demonstration
        demonstrateExceptionHandling();
    }
    
    // -------------------- HELPER METHODS --------------------
    
    private static void displaySubjectInformation() {
        Subject subject = new Subject("SE201", "Software Engineering", 3);
        
        System.out.println("Subject Information:");
        System.out.println("Code: " + subject.getSubjectCode());
        System.out.println("Name: " + subject.getSubjectName());
        System.out.println("Credits: " + subject.getCredits());
        System.out.println();
    }
    
    private static void displaySessionInformation() {
        Session session = new Session("SE Revision", 14, 16);
        
        System.out.println("Session Information:");
        System.out.println("Session Name: " + session.getSessionName());
        System.out.println("Start Time: " + session.getStartTime());
        System.out.println("End Time: " + session.getEndTime());
    }
    
    private static void demonstrateExceptionHandling() {
        // Optional exception handling example
        try {
            // Example: Try creating invalid session
            Session invalidSession = new Session("Invalid", 18, 15);
        } catch (IllegalArgumentException e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
    }
}