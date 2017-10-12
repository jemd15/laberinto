import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
    List vecinos = getNeighbours(1, false, null);
    int[] caminos = null;
    List recorrido = null;
    public void act() 
    {
      	for(int i = 0; i < 4; i++){
      	    if(vecinos.get(i) == null){
      	        
      	    }
      	}
    }
    
    public void izquierda(){
      int x = getX();
      int y = getY();
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
      setLocation(x,y);
    }
    
    public void derecha(){
      int x = getX();
      int y = getY();
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
      setLocation(x,y);
    }
    
    public void bajar(){
      int x = getX();
      int y = getY();
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
      setLocation(x,y);
    }
    
    public void subir (){
      int x = getX();
      int y = getY();
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
      setLocation(x,y);
    }
}
