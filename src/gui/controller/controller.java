package gui.controller;

import gui.view.HipsterFrame;

/**
 * simple GUI controller
 * @author jand6944
 *@version 0.2 november 9, 2015
 */

public class controller 
{
	/**
	 * refernece to the GUIFrame obct for internal use.
	 */
	private HipsterFrame baseFrame;

	/**
	 * Creates a GU controller and initializes the GUIFrame.
	 */
	public controller()
	{
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		
	}

}
