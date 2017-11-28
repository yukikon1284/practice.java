class Dungeon{
	private static final int[] dungeonLevel = {1,11,21,31,41,51,61,71,81,91};
	private static int[] places = {0,0};
	static void dungeon(Boolean x){
		int i = 0;
		while(x){
			try{
				int size = dungeonpl(i);
				int answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) x = false;
					else i--;
				}else if (answer > 0 && answer <= size+1) {
					if (i == 1 && dungeonLevel(answer-1)) {
						places[i] = getDungeonLevel()[answer-1];
						//x = ba;
						//modoru
						x = dungeonBattleSet(x); 
					}else if (i != 1) {
						places[i] = answer-1;
						i++;
					}else Case.pl("開放されていない。");
				}else Case.seyCorrect();
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
	}
	private static int dungeonpl(int place){
		final String[][] dungeonif = 
		{{"a1","a2","a3","a4","a5"}
		,{"1階","11階","21階","31階","41階","51階","61階","71階","81階","91階"}};
		int i;
		for (i=0; i<dungeonif[place].length; i++) Case.pl(Case.number(i)+dungeonif[place][i]);
		Case.pl(Case.number(i)+Case.back());
		return i;
	}
	static int[] getDungeonLevel(){
		return dungeonLevel;
	}
	private static Boolean dungeonBattleSet(Boolean x){
		Boolean myHP = true;
		while(x && myHP){
			Case.pl("敵");
			int answer = Case.YN(x);
			if (answer == 1) {
				SetEnemy SetEnemy = new SetEnemy(places);
				Case.pl(Case.toString(SetEnemy.getSC()));
				Case.pl(Case.toString(SetEnemy.getAbility()));
				Case.pl(Case.toString(SetEnemy.getLME()));
				int[] SC = SetEnemy.getSC();
				DungeonBattle DungeonBattle = new DungeonBattle(Enemy.getName(places[0], SC[0], SC[1]), SetEnemy.getAbility(), SetEnemy.getLME());
				myHP = DungeonBattle.dungeonBattle(x);
			}
			else if (answer == 2) x = false;
			if (myHP == false) dungeonHP();
		}
		return myHP;
	}
	private static Boolean dungeonLevel(int hierarchy){
		Boolean duLeBo = false;
		if (getDungeonLevel()[hierarchy] <= Character.getDungeonLevel()) duLeBo = true;
		return duLeBo;
	}
	private static void dungeonHP(){
		Case.pl(Character.getMyName()+"は倒れた。"+Case.newLine()+"町に送還された。");
	}
}