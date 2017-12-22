import Characters.DungeonCharacters;
public class DungeonBattle{
	private DungeonCharacters[] dC;
	private int[] state; // = {{{キャラ異常},{キャラバフ}},{{敵異常},{敵バフ}}};
	DungeonBattle(DungeonCharacters[] dC){
		this.dC = dC;
	}
	Boolean dungeonBattle(){
		int i=0;
		int[] avoid = {};
		while(this.dC[(i+1)%2].getOperationAbility()[0] != 0){
			if (i%2 == 0) {
				//steitasu hyouzi
			}
			//防御(攻撃())
			if (CaseOrigin.randomBoolean(this.dC[(i+1)%2].getAbility()[6], this.dC[(i+1)%2].getAbility()[6]-this.dC[i%2].getAbility()[6])) {
				//yoke
			}else {
				
			}
			System.out.println("adas");
		}
		Boolean win = true;
		if (i%2 == 0) win = false;
		return win;
	}
}