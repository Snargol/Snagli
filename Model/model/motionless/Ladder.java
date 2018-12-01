package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Ladder extends MotionLess{

	public Ladder(Position position) {
		super(0, 0, 1, "Ladder", Opacity.PENETRABLE, Permeability.SCALABLE, BlockEffect.NONE,Solidity.UNBREKABLE,position, 32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
