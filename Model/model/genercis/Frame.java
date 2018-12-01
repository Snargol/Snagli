package model.genercis;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Frame {
	/*------------------------------------------------------------------------------*/
	/*                                 PARAMETRES                                   */
	/*------------------------------------------------------------------------------*/
	protected BufferedImage image;
	protected String PATH = new String();
	protected int width;
	protected int height;
	
	/*------------------------------------------------------------------------------*/
	/*                                 CONSTRUCTEURS                                */
	/*------------------------------------------------------------------------------*/

	public Frame(int width, int height, String name, String PATH) {
		this.width = width;
		this.height = height;
		this.PATH = PATH;
		this.PATH += name + ".png";
		loadImage();
	}
	
	/*------------------------------------------------------------------------------*/
	/*                                 METHODES                                     */
	/*------------------------------------------------------------------------------*/
	
	private void loadImage() {
		try {
			setImage(ImageIO.read(new File(PATH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*------------------------------------------------------------------------------*/
	/*                                 GET/SET                                      */
	/*------------------------------------------------------------------------------*/
	
	public BufferedImage getImage() {
		return this.image;
	}
	
	protected void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void setImage(String path) {
		this.PATH = path;
		loadImage();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
}
