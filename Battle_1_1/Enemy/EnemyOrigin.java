package Enemy;
public class EnemyOrigin{
	private String name;
	private String type;
	private int[] ability;
	private int money;
	private int experiencePoint
	private String direction;
	//EnemyOrigin(名前, 敵の種類, 敵のアビリティ, 敵の金, 敵の経験値, 敵の説明);
	EnemyOrigin(final String name, final int type, final int ability, final int money, final int experiencePoint, final String description){
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.experiencePoint = experiencePoint;
		this.money = money;
		this.description = description;
	}
}