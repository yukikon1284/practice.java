package status.statusAilment.ailment;
public abstract class BasicAilment {
	private int period; //効果期間
	private boolean doing;//cr 保存の返しはあるか bs 発動するか
	BasicAilment(final int period, final boolean doing){
		setPeriod(period);
		setDoing(doing);
	}
	public abstract void ailmentEffect();
	public void ailmentEffectReset(){
		setPeriod(0);
		setDoing(false);
	}

	
	private final void setPeriod(final int period){
		this.period = period;
	}
	protected final void addPeriod(final int addPeriod){
		this.period += period;
	}
	public final int getPeriod(){
		return this.period;
	}
	private final void setDoing(final boolean doing){
		this.doing = doing;
	}
	public final boolean getDoing(){
		return this.doing;
	}
}
/*package status.statusAilment.ailment;
public abstract class BasicAilment {
	protected int period;
	BasicAilment(int period){
		this.period = period;
	}
	public int getPeriod(){
		return this.period;
	}
	public abstract void ailmentEffect();
}*/