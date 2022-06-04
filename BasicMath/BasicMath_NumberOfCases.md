## 기초수학 - 경우의 수

### 경우의 수  
어떤 사건에서 일어날 수 있는 경우의 가짓수  
  예시1) 동전을 던지는 사건: 경우의 수 2  
  예시2) 주사위를 던지는 사건: 경우의 수 6


### 합의 법칙  
사건A 또는 사건 B가 일어날 경우의 수  
  예시1) 두 개의 주사위를 던졌을 떄 합이 3 또는 4의 배수일 경우의 수 : (A의 경우의 수 + B의 경우의 수) - A와B 공통의 경우의 수  

 
    int[] dice1 = {1, 2, 3, 4, 5, 6};
    int[] dice2 = {1, 2, 3, 4, 5, 6};
    int nA = 0;
    int nB = 0; 
    int nAandB = 0;
   
    // 기본 풀이
    for (int item1: dice1) {
        for (int item2: dice2) {
            if ((item1 + item2) % 3 == 0) {
             nA += 1;
            }
            if ((item1 + item2) % 4 == 0) {
                nB += 1;
            }
            if ((item1 + item2) % 12 == 0) {
                nAandB += 1;
            }
        }
    }
    System.out.println("결과: " + (nA + nB - nAandB));
    
    // HashSet 이용
    HashSet<ArrayList> allCase = new HashSet<>();
    for (int item1: dice1) {
        for (int item2: dice2) {
            if ((item1 + item2) % 3 == 0 || (item1 + item2) % 4
                ArrayList list = new ArrayList(Arrays.asList(item1,item2));    //조건에 만족하면 ArrayList를 새로 만들면서 주사위 두개의 눈금을 리스트로 만들어
                allCase.add(list);                                             //HashSet에 넣어주면, 모든 주사위 눈금을 기록할 수 있고 
            }                                                                  //HashSet이므로 데이터 중복값은 제거된다.
        }
    }
    System.out.println("결과: " + allCase.size());




### 곱의 법칙  
사건A 와 사건 B가 동시에 일어날 경우의 수  
 예시1) 두개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의   


    // 두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우
    nA = 0;
    nB = 0;
    
    for (int item1: dice1)  {
        if (item1 % 3 == 0 ){
            nA++;
        }
    }
    for (int item1: dice2) {
        if (item1 % 4 == 0) {
            nB++;
        }
    }
    System.out.println("결과: " + (nA * nB));



### 최대공약수, 최대공배수  
최대공약수 GCD(the Greatest Common Denominator): 2개 이상의 수의 공약수 중에서 최대인 수  
최대공배수 LCM(the Lowest Common Multiple) : 2개 이상의 수의 공배수 가운데서 최소인 것 


    // 1.약수 구하기 
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= (int)num/2 ; i++) {      // i = 1 주의!! 자기수의 반이 넘어가면 더이상 나누어 떨어지는 수가 없으므로
            if (num % i == 0) {                       //  자기수의 절반까지만 for문 반복
                result.add(i);
            }
        } result.add(num);                            // for문 끝나고 자기자신을 넣어주면 약수구하기 완료
        return result;
    }

    // 2.최대 공약수 구하기
        public int getGCD (int numA, int numB) {
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for (int itemA: (ArrayList<Integer>)divisorA) {
            for (int itemB: (ArrayList<Integer>)divisorB) {
               if(itemA == itemB) {
                   if (itemA > gcd) {
                       gcd = itemA;
                   }
               }
            }
        }
        return gcd;
    }

    // 3.최대 공배수 구하기(numA * numB / 최대공약수)
    public int getLCM (int numA, int numB) {
        int lcm = -1;
        int gcd = this.getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }
        return lcm;
    }
