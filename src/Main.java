import java.util.*;
import java.io.*;

public class Main {
    public static int numOfInputs = 0;
    public static int numOfGateCol = 4;
    public static int numOfgateRow = 3;
    public static Gate[][] gateArray;
    public static Gate[] inputs;

    public static void main(String[] args) {
        File input = new File("input.txt");
        ArrayList<String> wireList = readFile(input);
        inputs = new Gate[numOfInputs];
        gateArray = new Gate[numOfGateCol][numOfgateRow];
    }

    /**
     * Function that sets the num of inputs and the size of the gate array
     * and returns a list of wires
     *
     * @param input the input file
     * @return
     */
    public static ArrayList<String> readFile(File input) {
        try {

            Scanner fileReader = new Scanner(input);
            numOfInputs = fileReader.nextInt();

            ArrayList<String> wireList = new ArrayList<>();

            while (fileReader.hasNextLine()) {
                wireList.add(fileReader.nextLine());
            }
            return wireList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return new ArrayList<>();
        }
    }

    public int gateNumtoCol(int num) {
        return num % numOfGateCol;
    }

    public int gateNumtoRow(int num) {
        return num / numOfGateCol;
    }

    public void wire(String input) {
        Gate wireIn;
        Gate wireOut;
        int gateNum;
        String[] inputSplit = input.split(" ");

        if (inputSplit[0].equalsIgnoreCase("i")) {
            wireIn = inputs[Integer.parseInt(inputSplit[1])];
        }
        else {
             gateNum= Integer.parseInt(inputSplit[1]);
             wireIn= gateArray[gateNumtoCol(gateNum)][gateNumtoRow(gateNum)];
        }
        if (inputSplit[2].equalsIgnoreCase("G")) {
             gateNum = Integer.parseInt(inputSplit[3]);
             wireOut = gateArray[gateNumtoCol(gateNum)][gateNumtoRow(gateNum)];
            if (wireOut.input1 == null) {
                wireOut.setInput1(wireIn);
            } else if (wireOut.input2 == null) {
                wireOut.setInput2(wireIn);

            } else throw new RuntimeException("invalid input. Gate can only have two inputs");


        }
        else {}
    }
}