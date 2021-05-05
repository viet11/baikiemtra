package java;
import java.util.Scanner;
public class nhacungcap {
    public static void main(String[] args){
        ncc hn = new ncc();
        hn.nhap();
        hn.xuat();

    
}
class ncc{
    String Mancc;
    String Tenncc;
    String diachi;
void nhap(){
    System.out.print("Nhập thông tin nhà cung cấp");
Scanner scanner = new Scanner(System.in);
System.out.println("nhap mã nhà cung cấp : ");
Mancc = scanner.nextLine();
System.out.println("nhap ten nhà cung cấp : ");
Tenncc = scanner.nextLine();
System.out.print("Nhập dia chi: ");
diachi = scanner.nextLine();
}

public void xuat() {
    System.out.println("Ma nha cung cap:" + Mancc);
    System.out.println("Ten nha cung cap:" + Tenncc);
    System.out.println("Dia chi:" + diachi);
}
}
