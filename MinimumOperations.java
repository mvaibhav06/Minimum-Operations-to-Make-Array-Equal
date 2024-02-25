public class MinimumOperations {
    public static int minOperations(int n){
        int out = 0;
        for (int i=1; i<n; i=i+2){
            out += n-i;
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(minOperations(6));
    }
}
