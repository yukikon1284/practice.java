package StatusAilment;
import tool.Tool;
public class Poison extends StatusAilment {
	public Poison(){
		super(new String[] {"なし","毒","猛毒"});
	}
	protected void setAilment(int[][] status){
		//毒
		float[] statusAilmentEffect = {0.0f,0.03f,0.05f,0.08f};
		this.statusAilment[2] = (int)(status[1][0] * statusAilmentEffect[this.getStatusAilment(0)])+1;
		status[0][0] -= this.statusAilment[2];
		Tool.pl(getStatusAilmentName()+"が発動");
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