package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Dirt extends MotionLess{

	public Dirt(Position position) {
		super((int)(Math.random() * ((3 - 0)) + 1), 0 ,1, "Dirt", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.WEAK, position,32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
