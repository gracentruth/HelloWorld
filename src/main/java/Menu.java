import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Student> list = new ArrayList<Student>();
    int id_num=0;

    Scanner sc=new Scanner(System.in);

    public void printMenu() {
        System.out.println("-----메뉴-----");
        System.out.println("1. 조회");
        System.out.println("2. 업로드");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("0. 종료");
        System.out.println("-------------");
        System.out.print("선택할 메뉴는?");
    }

    public void view(){
        if(this.list.size()==0){
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        for(Student s:this.list){
            System.out.println(s.toString());
        }
    }

    public void record(){

        Student s=new Student();
        System.out.println("학생 이름 입력");
        s.setName(sc.next());
        System.out.println("학년");
        s.setLevel(sc.nextInt());
        System.out.println("반");
        s.setClass_num(sc.nextInt());
        System.out.println("번호");
        s.setNum(sc.nextInt());
        System.out.println("생년월일");
        s.setBirth(sc.nextInt());
        System.out.println("등교시간");
        System.out.print("시: ");
        s.setIn_time_h(sc.nextInt());
        System.out.print("분: ");
        s.setIn_time_m(sc.nextInt());
        System.out.println("하교시간");
        System.out.print("시: ");
        s.setOut_time_h(sc.nextInt());
        System.out.print("분: ");
        s.setOut_time_m(sc.nextInt());
        id_num=id_num+1;
        s.setId(id_num);

       this.list.add(s);

        System.out.println("학생 등교(하교)기록이 완료되었습니다.");

    }

    public void upload(){

    }

    public void delete(){


    }
}
