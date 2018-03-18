package tool;
import java.util.Arrays;
public class Tool {
	public static <T> void pl(T obj){
		System.out.println(obj);
	}
	public static <T> void p(T obj){
		System.out.print(obj);
	}
	public static String[] deepCopy(String[] str, int number){
		return Arrays.copyOf(str, number);
	}
	public static String[] deepCopy(String[] str){
		return deepCopy(str, str.length);
	}
	public static int[] deepCopy(int[] copyInt, int number){
		return Arrays.copyOf(copyInt, number);
	}
	public static int[] deepCopy(int[] copyInt){
		return deepCopy(copyInt, copyInt.length);
	}
	public static String toString(int[] obj){
		return Arrays.toString(obj);
	}
	public static String toString(String[] obj){
		return Arrays.toString(obj);
	}
	public static String newLine(){
		return System.getProperty("line.separator");
	}
	public static String number(int i){
		return UtilTool.DIRECTION+(i+1)+" ";
	}
	//初期化設定　(配列数, 初期数値)
	public static int[] setIntArr(int number, int setNumber){
		int[] IntArr = new int[number];
		Arrays.fill(IntArr, setNumber);
		return IntArr;
	}
	/*public static int YN() throws java.util.InputMismatchException{
		String[] YN = {"はい","いいえ"};
		for (int i=0; i<YN.length; i++) pl(number(i)+YN[i]);
		int answer = UtilTool.scanI(2);
		return answer;
	}*/
	public static Boolean yesNo() throws java.util.InputMismatchException{
		String[] YN = {"はい","いいえ"};
		for (int i=0; i<YN.length; i++) pl(number(i)+YN[i]);
		int answer = UtilTool.scanI(2);
		Boolean[] ynBo = {true, false};
		return ynBo[answer-1];
	}
}