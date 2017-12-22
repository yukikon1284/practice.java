import Origins.OriginsType;
// import Origins.OriginsName;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
interface CaseOrigin{
	int[] DUNGEON_LEVEL = {1,11,21,31,41,51,61,71,81,91};
	static int[] designationInt(final int[] originInt, final int number){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i=0; i<originInt.length; i++) if (originInt[i] == number) arrayList.add(i);
		List<Integer> intList = arrayList;
		int[] designationInt = new int[intList.size()];
		for (int i=0; i<designationInt.length; i++) designationInt[i] = intList.get(i);
		return designationInt;
	}
	static int[] getDesignationInt(final int[] deIn, final int[] originInt, final int number){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i=0; i<deIn.length; i++) if (originInt[deIn[i]] == number) arrayList.add(deIn[i]);
		List<Integer> intList = arrayList;
		int[] designationInt = new int[intList.size()];
		for (int i=0; i<designationInt.length; i++) designationInt[i] = intList.get(i);
		return designationInt;
	}
	static int[] getAllType(final OriginsType[] originsType, final int place){
		final int OL = originsType.length;
		final int[] type = new int[OL];
		for (int i=0; i<OL; i++) type[i] = originsType[i].getType(place);
		return type;
	}
	static String[] ability(final int[] ability){
		final String[] abilityName = {"HP","MP","STR","VIT","INT","MGR","AGI"};
		String[] abilityStr = new String[abilityName.length];
		for (int i=0; i<abilityName.length; i++) abilityStr[i] = abilityName[i]+" "+ability[i]+" ";
		return abilityStr;
	}
	static String[] attribute(final int[] attribute){
		final String[] attributeResistanceName = {"無し","毒","燃焼","麻痺","睡眠","スロウ"};
		String[] attributeResistanceStr = new String[attribute.length];
		for (int i=0; i<attribute.length; i++) {
			String resistanceNumber = "";
			if (attribute[i] != 0) resistanceNumber = "Level"+attribute[i];
			attributeResistanceStr[i] = attributeResistanceName[attribute[i]]+resistanceNumber;
		}
		return attributeResistanceStr;
	}
	static String[] attributeAbility(final int[] attribute){
		final String[] attributeResistanceName = {"無し","STR","DEF","INT","MGR","AGI"};
		String[] attributeResistanceStr = new String[attribute.length];
		for (int i=0; i<attribute.length; i++) {
			String resistanceNumber = "";
			if (attribute[i] != 0) resistanceNumber = "Level"+attribute[i];
			attributeResistanceStr[i] = attributeResistanceName[attribute[i]]+resistanceNumber;
		}
		return attributeResistanceStr;
	}
	static int[] maxOperationAbility(int[] ability){
		int[] max = {10,10,1,1,1,1,1};
		for (int i=0; i<max.length; i++) ability[i] *= max[i];
		return ability;
	}
	static int hierarchyPlace(int hierarchy){
		int i = 0;
		while (true) {
			if (hierarchy <= 10*(i+1)+1) break;
			i++;
		}
		return i;
	}
	/*//よけれたら　true
	static Boolean avoid(final int attackAGI, final int avoidAGI, final Boolean slow){
		Boolean avoid = false;
		if (Case.random(avoidAGI)+1 <= avoidAGI - attackAGI) avoid = true;
		return avoid;
	}*/
	static Boolean avoid(final int attackAGI, final int avoidAGI, final Boolean slow){
		Boolean avoid = false;
		if (slow && Case.random(avoidAGI) < (int)(avoidAGI*0.5f) - attackAGI) avoid = true;
		else if (Case.random(avoidAGI) < avoidAGI - attackAGI) avoid = true;
		return avoid;
	}
	static Boolean randomBoolean(final int random, final int number){
		Boolean bool = true;
		if (Case.random(random) < number) bool = false;
		return bool;
	}
	//抵抗　できたら　false
	static Boolean resistance(int resistance){
		Boolean resist = true;
		if (Case.random(5) < resistance) resist = false;
		return resist;
	}
}