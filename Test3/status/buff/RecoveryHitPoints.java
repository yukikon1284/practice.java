package status.buff;
import tool.Tool;
import status.Status;
import status.StatusAilment;
public class RecoveryHitPoints extends StatusAilment {
	public RecoveryHitPoints(){
		super(new String[] {"なし","自動回復","自動超回復"});
	}
	protected void setAilment(Status status){
		float[] statusAilmentEffect = {0.0f,0.03f,0.05f,0.08f};
		status.addStatus(0, (int)(status.getStatusMax(0) * statusAilmentEffect[this.getStatusAilment(0)])+1);
		Tool.pl(getStatusAilmentName()+"が発動");
	}
	public void statusAilmentEffect(Status status){//効果を発動するか
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