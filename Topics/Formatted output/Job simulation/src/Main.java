public class Main {
    public static void main(String[] args) {        
        String name = "Lazy";
        String status = "detected";
        int errorCode = 2;

        //Fix code below
        String formattedMessage = String.format("Result of work - %s employee %s! Error code: %d", name, status, errorCode);
        System.out.println(formattedMessage);
    }
}