package Items;
public class ItemsOrigin{
	private String name;
	private int[] type;
	private int[] addAbility;
	private int money;
	private String description;
	//ItemsOrigin(名前, ,,);
	ItemsOrigin(final String name, final int[] type, final int[] addAbility, int money, String description){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
		this.money = money;
		this.description = description;
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