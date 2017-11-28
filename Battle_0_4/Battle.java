public class Battle{
	public static void main(String[] args) {
		Boolean x = true;
		Shop Shop = new Shop();
		Town Town = new Town();
		Items Items = new Items();
		Dungeon Dungeon = new Dungeon();
		Character Character = new Character();
		HealingShops HealingShops = new HealingShops();
		StorageLocation StorageLocation = new StorageLocation();
		Dungeon.dungeon(x);
		while(x){
			x = StorageLocation.storageLocation(x);
			if (x) Town.town(x);
		}
	}
}