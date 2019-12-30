PImage Moustache;
PImage Putin;
void setup() {
Putin = loadImage( "Putin.jpg");
Moustache = loadImage("Moustache.png");
size(800, 600);
Putin.resize(width,height);
Moustache.resize(800, 70);
}

void draw() {
background(Putin);
image(Moustache, -10, 100);
}
