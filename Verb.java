
public class Verb {
    String[] words = new String[5];
    String baseForm;
  
    public Verb( String first, String second, String third, String fourth, String fifth){

        this.baseForm = first;
        words[0]= first;
        words[1] = second;
        words[2]= third;
        words[3] = fourth;
        words[4] = fifth;
    }

    public boolean check( String word ){
        
        for (int i = 0; i<5; i++ ){
            if( word.equals(words[i])){
                return true;
            }        
        }
        return false;
    }
}
