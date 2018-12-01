package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Brick extends MotionLess{

	public Brick(Position position) {
		super((int)(Math.random() * ((3 - 0)) + 1), 0, 1, "Brick", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.WEAK,position, 32, 32, 50, 50);
	}

}
