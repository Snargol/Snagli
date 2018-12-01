package model.genercis;

public class FrameBar extends Frame{
	
	/*------------------------------------------------------------------------------*/
	/*                                 PARAMETRES                                   */
	/*------------------------------------------------------------------------------*/
	private static String PATH = "Images/Bar/";
	private int widthMax;
	/*------------------------------------------------------------------------------*/
	/*                                 CONSTRUCTEURS                                */
	/*------------------------------------------------------------------------------*/
	public FrameBar(int width, int height, String name) {
		super(width, height, name, getPATH());
		this.widthMax = width;
	}
	/*------------------------------------------------------------------------------*/
	/*                                 METHODES                                     */
	/*------------------------------------------------------------------------------*/
	
	/*------------------------------------------------------------------------------*/
	/*                                 GET/SET                                      */
	/*------------------------------------------------------------------------------*/
	

	public void setWidthByPercentage(int percentage) {
		//this.width = 
		width = Math.round((widthMax * percentage)/100);
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	private static String getPATH() {
		return PATH;
	}
	
	
}
