package lesson150305;

import java.util.*;

public class goodStrings {
    public static int goodStringIn( String str ) {
        
        int deletions = 0;
        char prev_char = 0;
        
        for (char c: str.toCharArray()) {
            if (c == prev_char) {
	            deletions++;
            }
            prev_char = c;
        }
        
        return deletions;
    }
    public static void main(String[] args) {
        
    	//Scanner in = new Scanner(System.in);
        int res;
        int num_of_strings;
        num_of_strings = 1;//in.nextInt();
        
        for (int i = 0 ; i < num_of_strings; i++){
           String str = "ABAABA";
           //str = in.nextLine();
           System.out.println(goodStringIn(str));    
        }
               
    }

}
