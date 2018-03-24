package status.statusAilment.ailment;
public abstract class BasicAilment {
	protected int period;
	BasicAilment(int period){
		this.period = period;
	}
	public int getPeriod(){
		return this.period;
	}
	public abstract void ailmentEffect();
}