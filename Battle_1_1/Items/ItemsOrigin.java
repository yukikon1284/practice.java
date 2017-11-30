package Items;
public class ItemsOrigin{
	private String name;
	private int[] type;
	private int[] addAbility;
	private int money;
	private Boolean equipment;
	private int[] restriction;
	private String[] txts;
	//ItemsOrigin(名前, {アイテムの種類, アイテムの種類の種類}, アイテムの能力, アイテムの価値, 装備できるか, 制限{ダンジョン, 階層}, {アイテムの説明, アイテムの設定});
	public ItemsOrigin(final String name, final int[] type, final int[] addAbility, final int money, final Boolean equipment, final int[] restriction, final String[] txts){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
		this.money = money;
		this.equipment = equipment;
		this.restriction = restriction;
		this.txts = txts;
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
	public Boolean getEquipment(){
		return this.equipment;
	}
	public int[] getRestriction(){
		return this.restriction;
	}
	public String getDescription(){
		return this.txts;
	}
}