package Characters;
public class CharactersOrigin implements Characters.DungeonCharacters{
	private String name; //名前
	private int[][] ability; //{{アビリティ}.{操作用のアビリティ}};
	//private int[] ability; //キャラの
	//private int[] operationAbility; //
	private int[][][] equipment; //{{{0},{0},{0,0,0,0,0},{0,0,0},{0}},{{0},{0},{0,0,0,0,0},{0,0,0},{0}}}; {{装備番号},{装備数}};
	// private int[][] equipment; //キャラの装備品 {{0},{0},{0,0,0,0,0},{0,0,0},{0}};
	// private int[][] equipmentNumber;
	//private int money; //キャラの金
	private int[] lME; //{レベル,お金,経験値};
	//private int experiencePoint; //キャラの経験値
	private int[][] items; //{{アイテム},{素材}};
	//private int[] items; //キャラのアイテム
	//private int[] materialItems; //キャラの素材
	CharactersOrigin(final int name, final int[][] ability, final int[][][] equipment, final int[] lME, final int[][] items){
		this.name = name;
		this.ability = ability;
		this.equipment = equipment;
		this.lME = lME;
		this.items = items;
	}

	public String getName(){
		return this.name;
	}
	public int[] getAbility(final int place){
		return ability[place];
	}
	public int[][] getEquipment(final int place){
		return equipment[place];
	}
	public int[] getLME(){
		return lME;
	}
	public int getLME(final int place){
		return lME[place];
	}
	public int[] getItems(int place){
		return items[place]
	}
	/*CharactersOrigin(final String name, final int[] ability, final int[] operationAbility, final int[][] equipment, final int[][] equipmentNumber, final int money, final int experiencePoint, final int[] items, final int[] materialItems){
		this.name = name;
		this.ability = ability;
		this.operationAbility = operationAbility;
		this.equipment = equipment;
		this.equipmentNumber = equipmentNumber;
		this.money = money;
		this.experiencePoint = experiencePoint;
		this.items = items;
		this.materialItems = materialItems;
	}*/




}