package status.statusAilment.deBuff;
import status.statusAilment.ailment.SlipDamage;
import status.statusAilment.deBuff.BasicBuff;
import status.Status;
public class Poison extends BasicBuff{
	private SlipDamage sd = null;
	public Poison(){
		super();
	}
	public void setBuff(Status status){
		final float[] magnification = {0.0f,0.03f,0.05f,0.08f};
		final int[] period = {0,3,4,5};
		this.period = period[this.power];
		final int place = 0;
		this.sd = new SlipDamage((int)(status.getStatusMax(place) * magnification[this.power])+1, place, this.period, status);
		this.doing = true;
	}
	public void buffEffect(){
		if (this.doing) {
			if (this.period == 0) {
				this.doing = false;
				this.power = 0;
			}
			this.sd.ailmentEffect();
		}
	}
}