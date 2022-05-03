import processing.core.PApplet;
import processing.event.MouseEvent;

public class Sketch extends PApplet {
	


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  float r = 0;
  float g = 128;
  float b = 0;
  float ballY = 300;

  public void setup() {
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

   public void draw() {

// mousePressed variable
  if(mousePressed) {
      background(135, 206, 235);
  } else {
      background(2, 17, 69);
  }

// Mouse X and Y input 
  fill(255, 255, 255);
  ellipse(mouseX, mouseY, 15, 15);

// Draw the ground
  fill(r, g, b);
  rect(0, 300, 400, 250);

// key Variable 
  textSize(50);
  fill(255,255,255);
  text(key, 350, 350);

//keyCode function
if(keyPressed){
  if(keyCode == UP){
    ballY --;
  }
}

// Calling method 
  house(25, 190);
  ball(250, ballY, 50);

  
}
// Mouse Input function
public void mouseDragged() {
    r = 128;
    g = 0;
    b = 0;
}
// Combining Input Variables and Event Functions
public void mouseWheel() {
  fill(245, 245, 66);
  ellipse(mouseX, mouseY, 80, 80);
}

  // define other methods down here.
  private void house(float houseX, float houseY){
    fill(200, 155, 125);
    rect(houseX, houseY, 150, 150); 
  
    fill(125, 65, 45);
    rect(houseX + 10, houseY - 60, 25, 60);
  
    fill(125, 65, 45);
    triangle(houseX, houseY, houseX + 150, houseY, houseX + 75, houseY - 70);
  
    fill(255, 197, 143);
    rect(houseX + 75, houseY + 60, 60, 90);
  
    fill(255, 255, 255);
    rect(houseX + 10, houseY + 60, 50, 50);
  
    fill(0, 0, 0);
    line(houseX + 35, houseY + 60, houseX + 35, houseY + 110);
  
    fill(0, 0, 0);
    line(houseX + 10, houseY + 85, houseX + 60, houseY + 85);
  
    fill(0, 0, 0);
    ellipse(houseX + 120, houseY + 110, 15, 15);
  }

  private void ball(float circleX, float circleY, float ballSize){
    fill(250, 255, 0);
    ellipse(circleX, circleY, ballSize, ballSize);
  
    fill(255, 0, 150);
    ellipse(circleX, circleY, ballSize, ballSize/2);
  
    fill(65, 0, 255);
    ellipse(circleX, circleY, ballSize/2, ballSize);
  }

}
