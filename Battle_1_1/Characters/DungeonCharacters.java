public class DungeonCharacters{
	/*private String name; //名前
	private int[] ability; //キャラのアビリティ
	private int[] operationAbility; //操作用のアビリティ
	private int[][] equipment; //キャラの装備品 {{0},{0},{0,0,0,0,0},{0,0,0},{0}};*/

	DungeonCharacters(Characters.CharactersOrigin cO){
		this.name = cO.getName();
		this.ability = cO.getAbility();
		operationAbility = cO.getOperationAbility;
		this.equipment = cO.getEquipment;
	}
	DungeonCharacters(Enemys.EnemysOriginn eO){
		this.name = eO.getName();
		this.ability = eO.getAbility();
		this.operationAbility = CaseOrigin.maxOperationAbility(this.ability);
		this.equipment = eO.equipment();
	}
	void resistance();
}