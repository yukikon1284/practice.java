package Enemys;
public class EnemysOrigin implements Origins.OriginsType{
	private String name; //名前
	private int[] type; //{敵のダンジョン,敵の大きさ}{アイテムの種類, アイテムの種類の種類}
	private int[][] ability; //アビリティ
	private int money; //金
	private int experiencePoint; //敵の経験値
	private int[][] dropItems; //敵の落とすアイテム {{アイテム},{確率}};
	//private int[] dropItemsProbability; //敵の落とすアイテムの確率
	private String[] txts; //{説明,設定}
	//EnemysOrigin(名前, {敵のダンジョン,敵の大きさ}, 敵のアビリティ, 敵の金, 敵の経験値, 敵の落とすアイテム, 敵の落とすアイテムの確率, 敵の説明);
	public EnemysOrigin(final String name, final int[] type, final int[][] ability, final int money, final int experiencePoint, final int[] dropItems, final int[] dropItemsProbability, final String[] txts){
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.operationAbility = ability;
		this.money = money;
		this.experiencePoint = experiencePoint;
		this.dropItems = dropItems;
		this.dropItemsProbability = dropItemsProbability;
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
	public int[] getAbility(int place){
		return this.ability;
	}
	public void setOperationAbility(int[] ability){
		this.operationAbility = ability;
	}
	public void setOperationAbility(int place, int ability){
		this.operationAbility[place] += ability;
	}
	public int[] getOperationAbility(){
		return operationAbility;
	}
	public int getMoney(){
		return this.money;
	}
	public int getExperiencePoint(){
		return this.experiencePoint;
	}
	public int[] getDropItems(){
		return this.dropItems;
	}
	public int getDropItems(int place){
		return this.dropItems[place];
	}
	public int[] getDropItemsProbability(){
		return this.dropItemsProbability;
	}
	public int getDropItemsProbability(int place){
		return this.dropItemsProbability[place];
	}
	public String[] getTxts(){
		return this.txts;
	}
}