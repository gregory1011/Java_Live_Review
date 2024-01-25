package week04;

public class SmsPart {
    public static void main(String[] args) {

      String msg = "Sender: <Omar Karahan>. From number: [202-123-3456]" +
              "Message: {I love programming and problem solving}"  ;

      int senderStart = msg.indexOf("<") + 1;
      int senderEnd = msg.indexOf(">");

      int numberStart = msg.indexOf("[");
      int numberEnd = msg.indexOf("]");

        System.out.println("Sender: "+ msg.substring(senderStart, senderEnd));
        System.out.println("Number: "+ msg.substring(numberStart + 1, numberEnd));

        System.out.println("Message: "+ msg.substring(msg.indexOf("{") + 1, msg.indexOf("}")));

    }
}
