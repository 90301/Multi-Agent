package Agent;

import java.util.ArrayList;

public class Agent implements Simulateable {
    
    private int health = 100; //Score of 100 - 0, if 0 death condition met.
    private int foodLevel = 100; //Score of 100 - 0, if 0 starving condition met
    
    //Stats / attributes / skills
    
    
    //Location Class?
    
    
    //Inventory Class
    
    
    //agents that can be interacted with
    ArrayList<Agent> agentsAwareOf = new ArrayList<Agent>();
    
    //Land Owned
    
    
    public void simTick() {
        
        //Basic checks and deteroration
        
        if (foodLevel>0) {
            foodLevel --;
        } else {
            starvingCondition();
        }
        
        if (health<=0) {
            deathCondition();
            return;
        }
        

        
    }


/*
 * Actions
 */
public void farm() {
    
}

public void eat() {
    
}

public void steal() {
    
}

public void attack() {
    
}

public void mine() {
    
}


/*
 * Conditions
 */
    private void deathCondition() {
        // TODO Auto-generated method stub
        
    }

    private void starvingCondition() {
        // TODO Auto-generated method stub
        
    }
}
