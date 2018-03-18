package status.buff;
import tool.Tool;
import status.Status;
import status.StatusAilment;
public class PhysicalDefense extends StatusAilment {
	private int statusUp;
	public PhysicalDefense(){
		super(new String[] {"なし","物理防御強化","物理防御超強化"});
		statusUp = 0;
	}
	protected void setAilment(Status status){
		final float[] statusAilmentDown = {0.25f,0.5f};
		this.statusUp = (int)(status.getStatusMax(3) * statusAilmentDown[this.getStatusAilment(0)]);
		status.addStatus(3, this.statusUp);
	}
	public void statusAilmentEffect(Status status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status.addStatus(3, -this.statusUp);
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