package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Rock extends MotionLess{

	public Rock(Position position) {
		super(0, Random.alea(0, 8), 1, "Decort/", "Rock", Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.WEAK, position,true, 32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
