import Items.Items;
public class Battle{
	public static void main(String[] args) {
		Boolean x = true;
		int answer = 0;
		try{
			Case.pl("aaa");
			answer = Case.YN();
		}catch(java.util.InputMismatchException e){
			Case.pl(e);
		}
		Items Itemss = new Items();
		Items.items();
	}
}