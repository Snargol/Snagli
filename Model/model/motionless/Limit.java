package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Limit extends MotionLess{

	public Limit(Position position) {
		super(0, 0, 1, "Limit", Opacity.BLOCKING, Permeability.KILLER, BlockEffect.NONE,Solidity.UNBREKABLE,position, 50, 50, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
