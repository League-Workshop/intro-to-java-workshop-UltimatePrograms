void setup () {
  size (1000, 10000);
}
void draw () {
  fill (#0041FF);
  if (mousePressed) {
    fill (#FF1500);
  }
  ellipse (mouseX, mouseY, mouseX, mouseY);
}