package status.statusAilment.ailment;
import tool.UtilTool;
public class BehaviorSuppression extends StatusAilment {
	private int[] probability;
	private boolean doing;
	public BehaviorSuppression(final int period, final int[] probability){
		super(period);
		this.probability = probability;
		this.doing = false;
	}
	public void ailmentEffect(){
		if (this.period != 0) {
			if (this.probability[0] > Tool.random(this.probability[1])) this.doing = true;
			else this.doing = false;
			this.period--;
		}
	}
}