import Enemys.SmallSizes.*;
import Enemys.EnemysOrigin;
public class Enemys{
	private static EnemysOrigin[] EnemysOrigin;
	private static String[] enemySize = {"小","中","大"};
	Enemys(){
		EnemysOrigin = new EnemysOrigin[] {new Slime()};
		String[] name = Case.getDesignationStr(getAllName(), getAllType(), 0);
		for (int i=0; i<name.length; i++) Case.pl(name[i]);

		int[] deNu = Case.designationNumber(getAllType(), 0);
		for (int i=0; i<deNu.length; i++) {
			Case.pl(EnemysOrigin[deNu[i]].getName()+Case.newLine()+EnemysOrigin[deNu[i]].getType()+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getAddAbility())+Case.newLine()+EnemysOrigin[deNu[i]].getMoney()+Case.newLine()+EnemysOrigin[deNu[i]].getExperiencePoint()+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getDropItems())+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getDropItemsProbability())+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getTxts()));
		}
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