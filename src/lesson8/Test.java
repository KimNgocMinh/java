package lesson8;


import java.io.*;
import java.util.Scanner;
public class Test {
    public static final int BOOK = 1,JOURNAL = 2,NEWSPAPER = 3;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream("src\\lesson8\\data.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        DocumentManament documentManament = (DocumentManament) inputStream.readObject();
        inputStream.close();


        int command = 0;
        do {
            System.out.println("-----Nhap vao command ban muon thuc hien-----");
            System.out.println("1: Them moi tai lieu." + "\r\n" +
                    "2: Hien thi thong tin ve tai lieu." + "\r\n" +
                    "3: Xoa tai lieu theo ma tai lieu." + "\r\n" +
                    "4: Tim kiem tai lieu theo the loai." + "\r\n" +
                    "5: Thoat khoi chuong trinh.");
            command = input.nextInt();
            input.nextLine();
            switch (command) {
                case 1: System.out.println("Chon loai tai lieu ban muon them vao: " + "\r\n" +
                                           "1. Sach" + "\r\n" +
                                           "2. Tap chi" + "\r\n" +
                                           "3. Bao");
                    int luaChon = input.nextInt();
                    input.nextLine();
                    System.out.println("Nhap nha xuat ban: ");
                    String nhaXuatBan = input.nextLine();
                    System.out.println("Nhap ma tai lieu: ");
                    String maTaiLieu = input.nextLine();
                    System.out.println("Nhap so ban phat hanh: ");
                    int soBanPhatHanh = input.nextInt();
                    input.nextLine();
                    if (luaChon == BOOK) {
                        System.out.println("Nhap ten tac gia: ");
                        String tenTacGia = input.nextLine();
                        System.out.println("Nhap so trang: ");
                        int soTrang = input.nextInt();
                        input.nextLine();
                        documentManament.themTaiLieu(new Book(nhaXuatBan,maTaiLieu,soBanPhatHanh,tenTacGia,soTrang));break;
                    } else if (luaChon == JOURNAL) {
                        System.out.println("Nhap so phat hanh: ");
                        int soPhatHanh = input.nextInt();
                        System.out.println("Nhap thang phat hanh: ");
                        int thangPhatHanh = input.nextInt();
                        input.nextLine();
                        documentManament.themTaiLieu(new Journal(nhaXuatBan,maTaiLieu,soBanPhatHanh,soPhatHanh,thangPhatHanh));break;
                    } else if (luaChon == NEWSPAPER) {
                        System.out.println("Nhap ngay phat hanh: ");
                        int ngayPhatHanh = input.nextInt();
                        input.nextLine();
                        documentManament.themTaiLieu(new Newspaper(nhaXuatBan,maTaiLieu,soBanPhatHanh,ngayPhatHanh));break;
                    }
                case 2: documentManament.hienThiThongTinTaiLieu();break;
                case 3: System.out.println("Nhap ma tai lieu ban muon xoa: ");
                        String maTaiLieuXoa = input.nextLine();
                        documentManament.xoaTaiLieu(maTaiLieuXoa);break;
                case 4:
                    System.out.println("Nhap the loai: (1.Book, 2.Journal, 3.Newspaper): ");
                    documentManament.timTaiLieuTheoTheLoai(Integer.parseInt(input.nextLine()));
            }

        }while(command != 5);
        //Luu data
        try{
            FileOutputStream file = new FileOutputStream("src\\lesson8\\data.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

            objectOutputStream.writeObject(documentManament);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
