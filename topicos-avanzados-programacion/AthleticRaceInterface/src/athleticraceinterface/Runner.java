package athleticraceinterface;


import java.util.Random;


public class Runner {
    private String name;
    private int speed;
    
    Runner(String name) {
        this.name = name;
        Random random = new Random();
        // Produce un numero entre 0 y 30.
        this.speed = random.nextInt(31);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
