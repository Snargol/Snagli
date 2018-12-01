package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Hill extends MotionLess{

	public Hill(Position position) {
		super((int)(Math.random() * ((7 - 0)) + 1), 0, 1, "Hill", Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.UNBREKABLE,position, 100, 50, 400, 200);
	}

}
