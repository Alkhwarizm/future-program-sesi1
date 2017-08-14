public class BubbleSort {

  public static void main(String[] args) {
    int[] numbers = new int[args.length];

    for(int i=0; i<args.length; i++){
      numbers[i] = Integer.parseInt(args[i]);
    }
    for(int i=0; i<numbers.length; i++) {
      for(int j=i+1; j<numbers.length; j++) {
        if(numbers[j]<numbers[i]) {
          int temp = numbers[j];
          numbers[j] = numbers[i];
          numbers[i] = temp;
        }
      }
    }

    String numbersText = "";
    for(int i=0; i<numbers.length; i++) {
      numbersText += Integer.toString(numbers[i]);
    }
    System.out.println(numbersText);
  }
}
