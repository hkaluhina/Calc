package calc;

public class benchmark {
    public void somePublicMethod() {
        long startTime = System.currentTimeMillis();
        calc();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
