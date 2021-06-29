# HelloWorld

A. Project1 CRUD project

1. git 버전관리 
- preference > Version Control > Github > + > 로그인 
- 저장소 생성하면서 github와 공유 : 메뉴바 > Git > GitHub > Share project on GitHub 



2. Project 소개
- 제목: 초등학생 등교 관리 프로그램 
- 데이타 : id,이름,생년월일,학년,반,번호,등교시간,하교시간,특이사항


3. Class 생성 

    1) Main
    2) Student 
    3) Menu 
   
4. 실행 화면 
   1. Create

<img width="387" alt="스크린샷 2021-06-29 오후 1 08 31" src="https://user-images.githubusercontent.com/63465350/123735950-24b1c680-d8db-11eb-9d5a-bfc3a35ec0b8.png">
      

   2. Read

<img width="409" alt="스크린샷 2021-06-29 오후 1 09 46" src="https://user-images.githubusercontent.com/63465350/123736018-490da300-d8db-11eb-9651-5c56d25453a0.png">
      

   3. Update

<img width="431" alt="스크린샷 2021-06-29 오후 1 10 40" src="https://user-images.githubusercontent.com/63465350/123736076-68a4cb80-d8db-11eb-9935-6100f37efef0.png">
   4. Delete 

<img width="397" alt="스크린샷 2021-06-29 오후 1 11 23" src="https://user-images.githubusercontent.com/63465350/123736118-82dea980-d8db-11eb-8aa8-51202c197561.png">


B. Project2 CRUD + File/IO 

: Project1 + 파일저장기능 + 파일불러오기기능 

   1. 외부 library 쓰는 법
   
   - library 이름 검색 
   - maven 사이트 접속
   - build tool 맞게 dependency 복사
   - build.gradle 파일에 dependency안에 붙여넣기 

   2. Fileservice 클래스 생성
   
   3. 파일 불러오기 기능 추가 
    
   : 프로그램 시작하면, data.txt 파일 불러온 후 리스트에 추가하도록 
    BufferReader & FileReader 클래스 사용 OR FileUtils(common-io 라이브러리) 사용 

    (1) FileService 클래스 내 파일 불러오기 함수 생성 : readFile() 
        - 파일 객체 생성 
        - 입력 스트림 생성(FileReader)
        - 입력 버퍼 생성(BufferReader) 

      
       * String Tokenizer : 문자열 쪼개는 클래스 
         
   
      


   
    
