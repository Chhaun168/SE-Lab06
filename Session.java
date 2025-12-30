package Lab06;

//------------------------------------------------------------
//Class Name: Session
//Description:
//This class represents a study session during the day.
//It includes a name, start time, and end time.
//The class ensures that the session duration is valid.
//
//Author: Chum kimchhun
//Date: 30/12/2025
//------------------------------------------------------------

public class Session {

 // -------------------- ATTRIBUTES --------------------
 private String sessionName; 
 private int startTime;      
 private int endTime;        

 // -------------------- CONSTRUCTOR --------------------
 public Session(String sessionName, int startTime, int endTime) {
     setSessionName(sessionName);
     setDuration(startTime, endTime);
 }

 // -------------------- GETTERS --------------------
 public String getSessionName() {
     return sessionName;
 }

 public int getStartTime() {
     return startTime;
 }

 public int getEndTime() {
     return endTime;
 }

 // -------------------- SETTERS --------------------

 public void setSessionName(String sessionName) {
     if (sessionName == null || sessionName.trim().isEmpty()) {
         throw new IllegalArgumentException("Session name cannot be null or empty.");
     }
     this.sessionName = sessionName;
 }

 // -------------------- BUSINESS LOGIC --------------------
 public void setDuration(int startTime, int endTime) {

     // Validate logical time order
     if (startTime >= endTime) {
         throw new IllegalArgumentException(
             "Invalid duration: start time must be less than end time."
         );
     }

     // Validate 24-hour format
     if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24) {
         throw new IllegalArgumentException("Time must be between 0 and 24.");
     }

     this.startTime = startTime;
     this.endTime = endTime;
 }
}