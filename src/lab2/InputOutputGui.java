package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        boolean Repeat = false;
        String fullName = null;
        String lastName = null;
       
        
        do{
            fullName =  JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        
        
        try {
        lastName = nameService.extractLastName(fullName);
        Repeat = false;
        
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            Repeat = true;
        }

        }while(Repeat);
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);

        
    }
     
}
