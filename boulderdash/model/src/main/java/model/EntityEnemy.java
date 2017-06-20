package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityEnemy extends Entity{

	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		return test;
	}
	
	//Début du comportement des Enemy
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
	
	
	
	
}
