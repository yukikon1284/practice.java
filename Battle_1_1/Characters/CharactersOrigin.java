package Characters;
public class CharactersOrigin implements DungeonCharacters, Origins.OriginsName{
	private String name; //名前
	private int[] ability; //キャラのアビリティ
	private int[] operationAbility; //操作用のアビリティ
	private int[][] equipment; //キャラの装備品 {{0},{0},{0,0,0,0,0},{0,0,0},{0}};
	private int[][] equipmentNumber;
	private int money; //キャラの金
	private int experiencePoint; //キャラの経験値
	private int[] items; //キャラのアイテム
	private int[] materialItems; //キャラの素材
	CharactersOrigin(final String name, final int[] ability, final int[] operationAbility, final int[][] equipment, final int[][] equipmentNumber, final int money, final int experiencePoint, final int[] items, final int[] materialItems){
		this.name = name;
		this.ability = ability;
		this.operationAbility = operationAbility;
		this.equipment = equipment;
		this.equipmentNumber = equipmentNumber;
		this.money = money;
		this.experiencePoint = experiencePoint;
		this.items = items;
		this.materialItems = materialItems;
	}
	public String getName(){
		return this.name;
	}
	public int[] getAbility(){
		return this.ability;
	}
	public int getAbility(int place){
		return this.ability[place];
	}
	public  void setOperationAbility(){
		this.operationAbility = Case.maxOperationAbility(this.ability);
	}
	public void setOperationAbility(int place, int ability){
		this.operationAbility[place] += ability;
	}
	public int[] getOperationAbility(){
		return this.operationAbility;
	}
	public int getOperationAbility(int place){
		return this.operationAbility[place];
	}
	public int[][] getEquipment(){
		return this.equipment;
	}
	public int[] getEquipment(int place){
		return this.equipment[place];
	}
	public int getMoney(){
		return this.money;
	}
	public int getExperiencePoint(){
		return this.experiencePoint;
	}
	public int[] getItems(){
		return this.items;
	}
	public int[] getMaterialItems(){
		return this.materialItems;
	}
}