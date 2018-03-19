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
		int[] aciton = {getAilment(new int[] {1,3}, 2),getAilment(new int[] {1,2}, 2)};
		Boolean attack = true;
		if (aciton[0] == 0) {
			while (attack) {
				try{
					String[] answerArr = {"物理","魔法","道具"};
					for (int i=0; i<answerArr.length; i++) Tool.pl(Tool.number(i)+answerArr[i]);
					int answer = UtilTool.scanI(3);
					if (answer != 2 && aciton[1] == 1) {
						Tool.pl("行動できない。");
					}else {
						attack = attackPattern(answer, dmg);
					}
				}catch (Exception e) {
					Tool.pl(UtilTool.CORRECT);
				}
			}
			/*dmg[0][0] = UtilTool.random(3);
			if (dmg[0][0] == 0 && aciton[1]) {
				Tool.pl("物理攻撃");
				dmg[0][1] = 1;
			}else if (dmg[0][0] == 1 && aciton[1]) {
				Tool.pl("魔法攻撃　毒");
				this.status.addStatus(1, -1);
				dmg[0][1] = 1;
				dmg[1][0] = 1;
			}else Tool.pl("様子見");*/
		}
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
			Tool.pl("道具は実装されていない");
		}
		return attack;
	}
}