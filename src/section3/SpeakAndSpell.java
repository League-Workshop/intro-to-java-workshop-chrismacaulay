package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		// 2. Catch the user's answer in a String

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


