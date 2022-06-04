## 점화식과 재귀함수

### 점화식(Recurrence)
어떤 수열의 일반항을 그 이전의 항들을 이용하여 정의한 식  
예시) 피보나치 수열  

    
    1, 1, 2, 3, 5, 8, 13 ....      // 앞의 두 숫자를 더한 값
    F1 = F2 = 1, Fn+2 = Fn+1 + Fn
    
    //예시1 (1, 3, 9, 27, ... 의 n번째 수를 구하시오)
        int n = 4;
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result *= 3;
            }
        }
        System.out.println(result);


    //예시2 (1, 1, 2, 3, 5, 8, 13, ...의 n번 째 수)
    n = 6;
    result = 0;
    int a1 = 1;
    int a2 = 1;

    if (n < 3) {
        result = 1;
    } else {
        for (int i = 2; i < n; i++) {
            result = a1 + a2;
            a1 = a2;               
            a2 = result;
        }
    } System.out.println(result);
    }


### 재귀함수(Recursive Function)
어떤 함수가 자신을 다시 호출하여 작업을 수행하는 방식  
(자신을 호출하면서 반복 // for문 사용X)

   
    반환타입 함수이름(매개변수 {
        종료조건                //일종의 반복문이므로 종료조건이 반드시 있어야 한다!  
          ...
        함수이름(...)           // return n * 함수이름(n -1);    
    }


    //예시1 (1, 3, 9, 27, ... 의 n번째 수를 구하시오)
    static int recursion1(int n) {
        if (n ==1) {
            return 1;
        }
        return 3 * recursion1(n -1);
    }


    //예시2 
    static int recursion3(int n) {
        if (n < 3) {
            return 1;
        }
        return recursion3(n -2) + recursion2(n - 1);
    }


    //예시 (팩토리얼을 재귀함수로 구하시오)
    static int factorial(int n) {       
        if (n ==1) {
            return 1;
        }
        return n * factorial(n -1);         //점화식을 재귀함수로 구현
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }


    //예시 (최대공약수를 재귀함수로 구하시오)
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3, 5));
        System.out.println(gcd(2, 6));
        System.out.println(gcd(8, 12));
    }
