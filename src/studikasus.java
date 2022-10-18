import java.util.Scanner;
public class studikasus {
    public static void main(String[] args) {
        String nama,tmp_lhr,jns_klmn,jurusan,alamat,bakat,as_sklh,tgl_lhr;
        int NIS;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama :");
        nama = input.nextLine();
        System.out.println("Masukkan NIS :");
        NIS = input.nextInt();
        System.out.println("Masukkan Tempat Lahir :");
        tmp_lhr = input.next();
        System.out.println("Masukkan Tanggal Lahir :");
        tgl_lhr = input.next();
        System.out.println("Masukkan Jenis Kelamin :");
        jns_klmn = input.next();
        System.out.println("Masukkan Jurusan :");
        jurusan = input.next();
        System.out.println("Masukkan Alamat :");
        alamat = input.next();
        System.out.println("Masukkan Bakat :");
        bakat = input.next();
        System.out.println("Masukkan Asal Sekolah :");
        as_sklh = input.next();
        System.out.println();
        System.out.println("--DATA ANDA--");
        System.out.println("Nama :"+nama);
        System.out.println("NIS :"+NIS);
        System.out.println("Tempat Lahir :"+tmp_lhr);
        System.out.println("Tanggal Lahir :"+tgl_lhr);
        System.out.println("Jenis Kelamin :"+jns_klmn);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Alamat :"+alamat);
        System.out.println("Bakat :"+bakat);
        System.out.println("Asal Sekolah :"+as_sklh);

    }   
}
