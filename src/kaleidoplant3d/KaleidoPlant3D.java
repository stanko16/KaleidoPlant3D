package kaleidoplant3d;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;

import peasy.PeasyCam;
import processing.core.PApplet;

public class KaleidoPlant3D extends PApplet {
	
	private float theta,gamma = radians(5*PI);
	private int n,lastOneWas= 0;
	private String s;
	private BufferedReader reader;
	private PeasyCam camera;
	private Menu m;

	public static float a;
	public static int width;
	public static String path = "rule1.dat";
	public static int background=255;
	public static int red=50;
	public static int green=100;
	public static int blue=20;
	
	public void actionPerformed(ActionEvent evt) {

}
	
	public void setup() {
	  size(displayWidth-100, displayHeight*100, P3D);
	  KaleidoPlant3D.width=displayWidth-100;
	  camera = new PeasyCam(this, 500);
	  camera.lookAt(250, 360, 0);
	  camera.rotateZ(0.99483*90f);
	  m = new Menu();m.setVisible(true);
	  n=5;
	  camera.setResetOnDoubleClick(false);
	}
	
	public void draw() {
		  background(background);
		  
		  reader = createReader(path); 
		  try {s=reader.readLine();}
		  catch(Exception E) {print("FILE NOT FOUND");}

		  //Preparing ambient
		  strokeWeight(2);
		  frameRate(40);
		  stroke(red,green,blue,100);

		  //Setting the angle of mobility
		  //a = (float) ((((mouseY) / ((float) width*0.263)))* 90f);
		  gamma = radians(a);

		  //Setting starting position and line
		  translate(0, height/2);

		  //running the algorithm

		  read();

		}

	
	public void read() {

	  for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if (c=='-') {
	      direction(1);
	      lastOneWas=1;
	    }
	    else if (c=='+') {
	      direction(2);
	      lastOneWas=2;
	    }
	    else if (c=='*') {
	      direction(3);
	      lastOneWas=3;
	    }
	    else if (c=='%') {
	      direction(4);
	      lastOneWas=4;
	    }
	    else if (c=='f') {
	      drowline();
	    }
	    else if (c==']') {
	      translate(-n, 0);
	      try{
	      popMatrix();}catch(Exception e){}
	    }
	    else if (c=='[') {
	      pushMatrix();
	    }
	    else {
	    }
	  }
	  s="";
	}


	public void direction(int n) {

	  if (n==1) {
	    rotateZ(gamma);
	  } 
	  else if (n==2){
	    rotateZ(-gamma);
	  }
	  else if (n==3){
	    rotateY(gamma);
	  }
	  else if (n==4){
	    rotateY(-gamma);
	  }
	}

	public void drowline() {   
	  
	  line(0, 0, n, 0); 
	  translate(n, 0);
	}

}
