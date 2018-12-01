package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class SmallPavingHerbsHole extends MotionLess{

	public SmallPavingHerbsHole(Position position) {
		super(Random.alea(7), 0, 1, "SmallPavingHerbsHole", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.NORMAL,position, 50, 50, 50, 50);
	}
}
