import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import org.apache.commons.io.FileUtils;

public class fileService {
    String filename;

    fileService(){
       String path= Paths.get(".").toAbsolutePath().toString(); //현재주소받아오기
       filename=path+"/data.txt";//파일명
    }

    public ArrayList<Student> readFile(){
        ArrayList<Student> myList= new ArrayList();
        try {

            //파일 객체 생성
            File file = new File(filename);

            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(new FileReader(file));

            int i =0;
            String line = "";
            while ((line = bufReader.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(line, "-");

                String name = st.nextToken().trim();
                int birth = Integer.parseInt(st.nextToken().trim());
                int level = Integer.parseInt(st.nextToken().trim());
                int class_num= Integer.parseInt(st.nextToken().trim());
                int num = Integer.parseInt(st.nextToken().trim());
                int in_time_h = Integer.parseInt(st.nextToken().trim());
                int in_time_m = Integer.parseInt(st.nextToken().trim());
                int out_time_h = Integer.parseInt(st.nextToken().trim());
                int out_time_m = Integer.parseInt(st.nextToken().trim());

                myList.add(new Student(i + 1, name, birth, level,class_num, num, in_time_h, in_time_m, out_time_h, out_time_m));
                i++;
            }
            bufReader.close();
        }catch(FileNotFoundException e ){
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }

        return myList;

    }

    public void SaveFile(ArrayList<Student> list){
            //파일 객체 생성
        try {
            File file = new File(filename);
           // System.out.println(filename);
            FileUtils.write(file," ",false);//data.txt 파일내 데이타들을 지워줌
            for(Student s:list){
                FileUtils.write(file,s.toFString(),true);
                FileUtils.write(file,"\n",true);

            }

        }catch(FileNotFoundException e ){
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }



    }


}
