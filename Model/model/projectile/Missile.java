package model.projectile;

import model.enumeration.Direction;
import model.enumeration.Opacity;
import model.enumeration.Solidity;
import model.genercis.HitBoxe;
import model.genercis.Position;
import model.mobile.MobileEntity;

public class Missile extends MobileEntity{

	public Missile(Position position, Direction direction) {
		super(0, 0, 4, "Missile", Opacity.BLOCKING, new HitBoxe(50,50), position, 50, 50, 50, 50);
		switch (direction) {
		case RIGHT:
			createSpriteArray(0, 0, 4, 50, 50);
			break;
		case LEFT :
			createSpriteArray(0, 1, 4, 50, 50);
			break;
		case UP :
			createSpriteArray(0, 2, 4, 50, 50);
			break;
		default :
			setAlive(false);
			break;
		}
		
		setSolidityDestructiblesElements(Solidity.SOLID);
	}
	
	public void move(Direction direction) {
		switch (direction) {
		case RIGHT :
			getPosition().addX(getSpeed());
			break;
		case LEFT : 
			getPosition().addX(-getSpeed());
			break;
		case UP : 
			getPosition().addY(-getSpeed());
			break;
		default :
			setAlive(false);
			break;
		}

	}

}
