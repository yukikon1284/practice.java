import Origins.OriginsType;
import Origins.OriginsName;
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
	static String[] getDesignationStr(final String[] originStr, final int[] originInt, final int number){
		int[] designationInt = designationInt(originInt, number);
		String[] designationStr = new String[designationInt.length];
		for (int i=0; i<designationInt.length; i++) designationStr[i] = originStr[designationInt[i]];
		return designationStr;
	}
	static String[] getAllName(final OriginsName[] originsName){
		final int OL = originsName.length;
		final String[] name = new String[OL];
		for (int i=0; i<OL; i++) name[i] = originsName[i].getName();
		return name;
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
	static String attribute(final int attribute){
		final String[] attributeName = {"無し","毒","猛毒","やけど","燃焼","しびれ","麻痺","睡眠","スロウ"};
		return attributeName[attribute];
	}
}