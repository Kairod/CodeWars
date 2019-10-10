package BuildPileOfCubes;

public class BuildPileOfCubes {
    public static long findNb(long m){
        long sum = 0;
        int n = 0;
        while(sum < m){
            n++;
            sum += Math.pow(n, 3.);
        }
        return (sum == m)? n : -1;
    }

    public static long findM(long n){
        long sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += Math.pow(i, 3.);
        }
        return sum;
    }
}
