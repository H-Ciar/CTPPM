package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeTest {

    /*
        Phương thức void inputMotorbike(ArrayList<Motorbike> motorbikes, int n)
        để nhập danh sách n  xe máy từ bàn phím
    */
    public static void inputMotorbike(ArrayList<Motorbike> motorbikes, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            String id = scan.nextLine();
            String name = scan.nextLine();
            String manu = scan.nextLine();
            int quantity = scan.nextInt();
            double price = scan.nextDouble();
            double weight = scan.nextDouble();
            scan.nextLine();
            String date = scan.nextLine();

            Motorbike m = new Motorbike(id,name, manu,quantity, price, weight,date);
            motorbikes.add(m);
        }

    }

    /*
        Phương thức void outputMotorbike (ArrayList<Motorbike> motorbikes)
        để in thông tin của các xe máy, mỗi xe trên một dòng.
    */
    public static void outputMotorbike(ArrayList<Motorbike> motorbikes) {
        for (Motorbike m : motorbikes) {
            m.printMotorbike();
        }
    }


    /*
    Phương thức ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes)
    để tìm kiếm và trả về danh sách các xe có hãng sản xuất là manu
    */
    public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes) {
        ArrayList<Motorbike> result = new ArrayList<>();
        for (Motorbike m : motorbikes) {
            if (m.getManu().equals(manu)) {
                result.add(m);
            }
        }
        return result;
    }

    /*
        Phương thức ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes)
        để tìm kiếm và trả về các xe có khối lượng lớn nhất.
    */
    public static ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes) {
        ArrayList<Motorbike> result = new ArrayList<>();
        double max = 0;
        for (Motorbike m : motorbikes) {
            if (m.getWeight() > max) {
                max = m.getWeight();
            }
        }
        for (Motorbike m : motorbikes) {
            if (m.getWeight() == max) {
                result.add(m);
            }
        }
        return result;
    }


    /*
    Phương thức ArrayList<Motorbike> minQuantity(ArrayList<Motorbike> motorbikes)
    để tìm kiếm và trả về các xe có số lượng ít.
    */
    public static ArrayList<Motorbike> minQuantity(ArrayList<Motorbike> motorbikes) {
        ArrayList<Motorbike> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (Motorbike m : motorbikes) {
            if (m.getQuantity() < min) {
                min = m.getQuantity();
            }
        }
        for (Motorbike m : motorbikes) {
            if (m.getQuantity() == min) {
                result.add(m);
            }
        }
        return result;
    }

    /* Phương main(String[]) thực hiện việc  các yêu cầu sau:

    -- Nhập số lượng xe;

   -- Nhập số 1<=c <=3

   +) Nếu c==1. Tìm và in ra tất cả các loại xe có hãng sản xuất là "Honda"

   +) Nếu c==2. Tìm và in ra thông tin của xe có trọng lượng nặng nhất

   +)Nếu c==3. Tìm và in ra thông tin của xe có số lượng ít nhất.*/

    public static void main(String[] args) {
        ArrayList<Motorbike> motorbikes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // đọc vào số lượng xe
        int n = scanner.nextInt();

        // nhảy qua dòng mới
        scanner.nextLine();

        // nhập danh sách xe
        inputMotorbike(motorbikes, n);

        // đọc vào số 1 đến 3
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                ArrayList<Motorbike> hondas = search("Honda", motorbikes);
                outputMotorbike(hondas);
                break;
            case 2:
                ArrayList<Motorbike> maxWeights = maxWeight(motorbikes);
                outputMotorbike(maxWeights);
                break;
            case 3:
                ArrayList<Motorbike> minQtys = minQuantity(motorbikes);
                outputMotorbike(minQtys);
                break;
        }

        scanner.close();
    }
}
