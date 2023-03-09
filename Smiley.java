import java.awt.*;  
import java.applet.*;  
/*
<applet code = "Smiley.class" width = "320" height = "120">
</applet>
*/
public class Smiley extends Applet 
{
 public void paint(Graphics g) 
 {
	// For face
  	g.setColor(Color.yellow);
  	g.fillOval(20,20,150,150);   
  	
	g.setColor(Color.black);
	// Left Eye 
  	g.fillOval(60,60,15,25); 
	// Right Eye   
 	g.fillOval(110,60,15,25);    
 	
     	// Smile
  	g.drawArc(55,90,78,50,0,-180); 
	
  }
}
 