package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class LargePavingHerbs extends MotionLess{

	public LargePavingHerbs(Position position) {
		super(Random.alea(3), 0, 1, "LargePavingHerbs", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.SOLID,position, 50, 50, 50, 50);
	}
}
