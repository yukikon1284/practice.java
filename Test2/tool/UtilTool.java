package tool;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class UtilTool {
	public static final String CORRECT = "対応した数字を入れてください。";
	public static final String DIRECTION = " >";
	public static String scanS(){
		Tool.p(DIRECTION);
		return new Scanner(System.in).nextLine();
	}
	public static int scanI() throws java.util.InputMismatchException{
		Tool.p(DIRECTION);
		return new Scanner(System.in).nextInt();
	}
	public static int scanI(int limit) throws java.util.InputMismatchException{
		int answer = scanI();
		if (answer < 0 || answer >= limit) throw new java.util.InputMismatchException(CORRECT);
		return answer;
	}
	public static int random(int number){
		return new Random().nextInt(number);
	}
	public static void time(int time){
		TimeUnit timeUnit = TimeUnit.SECONDS;
		try{
			timeUnit.sleep(time);
		}catch(InterruptedException e){
		}
	}
}