public class PhanSo {

    int tuso;
    int mauso;

    public void print() {
        System.out.format("%d/%d ", this.tuso, this.mauso);
    }

    public void nhapPhanSo(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
    }


    public int uocChungLonNhat(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
        int ucln = 0;
        if (this.tuso > this.mauso) {
            for (int i = 1; i <= this.mauso; i++) {
                if (this.tuso % i == 0 && this.mauso % i == 0 && ucln < i) {
                    ucln = i;
                }
            }
        } else if (this.tuso < this.mauso) {
            for (int i = 1; i <= this.tuso; i++) {
                if (this.tuso % i == 0 && this.mauso % i == 0 && ucln < i) {
                    ucln = i;
                }
            }
        }
        return ucln;
    }

    public void rutGonPhanSo(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
        if (this.tuso % this.mauso == 0) {
            System.out.println("phan so rut gon " + this.tuso / this.mauso);
        } else {
            int ucln = uocChungLonNhat(this.tuso, this.mauso);
            this.tuso = this.tuso / ucln;
            this.mauso = this.mauso / ucln;
            System.out.format(" phan so sau khi rut gon %d/%d ", this.tuso, this.mauso);
            System.out.println();
        }
    }

    public void sumHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2) {
        if (mau_1 != mau_2) {
            this.tuso = ((tu_1 * mau_2) + (tu_2 * mau_1));
            this.mauso = (mau_1 * mau_2);
        } else {
            this.tuso = ((tu_1 * mau_2) + (tu_2 * mau_1));
            this.mauso = mau_1;
        }
        print();
    }

    public void hieuHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2) {
        if (mau_1 != mau_2) {
            this.tuso = ((tu_1 * mau_2) - (tu_2 * mau_1));
            this.mauso = (mau_1 * mau_2);
        } else {
            this.tuso = ((tu_1 * mau_2) - (tu_2 * mau_1));
            this.mauso = mau_1;
        }
        print();
    }

    public void tichHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2) {
        this.tuso = (tu_1 * tu_2);
        this.mauso = (mau_1 * mau_2);
        rutGonPhanSo(this.tuso, this.mauso);
    }

    public void chiaHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2) {
        this.tuso = (tu_1 * mau_2);
        this.mauso = (mau_1 * tu_2);
        rutGonPhanSo(this.tuso, this.mauso);
    }

    public boolean isPhanSoToiGian(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
        if (uocChungLonNhat(this.tuso, this.mauso) == 1) {
            return true;
        }
        return false;
    }

    public void quyDongHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2) {
        int ps1;
        int ps2;
        if (mau_1 != mau_2) {
            this.tuso = tu_1 * mau_2;
            this.mauso = mau_1 * mau_2;
            rutGonPhanSo(this.tuso, this.mauso);
            this.tuso = tu_2 * mau_1;
            this.mauso = mau_2 * mau_1;
            rutGonPhanSo(this.tuso, this.mauso);

        }

    }

    public boolean kiemTraPhanSoAm(int tu, int mau){
        boolean isAm = true;
        this.tuso = tu;
        this.mauso = mau;
        if(this.tuso < 0 || this.mauso <0){
            return isAm;
        }
        return false;
    }

    public void soSanhHaiPhanSo(int tu_1, int mau_1, int tu_2, int mau_2){
        int ts1;
        int ts2;
        int ms1;
        int ms2;

        if (mau_1 != mau_2) {
            ts1 = tu_1 * mau_2;
            ms1 = mau_1 * mau_2;
            ts2 = tu_2 * mau_1;
            ms2 = mau_2 * mau_1;
            if(ms1 == ms2 && ts1 >ts2){
                System.out.println("phân số 1 lớn hơn phân số 2");
            }
            else
                System.out.println("phân số 2 lớn hơn phân số 1");

        }
    }


}
