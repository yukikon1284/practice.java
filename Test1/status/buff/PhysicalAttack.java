package status.buff;
import tool.Tool;
import status.Status;
import status.StatusAilment;
public class PhysicalAttack extends StatusAilment {
	private int statusUp;
	public PhysicalAttack(){
		super(new String[] {"なし","物理攻撃強化","物理攻撃超強化"});
		statusUp = 0;
	}
	protected void setAilment(Status status){
		final float[] statusAilmentDown = {0.25f,0.5f};
		this.statusUp = (int)(status.getStatusMax(2) * statusAilmentDown[this.getStatusAilment(0)]);
		status.addStatus(2, this.statusUp);
	}
	public void statusAilmentEffect(Status status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status.addStatus(2, -this.statusUp);
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