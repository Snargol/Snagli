package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Bush extends MotionLess{

	public Bush(Position position) {
		super(0, Random.alea(9), 1, "Decort/", "Bush", Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.WEAK, position,true, 32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
