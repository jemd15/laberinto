import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chinita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chinita extends Actor
{
    /**
     * Act - do whatever the chinita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String direccion = "norte";
    public void act() 
    {
        // Add your action code here.
        int y = getY();
        int x = getX();
      if (Greenfoot.isKeyDown("left")) {
          x--;
          if(direccion.equals("norte")){
              turn(-90);
          }else if(direccion.equals("este")){
              turn(-180);
          }else if(direccion.equals("oeste")){

          }else if(direccion.equals("sur")){
              turn(90);
          }
          direccion = "oeste";
      }
      if (Greenfoot.isKeyDown("right")) {
          x++;
          if(direccion.equals("norte")){
              turn(90);
          }else if(direccion.equals("este")){

          }else if(direccion.equals("oeste")){
              turn(180);
          }else if(direccion.equals("sur")){
              turn(-90);
          }
          direccion = "este";
      }
      if (Greenfoot.isKeyDown("up")) {
          y--;
          if(direccion.equals("norte")){

          }else if(direccion.equals("este")){
              turn(-90);
          }else if(direccion.equals("oeste")){
              turn(90);
          }else if(direccion.equals("sur")){
              turn(180);
          }
          direccion = "norte";
      }
      if (Greenfoot.isKeyDown("down")) {
          y++;
          if(direccion.equals("norte")){
              turn(180);
          }else if(direccion.equals("este")){
              turn(90);
          }else if(direccion.equals("oeste")){
              turn(-90);
          }else if(direccion.equals("sur")){
              
          }
          direccion = "sur";
      }
      setLocation(x,y);
    }
}
