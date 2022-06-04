## 지수와 로그


### 제곱, 제곱근, 지수

#### 제곱  
같은 수를 두 번 곱함  
(거듭 제곱: 같은 수를 거듭하여 곱함)  

#### 제곱근(= root)  
a를 제곱하여 b가 될 때 a를 b의 제곱근이라고 함


    2의 3승 = 2 x 2 x 2
    a의 x승 = a: 밑, x:지수

    //예제1 (제곱)
    System.out.println("== 제곱 ==");
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.pow(2, -3));
    System.out.println(Math.pow(-2, -3));
    System.out.println(Math.pow(2, 30));
    System.out.printf("%.0f\n", Math.pow(2, 30));
    
    //예제2 (제곱근)
    System.out.println(Math.sqrt(16));
    System.out.println(Math.pow(16, 1.0/2));
    System.out.println(Math.pow(16, 1.0/4));


    //예제3 (절대값)
    System.out.println(Math.abs(5));
    System.out.println(Math.abs(-5));1


### 로그
logab: a가 b가 되기 위해 제곱해야하는 수  

    log2 4 = 2
    log10 1000 = 3

    //예제
    System.out.println(Math.E);
    System.out.println(Math.log(2.718281828459045));
    System.out.println(Math.log10(1000));
    System.out.println(Math.log(4)/ Math.log(2));



### 메소드 사용없이 제곱, 제곱근 구하기
####제곱


    static double pow (int a, double b) {           //기본적인 양수의 제곱
        double result = 1;
        boolean isMinus = false;                    //음수 체크하기 위한 변수

         if (b == 0) {
             return 1;
         } else if (b < 0) {                        //음수일 경우를 위한 조건
             b *= -1;
             isMinus = true;
        }

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return isMinus? 1 / result : result;
    }


#### 제곱근(바빌로니아 방식)


    static double sqrt(int a) {
        double result = 1;

        for (int i = 0; i < 10; i++) {              //많이 반복할 수록 정확한 값을 구할 수 있다.
            result = (result + (a/ result)) / 2;
        }
        return result;
    }
