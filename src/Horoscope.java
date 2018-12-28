import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String hi = JOptionPane.showInputDialog("What is your zodiac sign?");
	if (hi.equalsIgnoreCase("aries")) {
		JOptionPane.showMessageDialog(null, "You wont work well in groups today and your energy will serve you better if you do things alone.");
}
	else if (hi.equalsIgnoreCase("taurus")) {
		JOptionPane.showMessageDialog(null, "Single Taureans especially should be themselves today and let your personality shine through."); 
			
	}
	else if (hi.equalsIgnoreCase("gemini")) {
		JOptionPane.showMessageDialog(null, "When negative memories surface with the reconnecting of family members today, let it go and move forward.");
	}
	else if (hi.equalsIgnoreCase("cancer")) {
		JOptionPane.showMessageDialog(null, "With an evening out of the balance between work and play today, youll feel you can have it all.");
	}
	else if (hi.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, "Changes are coming for you, but they arent here yet so relax and gather your energy ready for it.");
	}
	else if (hi.equalsIgnoreCase("virgo")) {
		JOptionPane.showMessageDialog(null, "The Moon enters Virgo with strong energy today, but allow that energy to be inward looking.");
	}
	else if (hi.equalsIgnoreCase("libra")) {
		JOptionPane.showMessageDialog(null, "Stop obsessing over that problem you cant solve and let you subconscious work on it, the answer will come.");
	}
	else if (hi.equalsIgnoreCase("scorpio")) {
		JOptionPane.showMessageDialog(null, ("When a friend needs something from you today, be the best friend you can be and give freely."));
	}
	else if (hi.equalsIgnoreCase("sagittarius")) {
		JOptionPane.showMessageDialog(null, ("Energy from Jupiter square with The Moon today means its time to start planning a fun trip."));
				
	}
	else if (hi.equalsIgnoreCase("capricorn")) {
		JOptionPane.showMessageDialog(null, ("Energy from Saturn in trine with The Moon today gives you the strength to be flexible and to see a new perspective."));
	}
	else if (hi.equalsIgnoreCase("aquarius")) {
		JOptionPane.showMessageDialog(null, "When you feel the pressure over your work/life balance today, slow your pace and scale back.");
	}
	else if (hi.equalsIgnoreCase("pisces")) {
		JOptionPane.showMessageDialog(null, "Smile, laugh and keep a positive attitude today, look for goodness and beauty and good things will come.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a zodiac sign!");
	}
}
}
