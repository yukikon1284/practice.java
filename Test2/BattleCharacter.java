/*import status.buff.*;
import status.deBuff.*;*/
import status.Status;
// import status.StatusAilment;
import status.statusAilment.deBuff.*;
import tool.Tool;
import tool.UtilTool;
public class BattleCharacter {
	protected Status status;
	private String name;
	//protected StatusAilment[][] ailment;
	protected BasicBuff[][] ailment;
	BattleCharacter(final int[] status, final String name){
		this.status = new Status(status);
		this.name = name;
		this.ailment = new /*StatusAilment[][] 
			{{new RecoveryHitPoints(),new PhysicalAttack(),new PhysicalDefense(),new MagicAttack(),new MagicDefense()},
			{new Poison(),new Scald(),new Numbness(),new Sleep(),new Slow()}};*/
			BasicBuff[][] {{new Poison()},{new Poison()}};

	}
	BattleCharacter(final Status status, final String name){
		this.status = status;
		this.name = name;
		this.ailment = new /*StatusAilment[][] 
			{{new RecoveryHitPoints(),new PhysicalAttack(),new PhysicalDefense(),new MagicAttack(),new MagicDefense()},
			{new Poison(),new Scald(),new Numbness(),new Sleep(),new Slow()}};*/
			BasicBuff[][] {{new Poison()},{new Poison()}};

	}
	public int[][] attack(){
		//{{種類 威力},{状態異常}}
		int[][] dmg = {{0,0},{0,0,0,0,0}};
		//{睡眠,麻痺}
		/*int[] aciton = {this.ailment[1][3].getStatusAilment(2),this.ailment[1][2].getStatusAilment(2)};*/
		//if (aciton[0] == 0) {
			int attackType = UtilTool.random(3);
			//if (attackType == 2 && aciton[1] == 0) {
			if (attackType == 2) {
				Tool.pl("物理攻撃");
				dmg[0][0] = attackType;
				dmg[0][1] = 1;
			}else if (attackType == 1){
			//}else if (attackType == 1 && aciton[1] == 0) {
				Tool.pl("魔法攻撃　毒");
				this.status.addStatus(1, -1);
				dmg[0][0] = attackType;
				dmg[0][1] = 1;
				dmg[1][0] = 1;
			}else Tool.pl("様子見");
		//}
		return dmg;
	}
	public void defense(final int[][] dmg, final int agi){
		if (dmg[0][0] != 0) {
			Tool.pl(this.name+" "+dmg[0][1]+"受けた");
			this.status.addStatus(0, -dmg[0][1]);
			for (int i=0; i<dmg[1].length; i++) {
				if (dmg[1][i] != 0) {
					Tool.pl("属性攻撃をされた");
					if (UtilTool.random(3) == 0) Tool.pl("抵抗成功");
					else {
						Tool.pl("抵抗失敗");
						this.ailment[1][i].setBuff(dmg[1][i], this.status);
					}
				}
			}
		}
	}
	public int getStatus(final int number){
		return this.status.getStatus(number);
	}
	public int getStatusMax(final int number){
		return this.status.getStatusMax(number);
	}
	public String getName(){
		return name;
	}
	/*public int getAilment(int[] ailmentNumber, int number){
		return this.ailment[ailmentNumber[0]][ailmentNumber[1]].getStatusAilment(number);
	}*/
	public void statusAilment(final int number){
		for (int i=0; i<this.ailment[number].length; i++) this.ailment[number][i].buffEffect();
	}
	public void statusAilment(){
		for (int i=0; i<this.ailment.length; i++) statusAilment(i);
	}
	public void sayStatusAilmentName(int number){
		/*String sayStr = "";
		for (int i=0; i<this.ailment[number].length; i++) {
			StatusAilment sayStatus = this.ailment[number][i];
			if (sayStatus.getStatusAilment(0) > 0) sayStr += sayStatus.getStatusAilmentName()+" ";
		}
		if (sayStr.equals("") == false) Tool.pl(sayStr);*/
		String sayStr = "";
		for (int i=0; i<this.ailment[number].length; i++) {
			BasicBuff sayBuff = this.ailment[number][i];
			if (sayBuff.getPeriod() > 0) sayStr += sayBuff.getName();
		}
	}
	public void sayStatusAilmentName(){
		for (int i=0; i<this.ailment.length; i++) sayStatusAilmentName(i);
	}
}