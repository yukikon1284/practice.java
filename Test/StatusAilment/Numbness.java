package StatusAilment;
import tool.Tool;
import tool.UtilTool;
public class Numbness extends StatusAilment {
	public Numbness(){
		super(new String[] {"なし","痺れ","麻痺"});
	}
	protected void setAilment(int[][] status){
		if (UtilTool.random(5) < getStatusAilment(0)) {
			this.statusAilment[2] = 1;
			Tool.pl(getStatusAilmentName()+"が発動");
		}else this.statusAilment[2] = 0;
	}
	public void statusAilmentEffect(int[][] status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				Tool.pl(getStatusAilmentName()+"が切れた");
				this.statusAilmentReset();
			}else {
				//ダメージ系 ステータス系
				this.setAilment(status);
				this.statusAilment[1]--;
			}
		}
	}
}