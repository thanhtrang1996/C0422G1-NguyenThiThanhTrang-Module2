package task1_telephone.controller;

import task1_telephone.common.CheckNumber;
import task1_telephone.service.Impl.PortablePhonesServiceImpl;
import task1_telephone.service.PortablePhonesService;

public class PortablePhonesController {
    private  static PortablePhonesService portablePhonesService;
    public  static void displayPortablePhones(){
        int chon;
        do{
            portablePhonesService = new PortablePhonesServiceImpl();
            System.out.println("Chọn chức năng\n"+
                    "1. Thêm điện thoại xách tay\n"+
                    "2.Xoá điện thoại xách tay\n"+
                    "3.Hiển thị danh sách điện thoại xách tay\n"+
                    "4.Tìm kiếm điện thoại xách tay\n"+
                    "5. Quay lại màn hình chính"
            );
            System.out.println("Chọn chức năng");
            chon = CheckNumber.checkInteger();
            switch (chon){
                case 1:
                    portablePhonesService.add();
                    break;
                case 2:
                    portablePhonesService.delete();
                    break;
                case 3:
                    portablePhonesService.display();
                    break;
                case 4:
                    portablePhonesService.search();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Xin mời nhập lại");
            }
        }while (true);
    }
}
