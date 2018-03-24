package status.statusAilment.ailment;
import status.Status;
public class CapacityRise extends StatusAilment {
	private int rise;
	private int target;
	private Status status;
	private boolean doing;
	public CapacityRise(final int rise ,final int target, final int period,final Status status){
		super(period);
		this.rise = rise;
		this.target = target;
		this.status = status;
		this.doing = true;
	}
	public void ailmentEffect(){
		if (this.period == 0 && this.doing) {
			this.doing = false;
			ailmentEffectReset();
		}else {
			this.status.addStatus(target, rise);
			this.period--;
		}
	}
	public void ailmentEffectReset(){
		this.status.addStatus(-target, rise);
	}
}