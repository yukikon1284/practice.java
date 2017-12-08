import Origins.OriginsType;
// import Origins.OriginsName;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
interface CaseOrigin{
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
	/*static String[] getDesignationStr(final String[] originStr, final int[] originInt, final int number){
		int[] designationInt = designationInt(originInt, number);
		String[] designationStr = new String[designationInt.length];
		for (int i=0; i<designationInt.length; i++) designationStr[i] = originStr[designationInt[i]];
		return designationStr;
	}*/
	/*static String[] getAllName(final OriginsName[] originsName){
		final int OL = originsName.length;
		final String[] name = new String[OL];
		for (int i=0; i<OL; i++) name[i] = originsName[i].getName();
		return name;
	}*/
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
		final String[][] attributeName = {{"無し","毒","猛毒"},{"無し","やけど","燃焼"},{"無し","しびれ","麻痺"},{"無し","睡眠"},{"無し","スロウ"}}; 
		String[] attributeStr = new String[attribute.length];
		for (int i=0; i<attribute.length; i++) attributeStr[i] = attributeName[i][attribute[i]];
		return attributeStr;
	}
	static String[] attributeResistance(final int[] attribute){
		final String[] attributeResistanceName = {"無し","毒","燃焼","麻痺","睡眠","スロウ"};
		String[] attributeResistanceStr = new String[attribute.length];
		for (int i=0; i<attribute.length; i++) {
			String resistanceNumber = "";
			if (attribute[0] != 0) resistanceNumber = "Level"+(attribute[1]+1);
			attributeResistanceStr[i] = attributeResistanceName[attribute[i]]+resistanceNumber;
		}
		return attributeResistanceStr;
	}
	static int[] maxOperationAbility(int[] ability){
		int[] max = {10,10,1,1,1,1,1};
		for (int i=0; i<max.length; i++) ability[i] *= max[i];
		return ability;
	}
	//よけれたら　true
	static Boolean avoid(final int attackAGI, final int avoidAGI, final Boolean slow){
		Boolean avoid = false;
		if (Case.random(avoidAGI)+1 <= avoidAGI - attackAGI) avoid = true;
		return avoid;
	}
	//抵抗　できたら　false
	static Boolean resistance(int resistance){
		Boolean resist = true;
		if (Case.random(5) < resistance) resist = false;
		return resist;
	}
}