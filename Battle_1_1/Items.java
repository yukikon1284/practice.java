import Items.Weapons.OneHandedSwords.*;
import Items.Weapons.MagicalSwords.*;
import Items.ItemsOrigin;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemsN = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔導銃"}//武器
		,{"中防具","軽防具","重防具","魔防具"}//防具
		,{"回復薬","特殊魔法薬","その他"}//アイテム{HP、MP回復,能力上昇,その他}
		,{"攻撃魔法","回復魔法","特殊魔法"}//魔法
		,{"能力変化","状態異常耐性","その他"}};//装飾品
	Items(){
		ItemsOrigin = new ItemsOrigin[] {new WoodSword(), new IronSword(), new BronzeSword(), new MagicalIronSword()};
		seyDesignationType(0);
	}
	static void seyDesignationType(final int place){
		for (int i=0; i<ItemsOrigin.length; i++) {
			final int[] type = ItemsOrigin[i].getType();
			if (type[0] == place) System.out.println(itemsN[type[0]][type[1]]);
		}
	}
	//Items 0 1 2 3 4 5 6
	//Weaoon
	//size 0 1 2
	// type 0 int[] getType(o)
	/*static int[] getType(final int place){
		//arr 
		for (int i=0; i<ItemsOrigin.length; i++) {
			final int[] type = ItemsOrigin[i].getType();
			if (type[0] == place) //arr = i;
		}
	}
	static int[] getTypeNumber(final int place){
			final int[] type = Enemys.getType(place);
			arr int[] size
		for (int i=0; i<type.length; i++) if (type[0] == place) size add = i;
		return size;
	}*/

	//これをつくる
	/*static int[] getType(final int place){
		final int IOL = ItemsOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin.getType(0);
		return type;
	}*/
}