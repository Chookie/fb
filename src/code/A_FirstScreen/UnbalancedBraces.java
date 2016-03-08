package A_FirstScreen;

public class UnbalancedBraces {
    public static String balance(String input){
    	int count = 0;
       	String forward = "";
       	for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
       		if( ch == ')' ) {
       			if( count > 0 ){
       				count--;
       				forward = forward + ch;
       			}
       		} else {
       			if( ch == '(' ) {
       				count++;
       			}
       			forward = forward + ch;
       		}
       	}

       	count = 0;
       	String reverse = "";
       	for(int i=forward.length()-1; i>=0; i--) {
       		char ch = forward.charAt(i);
       		if( ch == '(' ) {
       			if(count > 0) {
       				count--;
       				reverse = ch + reverse;
       			}
       		} else {
       			if( ch==')' ) {
       				count++;
       			}
       			reverse=ch + reverse;
       		} 
       	}
       	
       	return reverse;
    }
}
