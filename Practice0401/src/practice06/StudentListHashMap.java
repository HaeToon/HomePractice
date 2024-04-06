package practice06;

import java.util.*;

public class StudentListHashMap {
    Scanner scanner = new Scanner(System.in);
    private Map<String,Student> students = new HashMap<>();

    void run(){
        System.out.println("학생관리부를 작성합니다.");
        while(true) {
            System.out.println("1==저장 2==검색 3==종료");
            int menu = scanner.nextInt();
            if (menu == 3) {
                finish();
                break;
            }else if (menu==1){
                input();
            }else if(menu==2){
                search();
            }
        }
    }
    private void input(){
        System.out.println("학생이름 , 학과 , 학번 , 학점을 입력해 주세요(그만 입력시 종료)");
        while(true){
            System.out.println(">>");
            String name = scanner.next();
            if(name.equals("그만")){
                finish();
                break;
            }
            String department = scanner.next();
            int id = scanner.nextInt();
            double score = scanner.nextDouble();
            Student student = new Student(name,department,id,score);
            students.put(name,student);
        }
    }
    private void search(){
        while(true){
            System.out.println("학생이름을 입력해 주세요");
            String name = scanner.next();
            Student student = students.get(name);
            if(name.equals("그만")){
                finish();
                break;
            }
                if(student !=null){
                    System.out.println("이름 : "+student.getName() + "학과 : "+ student.getDepartment() + "학번 : "+ student.getId()+ "학점 : "+student.getScore());
                }else {
                    System.out.println(name + "은 우리학생이 아닙니다.");
                }
        }
    }
    private void finish(){
        System.out.println("종료합니다.");
    }
}
