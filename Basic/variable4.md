# Java - 자료형(리스트, 맵, 제네릭스)

## 리스트(List)
배열과 같이 여러 데이터를 담을 수 있는 자료형  
추가로 여러가지 메소드를 제공

    ArrayList l1 = new ArrayList();
    l1.add(1);

리스트 메소드

    add, get, size, remove, clear, sort, contains

    //메소드 사용예
    l1.add(1);
    l1.add("World");
    l1.add(0, 1);       //0번 index에 값(1)을 추가

    System.out.println(l1.get(3));    //3번 index의 값을 출력

    System.out.println(l1.size());

    System.out.println(l1.remove(0));   //0번 index의 값을 제거
    System.out.println(l1.remove(Integer.valueOf(1)));  //값이 '2'인 데이터 를제거
    
    l1.clear();
    
    l2.sort(Comparator.naturalOrder());   //오름차순으로 정렬
    l2.sort(Comparator.reverseOrder());   //내림차순으로 정렬

    System.out.println(l2.contains(1));   //'1'이 리스트에 있는지 확인

 
## 맵(Map)
key, value 형태로 데이터를 저장하는 자료형  
(맵은 데이터 저장 순서가 보장되지 않는다. 키를 통해 해당 값에 접근한다.)

    HashMap<String, String> map = new HashMap<String, String>();
    map.put("product", "kiwi");

맵 메소드

    put, get, size, remove, containskey

    //메소드 사용예
    map.put("kiwi", 9000);
    map.put("fruit", apple");

    System.out.println(map.get("kiwi"));    //9000이라는 값이 출력
    System.out.println(map.get("mango"));   //null이 출력

    System.out.println(map.size());

    System.out.println(map.remove("kiwi"));   //키를 지우면 값도 같이 지워진다

    System.out.println(map.containsKey("apple"));   //"fruit"이라는 키가 있으므로 true를 출력


## 제네릭스(Generics)
자료형을 명시적으로 지정  
제한적일 수 있지만 안전성을 높여주고 형변환을 줄여줌

    ArraList<String> l1 = newArrayList<String>();
    HashMap<String, Integer> map1 = new HashMap<String, Integer>();

    //사용예
    ArrayList l2 = new ArrayList();      //제네릭스 사용안 한 경우
    l2.add(1);
    l2.add("Hello");

    ArrayList<String> l3 = new ArrayList<String>();   // 오른쪽의 <String>은 생략가능
    l3.add(1);          //에러. 숫자형은 불가.
    l3.add("World");

    HashMap<String, Integer> map2 = new HashMap<>();
    map.put(123, "id");        //에러.
    map.put("apple", 10000);   //OK.
