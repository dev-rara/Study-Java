
# Java - 자료형(문자열, StringBuffer, Array)

## 문자열(String)
문자들로 이루어진 집합
    
    String s1 = "Hello World!";
    String s2 = "01234";

문자열 메소드
    
    equals, indexOf, replace, substring, toUpperCase

    //메소드 사용예
    System.out.println(s1.equals(s2));
    System.out.println(s1.indexof("!"));
    
    String s3 = s1.replace("Hello", "Bye");
    
    System.out.println(s2,substring(0, 3));
    System.out.println(s1.toUpperCase);


## StringBuffer
문자열을 자주 추가하거나 변경할 때 사용하는 자료형
String 으로도 문자열을 변경 할 수는 있지만, 빈번하게 일어날 경우
객체가 여러번 생성되므로 메모리 사용이 많아지므로 StringBuffer 를 사용하는 것이 좋다.

    StringBuffer sb1 = new StringBuffer("Hello World!");

StringBuffer 메소드
    
    append, insert, substring
    
    //메소드 사용예
    sb1.append("01234");


## 배열(Array)
많은 수의 데이터를 담을 수 있는 자료형
(엄밀히 말하면 자료구조)

    int[] myArray1 = {1, 2, 3, 4, 5};
    char[] myArray2 = {'a', 'b', 'c', 'd', 'e'}; 

    //사용예
    System.out.println(myArray1[0])   //0번 index의 값(1)을 출력
    System.out.println(myArray2[2])   //2번 index의 값(C)을 출력
    
    String[] myArray3 = new String[3];
    myArray3[0] = "Hello";
    myArray3[1] = " ";
    myArray3[2] = "World!";
    System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
