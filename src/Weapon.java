public class Weapon {
    //fictional weapon (FS-33)

    public final int damage = 43;
    private int mags = 3;
    private int ammo = 17;


    //getters
    public int getMags(){
        return mags;
    }
    public int getAmmo(){
        return ammo;
    }

    public void shoot(Player attacker, Player target){
        if(ammo == 0 && mags > 0){ //checks if player got ammo to shoot
            mags = mags - 1;
            ammo = 17;
            System.out.println("["+attacker.getUsername()+"] tried to shoot, but he dosent have reloaded weapon. Reloading.");
            return;
        } if(ammo == 0 && mags == 0){
            System.out.println("["+attacker.getUsername()+"] tried to shoot, but he dosent have any ammo left.");
            return;
        }
        //Player attacker is shooting at Player target
        ammo = ammo - 1;
        System.out.println("["+attacker.getUsername()+"] shot at ["+target.getUsername()+"].");
        target.takeDamage(damage);
    }

}
