PImage rainbow;
PImage unicorn;
void setup() { 
  rainbow = loadImage("rainbow.jpg");

  size(800, 600);

  rainbow.resize(800, 600);
  unicorn = loadImage ("image1.png");
  unicorn.resize(170, 150);
}
void draw () { 
 background (rainbow);
  image(unicorn, mouseX, mouseY);
}