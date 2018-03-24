package tool;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SwingTool {
	// JFrame
	public static void setJF(JFrame frame, String title, int[] size){
		frame.setTitle(title);
		frame.setBounds(size[0], size[1], size[2], size[3]);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	// JPanel
	// JButton
	public static JButton setJB(final String jbc){
		JButton jb = new JButton(jbc);
		jb.setActionCommand(jbc);
		return jb;
	}
	public static JButton[] setJB(final String[] jbc){
		JButton[] jb = new JButton[jbc.length];
		for (int i=0; i<jb.length; i++) jb[i] = setJB(jbc[i]);
		return jb;
	}
	public static void setJP(JPanel jp, final JButton[] jb){
		for (int i=0; i<jb.length; i++) setJP(jp, jb[i]);
	}
	public static void setJP(JPanel jp, final JButton jb){
		jp.add(jb);
	}
	// JLabel
	public static void setJP(JPanel jp, final JLabel[] jl){
		for (int i=0; i<jl.length; i++) setJP(jp, jl[i]);
	}
	public static void setJP(JPanel jp, final JLabel jl){
		jp.add(jl);
	}
	// JTextField
	public static void setJP(JPanel jp, final JTextField[] jtf){
		for (int i=0; i<jtf.length; i++) setJP(jp, jtf[i]);
	}
	public static void setJP(JPanel jp, final JTextField jtf){
		jp.add(jtf);
	}
}