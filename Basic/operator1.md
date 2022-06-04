# 여러가지 연산자1

## 항과 연산자
항은 연산을 할 때의 값을 의미    
연산자는 "연산을 수행하는 기호"를 의미  

1.단항 연산자: 항이 한 개

    ex) num++;

2.이항 연산자: 항이 두 개

    ex) 1 + 1

3.삼항 연산자: 항이 세 개
      
    ex) (3 > 1) ? 1 : 0
    
    int a = 100;
    String aResult = (a == 100) ? "yes" : "no";
     > (조건)이 맞으면 왼쪽 값을, 틀리면 오른쪽 값을 반환한다.


## 대입 연산자, 부호 연산자
1.대입 연산자(=)  
우측의 데이터를 좌측에 변수에 대입하는 연산

    ex) int num = 100;

2.부호 연산자(+,-)

    ex) +10, -10


## 산술 연산자, 증가/감소 연산자
1.산술 연산자  
덧셈(+), 뺄셈(-), 곱셈(x), 나눗셈(/), 나머지(%)
    
    ex) 10 % 3

2.증가/감소 연산자  
값을 1만큼 늘리거나(++), 1만큼 줄임(--)  
연산자가 뒤에 붙은 경우에는 일단 값을 그대로 반환하고 그 다음부터 증가(++)/감소(--)  
반대로 연산자가 앞에 오는 경우에는 바로 증가/감소 

    ex) num++, ++num, num--, --num
    
    int numZ = 1;
    System.out.println(numZ++)     // 1이 출력
    System.out.println(numZ)       // 2가 출력

    numZ = 1;
    System.out.println(++numZ)     // 2가 출력
    System.out.println(numZ)       // 3이 출력


## 관계 연산자(> , < , !, ==)
두 항의 값 크기를 비교  
결과 값은 비교 결과에 따라 true 또는 false 를 반환

    ex)   10 > 9      // false
    ex)   5 ! = 3      // true

    int numA = 10;
    int numB = 9;
    
    System.out.println(numA > numB);    // true
    System.out.println(numA < numB);    // false
    System.out.println(numA == numB);   // false
    System.out.println(numA ! = numB);  // true


## 논리 연산자(&&, ||, !)
논리식에 대해 참 거짓을 판단  
결과 값은 판단 결과에 따라 true 또는 false 를 반환

    ex)   (10 > 9) && (1 == 0)     // &&는 'and'를 의미, false
    ex)   (10 > 9) || (1 == 0)     // ||는 'or'를 의미, true
    ex)   5 ! = 3                   // !는 'not'을 의미, true


## 복합 대입 연산자
대입 연산자와 다른 연산자를 조합한 연산
코드를 간결하게 작성할 때 사용
    
    ex) num1 += num2;     // num1에 num2를 더해 다시 num1으로 대입하라는 의미     
    ex) num1 %= num2;       

    int numX = 10;
    int numY = 5;
    numX += numY;         // 값: 15, numX = numX + numY 와 같은 의미
    System.out.println("numX =" + numX);      // 15 출력
