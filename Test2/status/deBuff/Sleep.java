package status.deBuff;
import tool.Tool;
import status.Status;
import status.StatusAilment;
public class Sleep extends StatusAilment {
	public Sleep(){
		super(new String[] {"なし","睡眠"});
	}
	protected void setAilment(Status status){
		this.statusAilment[2] = 1;
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