package class1;

import java.util.Scanner;

public class ClassStart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();  // 기본 생성자 호출

            System.out.println("[" + (i + 1) + "] 번째 학생의 이름을 작성하시오: ");
            students[i].name = sc.nextLine();

            System.out.println("[" + (i + 1) + "] 번째 학생의 나이를 작성하시오: ");
            students[i].age = sc.nextInt();

            System.out.println("[" + (i + 1) + "] 번째 학생의 성적을 작성하시오: ");
            students[i].grade = sc.nextInt();

            // nextInt(), nextDouble() 후에는 nextLine()을 호출해서 개행 문자를 소비해야 합니다.
            sc.nextLine();
        }
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }

        sc.close();  // Scanner 닫기
    }
}
