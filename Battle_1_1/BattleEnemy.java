import Enemys.EnemysOrigin;
class BattleEnemy implements Characters.DungeonCharacters{
	private EnemysOrigin eO;
	private int[] lME;
	private int addLevel;
	private int[] ability;
	BattleEnemy(EnemysOrigin eO, int hierarchy){
		this.eO = eO;
		this.lME = setLME(eO.getME(), hierarchy);
		this.ability = setAbility(eO.getAbility(), hierarchy);
	}
	public int[] attack(){
		return this.eO.attack();
	}

	public String getName(){
		return eO.getName();
	}
	public int[] getLME(){
		return lME;
	}
	public int[] getAbility(){
		return ability;
	}


	private int[] setLME(int[] mE , int hierarchy){
		this.addLevel = Case.random(10);
		return new int[] {CaseOrigin.hierarchyPlace(hierarchy)*10+this.addLevel,calcME(mE[0], hierarchy),calcME(mE[1], hierarchy)};
	}
	private int calcME(int number, int hierarchy){
		return (int)(number*((hierarchy/10)+1));
	}
	private int[] setAbility(int[][] addAbility, int hierarchy){
		int[] ability = new int[7];
		int hierarchyPlaceInt = CaseOrigin.hierarchyPlace(hierarchy);
		for (int i=0; i<ability.length; i++) {
			ability[i] = addAbility[0][i]*hierarchyPlaceInt;
			if (Case.random(10-this.addLevel) == 0 || hierarchyPlaceInt == 0) ability[i] += Case.random(addAbility[1][i])+1;
		}
		return ability;
	}
}