package StatusAilment;
public abstract class StatusAilment {
	private String[] statusAilmentName;
	protected int[] statusAilment = new int[3];//強さ　長さ　データ
	//継続ダメージ系は　データの保持を　ダメージとする oo*数値
	//行動阻害系は　データの保持で　するかしないか 0 !=
	//ステータス系は　データの保持で　足すものとする　上限*数値
	//状態の強さ
	//状態の長さ
	//ダメージ　行動阻害　ステータス阻害　
	StatusAilment(String[] name){
		this.statusAilmentName = name;
		this.statusAilmentReset();
	}
	public final void statusAilmentReset(){
		for (int i=0; i<statusAilment.length; i++) this.statusAilment[i] = 0;
	}
	public final void setAilment(int power){
		this.statusAilment[0] = power;
		this.statusAilment[1] = setAilmentLength(power);
	}
	protected abstract void setAilment(int[][] status);
	private final int setAilmentLength(int power){//長さ
		int[] statusAilmentlength = {0,3,4,5};
		return statusAilmentlength[power];
	}
	public abstract void statusAilmentEffect(int[][] status);
	public final String getStatusAilmentName(){
		return this.statusAilmentName[this.getStatusAilment(0)];
	}
	public final int getStatusAilment(int number){
		return this.statusAilment[number];
	}
}