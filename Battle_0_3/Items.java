class Items{

	//[店][種類][場所] アイテムの名前 文字列 三次元配列
	private static String[][][] itemsName = 
		//武器
		{{{"a1","a2","a3","a4","a5"}
		,{"b1","b2","b3","b4","b5"}
		,{"c1","c2","c3","c4","c5"}
		,{"d1","d2","d3","d4","d5"}
		,{"e1","e2","e3","e4","e5"}
		,{"f1","f2","f3","f4","f5"}
		,{"g1","g2","g3","g4","g5"}
		,{"h1","h2","h3","h4","h5"}}
		//防具
		,{{"i1","i2","i3","i4","i5"}
		,{"j1","j2","j3","j4","j5"}
		,{"k1","k2","k3","k4","k5"}
		,{"l1","l2","l3","l4","l5"}}
		//魔法
		,{{"m1","m2","m3","m4","m5"}
		,{"n1","n2","n3","n4","n5"}
		,{"o1","o2","o3","o4","o5"}}
		//道具
		,{{"p1","p2","p3","p4","p5"}
		,{"q1","q2","q3","q4","q5"}
		,{"r1","r2","r3","r4","r5"}}
		//装飾品
		,{{"s1","s2","s3","s4","s5"}
		,{"t1","t2","t3","t4","t5"}
		,{"u1","u2","u3","u4","u5"}}
		,{{"無し"}}};
	
	//[店][種類][場所][行] アイテムのフレーバーテキスト 文字列 四次元配列
	private static String[][][][] itemsFlavorText =
		//武器
		{{{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}}
		//防具
		,{{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}}
		//魔法
		,{{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}}
		//道具
		,{{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}}
		//装飾品
		,{{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}
		,{{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}
		,{"","","","",""}}}};
	
	//[店][種類][場所] アイテムの表示 真偽 三次元配列
	private static Boolean[][][] itemsFault  =
		//武器
		{{{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}}
		//防具
		,{{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}}
		//魔法
		,{{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}}
		//道具
		,{{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}}
		//装飾品
		,{{true,true,true,true,true}
		,{true,true,true,true,true}
		,{true,true,true,true,true}}};
	
	//[店][種類][場所] アイテムの装備できる数 
	private static int[][][] itemsEquipmentNumber  =
		//武器
		{{{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}}
		//防具
		,{{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}}
		//魔法
		,{{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}}
		//道具
		,{{2,2,2,2,2}
		,{2,2,2,2,2}
		,{2,2,2,2,2}}
		//装飾品
		,{{1,1,1,1,1}
		,{1,1,1,1,1}
		,{1,1,1,1,1}}
		,{{1}}};
	
	//[店][種類][場所]
	private static int[][][] itemsMoney = 
		//武器
		{{{1,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//防具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//魔法
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//道具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//装飾品
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}};
	public static String itemsName(int store, int type, int place){
		return itemsName[store][type][place];
	}
	public static String[] itemsName(int store, int type){
		return itemsName[store][type];
	}
	public static int itemsEquipmentNumber(int store, int type, int place){
		return itemsEquipmentNumber[store][type][place];
	}
	public static String[] itemsFlavorText(int store, int type, int place){
		return itemsFlavorText[store][type][place];
	}
	public static Boolean itemsFault(int store, int type, int i){
		return itemsFault[store][type][i];
	}
	public static int itemsMoney(int store, int type, int place){
		return itemsMoney[store][type][place];
	}
	public static int[][] seyItemsName(int store, int type, Boolean showall, Boolean money, Boolean possession){
		String[] itemsNames = itemsName(store, type);
		int[] CIN = new int[itemsNames.length];
		int t = 0;
		int[] characterItemsNumberIntArr = Character.getCharacterItemsNumber(store, type);
		for (int i=0; i<itemsNames.length; i++) {

			/*
				if () {
				
				}else if (){
				
				}
			*/
			Boolean indication = false;
			if (showall) {
				Case.p(Case.number(i)+itemsNames[i]);
				CIN[t] = i;
				t++;
				indication = true;
			}else if (showall == false
				&& characterItemsNumberIntArr[i] > 0) {
				Case.p(Case.number(t)+itemsNames[i]);
				CIN[t] = i;
				t++;
				indication = true;
			}
			//if() $を表示するか、しないか
			if (money 
				&& indication) Case.p(" $"+itemsMoney(store, type, i));
			//if () 所持数を表示するか、しないか
			if (possession 
				&& indication) Case.p(" ("+characterItemsNumberIntArr[i]+")");
			if (indication) Case.pl("");
		}
		if (t == 0) Case.pl(" 所有物無し");
		Case.pl(Case.number(t)+Case.back());
		int[][] poCIN = {CIN,{t}};
		return poCIN;
	}
}