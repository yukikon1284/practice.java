import tool.Tool;
public class Test {
	public static void main(String[] args) {
		Status s = new Status(new int[] {10,20,3,4,5,6,7});
		s.addStatus(0, -1);
		Tool.pl(Tool.toString(s.getStatusArr()));
		Tool.pl(Tool.toString(s.getStatusMaxArr()));

		s.addStatusArr(new int[] {10,10,0,0,0,0,0});
		Tool.pl(Tool.toString(s.getStatusArr()));
		Tool.pl(Tool.toString(s.getStatusMaxArr()));
	}
}