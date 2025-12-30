
	package Lab06;

	//------------------------------------------------------------
	//Class Name: Session
	//Description:
	//This class represents a study session during the day.
	//It includes a name, start time, and end time.
	//The class ensures that the session duration is valid.
	//
	//Author: Kong Sophanha
	//Date: 30/12/2025
	//------------------------------------------------------------

	public class Session {

	    // -------------------- ATTRIBUTES --------------------
	    private String sessionName;
	    private int startTime;
	    private int endTime;
	    
	    // -------------------- CONSTANTS --------------------
	    private static final int MIN_HOUR = 0;
	    private static final int MAX_HOUR = 24;

	    // -------------------- CONSTRUCTOR --------------------
	    public Session(String sessionName, int startTime, int endTime) {
	        validateAndInitialize(sessionName, startTime, endTime);
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
	    
	    // -------------------- HELPER METHODS --------------------
	    
	    private void validateAndInitialize(String sessionName, int startTime, int endTime) {
	        validateSessionName(sessionName);
	        validateTimeRange(startTime, endTime);
	        
	        this.sessionName = sessionName;
	        this.startTime = startTime;
	        this.endTime = endTime;
	    }
	    
	    private void validateSessionName(String name) {
	        if (name == null || name.trim().isEmpty()) {
	            throw new IllegalArgumentException("Session name cannot be null or empty.");
	        }
	    }
	    
	    private void validateTimeRange(int start, int end) {
	        if (!isValidHour(start) || !isValidHour(end)) {
	            throw new IllegalArgumentException(
	                String.format("Time must be between %d and %d.", MIN_HOUR, MAX_HOUR)
	            );
	        }
	        
	        if (start >= end) {
	            throw new IllegalArgumentException(
	                "Invalid duration: start time must be less than end time."
	            );
	        }
	    }
	    
	    private boolean isValidHour(int hour) {
	        return hour >= MIN_HOUR && hour <= MAX_HOUR;
	    }
	    
	    // -------------------- SETTERS (Alternative approach) --------------------
	    
	    public void updateSession(String newName, int newStart, int newEnd) {
	        validateSessionName(newName);
	        validateTimeRange(newStart, newEnd);
	        
	        this.sessionName = newName;
	        this.startTime = newStart;
	        this.endTime = newEnd;
	    }
	    
	    // -------------------- ADDITIONAL BUSINESS METHODS --------------------
	    
	    public int getDuration() {
	        return endTime - startTime;
	    }
	    
	    public boolean overlapsWith(Session other) {
	        return (this.startTime < other.endTime && this.endTime > other.startTime);
	    }
	    
	    @Override
	    public String toString() {
	        return String.format("%s: %02d:00 - %02d:00", sessionName, startTime, endTime);
	    }
	}


