import tool.Tool;
import tool.UtilTool;
import status.Status;
public class TestPC extends BattleCharacter {
	TestPC(){
		super(new Status(new int[] {10,10,2,2,2,2,2}), "player");
	}
	public int[][] attack(){
		//{{種類 威力},{状態異常}}
		int[][] dmg = {{0,0},{0,0,0,0,0}};
		//{睡眠,麻痺}
		//int[] aciton = {this.ailment[1][3].getStatusAilment(2),this.ailment[1][2].getStatusAilment(2)};
		//if (aciton[0] == 0) {
			Boolean attack = true;
			while (attack) {
				try{
					String[] answerArr = {"物理","魔法","道具"};
					for (int i=0; i<answerArr.length; i++) Tool.pl(Tool.number(i)+answerArr[i]);
					int answer = UtilTool.scanI(3);
					//if (answer != 2 && aciton[1] == 1) {
						Tool.pl("行動できない。");
					//}else {
						attack = attackPattern(answer, dmg);
					//}
				}catch (Exception e) {
					Tool.pl(UtilTool.CORRECT);
				}
			}
		//}
		return dmg;
	}
	private Boolean attackPattern(final int answer, int[][] dmg){
		Boolean attack = true;
		if (answer == 0) {
			dmg[0][0] = 1;
			dmg[0][1] = 1;
			Tool.pl("物理攻撃");
			attack = false;
		}else if (answer == 1) {
			dmg[0][0] = 2;
			dmg[0][1] = 1;
			dmg[1][0] = 1;
			Tool.pl("魔法攻撃 毒");
			attack = false;
		}else if (answer == 2) {
			//this.ailment[0][0].setAilment(1);
			this.ailment[0][0].setBuff(1, this.status);
			Tool.pl("自動回復");
		}
		return attack;
	}
}