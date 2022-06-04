# 반복문

## for
주어진 횟수만큼 반복하여 실행하는 구조  
초기값부터 조건문에 해당하는 횟수 이하까지 특정 값만큼 증가하면서 블럭 내의 내용을 반복한다.

    for (초기치; 조건문; 증가치;) {
        반복하여 실행할 내용;
    }

    //사용예(1)
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    //사용예 (2)
     for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5 + 1; j++) {
        System.out.print("*");
        }
     System.out.println();
     }                       

    //사용예 (3)
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
        continue;                          // break; 도 사용가능
    }
        for (int j = 0; j < 5 + 1; j++) {
            System.out.print("*");
    }
    System.out.println();
    }                       


### for each  
모든 원소를 순회할 때는 for 보다 for each 가 더 편리하다.

    int[] nums = {1, 2, 3, 4, 5};
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }  

    
    for (int num : nums) {
        System.out.println(nums);
    }
    //nums: 반복하고자 하는 대상
      int : 반복하고자 하는 대상의 자료형
      num : 변수명


## while
조건문이 만족하는 동안 반복하여 실행하는 구조  
while/ do-while 구조가 있음

    (1)while : 조건에 따라 내용 실행 안 할수도
    
    while (조건문) {
        반복하여 실행할 내용;
    }

    (2)do-while : 일단 블럭 안의 내용을 실행하고 while의 조건문 검사

    do{
        반복하여 실행할 내용;
    } while(조건문);             // 마지막의 세미콜론(;) 잊지않도록 주의


    //사용예(1)
    int i = 0;
    while (i < 5) {
        System.out.println(i++);     // 증가치 잊지않도록 주의!
    }

    //사용예(2)
    i = 0;
    while (i < 5) {
        if(i == 2) {
        i++;                         // 증가치 잊지않도록 주의!
        continue;                    //break;도 사용가능
    }
        System.out.println(i++);   
    }

    //사용예(3)
    boolean knock = false;
    do {
        System.out.println("knock");
    } while (knock);
    //false 임에도 do-while 로 인해 한번 출력되고 그 다음 조건문에 걸려 멈춘다.