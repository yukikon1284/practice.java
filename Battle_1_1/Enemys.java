import Enemys.SmallSizes.*;
import Enemys.EnemysOrigin;
public class Enemys{
	private static EnemysOrigin[] EnemysOrigin;
	private static String[] enemySize = {"小","中","大"};
	public Enemys(){
		EnemysOrigin = new EnemysOrigin[] {new Slime()};
		System.out.println(EnemysOrigin[0].getName());
	}
	public static void seyDesignationType(final int place){
		for (int i=0; i<EnemysOrigin.length; i++) {
			final int type = EnemysOrigin[i].getType();
			if (type == place) System.out.println(enemySize[type]);
		}
	}
}