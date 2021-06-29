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


    public Student() {

    }

    public Student(int id, String name, int birth, int level, int class_num, int num, int in_time_h, int in_time_m, int out_time_h, int out_time_m) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.level = level;
        this.class_num = class_num;
        this.num = num;
        this.in_time_h = in_time_h;
        this.in_time_m = in_time_m;
        this.out_time_h = out_time_h;
        this.out_time_m = out_time_m;

    }

    @Override
    public String toString() {
        return this.id + "  | " + this.name + " " + this.birth + " " + this.level + "학년 " +
                this.class_num + "반 " + this.num + "번 " + this.in_time_h + "시" + this.in_time_m + "분 " +
                this.out_time_h + "시" + this.out_time_m + "분";
    }

    public String toFString() {
        return this.name+"-"+this.getBirth()+"-"+this.getLevel()+"-"+this.getClass_num()+"-"+this.getNum()+"-"+this.getIn_time_h()+"-"+this.getIn_time_m()+"-"+this.getOut_time_h()+"-"+this.getOut_time_m();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIn_time_h() {
        return in_time_h;
    }

    public void setIn_time_h(int in_time_h) {
        this.in_time_h = in_time_h;
    }

    public int getIn_time_m() {
        return in_time_m;
    }

    public void setIn_time_m(int in_time_m) {
        this.in_time_m = in_time_m;
    }

    public int getOut_time_h() {
        return out_time_h;
    }

    public void setOut_time_h(int out_time_h) {
        this.out_time_h = out_time_h;
    }

    public int getOut_time_m() {
        return out_time_m;
    }

    public void setOut_time_m(int out_time_m) {
        this.out_time_m = out_time_m;
    }
}
