import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
interface Case{
	static int YN(Boolean x){
		int answer = 0;
		String[] YN = {"はい","いいえ"};
		while(x){
			try{
				for (int i=0; i<YN.length; i++) {
					pl(number(i)+YN[i]);
				}
				answer = scanI();
				if (answer == 1 || answer == 2) {
					x = false;
				}else{
					pl(correct());
				}
			}catch(java.util.InputMismatchException e){
				pl(correct());
			}
		}
		return answer;
	}
	static void time(int time){
		TimeUnit timeUnit = TimeUnit.SECONDS;
		try{
			timeUnit.sleep(time);
		}catch(InterruptedException e){
		}
	}
	static String scanS(){
		p(direction());
		String scanS = new Scanner(System.in).nextLine();
		return scanS;
	}
	static int scanI(){
		p(direction());
		int scanI = new Scanner(System.in).nextInt();
		return scanI;
	}
	static int random(int number){
		int random = new Random().nextInt(number);
		return random;
	}
	static String correct(){
		String correct = "対応した数字を入れてください。";
		return correct;
	}
	static void seyCorrect(){
		pl(correct());
	}
	static String number(int i){
		return direction()+(i+1)+" ";
	}
	static String direction(){
		String direction = " >";
		return direction;
	}
	static String back(){
		String back = "戻る";
		return back;
	}
	static void pl(String str){
		System.out.println(str);
	}
	static void p(String str){
		System.out.print(str);
	}
	static int[] setIntArr(int number, int setNumber){
		int[] IntArr = new int[number];
		Arrays.fill(IntArr, setNumber);
		return IntArr;
	}
}