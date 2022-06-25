package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Car;
import end_module.bai_tap1.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
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
        String bienKiemSoat = scanner.nextLine();
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
