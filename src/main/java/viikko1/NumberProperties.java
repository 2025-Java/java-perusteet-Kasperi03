package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        // TODO
        if(n > 0){
            if(n % 2 == 0){
                return "positiivinen parillinen";
            }
            else{
                return "positiivinen pariton";
            }
        }
        if(n < 0){
            if(n % 2 == 0){
                return "negatiivinen parillinen";
            }
            else{
                return "negatiivinen pariton";
            }
        }
        else{
            return "nolla";
        }
    }
}
