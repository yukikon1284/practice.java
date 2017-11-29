package Enemys;
public class EnemysOrigin{
	private String name;
	private int type;
	private int[] ability;
	private int money;
	private int experiencePoint;
	private String description;
	//EnemysOrigin(名前, 敵の種類, 敵のアビリティ, 敵の金, 敵の経験値, 敵の説明);
	public EnemysOrigin(final String name, final int type, final int[] ability, final int money, final int experiencePoint, final String description){
		this.name = name;
		this.type = type;
		this.ability = ability;
		this.experiencePoint = experiencePoint;
		this.money = money;
		this.description = description;
	}
	public String getName(){
		return this.name;
	}
	public int getType(){
		return this.type;
	}
	public int[] getAddAbility(){
		return this.ability;
	}
	public int getMoney(){
		return this.money;
	}
	public int getExperiencePoint(){
		return this.experiencePoint;
	}
	public String getDescription(){
		return this.description;
	}
}