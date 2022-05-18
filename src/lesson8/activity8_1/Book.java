package lesson8.activity8_1;

public class Book extends Document {
    private String tenTacGia;
    private int soTrang;

    public Book() {

    }

    public Book(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void inThongTinTaiLieu() {
        System.out.println(
                "Ten tac gia: " + this.getTenTacGia() + "\r\n" +
                "So trang: " + this.getSoTrang()+ "\r\n" + "----------");
        super.inThongTinChung();

    }
}

