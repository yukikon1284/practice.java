package status.statusAilment.ailment;
import status.Status;
import status.StatusAilment;
public class SlipDamage extends BasicAilment{
	private int damage;
	private int target;
	private Status status;
	public SlipDamage(final int damage ,final int target, final int period, final Status status){
		super(period);
		this.damage = damage;
		this.target = target;
		this.status = status;
	}
	public void ailmentEffect(){
		if (this.period != 0) {
			this.status.addStatus(target, damage);
			this.period--;
		}
	}
}