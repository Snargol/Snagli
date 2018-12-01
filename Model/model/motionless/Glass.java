package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Glass extends MotionLess{

	public Glass(Position position) {
		super(0, Random.alea(3), 1, "Glass", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.WEAK,position, 32, 32, 50, 50);
	}

}
