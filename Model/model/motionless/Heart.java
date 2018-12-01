package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Heart extends MotionLess{

	public Heart(Position position) {
		super(0, 0, 8, "Heart", Opacity.PENETRABLE, Permeability.GRABABLE, BlockEffect.HEAL,Solidity.WEAK, position,32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
