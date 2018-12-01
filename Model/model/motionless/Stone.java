package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Stone extends MotionLess{

	public Stone(Position position) {
		super((int)(Math.random() * ((3 - 0)) + 1), 0, 1, "Stone", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.SOLID,position, 32, 32, 50, 50);
	}

}
