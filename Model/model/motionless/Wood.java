package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Wood extends MotionLess{

	public Wood(Position position) {
		super(Random.alea(3), 0, 1, "Wood", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.NORMAL,position, 50, 50, 50, 50);
	}

}
