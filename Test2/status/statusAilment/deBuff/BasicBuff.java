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
}