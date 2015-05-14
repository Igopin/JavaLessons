package lesson150430.enums;

public class UseEnums {

    public static void main(String[] args) {
        
        Apple ap = Apple.valueOf(args[0]);
        
        System.out.println(ap.ordinal());
        
        for (Apple kind : Apple.values()) {
            System.out.println(kind + " price is " + kind.getPrice());
        }
        
        if (ap == Apple.RedDel) {
            
        }
        
        if (ap.name().equals("RedDel")) {
            
        }
        
        if (Apple.RedDel.name().equals(args[1])) {
            
        }
        
//        switch (ap) {
//        case Jonathan:
//            break;
//        case GoldenDel:
//            break;
//        case RedDel:
//            break;
//        case Winesap:
//            break;
//        }
    }
}
