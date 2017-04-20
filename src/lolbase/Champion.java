package lolbase;

/**
 * Class object for champions, uses abilities and skins.
 */
public class Champion {
	/**
	 * Enum of champion lanes
	 */
	public enum Position {
		Top,
		Mid,
		Jungle,
		Adc,
		Support;
		
		@Override
		public String toString() {
			return super.toString();
		}
	}
	/**
	 * Enum of roles
	 */
	public enum Role {
		Mage,
		Marksman,
		Support,
		Tank,
		Fighter,
		Assassin,
	}
	
	public int id;
	public String name;
	public String title;
	public Position pos;
	public String lore;
	public Role role;
	
	//Constructor to initialise values
	public Champion(){
		this.id = -1;
		this.name = "DefaultName";
		this.title = "DefaultTitle";
		this.lore = "DefaultLore";
		this.pos = null;
		this.role = null;

	}

}
