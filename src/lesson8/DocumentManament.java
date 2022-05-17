package lesson8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DocumentManament implements Serializable {
    public static final int BOOK = 1,JOURNAL = 2,NEWSPAPER = 3;
    private List<Document> documents = new ArrayList<>();
    private HashMap<String,Integer> documentIdMap = new HashMap<>();
    public DocumentManament() {

    }

    public void themTaiLieu(Document taiLieu) {
        documents.add(taiLieu);
        this.capNhatMap();
    }

    public void hienThiThongTinTaiLieu() {
        for (Document document : documents) {

            document.inThongTinTaiLieu();
        }
    }

    //xoá tài liệu theo mã tài liệu
    public void xoaTaiLieu(String maTaiLieu) {
        if (this.timTaiLieuTheoMaTaiLieu(maTaiLieu) == -1) {
            System.out.println("Tai lieu khong co trong danh sach.");
        } else{
            documents.remove(timTaiLieuTheoMaTaiLieu(maTaiLieu));
            this.capNhatMap();
        }


    }

    //Tìm tài liệu theo mã tài liệu
    public int timTaiLieuTheoMaTaiLieu(String maTaiLieu) {
        return documentIdMap.get(maTaiLieu) == null ? -1: documentIdMap.get(maTaiLieu);
    }
    public void capNhatMap() {
        documentIdMap.clear();
        for (int i = 0; i < documents.size(); i++) {
            documentIdMap.put(documents.get(i).getMaTaiLieu(),i);
        }
    }

    //Tìm tài liệu theo thể loại
    public void timTaiLieuTheoTheLoai(int theLoai) {
        int count = 0;

        if(theLoai == BOOK){
            for (Document document : documents) {
                if(document instanceof Book)  {
                    document.inThongTinTaiLieu();
                    count++;
                }
            }
        } else if(theLoai == JOURNAL){
            for (Document document : documents) {
                if(document instanceof Journal)  {
                    document.inThongTinTaiLieu();
                    count++;
                }
            }
        } else {
            for (Document document : documents) {
                if(document instanceof Newspaper)  {
                    document.inThongTinTaiLieu();
                    count++;
                }
            }
        }
        if(count == 0) System.out.println("khong co the loai trong danh sach");
    }

}
