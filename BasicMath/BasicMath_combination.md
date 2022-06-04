## 조합

### 조합(Combination)
서로 다른 n개 중에서 r개를 선택하는 경우의 수(순서x, 중복x)  
예시) 서로 다른 4명 중 주번 2명 뽑는 방법  

    nCr = n! / (n-r)!r! = nPr(순열) / r!   
     => 순열(nPr)을 r!로 나누어준다

    // 예제(서로 다른 4명 중 주번 2명 뽑는 경우의 수)
     int n = 4;
     int r = 2;

     int pResult = 1;
     for (int i = n; i >= n - r + 1 ; i--) {
         pResult *= i;
     }

     int rResult = 1;
     for (int i = 1; i <= r ; i++) {
         rResult *= i;
     }
     System.out.println("결과: " + pResult / rResult);


### 중복 조합
서로 다른 n개 중에서 r개를 선택하는 경우의 수(순서x, 중복o)  
예시)후보 2명, 유권자 3명일 때 무기명 투표 방법(무기명 -> 중복허용)


    nHr = (n + r- 1)Cr => (2 + 3 -1) C 3 = 4C3
     => 조합을 구현한 메소드를 이용, ((n + r -1), r)의 값을 구해준다
