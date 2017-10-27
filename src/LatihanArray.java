public class LatihanArray {
    public static  void main (String[] args){
        int[] nilaiSiswa;
        nilaiSiswa = new int [10];
//        nilaiSiswa[0] = 10 ;
//        nilaiSiswa[1] = 20 ;
//        nilaiSiswa[2] = 30 ;
//        nilaiSiswa[3] = 40 ;
//        nilaiSiswa[4] = 50 ;
//        nilaiSiswa[5] = 60 ;
//        nilaiSiswa[6] = 70 ;
//        nilaiSiswa[7] = 80 ;
//        nilaiSiswa[9] = 100 ;
//
        int value = 0;


        for ( int i = 0 ; i < nilaiSiswa.length; i++)  {
            value = value + 10;
            nilaiSiswa[i] = value;
            if ( ( i % 2 ) == 1 ) {
                System.out.println("Nilai Siswa Absen Genap " + i + ":" + value);
            } else {
                System.out.println("Nilai Siswa Absen Ganjil "+ i +":" + value);
            }
        }







//        int idx =0;
//        for( int i : nilaiSiswa ) {
//            System.out.println("Element at index"+ idx +":" + i );
//            idx++;
//        }
    }
}
