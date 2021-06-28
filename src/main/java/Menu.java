import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Student> list;

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







}
