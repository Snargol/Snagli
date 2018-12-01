package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Void extends MotionLess{

	public Void(Position position) {
		super(0, 0, 1, "Void", Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.UNBREKABLE,position, 50, 50, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
