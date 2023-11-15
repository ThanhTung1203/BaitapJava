package Ql;

public class NhanVien extends QuanLyCanBo{
    private String staff;
    public NhanVien(String name,int age,String sex,int address){
        super(name, age, sex, address);
    }


    public String getStaff(){
        return staff;
    }

    public void setStaff(String staff){
        this.staff=staff;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "staff='" + staff + '\'' +
                '}';
    }
}
