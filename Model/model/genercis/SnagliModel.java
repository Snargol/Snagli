package model.genercis;

import java.util.ArrayList;
import java.util.Observable;

import model.bar.IGaugeBar;
import model.bar.StateBar;
import model.bar.TextsBar;
import model.mobile.Balls;
import model.mobile.Mob;
import model.mobile.Player;
import model.other.MovableText;
import model.other.Timer;
import model.particule.Particule;
import model.particule.ParticuleDebris;
import model.projectile.Projectile;

public class SnagliModel extends Observable{

	/*------------------------------------------------------------------------------*/
	/*                                 ATTRIBUTES                                   */
	/*------------------------------------------------------------------------------*/
	private Map 						map;
	private ArrayList<Mob> 				monsters 			=  new ArrayList<>();
	private ArrayList<Balls> 			balls    			=  new ArrayList<>();
	private ArrayList<IGaugeBar>		gaugeBars 			=  new ArrayList<>();
	private ArrayList<MovableText> 		texts     			=  new ArrayList<>();
	private ArrayList<ParticuleDebris> 	particulesDebris 	=  new ArrayList<>();
	private ArrayList<Particule>		particules    		=  new ArrayList<>();
	private ArrayList<Projectile> 		projectiles			=  new ArrayList<>();
	private TextsBar					textBar;
	private StateBar 					stateBar;
	private Player 						player;
	private Timer 						timer;
	private int COO_PLAYER_DISPLAY_X = 750;
	private int widthScreen = 1400;
	private int SIZE_BOXE = 50;

	/*------------------------------------------------------------------------------*/
	/*                            CONSTRUCTORS/DESTRUCTORS                          */
	/*------------------------------------------------------------------------------*/
	public SnagliModel() {
		this.timer = new Timer();
	}

	/*------------------------------------------------------------------------------*/
	/*                                 METHODS                                     */
	/*------------------------------------------------------------------------------*/

	/*------------------------------------------------------------------------------*/
	/*                                 GET/SET                                      */
	/*------------------------------------------------------------------------------*/

	public Timer getTimer() {
		return timer;
	}

	public ArrayList<Mob> getMonsters() {
		return monsters;
	}

	public void setMonsters(ArrayList<Mob> monsters) {
		this.monsters = monsters;
	}

	public ArrayList<Balls> getBalls() {
		return balls;
	}

	public void setBalls(ArrayList<Balls> balls) {
		this.balls = balls;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void addMonster(Mob mob) {
		monsters.add(mob);

	}

	public void setMobilesHavesMoved() {
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<IGaugeBar> getGaugeBars() {
		return gaugeBars;
	}

	public void addBar(IGaugeBar bar) {
		this.gaugeBars.add(bar);
	}


	public ArrayList<MovableText> getTexts() {
		return texts;
	}

	public void addtext(MovableText text) {
		this.texts.add(text);
	}
	
	public ArrayList<ParticuleDebris> getParticulesDebris() {
		return particulesDebris;
	}

	public void addParticulesDebris(ParticuleDebris particuleDebris) {
		this.particulesDebris.add(particuleDebris);
	}
	
	public ArrayList<Particule> getParticules() {
		return particules;
	}

	public void addParticule(Particule particule) {
		this.particules.add(particule);
	}

	public StateBar getStateBar() {
		return stateBar;
	}

	public void setStateBar(StateBar stateBar) {
		this.stateBar = stateBar;
	}

	public TextsBar getTextBar() {
		return textBar;
	}

	public void setTextBar(TextsBar textBar) {
		this.textBar = textBar;
	}
	
	public ArrayList<Projectile> getProjectiles() {
		return projectiles;
	}

	public void addProjectile(Projectile projectile) {
		this.projectiles.add(projectile);
	}
	
	public int getDistanceGap() {
		if (player.getPosition().getX() < COO_PLAYER_DISPLAY_X ) {
			return 0;
		}
//		else if (player.getPosition().getX() + 16 * 50 > (getMap().getWidth() * 50)) {
//			return player.getPosition().getX();
//		}
		else if (player.getPosition().getX() + ((getWidthScreen()-COO_PLAYER_DISPLAY_X-getPlayer().getHitboxe().getWidth())) >= (getMap().getWidth() * SIZE_BOXE)) {
			//decalage des objets
			return COO_PLAYER_DISPLAY_X - (getMap().getWidth()*SIZE_BOXE - ((getWidthScreen()-COO_PLAYER_DISPLAY_X-getPlayer().getHitboxe().getWidth())));
		}
		return (COO_PLAYER_DISPLAY_X - player.getPosition().getX());
	}
	
	public int getDistanceGapMap() {
		if (player.getPosition().getX() < COO_PLAYER_DISPLAY_X ) {
			return 0;
		}
		else if (player.getPosition().getX() + ((getWidthScreen()-COO_PLAYER_DISPLAY_X-getPlayer().getHitboxe().getWidth())) >= (getMap().getWidth() * SIZE_BOXE)) {
			//decalage de la map
			return COO_PLAYER_DISPLAY_X - (getMap().getWidth()*SIZE_BOXE - (getWidthScreen() - (COO_PLAYER_DISPLAY_X + getPlayer().getHitboxe().getWidth())));
		}
		return (COO_PLAYER_DISPLAY_X - player.getPosition().getX());
	}

	public int getWidthScreen() {
		return widthScreen;
	}

	public void setWidthScreen(int widthScreen) {
		this.widthScreen = widthScreen;
	}
	
	
}
