class Battle{
	private BattleCharacter[] bc;
	private int[][][] status = {{{0,0,0,0,0},{0,0,0,0,0}},{{0,0,0,0,0},{0,0,0,0,0}}}; //バフ　状態異常
	Battle(BattleCharacter[] bc){
		this.bc = bc;
	}
	void battle(){
		int i = 0;
		while (this.bc[i%2].getAbility(new int[] {1,0}) != 0) {
			System.out.println(this.bc[i%2].getName());
			//攻撃
			this.bc[i%2].attack();
			//防御
			i++;
		}
	}
}