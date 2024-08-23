public class Player {

    private int health = 100;
    private final String username;
    public Weapon weapon = new Weapon();


    public Player(String username){
        this.username = username;
        System.out.println("[SERVER]· new player joined! Say hi to ["+username+"]!");
    }
    public String getUsername(){
        return username;
    }

    public void sendMessage(String message){
        System.out.println("[CHAT]·("+username+"): "+message);
    }

    public void takeDamage(int damage){
        if(health - damage <= 0){
            System.out.println("[SERVER]· ["+username+"] got killed in action. RIP.");
            System.out.println("[SERVER]· respawning ["+username+"].");
            health = 100;
            return;
        }
        health = health - damage;
        System.out.println("["+username+"] took "+damage+" damage, and has "+health+" health left.");
    }

}
