public class Battle{
	public static Boolean x = true;
	public static void main(String[] args) {
		Shop Shop = new Shop();
		Items Items = new Items();
		Character Character = new Character();
		HealingShops HealingShops = new HealingShops();
		StorageLocation StorageLocation = new StorageLocation();
		Town Town = new Town();
		while(x){
			x = StorageLocation.storageLocation(x);
			Town.town(x);
		}
	}
}