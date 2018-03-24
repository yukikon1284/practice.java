package status.statusAilment.deBuff;
import status.statusAilment.ailment.CapacityRise;
import status.statusAilment.deBuff.BasicBuff;
import status.Status;
import tool.Tool;
public class Poison extends BasicBuff {
	private CapacityRise cr;
	private Status status;
	public Poison(Status status){
		this.status = status;
		cr = null;
	}
	public void setBuff(final int power){
		final float[] magnification = {0.0f,0.03f,0.05f,0.08f};
		final int[] period = {0,3,4,5};
		setPeriod(period[power]);
		setPower(power);
		final int target = 0;
		this.cr = new CapacityRise(-((int)(status.getStatusMax(target) * magnification[getPower()])+1), target, getPeriod(), this.status);
	}
	public void buffEffect(){
		if (getPeriod() == 0) {
			Tool.pl(getName()+"が切れた。");
			buffEffectReset();
		}else {
			Tool.pl(getName()+"が発動した。"+getPeriod());
			cr.ailmentEffect();
			setDoing(true);
			addPeriod(-1);
		}
	}
	public void buffEffectReset(){
		super.buffEffectReset();
	}
	public String getName(){
		String[] name = {"なし","毒","猛毒"};
		return name[getPower()];
	}
}