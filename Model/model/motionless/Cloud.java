package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Cloud extends MotionLess {
	
	public Cloud(Position position) {
		super((int)(Math.random() * ((4 - 0)) + 1), 0, 1, "CLOUD",Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.UNBREKABLE, position,32, 32, 100, 100);
		// TODO Auto-generated constructor stub
	}

}
