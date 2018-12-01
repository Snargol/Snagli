package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Coin extends MotionLess{

	public Coin(Position position) {
		super(0, 0, 9, "Coin", Opacity.PENETRABLE, Permeability.GRABABLE, BlockEffect.GIVE_MONEY,Solidity.WEAK,position, 50, 50, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
