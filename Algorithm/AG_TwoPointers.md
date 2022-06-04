## 투 포인터


### 투 포인터(Two Pointers)
* 배열에서 두 개의 포인터를 사용하여 원하는 결과를 얻는 방법
* 두개 포인터의 배치 방법
  * 같은 방향에서 시작: 첫 번째 원소에 둘다 배치
  * 서로 다른 방향에서 시작: 첫 번째 원소와 마지막 원소에 배치
* 다중 for문의 복잡도를 좀 더 선형적으로 풀 수 있음


### 투 포인터 예시
* 기존의 단순 for문 이용하는 경우 알고리즘 시간복잡도: O(n^2)
* 투 포인터 방법을 이용하는 경우 알고리즘 시간복잡도: O(n)  
  
  
    //아래의 배열에서 부분합이 9가 되는 구간을 찾으시오.
    int[] arr = {1, 2, 5, 3, 7, 2, 4, 3, 2}; 

    //for문 이용의 경우
    //이중 for문을 이용하여 Target을 찾아준다
    public static int[] forLoop(int[] arr, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (sum == target) {
                    result[0] = i;
                    result[1] = j - 1;
                    break;
                }
                sum += arr[j];
            }
            if (target == sum) {
                break;
            }
        }
        return result;
    }
    
  

    //투 포인터 이용의 경우
    //처음엔 P1, P2가 같은 값을 가리키고 있다가 Target 보다 작으면 P1이 이동한다.
    //부분합이 Target 보다 커지면 P2를 이동시키면서 수를 하나씩 빼면서 Target을 찾는다
     public static int[] twoPointers(int[] arr, int target) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int[] result = {- 1, - 1};

        while (true) {
            if (sum > target) {
                sum -= arr[p1++];   //p1의 값을 빼주고 p1은 오른쪽으로 이동시킨다
            } else if(p2 == arr.length) {
                break;              //배열의 끝에 닿은 경우 반복문 탈출
            } else {
                sum += arr[p2++];   //p2값을 더해주고 p2는 오른쪽으로 이동시킨다
            }

            if (sum == target) {
                result[0] = p1;
                result[1] = p2 - 1;
                break;
            }
        }
        return result;
    }