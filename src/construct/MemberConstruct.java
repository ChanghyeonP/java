package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50); // this()는 생성자 코드의 첫줄에만 작성할 수 있음
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // 제약 - 생성자 호출 필수 = 생성자를 호출하게 강제하여 데이터를 누락할 실수를 줄일 수 있음 = 필수값 입력 보장
    MemberConstruct(String name, int age, int grade) { // 생성자 이름 = 클래스 이름
        System.out.println("constructor name : " + name + ", age : " + age + ", grade : " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MemberConstruct{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}