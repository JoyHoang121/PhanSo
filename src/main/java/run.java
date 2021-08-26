import entities.PhanSo;

public class run {
    public static void main(String[] args) {

        PhanSo ps = new PhanSo();

        ps.nhapPhanSo(5,6);
        ps.print();
        ps.rutGonPhanSo(9,6);
        ps.sumHaiPhanSo(1,3,4,7);
        ps.hieuHaiPhanSo(1,3,4,7);
        ps.tichHaiPhanSo(1,2,3,4);
        ps.chiaHaiPhanSo(1,2,3,4);
        ps.quyDongHaiPhanSo(1,2,3,4);
        boolean a = ps.kiemTraPhanSoAm(-2,-3);
        if(a){
            System.out.println("là phân số âm");
        }else System.out.println("la phan so duong");


        ps.soSanhHaiPhanSo(2,3, 3,4);
    }

}
