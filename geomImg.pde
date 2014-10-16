// This sketch is an experiment using the Geomerative library to manipulate SVGs. 

// Sketch built with help from Geomerative tutorial: http://freeartbureau.org/
// USING GEOMERATIVE LIBRARY. Thanks due.

//////////////////////////////////////////////////////
/////// --------- james-oldfield.co ---------- ///////
//////////////////////////////////////////////////////

import geomerative.*; // require geomerative library

RShape myIcon;
float segLength = 10;

void setup() {
  RG.init(this); // initalise the library 
  size(500, 500, P3D);
  background(255);
  smooth(); 
  frameRate(20);

  myIcon = RG.loadShape("icon.svg");
}
  
void draw() {

	background(255);
	translate(18, 18);
	scale(2);
	RG.shape(myIcon);

	// Initialises a new variable, textPoints, as an array and stores the points of the SVG inside.
	RPoint[] imagePoints = myIcon.getPoints();

	// Set a distance of segLength between every shape below.
	RCommand.setSegmentLength(segLength);
	 
	// If i is smaller than the number of points in the image (length of array), increment by 1, and draw a rectangle at each point.
	// For-Loop contains concepts discovered at http://freeartbureau.org/ 
	for (int i=0; i<imagePoints.length; i++) {
		noStroke();
		fill(random(255), random(255), random(255) );
		rect(imagePoints[i].x, imagePoints[i].y, mouseX/80, mouseY/80);
		// segLength = random(10);
	}

  }
