PImage catPic;
int x = 570;
int y = 334;
int acceleration=5;
void setup () { 
  size (800, 800);
  catPic=loadImage ("cat.jpg");
  catPic.resize(800, 800);
  background (catPic); 
}



void draw () {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  fill (#0A2BF5);
  noStroke();
  ellipse (x, y, 150, 150);
  ellipse(x-320, y+90, 150, 150);
  if (y >800){ background (catPic);
  x = 570;
  y= 334;
  
  }
}
void keyPressed () {
  y+=2*acceleration;
x+=2*acceleration;
}
