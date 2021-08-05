public class Demo递归 {
    public static void main(String[] args) {
        int sum = sum(50);
        System.out.println(sum);
    }
    public static int sum(int n ){
      if(n==1) {
          return 1;
      }
      return n + sum(n-1);
    }
}
