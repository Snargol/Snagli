package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;

public class Octopus extends MotionLess{
	public Octopus (String name, BlockEffect effect,Position position) {
		super(0, 0, 1, name, Opacity.PENETRABLE, Permeability.GRABABLE, effect, Solidity.WEAK, position,50, 50, 50, 50);
	}
}
