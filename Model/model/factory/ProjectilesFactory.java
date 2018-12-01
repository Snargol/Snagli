package model.factory;

import model.enumeration.Direction;
import model.enumeration.Opacity;
import model.enumeration.Projectiles;
import model.genercis.HitBoxe;
import model.genercis.Position;
import model.mobile.MobileEntity;
import model.projectile.Missile;
import model.projectile.Projectile;

public abstract class ProjectilesFactory {

	public static Projectile launchProjectile(Projectiles projectile, Position position, Direction direction) {
		switch (projectile) {
		case MISSILE :
			return createMissile(position, direction, projectile);
		default :
			System.out.println("projectile inconnu");
			return null;
		}
	}
	
	public static Projectile createMissile(Position position, Direction direction, Projectiles projectile) {
		int ypos = 0;
		switch (direction) {
		case RIGHT:
			ypos = 0;
			break;
		case LEFT :
			ypos = 1;
			break;
		case UP :
			ypos = 2;
			break;
		default :
			ypos = 0;
			break;
		}
		if (direction == Direction.STATIC || direction == null) {
			direction = Direction.RIGHT;
		}
		Projectile missile = new Projectile(0, ypos, 4, Opacity.BLOCKING, new HitBoxe(50,50), "Missile", 50, 50, 50, 50, position, direction, projectile);
		return missile;
	}
}
