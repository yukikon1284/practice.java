package Items;
public class ItemsOrigin{
	private String name;
	private int[] type;
	private int[] addAbility;
	ItemsOrigin(final String name, final int[] type, final int[] addAbility){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
	}
	String getName(){
		return this.name;
	}
	int[] getType(){
		return this.type;
	}
	int getType(int place){
		return this.type[place];
	}
	int[] getAddAbility(){
		return this.addAbility;
	}
}