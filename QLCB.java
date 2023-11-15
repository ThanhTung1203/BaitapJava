package Ql;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    List<QuanLyCanBo> danhSach = new ArrayList<>();

    QLCB() {
        danhSach.add(new QuanLyCanBo("đạt", 19, "nam", 1));
        danhSach.add(new QuanLyCanBo("khoa", 22, "nam", 2));
    }

    public void themCanBo(QuanLyCanBo quanLyCanBo) {
        danhSach.add(quanLyCanBo);
    }

    public void danhsachCB() {
        for (int i = 0; i < this.danhSach.size(); i++) {
            System.out.println(this.danhSach.get(i));
        }
    }
    public void timKiem(String name){
        for (int i = 0; i < this.danhSach.size(); i++) {
            if(this.danhSach.get(i).getName().equals(name)){
                System.out.println(this.danhSach.get(i));
            }
        }
    }

    public void veVuon(int address) {
        int index = -1;
        for (int i = 0; i < this.danhSach.size(); i++) {
            if (address == this.danhSach.get(i).getAddress()) {
                index = i;

            }
                    } this.danhSach.remove(index);
    }





    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);
        int choose = 1;
        while (choose != 0) {
            System.out.println("Menu " +
                    "\n1. Hiện danh sách cán bộ " +
                    "\n2. Thêm " +
                    "\n3. Tìm kiếm" +
                    "\n4. Xóa "


            );
            System.out.println("Chọn đê ");
            choose = scanner.nextInt();


            if (choose == 1) {
                qlcb.danhsachCB();
            }

            if (choose == 2) {
                System.out.println("Nhập tên ");
                scanner.nextLine();
                String newName = scanner.nextLine();
                System.out.println("Nhập tuổi ");
                int newAge = scanner.nextInt();
                System.out.println("Nhập giới tính ");
                scanner.nextLine();
                String newGt = scanner.nextLine();
                System.out.println("Nhập địa chỉ ");
                int newAdd = scanner.nextInt();
                qlcb.themCanBo(new QuanLyCanBo(newName, newAge, newGt, newAdd));

            }
            if (choose == 4) {
                System.out.println("nhập address : ");
                int cut = scanner.nextInt();
                qlcb.veVuon(cut);
            }
            if(choose== 3){
                System.out.println("nhập tên muốn tìm :");
                scanner.nextLine();
                String findName = scanner.nextLine();
                qlcb.timKiem(findName);

            }
        }

    }
}
