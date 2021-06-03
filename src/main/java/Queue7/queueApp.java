package Queue7;
public class queueApp {
public static void main(String[]  args){
            queue antrian = new queue(10);
            antrian.masuk(40);
            antrian.lihat();
            antrian.masuk(33);
            antrian.lihat();
            System.out.println("nilai yang paling depan = " + antrian.peek());
            System.out.println(" ");
            antrian.masuk(60);
            antrian.lihat();
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
            System.out.println(" ");
            antrian.masuk(54);
            antrian.lihat();
            System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}
