package lesson8;

import java.io.Serializable;
import java.util.Objects;

public abstract class Document implements Comparable<Document>, Serializable {
    protected String tenNhaXuatBan;
    protected String maTaiLieu;
    protected int soBanPhatHanh;

    protected Document() {

    }

    protected Document(String tenNhaXuatBan,String maTaiLieu,int soBanPhatHanh){
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.maTaiLieu = maTaiLieu;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    public void inThongTinChung() {
        System.out.println("Nha Xuat Ban:" + this.tenNhaXuatBan + "\r\n" +
                "Ma tai lieu: " + this.maTaiLieu +"\r\n" +
                "So ban phat hanh: " + this.soBanPhatHanh + "\r\n");
    }
    public abstract void inThongTinTaiLieu();

    @Override
    public int compareTo(Document o) {
        return this.maTaiLieu.compareTo(o.getMaTaiLieu());
    }


}
