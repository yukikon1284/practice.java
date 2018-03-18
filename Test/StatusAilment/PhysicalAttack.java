package StatusAilment;
import tool.Tool;
public class PhysicalAttack extends StatusAilment {
	private int statusUp;
	public PhysicalAttack(){
		super(new String[] {"なし","物理攻撃強化","物理攻撃超強化"});
		statusUp = 0;
	}
	protected void setAilment(int[][] status){
		final float[] statusAilmentDown = {0.25f,0.5f};
		this.statusUp = (int)(status[1][2] * statusAilmentDown[this.getStatusAilment(0)]);
		status[0][2] += this.statusUp;
	}
	public void statusAilmentEffect(int[][] status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status[0][2] -= statusUp;
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