// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 

//TankOne

//track
fill(255,255,255)
  ellipse(305, 220, 110, 30);

  

//wheels
//--------------\/
fill(107,93,25)
//1small
ellipse(257, 221, 10, 10);
//2small
ellipse(352, 221, 10, 10);
//first
ellipse(271, 224, 15, 15);
//second
ellipse(288, 226, 15, 15);
//third
ellipse(305, 227, 15, 15);
//fourth
ellipse(322, 226, 15, 15);
//fivth
ellipse(339, 224, 15, 15);
  
  //body
  fill(35,148,12)
  rect(263, 189, 30, 5);
  fill(19,97,4)
  ellipse(300, 200, 50, 42);
  rect(304, 210, 110, 20);

  //TankTwo

//track
fill(255,255,255)
  ellipse(105, 220, 110, 30);

  

//wheels
//--------------\/
fill(64,56,0)
//1small
ellipse(57, 221, 10, 10);
//2small
ellipse(152, 221, 10, 10);
//first
ellipse(71, 224, 15, 15);
//second
ellipse(88, 226, 15, 15);
//third
ellipse(105, 227, 15, 15);
//fourth
ellipse(122, 226, 15, 15);
//fivth
ellipse(139, 224, 15, 15);
  
//Rockets!
fill(235,12,12)
triangle(55,160,50,170,60,170);
fill(204,92,0)
rect(55, 185, 10, 30);
fill(235,12,12)
triangle(67,160,62,170,72,170);
fill(204,92,0)
rect(67, 185, 10, 30);
fill(235,12,12)
triangle(79,160,74,170,84,170);
fill(204,92,0)
rect(79, 185, 10, 30);
fill(235,12,12)
triangle(91,160,86,170,96,170);
fill(204,92,0)
rect(91, 185, 10, 30);


  //body
  fill(252,171,104)
  rect(73, 190, 49, 8);
  fill(230,100,6)
  ellipse(136, 200, 45, 35);
  fill(87,39,0)
  rect(104, 210, 110, 20);

  
  
  
  
  
  
  
  
  
  
 

  
 
	

}