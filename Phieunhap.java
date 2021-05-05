package java;
import java.util.Scanner;
public class Phieunhap {
    public static void main(String[] args){
        pn ht = new pn();
        ht.nhapttkhachhang();
        ht.hienThiThongTinKhachhang();
}
class pn{
    String Mapn;
    String Tennv;
    int  ngaynhap;
public void  nhapttkhachhang (){
    System.out.print("Nhập thông tin phiếu");
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ten nhan vien : ");
    Tennv = scanner.nextLine();
    System.out.println("nhap vao mã phiếu nhập : ");
    Mapn = scanner.nextLine();
    System.out.print("Nhập ngàyy nhập: ");
    ngaynhap = scanner.nextInt();
}
public void hienThiThongTinKhachhang() {
    System.out.println("Họ và tên nhan vien : " + Tennv);
    System.out.println("ma phiếu nhập: "+ Mapn);
    System.out.println("ngày nhập " + ngaynhap);

}
}
public class Chitietphieunhap extends pn {
    int MaPhieuNhap;
    String TenPhieuNhap;
    int SoLuong;
    String HanSuDung;
    
    void nhap() {
    	Scanner scanner = new Scanner(System.in);
         System.out.print("Nhập mã phiếu: ");
    MaPhieuNhap = scanner.nextInt();
    System.out.print("Nhập tên phiếu nhập: ");
    TenPhieuNhap = scanner.nextLine();
    System.out.print("Nhập số lượng: ");
    SoLuong = scanner.nextInt();
    System.out.print("Nhập hạn sử dụng: ");
    HanSuDung = scanner.nextLine();
    }
    void in(){
         System.out.println("Mã phiếu:"+MaPhieuNhap +"\n" +"Tên Phiếu Nhâp:"+ TenPhieuNhap +"\n"+"Số lượng:"+ SoLuong +"hạn sử dụng: "+HanSuDung);
    }
    
}
}

