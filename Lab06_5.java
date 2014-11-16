import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06_5 {

public static void toEnd1(Robot arg){

   int count = 0;
   while (arg.frontIsClear()){
   arg.move();
   count++;
}
System.out.println("Count is "+ count);
}
public static void toEnd2(Robot arg){
   
   while (arg.nextToABeeper()){
      arg.pickBeeper();
   }
   while (!arg.nextToARobot()){
      arg.move();
   }
   
   arg.move();
   
   while (arg.hasBeepers()){
      arg.putBeeper();
   }    
}   
public static void toEnd3(Robot arg){
   int n = 4;
   int k = 0;
   
   while (k != n){
      arg.putBeeper();
      k++;
   }      
   arg.move();
   n = n + 4;
    while (k != n){
      arg.putBeeper();
      k++;
   }      
   arg.move();
   n = n + 4;
    while (k != n){
      arg.putBeeper();
      k++;
   }      
   arg.move();
   n = n + 4;
    while (k != n){
      arg.putBeeper();
      k++;
   }      
   arg.move();
   n = n + 4;
    while (k != n){
      arg.putBeeper();
      k++;
   }      
   arg.move();

}
public static void toEnd4(Robot arg){
   
   while (arg.frontIsClear()){
      arg.putBeeper();
      arg.move();
   }
   arg.putBeeper();
}
public static void toEnd5(Robot arg){

   while (!arg.rightIsClear()){
      arg.putBeeper();
      arg.move();
   }
}
public static void toEnd6(Robot arg){
   
   while (arg.rightIsClear()||!arg.nextToABeeper()){
      arg.move();
   }
}
   

public static void main(String[] args) {
     
   String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
   Display.setSize(10, 10);
   Display.setSpeed(9);
   
   Robot john = new Robot(1, 1, Display.EAST, 0);
   Robot alex = new Robot(1, 2, Display.EAST, 0);
   Robot jordon = new Robot(1, 3, Display.EAST, 20);
   Robot pete = new Robot(1, 4, Display.EAST, 15);
   Robot max = new Robot(1, 5, Display.EAST, 15);
   Robot joe = new Robot(1, 7, Display.EAST, 0);
   Robot liam = new Robot(9, 2, Display.WEST, 0); 
   
   toEnd1(john);
   toEnd2(alex);
   toEnd3(jordon);
   toEnd4(pete);
   toEnd5(max);
   toEnd6(joe);

     }
     
}
