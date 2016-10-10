import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class test {

    public static void main(String[] args) {
    	Robot exercise1 = new Robot();
    	exercise1.penDown();
    	exercise1.setSpeed(8);
   	 // 3. ask the user what color they would like the Robot to draw
    	String clr = JOptionPane.showInputDialog("What colour would you like to set?");
    	clr.toLowerCase();
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(clr.equals("blue")){
    		exercise1.setPenColor(Color.blue);
    	}
    	else if(clr.equals("pink")){
    		exercise1.setPenColor(Color.magenta);
    	}
    	else if(clr.equals("purple")){
    		exercise1.setPenColor(100,0,255);
    	}
    	else if(clr.equals("orange")){
    		exercise1.setPenColor(Color.orange);
    	}
    	else if(clr.equals("green")){
    		exercise1.setPenColor(Color.green);
    	}
    	else if(clr.equals("cyan") || clr.equals("teal") || clr.equals("turquoise")){
    		exercise1.setPenColor(Color.cyan);
    	}
    	else if(clr.equals("red")){
    		exercise1.setPenColor(Color.red);
    	}
    	else if(clr.equals("yellow")){
    		exercise1.setPenColor(Color.yellow);
    	}
    	else if(clr.equals("black")){
    		exercise1.setPenColor(Color.black);
    	}
    	else if(clr.equals("white")){
    		exercise1.setPenColor(Color.white);
    	}
    	else{
    		JOptionPane.showConfirmDialog(null, "I'm sorry, that colour is not supported. Please reload and try again.");
    	}
   	 // 2. set the pen width to 10
    	exercise1.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 	for(int i=0;i<4;i++){
    		exercise1.move(150);
    		exercise1.turn(90);
   	 	}
    }

}