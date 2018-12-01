package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class MirrorPaving extends MotionLess{

	public MirrorPaving(Position position) {
		super(Random.alea(7), 0, 1, "MirrorPaving", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.UNBREKABLE,position, 50, 50, 50, 50);
	}
}
