package task1_telephone.common;

import java.util.Scanner;

public class Check {
    public static String phamVi() {
        Scanner scanner = new Scanner(System.in);
        String chon;
        String phamVi = null;
        do {
            System.out.println("Chọn phạm vi bảo hành\n" +
                    "1.Toàn quốc\n" +
                    "2. Quốc tế");
            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    phamVi = "Toàn quốc";
                    break;
                case "2":
                    phamVi = "Quốc tế";
                    break;
                default:
                    System.out.println("CHỌN LẠI");
            }
        }
        while (phamVi == null);
        System.out.println(phamVi);
        return phamVi;

    }
    public  static String tinhTrang(){
        Scanner scanner = new Scanner(System.in);
        String chon;
        String tinhTrang = null;
        do{
            System.out.println("Chon tinh trang\n"+
                    "1.da sua chua\n"+
                    "2.chua sua chua\n"
                    );
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    tinhTrang = "da sua chua";
                    break;
                case "2":
                    tinhTrang = "chua sua chua";
                    break;
                default:
                    System.out.println("chon lai");
            }
        }while (tinhTrang == null);
        System.out.println(tinhTrang);
        return tinhTrang;
    }

}
