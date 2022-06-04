## 기초수학 - 집합(Set)

### 집합
특정 조건에 맞는 원소들의 모임  

(집합 표현 방법)  
원소나열법 : A = {1, 2, 3, 4, 5}  
조건제시법 : A = {A|A는 정수, 1 <= A <= 5}  
벤 다이어그램  

      
    // Java에서의 집합 사용
    System.out.println("== HashSet ==");
    HashSet set1 = new HashSet();
    set1.add(1);
    set1.add(1);                             //Set은 중복된 값을 허용하지 않는다
    System.out.println("set1 = " + set1);
    set1.add(2);
    set1.add(3);
    System.out.println("set1 = " + set1);
    set1.remove(1);
    System.out.println("set1 = " + set1);
    System.out.println(set1.size());
    System.out.println(set1.contains(2));



### 교집합(retainAll)
두 집합이 공통으로 포함하는 원소로 이루어진 집합  
즉, 두 집합의 공통된 부분  

   
    HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
    HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10));
    a.retainAll(b);                              //a와 b의 중복된 원소를 찾는 것
    System.out.println("교집합: " + a);
    
    

### 합집합(addAll)
어느 하나에라도 속하는 원소들을 모두 모은 집합

    a.addAll(b);                               //a와 b의 원소를 하나로 합치는 것
    System.out.println("합집합: " + a);


### 차집합(removeAll)
A(or B)에만 속하는 원소들의 집합  
A에 속하면서 B에는 속하지 않는 부분  

    a.removeAll(b);                            //a에서 b와 공통된 부분을 제거하는 것
    System.out.println("차집합: " + a);

### 여집합 
전체집합(U) 중 A의 원소가 아닌 것들의 집합  


### HashSet 사용없이 동일한 기능의 집합연산 구현


    class MySet {
    ArrayList<Integer> list;

    // 생성자1(객체를 만들기 위한 생성자)
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    // 생성자2(데이터를 만들어서 객체 생성시 그 데이터를 넣어주기 위한 생성자)
    MySet(int[] arr) {
        this.list = new ArrayList<Integer>();

        for (int item : arr) {                    //들어온 데이터를 리스트에 하나씩 add한다
            this.list.add(item);
        }
    }

    // 원소 추가(중복 X)
    public void add(int x) {
        for (int item : this.list) {              //add 하려고 하는 데이터와 리스트에 있는 데이터를 비교하여 중복값이 아니면 add
            if (item == x) {
                return;                           //값이 같은 경우 추가 없이 return
            }
        }
        this.list.add(x);
    }


    // 교집합
    public MySet retainAll(MySet b) {             // A라는 집합은 그대로 두고 공통된 원소를 가지고 있는 집합을 새로 반환하는 함수로 만듦
        MySet result = new MySet();               // 반환을 하기 위한 자료형

        for (int itemA : this.list) {             // 자기 자신의 list를 순회하고, 새로 들어온 b.list를 순회하면서 비교
            for (int itemB : b.list) {
                if (itemA == itemB) {
                    result.add(itemA);       
                }
            }
        }
        return result;
    }

    // 합집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            result.add(itemA);             // add는 위에서 만든 중복없이 추가하는 메소드
        }
        for (int itemB : b.list) {
            result.add(itemB);
        }
        return result;
    }


    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            boolean containFlag = false;     // 원소가 있는지 없는지를 구분하기 위해서 containFlag 추가

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;                    // true의 경우 안쪽 for문을 탈출
                }
            }
            if (!containFlag) {               //containFlag가 false이면 !containFlag가 true가 되어 블럭의 내용이 실행되는데, 
                result.add(itemA);            //containFlag가 false라는 건 두 리스트에 같은 값이 없다는 뜻이므로 if문에서 살아남은 원소를 result에 add
            }
        }
        return result;
    }
    }



    public class Practice {
    public static void main(String[] args) {
        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);
     }
    }
