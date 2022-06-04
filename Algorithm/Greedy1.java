// Activity Selection Problem
//N 개의 활동과 각 활동의 시작/종료 시간이 주어졌을 때,
//한 사람이 최대한 많이 할 수 있는 활동을 구하시오

import java.util.ArrayList;
import java.util.Collections;

class Activity {   //활동에 대한 정보들을 담기 위한 클래스
    String name;
    int start;
    int end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}

public class Greedy1 {
    public static void selectActivity(ArrayList<Activity> list) {
        Collections.sort(list, (x1, x2) -> x1.end - x2.end);
        ArrayList<Activity> result = new ArrayList<>();

        int curTime = 0;
        for (Activity item: list) {
            if (curTime <= item.start) {
                curTime = item.end;
                result.add(item);
            }
        }

        for (Activity item: result) {
            System.out.print(item.name + " ");
        }
    }

    public static void main(String[] args) {
        // Test code
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("A", 1, 5));
        list.add(new Activity("B", 4, 5));
        list.add(new Activity("C", 2, 3));
        list.add(new Activity("D", 4, 7));
        list.add(new Activity("E", 6, 10));
        selectActivity(list);
    }
}
