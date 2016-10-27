package algorithm;

public abstract class Algorithm {

    public void execute() {
        int result = stage1();
        stage2(result);
    }

    protected abstract int stage1();

    private void stage2(int value) {
        System.out.println("Final value is " + value);
    }


}
