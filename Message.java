public class Message {
    private String greeting;
    private int areaCode;

    public void setGreeting(String inputGreeting) {
        greeting = "Please leave a message for " + inputGreeting;
    }

    public void setAreaCode(int inputAreaCode) {
        areaCode = inputAreaCode;
    }

    /* Your code goes here */

    public String getGreeting(){
        return greeting;
    }

    public int getAreaCode(){
        return areaCode;
    }

}
