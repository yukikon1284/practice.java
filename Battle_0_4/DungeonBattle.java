class DungeonBattle{

	private static String enemyName;
	private static int[] enemyAbility;
	private static int[] enemyAbilityOperation;
	private static int[] enemyLME;
	DungeonBattle(final String name,final int[] ability,final int[] LME){
		enemyName = name;
		enemyAbility = ability;
		enemyAbilityOperation = getEnemyAbilityMax();
		enemyLME = LME;
	}
	static void setEnemyAbilityOperation(int place, int addAbility){
		enemyAbilityOperation[place] += addAbility;
		int abilityMaxInt = getEnemyAbilityMax()[place];
		int enemyAbilityOperationInt = enemyAbilityOperation[place];
		if (enemyAbilityOperationInt > abilityMaxInt) enemyAbilityOperation[place] = abilityMaxInt;
		else if (enemyAbilityOperationInt < 0) enemyAbilityOperation[place] = 0;
	}
	static int[] getEnemyAbilityMax(){
		int[] abilityMaxIntArr = new int[enemyAbility.length];
		for (int i=0; i<abilityMaxIntArr.length; i++) {
			abilityMaxIntArr[i] = getEnemyAbilityMax(i);
		}
		return abilityMaxIntArr;
	}
	static int getEnemyAbilityMax(int place){
		final int[] abilityMaxConstant = {10,10,1,1,1,1,1};
		return enemyAbility[place]*abilityMaxConstant[place];
	}
	static void seyAbility(int[] ability){
		for (int i=0; i<ability.length; i++) {
			Case.p(" "+abilityName(i)+" "+ability[i]+" ");
		}
		Case.pl("");
	}
	static String abilityName(int place){
		final String[] abilityName = {"HP","MP","STR","VIT","INT","MGR","AGI"};
		return abilityName[place];
	}
	static Boolean dungeonBattle(Boolean x){
		Boolean myHP = true;
		Boolean enemyHP = true;
		Case.pl(enemyName+"が現れた。");
		while(x && myHP && enemyHP){
			Case.pl(enemyName);
			seyAbility(enemyAbility);
			Case.pl(Character.getMyName());
			seyAbility(Character.getAbility());
			myBattle(x);
			enemyBattle(x);
		}
		return myHP;
	}
	static void enemyBattle(Boolean x){
		Case.pl("敵攻撃");
	}
	static int dungeonBattleMenu(){
		String[] menu = {"物理","魔法","道具"};
		int i;
		for (i=0; i<menu.length; i++) {
			Case.pl(Case.number(i)+menu[i]);
		}
		return i;
	}
	static void myBattle(Boolean x){
		while(x){
			try{
				int size = dungeonBattleMenu();
				int answer = Case.scanI();
				if (size < 0 || answer > size) Case.seyCorrect();
				else {
					if (answer != 1) x = battleMI(answer-2);
					else x = battleP();
				}
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
	}
	static Boolean battleMI(int place){
		int answer = 0;
		Boolean aaaa = true;
		try{
			//装備する場所表示。 文字列
			int[] places = {2, 3};
			int[] equipmentNumberIntArr = Character.getEquipmentNumber(places[place]);
			int i;
			for (i=0; i<equipmentNumberIntArr.length; i++) {
				String equipmentStr = Case.number(i)+Items.itemsName(Character.getEquipmentPlace(places[place], i, 0), Character.getEquipmentPlace(places[place], i, 1), Character.getEquipmentPlace(places[place], i, 2));
				if (places[place] == 2 || Character.getEquipmentPlace(places[place], i, 0) == 5) {
					Case.pl(equipmentStr);
				}else {
					Case.pl(equipmentStr+" ("+equipmentNumberIntArr[i]+")");
				}
			}
			Case.pl(Case.number(i)+Case.back());
			answer = Case.scanI();
			if (answer < 0 || answer > i+1) aaaa = false;
		}catch(java.util.InputMismatchException e){
			Case.seyCorrect();
		}
		return aaaa;
	}
	static Boolean battleP(){
		return false;
	}
}