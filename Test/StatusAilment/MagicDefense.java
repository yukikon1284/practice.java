package StatusAilment;
import tool.Tool;
public class MagicDefense extends StatusAilment {
	private int statusUp;
	public MagicDefense(){
		super(new String[] {"なし","魔法防御強化","魔法防御超強化"});
		statusUp = 0;
	}
	protected void setAilment(int[][] status){
		final float[] statusAilmentDown = {0.25f,0.5f};
		this.statusUp = (int)(status[1][5] * statusAilmentDown[this.getStatusAilment(0)]);
		status[0][5] += this.statusUp;
	}
	public void statusAilmentEffect(int[][] status){//効果を発動するか
		if (this.statusAilment[0] != 0) {
			if (this.statusAilment[1] == 0) {
				//ステータス系
				status[0][5] -= statusUp;
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