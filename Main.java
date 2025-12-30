package Lab06;

//------------------------------------------------------------
//Class Name: Main
//Description:
//This class is the entry point of the program.
//It is responsible for creating objects and demonstrating how
//the Subject and Session classes work together.
//This class does NOT contain business logic — only execution logic.
//
//Author: Chum kimchhun
//Date: 30/12/2025
//------------------------------------------------------------

public class Main {

 // -------------------- MAIN METHOD --------------------

 public static void main(String[] args) {

     // Step 1: Create a Subject object
     Subject subject = new Subject("SE201", "Software Engineering", 3);

     // Step 2: Create a Session object
     Session session = new Session("SE Revision", 14, 16);

     // Step 3: Display information using getter methods
     System.out.println("Subject Information:");
     System.out.println("Code: " + subject.getSubjectCode());
     System.out.println("Name: " + subject.getSubjectName());
     System.out.println("Credits: " + subject.getCredits());

     System.out.println();

     System.out.println("Session Information:");
     System.out.println("Session Name: " + session.getSessionName());
     System.out.println("Start Time: " + session.getStartTime());
     System.out.println("End Time: " + session.getEndTime());

     // Step 4: Demonstrate exception handling (optional example)
 }
}