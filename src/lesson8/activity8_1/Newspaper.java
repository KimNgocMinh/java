package lesson8.activity8_1;

public class Newspaper extends Document {
    private int ngayPhatHanh;

    public Newspaper() {

    }

    public Newspaper(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh, int ngayPhatHanh) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void inThongTinTaiLieu() {
        System.out.println(
                "Ngay phat hanh: " + this.getNgayPhatHanh()+ "\r\n" + "----------");
        super.inThongTinChung();
    }

}
