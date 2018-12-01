package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Lava extends MotionLess{

	public Lava(Position position) {
		super(0, 0, 6, "Lava", Opacity.PENETRABLE, Permeability.KILLER, BlockEffect.BURN ,Solidity.UNBREKABLE,position, 50, 50, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
