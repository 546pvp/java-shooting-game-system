import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //create players
        Player player = new Player("player");
        Player player2 = new Player("player2");

        /*
         shoot(Player attacker, Player target);

         - attacker is the one shooting (its only for logging purposes).
         - target is for logical purposes. It gives him damage, which is then logged into console.
         */

        player.weapon.shoot(player, player2);

        // send message into the chat!
        player.sendMessage("Hello World!");

        //these are all interactive methods (for now), there are also getters (check Player.java and Weapon.java);
    }
}