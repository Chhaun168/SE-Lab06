package Lab06;

//------------------------------------------------------------
//Class Name: Subject
//Description:
//This class represents a university subject in Year 2 program.
//It stores information such as subject code, subject name, and credits.
//The class demonstrates good coding standards such as encapsulation,
//naming conventions, validation, and exception handling.
//
//Author: Kong Sophanha
//Date: 30/12/2025
//------------------------------------------------------------

public class Subject {

    // -------------------- CONSTANTS --------------------
    public static final int MAX_CREDITS = 5;
    private static final int MIN_CREDITS = 1;
    
    // -------------------- ATTRIBUTES --------------------
    private String subjectCode;
    private String subjectName;
    private int credits;
    
    // -------------------- CONSTRUCTORS --------------------
    
    // Primary constructor
    public Subject(String subjectCode, String subjectName, int credits) {
        initializeSubject(subjectCode, subjectName, credits);
    }
    
    // Copy constructor (optional enhancement)
    public Subject(Subject other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy a null subject.");
        }
        initializeSubject(other.subjectCode, other.subjectName, other.credits);
    }
    
    // -------------------- INITIALIZATION --------------------
    private void initializeSubject(String code, String name, int creditValue) {
        validateSubjectCode(code);
        validateSubjectName(name);
        validateCredits(creditValue);
        
        this.subjectCode = code;
        this.subjectName = name;
        this.credits = creditValue;
    }
    
    // -------------------- VALIDATION METHODS --------------------
    private void validateSubjectCode(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject code cannot be null or empty.");
        }
        // Additional validation could be added for format (e.g., "SE201")
        if (!code.matches("[A-Z]{2}\\d{3}")) {
            // Just a note - keeping original behavior but showing enhancement possibility
        }
    }
    
    private void validateSubjectName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
    }
    
    private void validateCredits(int creditValue) {
        if (creditValue < MIN_CREDITS || creditValue > MAX_CREDITS) {
            throw new IllegalArgumentException(
                String.format("Credits must be between %d and %d.", MIN_CREDITS, MAX_CREDITS)
            );
        }
    }
    
    // -------------------- GETTERS --------------------
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }
    
    // -------------------- BUSINESS METHODS --------------------
    
    public boolean isAdvancedCourse() {
        return credits >= 4;
    }
    
    public boolean matchesCode(String code) {
        return this.subjectCode.equalsIgnoreCase(code);
    }
    
    public String getCourseSummary() {
        return String.format("%s: %s (%d credits)", 
            subjectCode, subjectName, credits);
    }
    
    // -------------------- SETTERS (Alternative approach) --------------------
    public void updateSubject(String newCode, String newName, int newCredits) {
        validateSubjectCode(newCode);
        validateSubjectName(newName);
        validateCredits(newCredits);
        
        this.subjectCode = newCode;
        this.subjectName = newName;
        this.credits = newCredits;
    }
    
    @Override
    public String toString() {
        return getCourseSummary();
    }
}
