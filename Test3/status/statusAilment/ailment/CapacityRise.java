package status.statusAilment.ailment;
import status.Status;
public class CapacityRise extends BasicAilment {
	private int rise; //上昇値
	private int target; //上昇対象
	private Status status;
	public CapacityRise(final int rise, final int target, final int period, final Status status){
		super(period, target > 1);
		this.rise = rise;
		this.target = target;
		this.status = status;
	}
	public void ailmentEffect(){
		if (getPeriod() == 0) ailmentEffectReset();
		else {
			this.status.addStatus(target, rise);
			addPeriod(-1);
		}
	}
	public void ailmentEffectReset(){
		if (getDoing()) this.status.addStatus(-target, rise);
		super.ailmentEffectReset();
	}
}