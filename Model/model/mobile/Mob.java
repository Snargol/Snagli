package model.mobile;

import java.util.ArrayList;

import model.enumeration.Behaviour;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.genercis.HitBoxe;
import model.genercis.Position;
import model.genercis.Sprite;

public class Mob extends MobileEntity{

	private Behaviour behaviour;
	private ArrayList<Sprite> burnSprites;
	private ArrayList<Sprite> deadSprites;
	private ArrayList<Sprite> splashSprites;
	
	public Mob(int xSpritePos, int ySpritePos, int nbSprites,String name, Opacity opacity, HitBoxe hitboxe, Position position,
			Behaviour behaviour,  int widthFrame, int heightFrame, int widthDisplay, int heightDisplay) {
		super(xSpritePos, ySpritePos, nbSprites, name, opacity, hitboxe, position,  widthFrame, heightFrame, widthDisplay, heightDisplay);
		this.behaviour = behaviour;
		// TODO Auto-generated constructor stub
	}
	
}
;