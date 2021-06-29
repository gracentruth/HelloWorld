import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        ArrayList<Student> list = new ArrayList<Student>();

        int menu_num = 1;
        boolean check = true;

        Menu m = new Menu(list);

        Scanner sc = new Scanner(System.in);

        while (check) {
            m.printMenu();
            menu_num = sc.nextInt();

            switch (menu_num) {

                case 1:
                    m.view();
                    break;
                case 2:
                    m.record();
                    break;
                case 3:
                    m.update();
                    break;
                case 4:
                    m.delete();
                    break;
                case 0:
                    System.out.println("종료");
                    check = false;
            }

        }


    }

}
