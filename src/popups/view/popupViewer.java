package popups.view;

import javax.swing.JOptionPane;

/**
 * Popup Viewer class
 * @author Hatchell.Kadin
 * @version 9/27/2016
 */
public class popupViewer
{
	/**
	 * makes a popup window to display the supplied message.
	 * @param message The message to be placed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Creates an input popup to collect a response from the user as a String.
	 * @param question The question being asked to the user.
	 * @return The user's response.
	 */
	public String collectResponse(String question)
	{
		String response = " ";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		 
		return response;
	}

}
