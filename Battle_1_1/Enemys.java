import Enemys.SmallSizes.*;
import Enemys.EnemysOrigin;
public class Enemys{
	private static EnemysOrigin[] EnemysOrigin;
	private static String[] enemySize = {"小","中","大"};
	Enemys(){
		EnemysOrigin = new EnemysOrigin[] {new Slime()};
		String[] name = Case.getDesignationName(getAllName(), getAllType(), 0);
		for (int i=0; i<name.length; i++) Case.pl(name[i]);
	}
	static int[] getAllType(){
		final int IOL = EnemysOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = EnemysOrigin[i].getType();
		return type;
	}
	static String[] getAllName(){
		final int IOL = EnemysOrigin.length;
		final String[] name = new String[IOL];
		for (int i=0; i<IOL; i++) name[i] = EnemysOrigin[i].getName();
		return name;
	}
}