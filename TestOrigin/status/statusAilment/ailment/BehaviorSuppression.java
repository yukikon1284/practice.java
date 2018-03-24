package status.statusAilment.ailment;
import tool.UtilTool;
public class BehaviorSuppression extends StatusAilment {
	private int[] probability; //{min, max};
	public BehaviorSuppression(final int period, final int[] probability){
		super(period, false);
		this.probability = probability;
	}
	public void ailmentEffect(){
		if (getPeriod() == 0) ailmentEffectReset();
		else {
			setDoing(Tool.random(this.probability[1]) < this.probability[0]);
			addPeriod(-1);
		}
	}
}