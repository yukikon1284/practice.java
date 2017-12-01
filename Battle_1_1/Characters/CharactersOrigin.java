package Characters;
public class CharactersOrigin{
	private String name; //名前
	private int[] ability; //キャラのアビリティ
	private int[] operationAbility; //操作用のアビリティ
	private int[][] equipment; //キャラの装備品 {{0},{0},{0,0,0,0,0},{0,0,0},{0}};
	private int money; //キャラの金
	private int experiencePoint; //キャラの経験値
	private int[] Items; //キャラのアイテム
	private int[] materialItems; //キャラの素材
	CharactersOrigin(final String name, final int[] ability, final int[] operationAbility, final int[][] equipment, final int money, final int experiencePoint, final int[] Items, final int[] materialItems){
		this.name = name;
		this.ability = ability;
		this.operationAbility = operationAbility;
		this.equipment = equipment;
		this.money = money;
		this.experiencePoint = experiencePoint;
		this.Items = Items;
		this.materialItems = materialItems;
	}
}