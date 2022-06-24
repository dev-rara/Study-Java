## 분할정복(Divide and Conquer)


### 분할정복 이란?
* 큰 문제를 작은 부분 문제로 나누어 해결하는 방법
  * 합병 정렬, 퀵 정렬, 이진 검색 ...
    

* 분할 정복 과정
  * 문제를 하나 이상의 작은 부분들로 분할
  * 부분들을 각각 정복
  * 부분들의 해답을 통합하여 원래 문제의 답을 구함  
  
  
###
### 분할정복 장단점
* 장점
  * 문제를 나누어 처리하며 어려운 문제 해결 가능
  * 병렬처리에 이점이 있음  
  
  
* 단점
  * 메모리를 많이 사용(재귀호출 구조)
   

###
### 분할 정복 예시
* 최대 값 찾기
  * 잘게 쪼개서 서로 비교하며 원하는 값이 나올 때까지 더 큰 값을 찾아간다  
  
  
```java
public static int getMax(int[] arr, int left, int right) {
    int m = (left + right) / 2;

    if(left == right) {
        return arr[left];
    }

    left = getMax(arr, left, m);
    right = getMax(arr, m + 1, right);
    
    return left > right? left : right;   
    //여기서 인덱스로 리턴해주면 위의 탈출조건에 걸려 해당 인덱스의 값이 최종 리턴 된다
}
```  
  
  
