package Lat.mod2;
import java.util.ArrayList;


public class Latihan1 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Before : "+Hewan);

        System.out.println("Hewan Delete : ["+ Hewan.get(1)+ "," + Hewan.get(2) +","+ Hewan.get(3)+"]");

        DeleteHewan.addAll(Hewan);

        DeleteHewan.remove("Kelinci");
        DeleteHewan.remove("Kambing");
        DeleteHewan.remove("Unta");

        System.out.println("After : "+ DeleteHewan);

    }
}
