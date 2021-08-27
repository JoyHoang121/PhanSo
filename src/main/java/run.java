import entities.PhanSo;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {

//        PhanSo ps1 = new PhanSo();
//        ps1.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập ps1 ");
        String strPs1 = sc.nextLine();
        PhanSo ps1 = PhanSo.parseFromString(strPs1);

        System.out.print("Mời nhập ps2 ");
        String strPs2 = sc.nextLine();
        PhanSo ps2 = PhanSo.parseFromString(strPs2);
        ps1.print();


        if (ps1.isPhanSoToiGian()) {
            System.out.println("Phan số chưa tối giản");
        } else System.out.println("La phân số tối giản");


        if (ps1.isPhanSoAm()) {
            System.out.println("là phân số âm");
        } else System.out.println("la phan so duong");

        // ps1.rutGonPhanSo();
        //ps1.print();

        //  PhanSo ps2 = PhanSo.parseFromString("4/8");
        if (ps1.soSanhHaiPhanSo(ps2) < 0) {
            //   System.out.format("%d/%d < %d/%d", ps1.getTuso(), ps1.getMauso(), ps2.getTuso(), ps2.getMauso());
            //   System.out.format("%s < %s", ps1.getDisplayString(), ps2.getDisplayString());
            System.out.format("%s < %s\n", ps1, ps2);

        } else if (ps1.soSanhHaiPhanSo(ps2) > 0) {
            //  System.out.format("%d/%d > %d/%d", ps1.getTuso(), ps1.getMauso(), ps2.getTuso(), ps2.getMauso());
            //     System.out.format("%s > %s", ps1.getDisplayString(), ps2.getDisplayString());
            System.out.format("%s > %s\n", ps1, ps2);

        } else
            //   System.out.format("%s = %s", ps1.getDisplayString(), ps2.getDisplayString());
            System.out.format("%s = %s\n", ps1, ps2);


        // cộng phân số cách 1 -> thay đổi giá trị của ps1 sau khi cộng ps2 vào
//        ps1.plus(ps2);
//        System.out.println(ps1);

        // cộng phân số cách 2 -> tạo ra 1 phân số mới
//        PhanSo psTotal = PhanSo.sumHaiPhanSo(ps1, ps2);
//        System.out.println(psTotal);
//
//        ps1.quyDongHaiPhanSo(ps2);
//        System.out.println(ps1);

        ps1.chiaHaiPhanSo(ps2);
        System.out.println(ps1);
    }
}
