package status;
import tool.Tool;
public class Status {
	private String name;
	private int[][] status;
	private int level;
	public Status(final String name, final int[] status, final int level){
		this.name = name;
		this.status = new int[][] {status, Tool.deepCopy(status)};
		this.level = level;
	}


	public final void getName(){
		return this.name;
	}

	public final void addStatus(int number, int addNumber){
		getStatusArr()[number] += addNumber;
		Boolean addMax = number == 0 || number == 1;
		if (addMax && getStatusArr()[number] > getStatusMaxArr()[number]) getStatusArr()[number] = getStatusMaxArr()[number];
	}
	public final void addStatusArr(int[] addNumberArr){
		int[] statusMax = getStatusMaxArr();
		int[] status = getStatusArr();
		for (int i=0; i<statusMax.length; i++) {
			statusMax[i] += addNumberArr[i];
			status[i] = statusMax[i];
		}
	}
	public final int getStatus(int[] number){
		return this.status[number[0]][number[1]];
	}
	public final int getStatus(int number){
		return getStatus(new int[] {0,number});
	}
	public final int getStatusMax(int number){
		return getStatus(new int[] {1,number});
	}
	public final int[] getStatusArr(int number){
		return this.status[number];
	}
	public final int[] getStatusArr(){
		return getStatusArr(0);
	}
	public final int[] getStatusMaxArr(){
		return getStatusArr(1);
	}

	public final void addLevel(int level){
		this.level += level;
	}
	public final int getLevel(){
		return this.level;
	}
}