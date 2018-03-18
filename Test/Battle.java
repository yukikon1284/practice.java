import tool.Tool;
class Battle {
	BattleCharacter[] bc;
	Battle(BattleCharacter bc1, BattleCharacter bc2){
		bc = new BattleCharacter[] {bc1,bc2};
	}
	public void battle(){
		int i=0;
		while(this.bc[i%2].getStatus(0)>0 && this.bc[(i+1)%2].getStatus(0)>0){
			Tool.pl("============================="+Tool.newLine()+(i+1)+"ターン目"+Tool.newLine()+this.bc[i%2].getName());
			sayStatus(i%2);
			//状態異常の効果を発動 dbuff
			this.bc[i%2].statusAilment();

			if (this.bc[i%2].getStatus(0)>0 && this.bc[(i+1)%2].getStatus(0)>0) this.bc[(i+1)%2].defense(this.bc[i%2].attack(), (int)this.bc[i%2].getStatus(6));

			//状態異常の効果を発動　buff

			i++;
			Tool.pl("=============================");
		}
		Tool.pl(this.bc[i%2].getName()+Tool.newLine()+"HP"+this.bc[i%2].getStatus(0));
		Tool.pl(this.bc[(i+1)%2].getName()+Tool.newLine()+"HP"+this.bc[(i+1)%2].getStatus(0));
	}
	private void sayStatus(int number){
		String[] statusName = {"HP","MP","STR","VIT","INT","MGR","AGI"};
		for (int i=0; i<statusName.length; i++) {
			String sayStr = statusName[i]+" "+bc[number].getStatus(i);
			if (i == 0 || i == 1) sayStr += "/"+bc[number].getStatus(new int[] {1,i});
			if (i != 6) Tool.p(sayStr+" ");
			else Tool.pl(sayStr);
		}
	}
}