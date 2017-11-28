public class Battle{
	public static Boolean x = true;
	public static void main(String[] args) {
		Case Case = new Case();
		Shop Shop = new Shop();
		Items Items = new Items();
		Character Character = new Character();
		Shop.shop(x);
		Character.equipment(x);
	}
}