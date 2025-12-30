package Lab06;

//------------------------------------------------------------
//Class Name: Subject
//Description:
//This class represents a university subject in Year 2 program.
//It stores information such as subject code, subject name, and credits.
//The class demonstrates good coding standards such as encapsulation,
//naming conventions, validation, and exception handling.
//
//Author: Chum kimchhun
//Date: 30/12/2025
//------------------------------------------------------------

public class Subject {

 // -------------------- CONSTANT --------------------
 public static final int MAX_CREDITS = 5;

 // -------------------- ATTRIBUTES --------------------
 private String subjectCode;   
 private String subjectName;   
 private int credits;        

 // -------------------- CONSTRUCTOR --------------------
 public Subject(String subjectCode, String subjectName, int credits) {
     setSubjectCode(subjectCode);
     setSubjectName(subjectName);
     setCredits(credits);
 }

 // -------------------- GETTERS --------------------
 public String getSubjectCode() {
     return this.subjectCode;
 }

 public String getSubjectName() {
     return this.subjectName;
 }

 public int getCredits() {
     return this.credits;
 }

 // -------------------- SETTERS WITH VALIDATION --------------------

 public void setSubjectCode(String subjectCode) {
     if (subjectCode == null || subjectCode.isBlank()) {
         throw new IllegalArgumentException("Subject code cannot be null or empty.");
     }
     this.subjectCode = subjectCode;
 }

 public void setSubjectName(String subjectName) {
     if (subjectName == null || subjectName.isBlank()) {
         throw new IllegalArgumentException("Subject name cannot be null or empty.");
     }
     this.subjectName = subjectName;
 }

 public void setCredits(int credits) {
     // Changed logic slightly but same output
     if (!(credits > 0 && credits <= MAX_CREDITS)) {
         throw new IllegalArgumentException(
             "Credits must be between 1 and " + MAX_CREDITS
         );
     }
     this.credits = credits;
 }
}