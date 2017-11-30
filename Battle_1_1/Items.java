import Items.Weapons.OneHandedSwords.*;
import Items.Weapons.MagicalSwords.*;
import Items.Weapons.TwinSwords.*;
import Items.Weapons.JapaneseSwords.*;
import Items.ItemsOrigin;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemNames = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔導銃"}//武器
		,{"中量防具","軽量防具","重量防具","魔道防具"}//防具
		,{"回復薬","特殊魔法薬","その他"}//アイテム{HP、MP回復,能力上昇,その他}
		,{"攻撃魔法","回復魔法","特殊魔法"}//魔法
		,{"能力上昇","状態異常耐性","その他"}};//装飾品
	Items(){
		ItemsOrigin = new ItemsOrigin[] {new WoodSword(), new IronSword(), new BronzeSword(), new MagicalIronSword(), new WoodTwinSword(), new WoodJapaneseSword()};
		String[] name = Case.getDesignationName(getAllName(), getAllType(), 0);
		for (int i=0; i<name.length; i++) {
			Case.pl(name[i]);
		}
	}
	static int[] getAllType(){
		final int IOL = ItemsOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin[i].getType(0);
		return type;
	}
	static String[] getAllName(){
		final int IOL = ItemsOrigin.length;
		final String[] name = new String[IOL];
		for (int i=0; i<IOL; i++) name[i] = ItemsOrigin[i].getName();
		return name;
	}
}