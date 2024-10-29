public class loop {
    public String sound(int eNumber){
        switch (eNumber) {
            case 1:
                return "this is the day";
            case 2:
                return "this is the night";
        }
        return null;

    }
    public static void main(String[] args){
        for(int i= 0; i < 5; ++i){
            System.out.println("Hello from oasis");
        }
    }
}