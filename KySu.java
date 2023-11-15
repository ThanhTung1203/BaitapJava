package Ql;

public class KySu extends QuanLyCanBo{
    private String branch ;
    public KySu(String name, int age, String sex, int address) {
        super(name, age, sex, address);
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "branch='" + branch + '\'' +
                '}';
    }
}
