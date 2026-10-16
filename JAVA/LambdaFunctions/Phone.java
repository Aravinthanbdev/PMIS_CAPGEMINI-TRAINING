package JAVA.LambdaFunctions;

public class Phone {
  public static void main(String[] args) {
    java.util.function.Consumer<String> SmsNoti = phoneno -> System.out.println("Sending SMS notification to: " + phoneno);
    SmsNoti.accept("+91 1234567890");
  }  
}
