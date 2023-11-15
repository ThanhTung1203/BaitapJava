package Ql;

public class CongNhan extends QuanLyCanBo{
    private int level;
    public CongNhan(String name, int age, String sex, int address) {
        super(name, age, sex, address);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level +
                '}';
    }
}
