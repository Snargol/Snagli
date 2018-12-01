package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Pillar extends MotionLess{

	public Pillar(Position position) {
		super((int)(Math.random() * ((3 - 0)) + 1), 0 ,1, "Pillar", Opacity.PENETRABLE, Permeability.NONE, BlockEffect.NONE,Solidity.UNBREKABLE, position,50, 150, 50, 150);
		// TODO Auto-generated constructor stub
	}

}
