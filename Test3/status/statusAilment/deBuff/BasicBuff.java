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
/*
package status.statusAilment.deBuff;
import status.Status;
import tool.Tool;
public abstract class BasicBuff{
	protected boolean doing;
	protected int power;
	protected String name;
	protected int period;
	public BasicBuff(){
		this.doing = false;
		this.power = 0;
		this.name = null;
		this.period = 0;
	}
	public abstract void setBuff(Status status);
	public abstract void buffEffect();
	public void setBuff(int power, Status status){
		if (this.period != 0) Tool.pl(" 効果がない。");
		else {
			this.power = power;
			setBuff(status);
		}
	}
	public boolean getDoing(){
		return this.doing;
	}
	public String getName(){
		return this.name;
	}
	public int getPeriod(){
		return this.period;
	}
}*/