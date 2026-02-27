import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputDocument {
    int[] num = new int[6710];
    int totalVerbCount;

    public InputDocument( String inputFile ) throws FileNotFoundException{
        File file = new File(inputFile);
        Scanner scan = new Scanner(file);
        while( scan.hasNext()){
            String line = scan.nextLine();
            StringTokenizer tokenzier = new StringTokenizer( line," \n.,;?!()[]{}'\"“”" );
            while(tokenzier.hasMoreTokens()){

                String word = tokenzier.nextToken();

                VerbDictionary verbD = new VerbDictionary();
                if( verbD.findVerbIndex(word) != -1 ){
                    num[verbD.findVerbIndex(word)]++;
                }
            }
        }
        scan.close();
        totalVerbCount = 0;
        for( int i = 0; i < 6710; i++ ){
            totalVerbCount += num[i];
        }
    }

    public void printTop5(){
        int max = 0;
        int secondMax = 0;
        int thirdMax = 0;
        int fourthMax = 0;
        int fifthMax = 0;
        
        for(int i = 0; i < num.length; i++ ){

            if( num[i] > max ){
                max = num[i];
            }
            else if ( num[i] > secondMax ){
                secondMax = num[i];
            }
            else if( num[i] > thirdMax ){
                thirdMax = num[i];
            }
            else if( num[i] > fourthMax ){
                fourthMax = num[i];
                
            }
            else if( num[i] > fifthMax ){
                fifthMax = num[i];                
            }
        }

        VerbDictionary verbD = new VerbDictionary();
        System.out.println( verbD.verbList.get(max).baseForm + max );

    }

    public double getFrequency(int verbIndex){

        double[] frequencies = new double[6710];
        for( int i = 0; i < num.length; i++ ){
            frequencies[i] = num[i]/totalVerbCount;
        }
        return frequencies[verbIndex];
    }

    public void calculateAllFrequencies(){

        double[] frequencies = new double[6710];
        for( int i = 0; i < num.length; i++ ){
            frequencies[i] = num[i]/totalVerbCount;
        }
    }

    public double calculateDissimilarity(InputDocument other){

        int dissimilarity = 0;

        for( int i = 0; i < 6710; i++ ){

            dissimilarity += Math.abs(getFrequency(i) - other.getFrequency(i));
        }
        return dissimilarity;
    }

    
}
