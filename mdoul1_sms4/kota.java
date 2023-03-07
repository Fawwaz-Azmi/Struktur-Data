package mdoul1_sms4;

public class kota <E>{
    private E element;

    public kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        kota<Integer> jumlahkota = new kota<Integer>(9);
        kota<String> namakota = new kota<String>("Malang");
        System.out.println("jumlah kota di jawa timur : "+ jumlahkota.getElement() + " kota");
        System.out.println("salah satu kota di jawa timur : kota "+ namakota.getElement());
    }
}
