import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import geomerative.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class geomImg extends PApplet {

// This sketch is an experiment using the Geomerative library to manipulate SVGs. 

// Sketch built with help from Geomerative tutorial: http://freeartbureau.org/
// USING GEOMERATIVE LIBRARY. Thanks due.

//////////////////////////////////////////////////////
/////// --------- james-oldfield.co ---------- ///////
//////////////////////////////////////////////////////

 // require geomerative library

RShape myIcon;
float segLength = 10;

public void setup() {
  RG.init(this); // initalise the library 
  size(500, 500, P3D);
  background(255);
  smooth(); 
  frameRate(20);

  myIcon = RG.loadShape("icon.svg");
}
  
public void draw() {

pushMatrix();
	background(255);
	translate(18, 18);
	scale(2);
	RG.shape(myIcon);

	rotateX(mouseX);
	rotateY(mouseY);
	rotateZ(mouseY*2);
popMatrix();

	// // Initialises a new variable, textPoints, as an array and stores the points of the SVG inside.
	// RPoint[] imagePoints = myIcon.getPoints();

	// // Set a distance of segLength between every shape below.
	// RCommand.setSegmentLength(segLength);
	 
	// // If i is smaller than the number of points in the image (length of array), increment by 1, and draw ellipse at each point.
	// // For-Loop contains concepts discovered at http://freeartbureau.org/ 
	// for (int i=0; i<imagePoints.length; i++) {
	// 	noStroke();
	// 	fill(random(255), random(255), random(255) );
	// 	rect(imagePoints[i].x, imagePoints[i].y, mouseX/80, mouseY/80);
	// 	// segLength = random(10);
	// }

  }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "geomImg" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
