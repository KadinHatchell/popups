package popups.controller;

import popups.view.popupViewer;

public class popupController
{
	private popupViewer display;
	
	public popupController()
	{
		display = new popupViewer();
		
	}
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("Hi there");
			
			answer = display.collectResponse("ya like memes? ");
			display.displayMessage(answer + " that's what you said");
			
		
		
		}
	}
	/**
	 * Checks if the supplied String can be parsed to a double value.
	 * @param potentialValue The string to test.
	 * @return Whether the calue could be parsed; true if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		}
		catch(NumberFormatException notdouble)
		{
			display.displayMessage("This is not  a double value =:<");
		}
		
		return isParseable;
	}
	
	/*
	 * Checks that the supplied string is parseable to an tinteger calue.
	 * @param potentialNumber The string to test for parsing.
	 * @return Whether it could be parsed as an integer.
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time!");
		}
		
		
		return isParseable;
	}
}
