## 순열

### 팩토리얼
1에서 n까지 모든 자연수의 곱(n!)  
    
    n! = n(n - 1)(n - 2)....1

    // 예제: 5!를 구하시오.
    int n = 5;
    int result = 1;

    for (int i = 1; i <= n ; i++) {
        result *= i;    
    }
    System.out.println("result = " + result);
    System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> (x * y)));


### 순열(Permutation)
순서를 정해서 나열  
서로 다른 n개 중에 r개를 선택하는 경우의 수(순서O, 중복X)  
  예시1) 5명을 3줄로 세우는 방법  
  예시2) 서로 다른 4명 중 반장, 부반장 뽑는 방법  


    nPr = n! / (n - r)! = n(n - 1)(n - 2)....(n - r + 1) (단, 0 < r <= n)
     => (n - r + 1)까지 1씩 줄어든 수를 곱해준다

    //예제: 5명을 3줄로 세우는 경우의 수
    n = 5;
    int r = 3;
    result = 1;

    for (int i = n; i >= n - r + 1; i--) {
        result *= i;
    }
    System.out.println("result = " + result);
    

### 중복 순열
서로 다른 n개 중에 r개를 선택하는 경우의 수(순서O, 중복O)  
  예시1) 서로 다른 4개의 수 중 2개를 뽑는 방법(중복 허용)  
  예시2) 후보 2명, 유권자 3명일 때 무기명투표 방법(무기명 -> 중복허용)  

        
    n의 r승
     => r만큼 n을 곱해준다

    //예제: 서로 다른 4개의 수 중 2개를 뽑는 경우의 수 (중복 허용)
    n = 4;
    r = 2;
    result = 1;

    for (int i = 1; i <= r; i++) {
        result *= n;
    }
    System.out.println("result = " + result);
    System.out.println(Math.pow(n,r));


### 원 순열  
원 모양의 테이블에 n개의 원소를 나열하는 경우의 수  
  예시) 원 모양의 테이블에 3명을 앉히는 경우  

    
    n! / n = (n -1)!

    //예제: 원 모양의 테이블에 3명을 앉히는 경우의 수
    n = 3;
    result = 1; 
    
    for (int i = 1; i < n; i++) {
        result *= i;
    }
    System.out.println("result = " + result);
