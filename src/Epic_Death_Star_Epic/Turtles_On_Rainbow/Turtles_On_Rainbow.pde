PImage Rainbow;
PImage Turtle;
void setup() {
  Rainbow = loadImage("Rainbow.jpg");
  Turtle = loadImage("Turtle.png");
  size(800, 600);
  Rainbow.resize(width, height);
  Turtle.resize(150, 100);
}

void draw() {
  background(Rainbow);
  image(Turtle, 300, 150);
}
