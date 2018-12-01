package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class LittlePics extends MotionLess{

	public LittlePics(Position position) {
		super(0, 0, 1, "LittlePics", Opacity.PENETRABLE, Permeability.DAMAGE, BlockEffect.SOFT_SPICY,Solidity.SOLID,position,true, 32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
