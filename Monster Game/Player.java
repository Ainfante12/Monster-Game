package Project1;

public class Player extends Creature{

	private int healAmount;

	
	public Player(String n, String d, int hp, int damage, int healAmount){
		super(n,d,hp,damage);
		this.healAmount = healAmount;
	}
	
	public void heal() {
		setHitPoints(this.healAmount) ;   //hitpoints = hitpoints + healamount
	}

}
