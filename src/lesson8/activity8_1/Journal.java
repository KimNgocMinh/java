package lesson8.activity8_1;

public class Journal extends Document {
    private int soPhatHanh;
    private int thangPhatHanh;

    public Journal() {

    }

    public Journal(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void inThongTinTaiLieu() {
        System.out.println(
                "So phat hanh: " + this.getSoPhatHanh() + "\r\n" +
                "Thang phat hanh: " + this.getThangPhatHanh()+ "\r\n" + "----------");
        super.inThongTinChung();
    }
}
