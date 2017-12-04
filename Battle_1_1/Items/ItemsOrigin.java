package Items;
public class ItemsOrigin implements Origins.OriginsName, Origins.OriginsType{
	private String name; //名前
	private int[] type; //{敵のダンジョン,敵の大きさ}{アイテムの種類, アイテムの種類の種類}
	private int[] ability; //アビリティ
	private int attribute; //アイテムの属性
	private int money; //金
	private Boolean equipment; //装備できるか
	private int equipmentRestriction; //装備できる個数
	private int[] restriction; //制限{ダンジョン, 階層}
	private String[] txts; //{説明,設定}
	//ItemsOrigin(名前, {アイテムの種類, アイテムの種類の種類}, アイテムの能力, アイテムの属性, アイテムの価値, 装備できるか, 装備できる個数, 制限{ダンジョン, 階層}, {アイテムの説明, アイテムの設定});
	public ItemsOrigin(final String name, final int[] type, final int[] ability, final int attribute, final int money, final Boolean equipment, int equipmentRestriction, final int[] restriction, final String[] txts){
		this.name = name;
		this.type = type;
		this.ability = ability;
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
	public int[] getAbility(){
		return this.ability;
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
	public String[] getTxts(){
		return this.txts;
	}
}