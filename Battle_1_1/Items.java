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
		int[] aas = Case.designationNumber(getType(0), 0);
		for (int i=0; i<aas.length; i++) {
			System.out.println(ItemsOrigin[aas[i]].getName());
		}
	}
	static void seyDesignationType(final int place){
		for (int i=0; i<ItemsOrigin.length; i++) {
			final int[] type = ItemsOrigin[i].getType();
			if (type[0] == place) System.out.println(itemsN[type[0]][type[1]]);
		}
	}
	static int[] getType(final int place){
		final int IOL = ItemsOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin[i].getType(0);
		return type;
	}
}