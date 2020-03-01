import java.awt.MouseInfo;
import java.awt.Point;

public class Main {
	public static void main(String args[]) {
		while(true) {
			Point p = MouseInfo.getPointerInfo().getLocation();
			System.out.println("X: " + p.getX() + " Y: " + p.getY());
		}
	}
}
