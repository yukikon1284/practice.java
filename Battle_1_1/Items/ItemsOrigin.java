package Items;
public class ItemsOrigin{
	private String name;
	private int[] type;
	private int[] addAbility;
	private int money;
	private String description;
	//ItemsOrigin(名前, {アイテムの種類, アイテムの種類の種類}, 武器の効果, 武器の説明);
	public ItemsOrigin(final String name, final int[] type, final int[] addAbility, final int money, final String description){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
		this.money = money;
		this.description = description;
	}
	public String getName(){
		return this.name;
	}
	public int[] getType(){
		return this.type;
	}
	public int getType(int place){
		return this.type[place];
	}
	public int[] getAddAbility(){
		return this.addAbility;
	}
	public int getMoney(){
		return this.money;
	}
	public String getDescription(){
		return this.description;
	}
}