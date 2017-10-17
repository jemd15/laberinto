import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class chinita extends Actor
{
    String direccion = "norte";
    List<camino> vecinos = new ArrayList<camino>();
    List<salida> fin = new ArrayList<salida>();
    Stack<rastro> recorrido = new Stack<rastro>();
    int cantidadVecinos = 0;
    int[] caminoElegido = new int[4];
    
    public void act() 
    {
        fin = getNeighbours(1,false,salida.class);
        
        if(fin.size() > 0){
            int x = getX();
            int y = getY();
            rastro rastro = new rastro();
            recorrido.push(rastro);
            getWorld().addObject(rastro, x,y);
            setLocation(fin.get(0).getX(),fin.get(0).getY());
            System.out.println("FIN");
            Greenfoot.stop();
        }else {
            vecinos = getNeighbours(1,false,camino.class);
            mover(elegirCamino(vecinos));
        }
    }
    
    public int[] elegirCamino(List<camino> vecinos){
        if(vecinos.size() > 0){
            cantidadVecinos = vecinos.size();
            int rnd = Greenfoot.getRandomNumber(cantidadVecinos);
            caminoElegido[0] = vecinos.get(rnd).getX();
            caminoElegido[1] = vecinos.get(rnd).getY();
            System.out.println("avanzando");
            return caminoElegido;
        }else{
            caminoElegido[0] = recorrido.peek().getX();
            caminoElegido[1] = recorrido.pop().getY();
            getWorld().removeObjects(getWorld().getObjectsAt(caminoElegido[0],caminoElegido[1],rastro.class));
            System.out.println("devolviendose");
            int x = caminoElegido[0];
            int y = caminoElegido[1];
            setLocation(x,y);
            return null;
        }
    }
    
    public void mover(int[] caminoElegido){
        int x = getX();
        int y = getY();
        if(caminoElegido != null){
            rastro rastro = new rastro();
            recorrido.push(rastro);
            getWorld().removeObjects(getWorld().getObjectsAt(caminoElegido[0],caminoElegido[1],camino.class));
            getWorld().addObject(rastro, x,y);
            setLocation(caminoElegido[0],caminoElegido[1]);
        }else{
            
        }
    }
}
