package access.ex;

public class MaxCounter {
    /**
     * 최대 카운터와 캡슐화
     *   최대값을 지정, 최대값 까지만 값이 증가
     *   접근 제어자를 사용해서 데이터를 캡슐화
     */

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    // 증가
    public void increment() {
        // 검증 로직
        if (max <= count) {
            System.out.println("초과");
            return;
        }
        //실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }


}

