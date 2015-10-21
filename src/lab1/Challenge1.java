package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    public static void main(String[] args) {
        
        boolean askAgain = false;
        Challenge1 app = new Challenge1();
        String fullName = null;
        String lastName = null;
        
        do{
            fullName =  JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        
        
        try {
        lastName = app.extractLastName(fullName);
        askAgain = false;
        
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            askAgain = true;
        }

        }while(askAgain);
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    
}

    /**
     * Attempts to extract last name from full name Constructed of two
     * parts -- first and last name
     * @param fullName - a multi-party entry representing full name This Method cannot
     * guarantee that the name is entered in the form first name and then last name.
     * @return 
     * @throws IllegalArgumentException if full name == null or is empty or has less than two parts. 
     * If full name has two parts no exception will be thrown. this is due to multiple part last names.
     * 
     */
    
    
    public String extractLastName(String fullName) {
        if (fullName.isEmpty() || fullName == null){
            throw new IllegalArgumentException("Your Full name cannot be empty.");
        }         
        String[] nameParts = fullName.split(" ");
        if (nameParts.length < 2){
            throw new IllegalArgumentException("Incorrect Format");
        } 

        
        return nameParts[nameParts.length - 1];
    }

}
