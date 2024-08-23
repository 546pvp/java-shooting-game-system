import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Player dcrffih = new Player("dcrffih");
        Player saladcool = new Player("saladcool");
        Player tushikvi = new Player("tushikvi");

        saladcool.weapon.shoot(saladcool,dcrffih);
        tushikvi.weapon.shoot(tushikvi,saladcool);
        dcrffih.weapon.shoot(dcrffih,saladcool);
        tushikvi.weapon.shoot(tushikvi,saladcool);

    }
}