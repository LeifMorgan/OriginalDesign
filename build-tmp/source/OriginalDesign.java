import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
		size(400, 400);
}
public void draw()
{
	background(127);
	//var
	int rectX = 0;
	int rectY = 0;
	int rectX2 = 100;
	int rectY2 = 100;
	//rectangles
		//top left
	noStroke();
	fill(0, 102, 204);
	rect(rectX,rectY,rectX2,rectY2);

	fill(51, 204, 51);
	rect(rectX+100,rectY,rectX2,rectY2);


	fill(51,204,51);
	rect(rectX,rectY+100,rectX2,rectY2);
	
	fill(0, 102, 204);
	rect(rectX+100,rectY+100,rectX2,rectY2);


		//top right
	fill(0, 102, 204);
	rect(rectX+200,rectY,rectX2,rectY2);

	fill(51, 204, 51);
	rect(rectX+300,rectY,rectX2,rectY2);


	fill(51,204,51);
	rect(rectX+200,rectY+100,rectX2,rectY2);
	
	fill(0, 102, 204);
	rect(rectX+300,rectY+100,rectX2,rectY2);

		//bottom left

		fill(0, 102, 204);
	rect(rectX,rectY+200,rectX2,rectY2);

	fill(51, 204, 51);
	rect(rectX+100,rectY+200,rectX2,rectY2);


	fill(51,204,51);
	rect(rectX,rectY+300,rectX2,rectY2);
	
	fill(0, 102, 204);
	rect(rectX+100,rectY+300,rectX2,rectY2);

		//bottom right
	fill(0, 102, 204);
	rect(rectX+200,rectY+200,rectX2,rectY2);

	fill(51, 204, 51);
	rect(rectX+300,rectY+200,rectX2,rectY2);


	fill(51,204,51);
	rect(rectX+200,rectY+300,rectX2,rectY2);
	
	fill(0, 102, 204);
	rect(rectX+300,rectY+300,rectX2,rectY2);




	



	//triangles
		
	fill(51,204,51);
	triangle(300,100,mouseX,mouseY,300,300);
	fill(255,255,0);
	triangle(100,300,mouseX,mouseY,100,100);
	fill(0,102,204);
	triangle(100,100,mouseX,mouseY,100,300);


	//lines

	stroke(5);
	stroke(51,204,51);
	
	line(0,0, mouseX,mouseY);
	line(400,0, mouseX,mouseY);
	line(0,400, mouseX,mouseY);
	line(400,400, mouseX,mouseY);
	line(100,0, mouseX,mouseY);
	line(0,100, mouseX,mouseY);
	line(0,300, mouseX,mouseY);
	line(300,0, mouseX,mouseY);
	stroke(0, 102, 204);
		line(200,0, mouseX,mouseY);
	line(0,200, mouseX,mouseY);
	line(100,400, mouseX,mouseY);
	line(200,400, mouseX,mouseY);
		line(400,100, mouseX,mouseY);
	line(400,200, mouseX,mouseY);
	line(300,400, mouseX,mouseY);
	line(400,300, mouseX,mouseY);




}
public void mousePressed()
{
	


}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
