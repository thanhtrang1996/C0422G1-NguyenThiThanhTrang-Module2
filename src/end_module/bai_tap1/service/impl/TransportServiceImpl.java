package end_module.bai_tap1.service.impl;

import end_module.bai_tap1.models.Transport;
import end_module.bai_tap1.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class TransportServiceImpl implements Service {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Transport> transports = new ArrayList<>();

    @Override
    public void add() {
    }

    @Override
    public void delete() {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("---------- DELETE VEHICLE ----------");
//            System.out.print("Enter license plate: ");
//            int bienKiemSoat = Integer.parseInt(scanner.nextLine());
//            boolean flag = false;
//            int choice;
//            for (int i = 0; i < transports.size(); i++) {
//                if (bienKiemSoat.equalsIgnoreCase(transports.get(i).getBienKiemSoat())) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                do {
//                    System.out.println("Do you want to delete vehicles with license plate: " + bienKiemSoat + "?");
//                    System.out.println("1. Yes" + "\n" +
//                            "2. No");
//                    System.out.print("Your choice: ");
//                    choice = Integer.parseInt(sc.nextLine());
//                    switch (choice) {
//                        case 1:
//                            for (int i = 0; i < vehicles.size(); i++) {
//                                if (licensePlate.equalsIgnoreCase(vehicles.get(i).getLicensePlate())) {
//                                    vehicles.remove(i);
//                                    break;
//                                }
//                            }
//                            System.out.println("---------- DELETE SUCCESS ----------");
//                            flag = false;
//                            break;
//                        case 2:
//                            System.out.println("---------- CANCEL ----------");
//                            flag = false;
//                            break;
//                        default:
//                            System.out.println("---------- CHOICE AGAIN! ----------");
//                            break;
//                    }
//                } while (flag);
//            } else {
//                System.out.println("License plate " + licensePlate + " is NOT found!");
//            }
//        }

      
    }
}