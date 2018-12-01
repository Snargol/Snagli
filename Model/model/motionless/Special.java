package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Special extends MotionLess{

	public Special(BlockEffect effect,Position position) {
		super(0, 0, 6, "SpecialBlock", Opacity.BLOCKING, Permeability.NONE, BlockEffect.GIVE_MONEY, Solidity.SOLID, position,32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
