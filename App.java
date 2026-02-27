import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        
        VerbDictionary verbD = new VerbDictionary();
        verbD.processDictionary("verbs-dictionaries.txt");
        System.out.println("Index of \"abandon\" is " + verbD.findVerbIndex("abandon") + ".");
        System.out.println("Index of \"abandoned\" is " + verbD.findVerbIndex("abandoned") + ".");
        System.out.println("Index of \"enjoying\" is " + verbD.findVerbIndex("enjoying") + ".");
        System.out.println("Index of \"notverb\" is " + verbD.findVerbIndex("notverb") + ".");
        
        InputDocument zero = new InputDocument("0.txt");
        InputDocument one = new InputDocument("1.txt");
        InputDocument two = new InputDocument("2.txt");
        InputDocument three = new InputDocument("3.txt");
        InputDocument four = new InputDocument("4.txt");
        InputDocument five = new InputDocument("5.txt");
        InputDocument six = new InputDocument("6.txt");
        InputDocument seven = new InputDocument("7.txt");
        InputDocument eigth = new InputDocument("8.txt");
        InputDocument nine = new InputDocument("9.txt");
        

        System.out.println("Index of \"abandon\" is " + verbD.findVerbIndex("abandon") + ".");
        System.out.println("Index of \"abandoned\" is " + verbD.findVerbIndex("abandoned") + ".");
        System.out.println("Index of \"enjoying\" is " + verbD.findVerbIndex("enjoying") + ".");
        System.out.println("Index of \"notverb\" is " + verbD.findVerbIndex("notverb") + ".");

        System.out.println("Top 5 verbs in each document:");
        zero.printTop5();
        one.printTop5();
        two.printTop5();
        three.printTop5();
        four.printTop5();
        five.printTop5();
        six.printTop5();
        seven.printTop5();
        eigth.printTop5();
        nine.printTop5();
        

        System.out.println("Dissimilarity matrix:");
        System.out.print("N        0        1        2        3        4        5        6        7        8        9");
    }
    
}
