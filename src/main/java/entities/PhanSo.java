package entities;

import java.util.Scanner;

public class PhanSo {

    private int tuso;
    private int mauso;

    public void print() {
        System.out.format("%d/%d \n", this.tuso, this.mauso);
    }

    public int getTuso() {
        return this.tuso;
    }

    public int getMauso() {
        return this.mauso;
    }

    public String getDisplayString() {
        return String.format("%d/%d", this.tuso, this.mauso);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tuso, this.mauso);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tử số: ");
        this.tuso = sc.nextInt();
        System.out.println("Mẫu số: ");
        this.mauso = sc.nextInt();
    }

    private static int uocChungLonNhat(int a, int b) {
        if (a == b)
            return a;

        if (a > b) {
            return uocChungLonNhat(a - b, b);
        }

        return uocChungLonNhat(a, b - a);
    }

    public void rutGonPhanSo() {
        int ucln = uocChungLonNhat(Math.abs(this.tuso), Math.abs(this.mauso));
        this.tuso /= ucln;
        this.mauso /= ucln;

    }

    public void plus(PhanSo x) {
        if (this.mauso != x.mauso) {
            this.tuso = this.tuso * x.mauso + x.tuso * this.mauso;
            this.mauso = this.mauso * x.mauso;
        } else {
            this.tuso = this.tuso + x.tuso;
        }
        this.rutGonPhanSo();
    }

    public static PhanSo sumHaiPhanSo(PhanSo ps1, PhanSo ps2) {
        PhanSo ret = new PhanSo();
        if (ps1.mauso != ps2.mauso) {
            ret.tuso = ((ps1.tuso * ps2.mauso) + (ps1.mauso * ps2.tuso));
            ret.mauso = (ps1.mauso * ps2.mauso);
        } else {
            ret.tuso = ((ps1.tuso * ps2.mauso) + (ps1.mauso * ps2.tuso));
            ret.mauso = ps2.mauso;
        }
        ret.rutGonPhanSo();

        return ret;
    }

    public void hieuHaiPhanSo(PhanSo x) {
        if (this.mauso != x.mauso) {
            this.tuso = ((this.tuso * x.mauso) - (this.mauso * x.tuso));
            this.mauso = (this.mauso * x.mauso);
        } else {
            this.tuso = ((this.tuso * x.mauso) - (this.mauso * x.tuso));

        }
        this.rutGonPhanSo();

    }

    public void tichHaiPhanSo(PhanSo x) {
        this.tuso = (this.tuso * x.tuso);
        this.mauso = (this.mauso * x.mauso);
        rutGonPhanSo();
    }

    public void chiaHaiPhanSo( PhanSo x) {
        this.tuso = this.tuso * x.mauso;
        this.mauso = x.tuso * this.mauso;
    }

    public boolean isPhanSoToiGian() {
        if (uocChungLonNhat(Math.abs(this.tuso), Math.abs(this.mauso)) == 1) {
            return false;
        }
        return true;
    }

    //quy đồng ps1 so với ps2
    public void quyDongHaiPhanSo(PhanSo x) {
        if (this.mauso != x.mauso) {
            this.tuso = this.tuso * x.mauso;
            this.mauso = this.mauso * x.mauso;
            rutGonPhanSo();

        }

    }

    public boolean isPhanSoAm() {
        if (this.tuso == 0)
            return false;
        if (this.tuso < 0 && this.mauso < 0) {
            return false;
        }
        if (this.tuso < 0 || this.mauso < 0)
            return true;
        return false;
    }

    public int soSanhHaiPhanSo(PhanSo x) {
        if (this.mauso == x.mauso) {
            if (this.tuso > x.tuso) {
                return 1; // this > x
            } else if (this.tuso < x.tuso)
                return -1; // this < x
        } else if (this.mauso != x.mauso) {
            long ts1 = this.tuso * x.mauso;
            long ts2 = this.mauso * x.tuso;
            long ms1 = this.mauso * x.mauso;
            long ms2 = x.mauso * this.mauso;
            if (ms1 == ms2 && ts1 > ts2) {
                return 1; // this > x
            } else
                return -1; // this < x
        }
        return 0; // this = x
    }

    public static PhanSo parseFromString(String str) {
        String[] parts = str.split("/");

        PhanSo ps = new PhanSo();
        ps.tuso = Integer.parseInt(parts[0]);
        ps.mauso = Integer.parseInt(parts[1]);
        return ps;
    }
}
