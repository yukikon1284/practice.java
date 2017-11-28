class StorageLocation{
	static int[] places = {0,0};
	static int[] SLN = {0,0,0};
	static Boolean storageLocation(Boolean x){
		int i = 0;
		while(x){
			try{
				int size = storageLocationTF(i);
				int answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) x = false;
					else i--;
				}else if (answer > 0 && answer <= size) {
					if (i == 1) {
						places[i] = answer-1;
						x = storageLocationIf(x);
						if (x == false) {
							x = true;
							break;
						}
					}else {
						places[i] = answer-1;
						i++;
					}
				}else Case.seyCorrect();
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
		return x;
	}
	private static Boolean storageLocationRead(Boolean x){
		Case.pl(Character.getName(places[1])+"をロードしますか？");
		int answer = Case.YN(x);
		if (answer == 1) {
			Character.setCharacter(places[1]);
			x = false;
		}
		return x;
	}
	private static Boolean storageLocationNew(Boolean x){
		Case.pl((places[1]+1)+"に新しくキャラを作りますか？");
		int answer = Case.YN(x);
		if (answer == 1) {
			Character.setCharacter(places[1]);
			Character.setNewAbility();
			Character.setStorageLocationNew(x);
			Character.setStorageLocation(places[1], true);
			x = false;
		}
		return x;
	}
	private static Boolean storageLocationOverwrite(Boolean x){
		Case.pl(Character.getName(places[1])+"空きがありません、上書きしますか？");
		int answer = Case.YN(x);
		if (answer == 1) {
			Character.setCharacter(places[1]);
			Character.setNewAbility();
			Character.setStorageLocationNew(x);
			x = false;
		}
		return x;
	}
	private static Boolean storageLocationIf(Boolean x){
		if (places[0] == 0) {
			if (Character.getStorageLocation(places[1])) x = storageLocationOverwrite(x);
			else x = storageLocationNew(x);
		}else if (places[0] == 1 && Character.getStorageLocation(places[1])) {
			x = storageLocationRead(x);
		}else Case.pl(" データがありません。");
		return x;
	}
	private static int storageLocationTF(int place){
		int t = 0;
		int i;
		String[] nameIntArr = Character.getName();
		final String[][] storageLocationStr = 
			{{"始め","続き"}
			,nameIntArr};
		for (i=0; i<storageLocationStr[place].length; i++) {
			if (place == 1 || i != 1 || i == 1 && storageTF() > 0){
				Case.pl(Case.number(t)+storageLocationStr[place][i]);
				SLN[t] = i;
				t++;
			}
		}
		String[] EBStrArr = {"終わり",Case.back()};
		Case.pl(Case.number(t)+EBStrArr[place]);
		return t;
	}
	private static int storageTF(){
		int storageTFInt = 0;
		Boolean[] storageTF = Character.getStorageLocation();
		for (int i=0; i<storageTF.length; i++) {
			if (storageTF[i]) storageTFInt++;
		}
		return storageTFInt;
	}
}