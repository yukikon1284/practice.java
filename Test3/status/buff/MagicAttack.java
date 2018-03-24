package status.buff;
import tool.Tool;
import status.Status;
import status.StatusAilment;
public class MagicAttack extends StatusAilment {
	private int statusUp;
	public MagicAttack(){
		super(new String[] {"なし","魔法攻撃強化","魔法攻撃超強化"});
		statusUp = 0;
	}
	protected void setAilment(Status status){
		final float[] statusAilmentDown = {0.25f,0.5f};
		this.statusUp = (int)(status.getStatusMax(4) * statusAilmentDown[this.getStatusAilment(0)]);
		status.addStatus(4, this.statusUp);
	}
	public void statusAilmentEffect(Status status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status.addStatus(4, -this.statusUp);
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