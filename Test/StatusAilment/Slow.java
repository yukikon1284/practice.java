package StatusAilment;
import tool.Tool;
public class Slow extends StatusAilment {
	private int statusDown;
	public Slow(){
		super(new String[] {"なし","鈍化"});
		statusDown = 0;
	}
	protected void setAilment(int[][] status){
		final float[] statusAilmentDown = {0.5f};
		this.statusDown = (int)(status[1][6] * statusAilmentDown[this.getStatusAilment(0)]);
		status[0][6] -= this.statusDown;
		Tool.pl(getStatusAilmentName()+"が発動");
	}
	public void statusAilmentEffect(int[][] status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status[0][6] += statusDown;
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