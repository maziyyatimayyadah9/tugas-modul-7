package Queue7;
public class queue {
    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumlahItem;
    private int depan;
    
    public queue (int s){
        ukuran = s;
        antrian = new long[ukuran];
        depan= 0;
        belakang = -1;
        jumlahItem = 0;
    }
    public void masuk(long j){
        if (!isFull()){
            antrian[++belakang] = j;
            jumlahItem++;
        }
    }
    public long keluar(){
    long temp = antrian[0];
    if (!isEmpty()){
        for (int i=0; i<jumlahItem; i++)
            antrian [i] = antrian [i+1];
            jumlahItem--;
            belakang--;
        }
        return temp;
    }
    
    public long peek(){
        return antrian[depan];
    }
    
    public boolean isEmpty(){
        return (jumlahItem==0);
    }
    
    public boolean isFull(){
        return(belakang==ukuran-1);
    }
    
    public int ukuran(){
        return jumlahItem;
    }
    
    public void lihat(){
            for (int i=0; i<jumlahItem; i++)
            System.out.print(antrian[i]+" ");
            System.out.println(" ");
    }
}