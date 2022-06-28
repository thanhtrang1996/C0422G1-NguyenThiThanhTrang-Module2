package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Car;
import end_module.bai_tap1.service.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements CarService {
    ArrayList<Car> cars = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
    @Override
    public void vehicleType () {

    }

    @Override
    public void numberOfSeats() {

    }

    @Override
    public void add() {
        System.out.print(" Nhập biển kiểm soát :");
        int bienKiemSoat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập số chổ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe :");
        String kieuXe = scanner.nextLine();
        cars.add(new Car(bienKiemSoat,namSanXuat,chuSoHuu,kieuXe,soChoNgoi));
    }

    @Override
    public void delete() {
        System.out.println("Nhập biển kiểm soát");
        int bienKiemSoat = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i <cars.size() ; i++) {

            if (cars.get(i).getBienKiemSoat()== bienKiemSoat){
                System.out.println("Bạn thực sự nuốn xoá");
                boolean confirm = Boolean.parseBoolean(scanner.nextLine());
                    if(confirm){ cars.remove(i);
                        System.out.println("Xoá thành công");
                        return;
                }
                }

        }
        if (!flag){
            System.out.println("Biển kiểm soát không tồn tại");
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void read() {
        System.out.println("Danh sách ô tô");
        for (Car car:cars
             ) {
            System.out.println(car);

        }
    }
}
