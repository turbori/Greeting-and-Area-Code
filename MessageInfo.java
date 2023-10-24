import java.util.Scanner;


/*Define the Message class's getGreeting() accessor that gets
field greeting and the getAreaCode() accessor that gets field areaCode.

Ex: If the input is Mia 443, then the output is:

Message: Please leave a message for Mia
Area Code: 443

 */

public class MessageInfo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Message voicemail = new Message();
        String inputGreeting;
        int inputAreaCode;

        inputGreeting = scnr.next();
        inputAreaCode = scnr.nextInt();
        voicemail.setGreeting(inputGreeting);
        voicemail.setAreaCode(inputAreaCode);

        System.out.println("Message: " + voicemail.getGreeting());
        System.out.println("Area Code: " + voicemail.getAreaCode());
    }
}