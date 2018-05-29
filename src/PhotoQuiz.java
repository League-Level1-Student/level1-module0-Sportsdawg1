
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)

		String image = "https://static-cdn.jtvnw.net/jtv_user_pictures/e91a3dcf-c15a-441a-b369-996922364cdc-profile_image-300x300.png";

		// 2. create a variable of type "Component" that will hold your image

		Component what;

		// 3. use the "createImage()" method below to initialize your Component

		what = createImage(image);

		// 4. add the image to the quiz window

		quizWindow.add(what);

		// 5. call the pack() method on the quiz window

		quizWindow.pack();

		// 6. ask a question that relates to the image

		String a1 = JOptionPane.showInputDialog("is it black");

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		if (a1.equals("yes")) {
			System.out.println("correct");
		} else {
			System.out.println("wrong");
		}

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)

		quizWindow.remove(what);

		// 10. find another image and create it (might take more than one line of code)

		Component Image = createImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Red.svg/768px-Red.svg.png");

		// 11. add the second image to the quiz window

		quizWindow.add(Image);

		// 12. pack the quiz window

		quizWindow.pack();

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

		String a2 = JOptionPane.showInputDialog("is it white");

		if (a2.equals("no")) {
			System.out.println("correct");
		} else {
			System.out.println("wrong");
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
