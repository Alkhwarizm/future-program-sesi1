public class Faktorial {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(recursiveFactorial(n));
    System.out.println(tailRecursiveFactorial(n, 1));
  }

  static int recursiveFactorial(int n) {
    if(n==0 || n==1) {
      return 1;
    } else {
      return recursiveFactorial(n-1) * n;
    }
  }

  static int tailRecursiveFactorial(int n, int result) {
    if(n==0 || n==1) {
      return result;
    } else {
      return tailRecursiveFactorial(n-1, result * n);
    }
  }
}
