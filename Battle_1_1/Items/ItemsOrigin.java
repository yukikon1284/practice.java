package Items;
public class ItemsOrigin{
	private String name; //名前
	private int[] type; //{アイテムの種類, アイテムの種類の種類}
	private int[] addAbility; //アイテムの能力
	private int attribute; //アイテムの属性
	private int money; //アイテムの価値
	private Boolean equipment; //装備できるか
	private int equipmentRestriction; //装備できる個数
	private int[] restriction; //制限{ダンジョン, 階層}
	private String[] txts; //{アイテムの説明, アイテムの設定}
	
	//ItemsOrigin(名前, {アイテムの種類, アイテムの種類の種類}, アイテムの能力, アイテムの属性, アイテムの価値, 装備できるか, 装備できる個数, 制限{ダンジョン, 階層}, {アイテムの説明, アイテムの設定});
	public ItemsOrigin(final String name, final int[] type, final int[] addAbility, final int attribute, final int money, final Boolean equipment, int equipmentRestriction, final int[] restriction, final String[] txts){
		this.name = name;
		this.type = type;
		this.addAbility = addAbility;
		this.attribute = attribute;
		this.money = money;
		this.equipment = equipment;
		this.equipmentRestriction = equipmentRestriction;
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
	public int getAttribute(){
		return this.attribute;
	}
	public int getMoney(){
		return this.money;
	}
	public Boolean getEquipment(){
		return this.equipment;
	}
	public int getEquipmentRestriction(){
		return this.equipmentRestriction;
	}
	public int[] getRestriction(){
		return this.restriction;
	}
	public String[] getDescription(){
		return this.txts;
	}
}