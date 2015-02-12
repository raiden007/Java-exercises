import java.awt.Color;
import acm.util.*;
import acm.graphics.*;
import acm.program.*;
import acm.program.GraphicsProgram;


public class BouncingBalls extends GraphicsProgram {
	public void run () {
		int pauseTime = 20;
		GRect rect = new GRect(100,100,100,100);
		rect.setColor(Color.RED);
		rect.setFilled(true);
		add (rect);

		for (int i=0;i<100;i++) {
			pause(pauseTime);
			rect.setVisible(false);
			pause(pauseTime);
			rect.setVisible(true);
		}
	}
}