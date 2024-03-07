import java.util.*;
import java.io.*;
public class Main {
    public static int numOfInputs=0;
    public static int numOfGateCol=0;
    public static int numOfgateRow=0;

    public static void main(String[] args) {
        File input = new File("input.txt");
        ArrayList<String> wireList= readFile(input);


    }

    /**
     * Function that sets the num of inputs and the size of the gate array
     * and returns a list of wires
     * @param input the input file
     * @return
     */
    public static ArrayList<String> readFile(File input){
        try {

            Scanner fileReader = new Scanner(input);
            numOfInputs=fileReader.nextInt();
            numOfGateCol=fileReader.nextInt();
            numOfgateRow=fileReader.nextInt();

            ArrayList<String> wireList= new ArrayList<>();

            while (fileReader.hasNextLine()){
                wireList.add(fileReader.nextLine());
            }
            return wireList;
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}