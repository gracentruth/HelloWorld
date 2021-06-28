public class Student {

    private int id;
    private String name;
    private int birth;
    private int level;
    private int class_num;
    private int num;
    private int in_time_h;
    private int in_time_m;
    private int out_time_h;
    private int out_time_m;
    private String memo;

    public Student(int id, String name, int birth,int level, int class_num,int num, int in_time_h,int in_time_m,int out_time_h,int out_time_m, String memo ) {
        this.id=id;
        this.name = name;
        this.birth=birth;
        this.level=level;
        this.class_num=class_num;
        this.num=num;
        this.in_time_h=in_time_h;
        this.in_time_m=in_time_m;
        this.out_time_h=out_time_h;
        this.out_time_m=out_time_m;
        this.memo=memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public int getIn_time_h() {
        return in_time_h;
    }

    public void setIn_time_h(int in_time_h) {
        this.in_time_h = in_time_h;
    }

    public int getOut_time_h() {
        return out_time_h;
    }

    public void setOut_time_h(int out_time_h) {
        this.out_time_h = out_time_h;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
