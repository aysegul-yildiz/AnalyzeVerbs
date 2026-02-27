import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VerbDictionary {
    ArrayList<Verb> verbList = new ArrayList<>();
    
    public void processDictionary(String fileName) throws FileNotFoundException{

        try{ 
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            for( int i = 1; i <= 6710; i++){
                String line = scan.nextLine();
                ArrayList<String> verbs = new ArrayList<>();
                StringTokenizer tokenzier = new StringTokenizer( line );
                while (tokenzier.hasMoreTokens()) {
            
                    verbs.add(tokenzier.nextToken());
                }
                Verb verb = new Verb(verbs.get(0), verbs.get(1), verbs.get(2),verbs.get(3), verbs.get(4));
                this.verbList.add(verb);
            }
            scan.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int findVerbIndex(String word) {

        for(int i = 0; i < 6710; i++ ){
            if(verbList.get(i).check(word)){
                return i;
            } 
        }
        return -1;

    }
}
