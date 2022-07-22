## 추상클래스

### 추상 메소드(Abstract Method)
자식클래스에서 반드시 오버라이딩 해야하는 메소드  
선언만 하고 구현 내용 없음

```java
    abstract void print();
     -> {구현내용 없음}

    //추상 클래스 Person
    abstract class Person {
        abstract void printInfo();
    }
```


### 추상 클래스
하나 이상의 추상 메소드를 포함하는 클래스  
-> 추상메소드를 포함하고 있는 것 을 제외하고는 일반 클래스와 다르지않다, 매개변수를 가질 수 있으며 생성자도 있다  
반드시 구현해야 하는 부분에 대해 명시적으로 표현  
추상 클래스 자체는 객체 생성 불가  

```java
    abstract class 클래스명 {
        ...
        abstract void print();
    }

    //추상 클래스 상속
    class Student extends Person {
        public void printInfo() {
            System.out.println("Student.printInfo");
        }
    }

    //추상 클래스의 사용
    Student s1 = new Student();    
        s1.printInfo();               //추상 클래스를 상속받은 자식 클래스의 객체를 만들어 사용
 
    Person p2 = new Person() {        //익명클래스로 사용(일회성) 
        @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    p2.printInfo();
```