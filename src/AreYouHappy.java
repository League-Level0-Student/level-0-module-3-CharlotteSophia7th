import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you happy?");
	if (answer.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	else {
		String hi =JOptionPane.showInputDialog("Don't you want to be happy?");
		if (hi.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
}
}
