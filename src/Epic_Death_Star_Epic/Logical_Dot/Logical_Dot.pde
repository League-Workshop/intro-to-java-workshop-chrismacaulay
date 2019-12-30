

void setup() {
  size(1920, 1080);
}

void draw() {
 background(#FFFFFF);
  ellipse(960, 540, 300, 200);
  if (mousePressed) {
    fill(#309BF0);
    ellipse(960, 540, 300, 300);
    fill(#000000);
  rect(860, 600, 1, 100);
  } else {
   
    fill(#309BF0);
    ellipse(960, 540, 300, 200);
  }
}
