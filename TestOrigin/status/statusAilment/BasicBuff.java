package status.statusAilment.deBuff;
import status.Status;
import tool.Tool;
public abstract class BasicBuff {
	private int period;
	private int power;
	private boolean doing; //効果が発動するか
	BasicBuff(){
		buffEffectReset();
	}
	public abstract void setBuff(final int power);
	public abstract void buffEffect();
	public void buffEffectReset(){
		setPeriod(0);
		setPower(0);
		setDoing(false);
	}


	public abstract String getName();

	protected final void setPeriod(final int period){
		this.period = period;
	}
	protected final void addPeriod(final int period){
		this.period += period;
	}
	public final int getPeriod(){
		return  this.period;
	}

	protected final void setPower(final int power){
		this.power = power;
	}
	public final int getPower(){
		return this.power;
	}
	
	protected final void setDoing(final boolean doing){
		this.doing = doing;
	}
	public final boolean getDoing(){
		return this.doing;
	}
}