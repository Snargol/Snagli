package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Fire extends MotionLess{

	public Fire(Position position) {
		super(0, Random.alea(2), 8, "Fire", Opacity.PENETRABLE, Permeability.DAMAGE, BlockEffect.BURN,Solidity.WEAK,position,true, 50, 50, 50, 50);
	}

}
