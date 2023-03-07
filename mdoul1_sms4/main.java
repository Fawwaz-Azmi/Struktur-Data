package mdoul1_sms4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<konsumsi> listkonsumsi = new ArrayList<>();
        konsumsi<Makanan, Minuman> breakfast = new konsumsi<>();
        konsumsi<Makanan, Minuman> lunch = new konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setkonsumsi(roti, susu);
        listkonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("air putih");

        lunch.setkonsumsi(nasi, air);
        listkonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (konsumsi<Makanan,Minuman> konsumsi: listkonsumsi){
    Makanan makanan = konsumsi.getM();
    Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}

