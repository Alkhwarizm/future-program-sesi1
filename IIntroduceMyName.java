public class IIntroduceMyName {

  public static void main (String[] args) {
    System.out.print("My name is");
    String myName = "";
    for(int i=0;i<args.length;i++) {
      myName = myName + " " + args[i];
    }
    System.out.println(myName);
  }
}
