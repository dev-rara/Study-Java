# Java - 자료형(숫자, 부울, 문자)

## 숫자 형태의 자료형

    정수
    int intNum = 10;
    long longNum = 2147483648L;

    실수
    float floatNum = 1.23f;              // 접미사'f'가 있어야 float형으로 인식
    double doubleNum = 1.23;

    2진수, 8진수, 16진수
    int numBase2 = 0b1100;   //10진수 12
    int numBase8 = 014;      //10진수 12
    int numBase16 = 0xC;     //10진수 12

* 2진수, 8진수, 16진수의 형태로 출력시 
    

    System.out.println("0b" + Integer.toBinaryString(numBase2));  
    System.out.println("0" + Integer.toOctalString(numBase8));  
    System.out.println("0x" + Integer.toHexString(numBase16));


## 부울(Boolean)
참과 거짓을 나타내는 자료형

    boolean isPass = true;
    boolean isOk = false;


## 문자(Character)
한 개의 문자 표현에 사용하는 자료형
    
    char keyFist = 'a';
    char keyLast = 'z';


    
