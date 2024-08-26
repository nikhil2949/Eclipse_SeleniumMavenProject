package Section2_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardStrokeHandling_AccessingLocalApplicaions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		String application="Notepad";
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		for(char c:application.toCharArray())
		{
			int key=KeyEvent.getExtendedKeyCodeForChar(c);   //Gives the unique code for each and every character
			r.keyPress(key);
			r.keyRelease(key);
			Thread.sleep(3000);         
		}
         r.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(3000);
         r.keyRelease(KeyEvent.VK_ENTER);
		}

}
