class BattleCharacter{
	private String name;
	private int[][] ability = {{0,0,0,0,0,0,0},{1,0,0,0,0,0,0}};
	private int[][][] equipment = {{{0},{0},{0,0,0},{0,0,0,0,0},{0}},{{1},{1},{1,1,1},{1,1,1,1,1},{1}}};
	BattleCharacter(String name, int[][] ability){
		this.name = name;
		this.ability = ability;
	}
	public int[][] attack(){
		int[] place = new int[2];
		Boolean x = true;
		while(x){
			try{
				Case.pl("攻撃");
				int size = attackif();
				int answer = Case.scanI(3);

				if (answer == 1) {
					x = false;
					place[0] = answer-1;
					//place[1] = 物理攻撃威力判定;
				}/*else if (answer == 2) {
					//魔道書表示
					//魔力計測
					//
				}else if (answer == 3) {
					//道具表示
					//個数計測
					//
				}*/
				else {
					x = false;
					place[0] = answer-1;
					place[1] = attackItems(answer);
				}
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
		//damage
		return new int[][] {{0,0},{0,0,0,0,0}};
	}
	int attackItems(int place){
		Boolean x = true;
		int answer = 0;
		int attackItemsInt = equipment[0][place].length;
		while(x){
			try{
				int i;
				for (i=0; i<attackItemsInt; i++) {
					Case.pl(Case.number(i)+":"+i); // Items[0][equipment[0][place][i]].getName(); 所持しているアイテムの名前表示
				}
				Case.pl(Case.number(i)+"戻る");
				answer = Case.scanI(attackItemsInt+1);
			}catch (java.util.InputMismatchException e) {
				Case.seyCorrect();
			}
			if (answer == attackItemsInt+1) x = false;
			else if (equipment[0][place][answer-1] == 0) Case.pl("装備していない。");
			else if (place == 2 ) { //Items[equipment[0][place][answer-1]].getAbility(1) <= ability[1][1] 魔力測定
				x = false;
				answer = equipment[0][place][answer-1];
			}else if (place == 3) { //Items[equipment[1][place][answer-1]] > 0; 個数
				x = false;
				answer = equipment[0][place][answer-1];
				equipment[1][place][answer-1]--;
				if (equipment[1][place][answer-1] == 0) for (int i=0; i<equipment.length; i++) equipment[i][place][answer-1] = i;
			}
		}
		return answer;
	}
	int attackif(){
		String[] attackifStr = {"物理","魔法","道具"};
		int i;
		for (i=0; i<attackifStr.length; i++) Case.pl(Case.number(i)+attackifStr[i]);
		return i;
	}
	int attackDamage(){

		return ;
	}
	public void defense(){

	}

	String getName(){
		return this.name;
	}
	int[] getAbility(int place){
		return this.ability[place];
	}
	int getAbility(int[] place){
		return this.ability[place[0]][place[1]];
	}
}