# 조건문(if/switch)

## if
조건에 따라 무엇을 실행할 지 판단하는 분기 구조

    if(조건문1) {
        조건문 1을 만족할 때 실행할 내용; 
    } else if(조건문2) {
        조건문 2를 만족할 때 실행할 내용;
    } else {
        그 외의 상황에서 실행할 내용;
    }

    //사용예(1)
    int waterTemperature = 99;
    
    if (waterTemperature >= 100) {
        System.out.println("물이 끓습니다.");
    } else {
        System.out.println("물을 끓이는 중입니다.");
    }

    //사용예(2)
    int score = 90;
    char grade = 0;

    if (score >= 90) {
        grade = 'A';
    } else if (score >= 80) {
        grade = 'B';
    } else if (score >= 70) {
        grade = 'C';
    } else {
        grade = 'F';
    }
    System.out.println("grade = " + grade);    // 점수에 따른 등급 출력


## switch
입력 값에 따라 어떤 case를 실행할 지 판단하는 분기 구조

    switch(입력 값) {
        case 입력 값 1:
            실행할 내용;
            break;           // break가 없으면 다음 case가 실행된다
        case 입력 값 2;
            실행할 내용;
            break;
        ......
        
        default:             // if의 else와 같은 의미, 위에서 해당사항이 없을 경우 실행
            실행할 내용;
            break;
    }


    //사용예(1)
    String fruit = "apple";
    
    switch (fruit) {
        case "apple":
            System.out.println(fruit + "은 5000원 입니다");
            break;
        case "blueberry":
            System.out.println(fruit + "은 10000원 입니다.");
            break;
        default:
            System.out.println("해당 과일이 없습니다.");
            break;
    }     
    // 이 경우 "apple"이 출력된다.


    //사용예(2)
    int number = 5;
    if (number % 2 == 0) {
        System.out.println("짝수 입니다.");
    } else {
        System.out.println("홀수 입니다");
    }
    // 이 경우 "홀수 입니다."가 출력된다.


    //사용예(3)
    score = 85;
    grade = 0;

    switch (score / 10) {
        case 10:             // break는 있어도, 없어도 괜찮다.(다음 case에서 탈출한다)
        case 9:
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        default:
            grade = 'F';
            break;
    }
    System.out.println("grade = " + grade);
    //이 경우 'B'가 출력된다.
      이 문제에서 score를 10으로 나누어준 것은 76 혹은 85 등의 경우,
      해당값 없음을 의미하는 'F'가 출력되지 않도록 하기 위함이다.
      (10으로 나누어줄 경우 7.6(7), 8.5(8) 이므로 해당 case에서 등급이 출력된다)