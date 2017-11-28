class SetEnemy{
	private static int[] DH;
	private static int[] SC = new int[2];
	private static int addLevel;
	private static int[] ability = new int[7];
	private static int[] LME = new int[3];
	SetEnemy(int[] places){
		DH = places;
		setSC();
		addLevel = Case.random(9);
		setAbility();
		setLME();
	}
	private static void setSC(){
		final int[] SCIntArr = {1,10,50};
		final int[] characterArr = {Case.random(3+dungeonLevel()),DH[1]/10-1,DH[1]/50-1};
		int i;
		for (i=2; i>=0; i--) if (DH[1]%SCIntArr[i] == 0) break;
		SC[0] = i;
		SC[1] = characterArr[i];
	}
	private static int dungeonLevel(){
		int i;
		int[] dungeonLevel = Dungeon.getDungeonLevel();
		for (i=0; i<dungeonLevel.length; i++) if (dungeonLevel[i] >= DH[1]) break;
		return i;
	}
	private static void setLME(){
		LME[0] = addLevel + Dungeon.getDungeonLevel()[dungeonLevel()];
		LME[1] = Enemy.getMoney(DH[0], SC[0], SC[1])*LME[0]/10;
		LME[2] = Enemy.getExperience(DH[0], SC[0], SC[1])*LME[0]/10;
	}
	private static void setAbility(){
		//変動
		int[] abilityVariable = Enemy.getAbilityVariable(DH[0], SC[0], SC[1]);
		//ko
		int[] abilityFixed = Enemy.getAbilityFixed(DH[0], SC[0], SC[1]);
		for (int i=0; i<ability.length; i++) {
			ability[i] = abilityFixed[i];
			if (Case.random(10-addLevel) == 0) ability[i] += Case.random(abilityVariable[i])+1;
		}
	}
	int[] getSC(){
		return SC;
	}
	int[] getAbility(){
		return ability;
	}
	int[] getLME(){
		return LME;
	}
}