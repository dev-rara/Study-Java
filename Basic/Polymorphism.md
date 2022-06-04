## 다형성


### 다형성(Polymorphism)
한 객체가 여러가지 타입을 가질 수 있는 것  
부모클래스 타입의 참조변수로 자식클래스 인스턴스 참조

    
    class Person{}
    class Student extends Person{}

    Person p1 = new Student();          //부모 -> 자식 OK
    Student s 1 = new Person();         //자식 -> 부모 NG


    //예제
    class Person {
        public void print() {
           System.out.println("Person.print");
        }
    
    class Student extends Person {
        public void print() {
            System.out.println("Student.print");
        }

        public void print2() {
            System.out.println("Student.print2");
        }
    
    class CollegeStudent extends Person {
        public void print() {
            System.out.println("CollegeStudent.print");
        }    
    }

    Person p1 = new Person();
    Student s1 = new Student();
    Person p2 = new Student();
    Student s2 = new Person();           //NG

    p1.print();                          //Person.print 출력
    s1.print();                          //Student.print 출력
    s1.print2();                         //Student.print2 출력
    p2.print();                          //Student.print 출력  -> 타입은 부모클래스인 Person이지만, 자식클래스인 Student 객체 이므로
    p2.print2();                         //NG! 메서드는 자식클래스에 속해있으면서(and) 부모클래스가 알고있는 "print메서드"만 접근 가능

    Person p3 = new CollegeStudent();    //CollegeStudent도 Person클래스를 상속했으므로 가능  
    CollegeStudent c1 = new Student();   //NG! 자식클래스끼리는 사용할 수 없다.
    p3.print();                          //CollegeStudent.print 출력

### instanceof
실체 참조하고 있는 인스턴스의 타입 확인

    
    class Person{}
    class Student extends Person{
        Person p1 = new Student();
        System.out.println(p1 instanceof Person);
    }

    //예제
    Person pe1 = new Person();
    Student st1 = new Student();
    Person pe2 = new Student();
    Person pe3 = new CollegeStudent();

    System.out.println(pe1 instanceof Person);
    System.out.println(pe1 instanceof Student);         // NG!

    System.out.println(st1 instanceof Student);         // Person 클래스를 상속받은 Student의 객체이므로
    System.out.println(st1 instanceof Person);

    System.out.println(pe2 instanceof Person);
    System.out.println(pe2 instanceof Student);

    System.out.println(pe3 instanceof Person);          // Person 클래스를 상속받은 Student의 객체이므로
    System.out.println(pe3 instanceof CollegeStudent);



### 타입변환
업캐스팅: 자식클래스의 객체가 부모클래스의 타입으로 형변환 되는 것  
다운캐스팅: 업캐스팅 되어 변경했던 타입을 다시 자기 클래스 쪽으로 변환 하는 것



        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student();    // 업캐스팅

        pp1 = pp2;
        pp1 = ss2;                     //자손타입의 참조변수를 조상타입의 참조변수에 할당할 경우, 형변환 생략가능

        ss1 = ss2;
        ss1 = pp2;                     // 자식 -> 부모 NG

        ss1 = pp3;                     // NG! 업캐스팅 되어 타입이 Person인 상태이므로
        ss1 = (Student)pp3;            // 다운캐스팅(조상타입의 참조변수를 자손타입의 참조변수에 저장할 경우 형변환 생략 불가능)
   


###  연습문제

    // 아래의 클래스와 상속 관계에서 다형성을 이용하여 car객체를 통해 아래와 같이 출력하시오
    // 빵빵! 위이잉! 삐뽀삐뽀!

    class Car {
        Car(){}
        public void horn() { 
            System.out.println("빵빵!");
        }
    }
    
    class FireTruck extends Car {
        public void horn() {
            System.out.println("위이잉!");
        }
    }
    
    class Ambulance extends Car {
        public void horn() {
            System.out.println("삐뽀삐뽀!");
        }
    }
    
    public class Practice {
        public static void main(String[] args) {
            Car car = new Car();
            car.horn();

            car = new FireTruck();
            car.horn();

            car = new Ambulance();
            car.horn();

        //아래와 같이 배열로도 구현가능
        Car car2[] = {new Car(), new FireTruck(), new Ambulance()};

            for (Car type: car2) {
                type.horn();
            }
        }
    }
