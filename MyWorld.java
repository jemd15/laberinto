import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public int y;
    public int x;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(25, 15, 40);
        setBackground("tierra.png");
        prepare();
    }

    public void crearLaberinto(){
        for(int i = 0; i < 25; i++){

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        chinita chinita = new chinita();
        addObject(chinita,20,14);
        roca roca = new roca();
        addObject(roca,21,14);
        roca roca2 = new roca();
        addObject(roca2,22,14);
        roca roca3 = new roca();
        addObject(roca3,23,14);
        roca roca4 = new roca();
        addObject(roca4,24,14);
        roca roca5 = new roca();
        addObject(roca5,24,13);
        roca roca6 = new roca();
        addObject(roca6,24,12);
        roca roca7 = new roca();
        addObject(roca7,24,11);
        roca roca8 = new roca();
        addObject(roca8,24,10);
        roca roca9 = new roca();
        addObject(roca9,24,9);
        roca roca10 = new roca();
        addObject(roca10,24,8);
        roca roca11 = new roca();
        addObject(roca11,24,7);
        roca roca12 = new roca();
        addObject(roca12,24,6);
        roca roca13 = new roca();
        addObject(roca13,24,5);
        roca roca14 = new roca();
        addObject(roca14,24,4);
        roca roca15 = new roca();
        addObject(roca15,24,3);
        roca roca16 = new roca();
        addObject(roca16,24,2);
        roca roca17 = new roca();
        addObject(roca17,24,1);
        roca roca18 = new roca();
        addObject(roca18,24,0);
        roca roca19 = new roca();
        addObject(roca19,19,14);
        roca roca20 = new roca();
        addObject(roca20,18,14);
        roca roca21 = new roca();
        addObject(roca21,16,14);
        roca roca22 = new roca();
        addObject(roca22,17,14);
        roca roca23 = new roca();
        addObject(roca23,15,14);
        roca roca24 = new roca();
        addObject(roca24,14,14);
        roca roca25 = new roca();
        addObject(roca25,13,14);
        roca roca26 = new roca();
        addObject(roca26,12,14);
        roca roca27 = new roca();
        addObject(roca27,11,14);
        roca roca28 = new roca();
        addObject(roca28,10,14);
        roca roca29 = new roca();
        addObject(roca29,9,14);
        roca roca30 = new roca();
        addObject(roca30,8,14);
        roca roca31 = new roca();
        addObject(roca31,7,14);
        roca roca32 = new roca();
        addObject(roca32,6,14);
        roca roca33 = new roca();
        addObject(roca33,5,14);
        roca roca34 = new roca();
        addObject(roca34,4,14);
        roca roca35 = new roca();
        addObject(roca35,3,14);
        roca roca36 = new roca();
        addObject(roca36,2,14);
        roca roca37 = new roca();
        addObject(roca37,1,14);
        roca roca38 = new roca();
        addObject(roca38,0,14);
        roca roca39 = new roca();
        addObject(roca39,0,13);
        roca roca40 = new roca();
        addObject(roca40,0,12);
        roca roca41 = new roca();
        addObject(roca41,0,11);
        roca roca42 = new roca();
        addObject(roca42,0,10);
        roca roca43 = new roca();
        addObject(roca43,0,9);
        roca roca44 = new roca();
        addObject(roca44,0,8);
        roca roca45 = new roca();
        addObject(roca45,0,7);
        roca roca46 = new roca();
        addObject(roca46,0,6);
        roca roca47 = new roca();
        addObject(roca47,0,5);
        roca roca48 = new roca();
        addObject(roca48,0,4);
        roca roca49 = new roca();
        addObject(roca49,0,3);
        roca roca50 = new roca();
        addObject(roca50,0,2);
        roca roca51 = new roca();
        addObject(roca51,0,1);
        roca roca52 = new roca();
        addObject(roca52,0,0);
        roca roca53 = new roca();
        addObject(roca53,2,0);
        roca roca54 = new roca();
        addObject(roca54,1,0);
        roca roca55 = new roca();
        addObject(roca55,3,0);
        roca roca56 = new roca();
        addObject(roca56,4,0);
        roca roca57 = new roca();
        addObject(roca57,6,0);
        roca roca58 = new roca();
        addObject(roca58,7,0);
        roca roca59 = new roca();
        addObject(roca59,8,0);
        roca roca60 = new roca();
        addObject(roca60,9,0);
        roca roca61 = new roca();
        addObject(roca61,10,0);
        roca roca62 = new roca();
        addObject(roca62,11,0);
        roca roca63 = new roca();
        addObject(roca63,12,0);
        roca roca64 = new roca();
        addObject(roca64,13,0);
        roca roca65 = new roca();
        addObject(roca65,14,0);
        roca roca66 = new roca();
        addObject(roca66,15,0);
        roca roca67 = new roca();
        addObject(roca67,16,0);
        roca roca68 = new roca();
        addObject(roca68,17,0);
        roca roca69 = new roca();
        addObject(roca69,18,0);
        roca roca70 = new roca();
        addObject(roca70,19,0);
        roca roca71 = new roca();
        addObject(roca71,20,0);
        roca roca72 = new roca();
        addObject(roca72,21,0);
        roca roca73 = new roca();
        addObject(roca73,22,0);
        roca roca74 = new roca();
        addObject(roca74,23,0);
    }
}
