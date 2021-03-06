import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    ArrayList<Student> MyList;

    Menu() {
    }

    Menu(ArrayList<Student> myList) {
        this.MyList = myList;
    }

    int id_num = 0;

    Scanner sc = new Scanner(System.in);


    public void printMenu() {
        System.out.println("-----메뉴-----");
        System.out.println("1. 조회");
        System.out.println("2. 추가");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 파일 저장하기");
        System.out.println("6. 이름 검색");
        System.out.println("0. 종료");

        System.out.println("-------------");
        System.out.print("선택할 메뉴는?");
    }

    public void view() {
        if (MyList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("No | 이름 생년월일 학년 반  번호 등교시간 하교시간");
        for (Student s : this.MyList) {
            System.out.println(s.toString());
        }
    }

    public void record() {

        Student s = new Student();
        System.out.println("학생 이름 입력");
        s.setName(sc.next());
        System.out.println("학년");
        s.setLevel(sc.nextInt());
        System.out.println("반");
        s.setClass_num(sc.nextInt());
        System.out.println("번호");
        s.setNum(sc.nextInt());
        System.out.println("생년월일 6자리");
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
        //id_num=id_num+1;
        s.setId(MyList.size() + 1);

        this.MyList.add(s);

        System.out.println("학생 등교(하교)기록이 완료되었습니다.");

    }

    public void update() {

        // Student s=new Student();
        int update_num;

        if (MyList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

//        for (Student s: this.list) {
//           // System.out.println(s.getId() + "번째 학생 이름:" + s.getName());
//            System.out.println(s.toString());
//        }
        view();

        System.out.println("수정할 학생의 ID를 입력하시오 ");
        update_num = sc.nextInt();
        System.out.println("학생 이름 입력");
        MyList.get(update_num - 1).setName(sc.next());
        System.out.println("학년");
        MyList.get(update_num - 1).setLevel(sc.nextInt());
        System.out.println("반");
        MyList.get(update_num - 1).setClass_num(sc.nextInt());
        System.out.println("번호");
        MyList.get(update_num - 1).setNum(sc.nextInt());
        System.out.println("생년월일 6자리");
        MyList.get(update_num - 1).setBirth(sc.nextInt());
        System.out.println("등교시간");
        System.out.print("시: ");
        MyList.get(update_num - 1).setIn_time_h(sc.nextInt());
        System.out.print("분: ");
        MyList.get(update_num - 1).setIn_time_m(sc.nextInt());
        System.out.println("하교시간");
        System.out.print("시: ");
        MyList.get(update_num - 1).setOut_time_h(sc.nextInt());
        System.out.print("분: ");
        MyList.get(update_num - 1).setOut_time_m(sc.nextInt());
        System.out.println("수정되었습니다.");


    }

    public void delete() {

        int delete_num;

        if (MyList.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

//        for (Student s: this.list) {
//            // System.out.println(s.getId() + "번째 학생 이름:" + s.getName());
//            System.out.println(s.toString());
//        }

        view();

        System.out.println("삭제 할 학생의 ID를 입력하시오 ");
        delete_num = sc.nextInt();

        MyList.remove(delete_num - 1);

        for (int i = 0; i < MyList.size(); i++)
            MyList.get(i).setId(i + 1);

        System.out.println("삭제되었습니다.");


    }

    public void Search(){
        String SearchName;
        System.out.println("검색할 이름 입력 ");
        SearchName = sc.next();

//
        for (int i = 0; i < MyList.size(); i++){

            if(MyList.get(i).getName().equals(SearchName)){
              //  System.out.println(SearchName);
                System.out.println("No | 이름 생년월일 학년 반  번호 등교시간 하교시간");
                System.out.println(MyList.get(i).toString());
            };
        }


    }
}
