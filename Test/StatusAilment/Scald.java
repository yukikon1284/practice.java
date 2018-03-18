package StatusAilment;
import tool.Tool;
public class Scald extends StatusAilment {
	private int statusDown;
	public Scald(){
		super(new String[] {"なし","火傷","燃焼"});
		statusDown = 0;
	}
	protected void setAilment(int[][] status){
		final float[] statusAilmentEffect = {0.0f,0.05f,0.08f,0.10f};
		final float[] statusAilmentDown = {0.1f,0.15f,0.2f};
		status[0][0] -= (int)(status[0][0] * statusAilmentEffect[this.getStatusAilment(0)])+1;
		this.statusDown = (int)(status[1][2] * statusAilmentDown[this.getStatusAilment(0)]);
		status[0][2] -= this.statusDown;
		Tool.pl(getStatusAilmentName()+"が発動");
	}
	public void statusAilmentEffect(int[][] status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status[0][2] += statusDown;
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