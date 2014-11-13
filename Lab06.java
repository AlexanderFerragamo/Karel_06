/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {

public static void toWall(Robot arg)
{
   while (arg.frontIsClear())
   {
   arg.move();
   }
}
public static void toEnd6(Robot arg)
{
   while (arg.nextToABeeper())
   {
   arg.move();
   }
   arg.move();
    while (arg.nextToABeeper())
   {
   arg.move();
   }
}
public static void toBeeper(Robot arg)
{
   while (!arg.nextToABeeper())
   {
   arg.move();
   }
}
public static void toEnd4(Robot arg)
{
   while (arg.frontIsClear())
   {
   if (arg.nextToABeeper()){
   arg.pickBeeper();
   arg.move();
   } else {
   arg.move();
   }
   }
   while (!arg.frontIsClear()&&arg.nextToABeeper()){
   arg.pickBeeper();
   }
}
public static void toEnd5(Robot arg){
   while (arg.frontIsClear())
   {
   if (arg.nextToABeeper()){
   arg.pickBeeper();
   } else {
   arg.move();
   }
   }
   while (!arg.frontIsClear()&&arg.nextToABeeper()){
   arg.pickBeeper();
}
}
public static void toSpace(Robot arg)
{
   while (arg.nextToABeeper())
   {
   arg.move();
   }
   }




     public static void main(String[] args) {
     
   String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
   Display.setSize(10, 10);
   Display.setSpeed(5);
   
   Robot john = new Robot(1, 1, Display.EAST, 0);
   Robot alex = new Robot(1, 2, Display.EAST, 0);
   Robot jordon = new Robot(1, 3, Display.EAST, 0);
   Robot pete = new Robot(1, 4, Display.EAST, 0);
   Robot max = new Robot(1, 5, Display.EAST, 0);
   Robot joe = new Robot(1, 6, Display.EAST, 0);
   
   toWall(jordon);
   toEnd6(joe);
   toSpace(john);
   toBeeper(alex);  
   toEnd4(pete);
   toEnd5(max);
     }
     
}
