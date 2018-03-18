import StatusAilment.*;
import tool.Tool;
import tool.UtilTool;
public class BattleCharacter {
	private int[][] status;
	private String name;
	private StatusAilment[][] ailment;
	BattleCharacter(final int[] status, final String name){
		int[] max = new int[status.length];
		for (int i=0; i<status.length; i++) max[i] = status[i];
		this.status = new int[][] {status,max};
		this.name = name;
		this.ailment = 
			new StatusAilment[][] {{new RecoveryHitPoints(),new PhysicalAttack(),new PhysicalDefense(),new MagicAttack(),new MagicDefense()},
			{new Poison(),new Scald(),new Numbness(),new Sleep(),new Slow()}};
	}
	public int[][] attack(){
		//{{種類 威力},{状態異常}}
		int[][] dmg = {{0,0},{0,0,0,0,0}};
		//睡眠の時　faluse
		//麻痺の時　選択後に変える
		dmg[0][0] = UtilTool.random(3);
		if (dmg[0][0] == 0) {
			Tool.pl("様子見");
		}else if (dmg[0][0] == 1) {
			Tool.pl("魔法攻撃　毒");
			setStatus(new int[] {1,1});
			dmg[0][1] = 1;
			dmg[1][0] = 1;
		}else {
			Tool.pl("物理攻撃");
			dmg[0][1] = 1;
		}
		return dmg;
	}
	public void defense(final int[][] dmg, final int agi){
		if (dmg[0][0] == 1 || dmg[0][0] == 2) {
			Tool.pl(this.name+" "+dmg[0][1]+"受けた");
			setStatus(new int[] {0,dmg[0][1]});
			for (int i=0; i<dmg[1].length; i++) {
				if (dmg[1][i] != 0) {
					Tool.pl("属性攻撃をされた");
					if (UtilTool.random(3) == 0) Tool.pl("抵抗成功");
					else if (ailment[1][i].getStatusAilment(0) == 0) {
						Tool.pl("抵抗失敗");
						this.ailment[1][i].setAilment(dmg[1][i]);
					}else {
						Tool.pl("効かなかった");
					}
				}
			}
		}
	}
	public int getStatus(final int[] number){
		return this.status[number[0]][number[1]];
	}
	public int getStatus(final int number){
		return getStatus(new int[] {0,number});
	}
	private void setStatus(final int[] number){
		this.status[0][number[0]] -= number[1];
	}
	public String getName(){
		return name;
	}
	public void statusAilment(int number){
		for (int i=0; i<this.ailment[number].length; i++) this.ailment[number][i].statusAilmentEffect(status);
	}
	public void statusAilment(){
		for (int i=0; i<this.ailment.length; i++) statusAilment(i);
	}
}