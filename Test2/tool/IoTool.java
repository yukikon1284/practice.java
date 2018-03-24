package tool;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class IoTool {
	public static String[] readFile(String fileName) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
		ArrayList<String> arrayList = new ArrayList<String>();
		while(true){
			String str = bf.readLine();
			if (str == null) break;
			arrayList.add(str);
		}
		/*List<String> strList = arrayList;
		String[] strArr = strList.toArray(new String[strList.size()]);*/
		String[] strArr = arrayList.toArray(new String[arrayList.size()]);
		return strArr;
	}
	public static void writeFile(String fileName, String str) throws IOException{
		BufferedWriter bw = setBW(fileName);
		bw.write(str);
		bw.close();
	}
	public static void writeFile(String fileName, String[] str) throws IOException{
		BufferedWriter bw = setBW(fileName);
		for (int i=0; i<str.length; i++) bw.write(str[i]);
		bw.close();
	}
	private static BufferedWriter setBW(String fileName) throws IOException{
		return new BufferedWriter(new FileWriter(new File(fileName)));
	}
}