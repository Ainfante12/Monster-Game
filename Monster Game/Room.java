package Project1;

public class Room {

	public int roomIndex;
	public String description;
	public Monster monster;
	
	public Room(int roomIndex, String description, Monster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster; //what is the type of Monster	
	}
	// enter the method for the player, that checks if monster is alive returns boolean value and 
	// prints out the stats of the room
	public void enter(Player player) {
		if (monster.isAlive() == true) {
			System.out.println(player.getName() + " is " + player.getDescription() + " and has hitpoint of " + player.getHitPoints() +  " and damage of " + player.getDamage());
			System.out.println(player.getName() + " This room is" + this.description + "and has" + this.monster);
		}
	}
	public boolean isComplete() {
		if(monster.isAlive() == false) {
			return true;
		}
		return false;
	}
	@Override
	public String toString(){         
	   	return String.format("roomIndex %5d, description %20s, monster %10s", roomIndex, description, monster); 	
	    
	    }
	

	
}
