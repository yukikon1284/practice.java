import Characters.DungeonCharacters;
public class DungeonBattle{
	private DungeonCharacters[] dC;
	private int[] state; // = {{{キャラ異常},{キャラバフ}},{{敵異常},{敵バフ}}};
	DungeonBattle(DungeonCharacters[] dC){
		this.dC = dC;
	}
	Boolean dungeonBattle(){
		int i=0;
		while(this.dC[(i+1)%2].getAbility(1)[0] != 0){
			if (i%2 == 0) {
				//steitasu hyouzi
			}
			//防御(攻撃())
		}
		Boolean win = true;
		if (i%2 == 0) win = false;
		return win;
	}
}