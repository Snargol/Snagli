package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class GoldenApple extends MotionLess{

	public GoldenApple(Position position) {
		super(0, 0, 1, "GoldenApple", Opacity.PENETRABLE, Permeability.GRABABLE, BlockEffect.REGENERATION  ,Solidity.WEAK,position, 52, 52, 40, 40);
		// TODO Auto-generated constructor stub
	}
	
	
}
