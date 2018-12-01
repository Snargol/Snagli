package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class Propulsor extends MotionLess{

	public Propulsor(Position position) {
		super(0, 0, 6, "Propulsor", Opacity.PENETRABLE, Permeability.ELEVATOR, BlockEffect.NONE,Solidity.SOLID, position,true, 50, 50, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
