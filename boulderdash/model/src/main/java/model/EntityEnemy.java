package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityEnemy extends Entity{

	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}
// NEED TO TRANSLATE EVERYTHING IN ENGLISH !!!!!!!!!!!
	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		return test;
	}
	
	public void pathFinding(ArrayList<Entity> test) throws Exception {
        Entity player = null;
        for(int i = 0;i < test.size();i++)
        {
            if(test.get(i).getTypeID() == EntityType.PLAYER)
            {
                player = test.get(i);
            }
        }


        if(player == null) throw new Exception("Player not found");

        int moveX = Posx - player.getPosx();
        int moveY = Posy - player.getPosy();

        int[] openRoutes = findRoute(test);
        int i = 0;
        ArrayList<Route> lesRoutesPossibles = new ArrayList<>();

        for(int a : openRoutes)//foreach
        {
            if(a == 1)
            {
                lesRoutesPossibles.add(new Route(i));
                
            }
            i++;
        }

        i=0;



    }

    public int[] findRoute(ArrayList<Entity> test)
    {
        int[] routes = {0,0,0,0};

        for(int i =0;i <  test.size();i++)
        {
            if(test.get(i).getPosx() == Posx+1 && test.get(i).getPosy() == Posy && test.get(i).getTypeID() == EntityType.VOID ) routes[0] = 1;
            if(test.get(i).getPosx() == Posx && test.get(i).getPosy() == Posy+1 && test.get(i).getTypeID() == EntityType.VOID ) routes[1] = 1;
            if(test.get(i).getPosx() == Posx-1 && test.get(i).getPosy() == Posy && test.get(i).getTypeID() == EntityType.VOID ) routes[2] = 1;
            if(test.get(i).getPosx() == Posx && test.get(i).getPosy() == Posy-1 && test.get(i).getTypeID() == EntityType.VOID ) routes[3] = 1;
        }

        return routes;
    }
	/**
    package model;

    import java.util.Dictionary;
    import java.util.HashMap;

     
    public class Route {



        private int nbCase;
        private HashMap<Integer, Integer> laRoute;
        private int direction;



       public Route(int pdirection)
       {
           nbCase = 0;
           laRoute = new HashMap<>();
           direction = pdirection;
       }


        public HashMap<Integer, Integer> getLaRoute() {
            return laRoute;
        }

        public void setNbCase(int nbCase) {
            this.nbCase = nbCase;
        }
    }
	*/
    
}
