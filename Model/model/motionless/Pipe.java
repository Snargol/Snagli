package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Pipe extends MotionLess {

	public Pipe(Permeability permeability,Position position) {
		super(0, 0, 2, "Pipe", Opacity.BLOCKING, permeability, BlockEffect.NONE,Solidity.SOLID,position, 32, 32, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
