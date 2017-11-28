package Items;
public class ItemsOrigin{
	private String name;
	private int[] type;
	private int[] addAbility;
	private int money;
	private String description;
	//ItemsOrigin(名前, {アイテムの種類, アイテムの種類の種類}, 武器の効果, 武器の説明);
	ItemsOrigin(final String name, final int[] type, final int[] addAbility, int money, String description){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
		this.money = money;
		this.description = description;
	}
	protected String getName(){
		return this.name;
	}
	protected int[] getType(){
		return this.type;
	}
	protected int getType(int place){
		return this.type[place];
	}
	protected int[] getAddAbility(){
		return this.addAbility;
	}
	protected int getMoney(){
		return this.money;
	}
	protected String getDescription(){
		return this.description;
	}
}