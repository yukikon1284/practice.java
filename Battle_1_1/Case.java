import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
interface Case{
	/*try{
		Case.pl("aaa");
		answer = Case.YN();
	}catch(java.util.InputMismatchException e){
		Case.pl(e);
	}*/
	public static int YN(){
		int answer = 0;
		String[] YN = {"はい","いいえ"};
			for (int i=0; i<YN.length; i++) pl(number(i)+YN[i]);
			answer = scanI(2);
		return answer;
	}
	public static void time(int time){
		TimeUnit timeUnit = TimeUnit.SECONDS;
		try{
			timeUnit.sleep(time);
		}catch(InterruptedException e){
		}
	}
	public static String scanS(){
		p(direction());
		return new Scanner(System.in).nextLine();
	}
	public static int scanI() throws java.util.InputMismatchException{
		p(direction());
		return new Scanner(System.in).nextInt();
	}
	public static int scanI(int limit) throws java.util.InputMismatchException{
		int answer = scanI();
		if (answer < 0 || answer > limit) throw new java.util.InputMismatchException(correct());
		return answer;
	}
	public static int random(int number){
		return new Random().nextInt(number);
	}
	public static String correct(){
		return "対応した数字を入れてください。";
	}
	public static void seyCorrect(){
		pl(correct());
	}
	public static String number(int i){
		return direction()+(i+1)+" ";
	}
	public static String direction(){
		return " >";
	}
	public static String back(){
		return "戻る";
	}
	public static void pl(Object obj){
		System.out.println(obj);
	}
	public static void p(Object obj){
		System.out.print(obj);
	}
	//初期化設定　(配列数, 初期数値)
	public static int[] setIntArr(int number, int setNumber){
		int[] IntArr = new int[number];
		Arrays.fill(IntArr, setNumber);
		return IntArr;
	}
	public static int[] designationNumber(final int[] originType, final int number){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i=0; i<originType.length; i++) if (originType[i] == number) arrayList.add(i);
		List<Integer> intList = arrayList;
		int[] designationInt = new int[intList.size()];
		for (int i=0; i<designationInt.length; i++) designationInt[i] = intList.get(i);
		return designationInt;
	}
	public static static String[] getDesignationName(final String[] names, final int[] originType, final int number){
		int[] designationInt = designationNumber(originType, number);
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i=0; i<originType.length; i++) arrayList.add(names[designationInt[i]]);
		List<String> strList = arrayList;
		String[] designationStr = strList.toArray(new String[strList.size()]);
		return designationStr;
	}
}