package quiz.access;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대값입니다");
        }
    }
    public int getCount() {
        return count;
    }
    
}
