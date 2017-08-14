public class Sigma {

  public static void main(String[] args) {
    int sum = 0;
    for (int i=0; i<args.length; i++) {
      int angka = Integer.parseInt(args[i]);
      sum = sum + angka;
    }
    System.out.println(sum);
  }
}
