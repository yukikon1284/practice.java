import tool.Tool;
public class Status {
	private int[][] status;
	Status(final int[] status){
		this.status = new int[][] {status, Tool.deepCopy(status)};
	}
	public int getStatus(int[] number){
		return this.status[number[0]][number[1]];
	}
	public int getStatus(int number){
		return getStatus(new int[] {0,number});
	}
	public int getStatusMax(int number){
		return getStatus(new int[] {1,number});
	}
	public int[] getStatusArr(int number){
		return this.status[number];
	}
	public int[] getStatusArr(){
		return this.status[0];
	}
	public int[] getStatusMaxArr(){
		return this.status[1];
	}
	public void addStatus(int number, int addNumber){
		getStatusArr()[number] += addNumber;
		if (getStatusArr()[number] > getStatusMaxArr()[number]) getStatusArr()[number] = getStatusMaxArr()[number];
	}
	public void addStatusArr(int[] addNumberArr){
		int[] statusMax = getStatusMaxArr();
		int[] status = getStatusArr();
		for (int i=0; i<statusMax.length; i++) {
			statusMax[i] += addNumberArr[i];
			status[i] = statusMax[i];
		}
	}
}