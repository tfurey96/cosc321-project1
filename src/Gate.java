public class Gate {
    /**
     * Gate object that simulates a nor gate
     * takes two binary input values and uses nor logic gate to create an output
     */
    int input1=-1;
    int input2=-1;

    int output;

    public int getOutput() {
        return output;
    }

    public void setOutput() {
        if (input1==0&& input2==0){
            output=1;
        }
        else output=2;

    }

    public int getInput1() {
        return input1;
    }

    /***
     * sets value of input1
     * if input 2 is already set then it runs the logic gate and sets the output
     * @param input1 value to be set as input1
     */
    public void setInput1(int input1) {
        this.input1 = input1;
        if (input2!=-1){
            setOutput();
        }
    }

    public int getInput2() {
        return input2;
    }

    /***
     * sets value of input2
     * if input 1 is already set then it runs the logic gate and sets the output
     * @param input2 value to be set as input2
     */
    public void setInput2(int input2) {
        this.input2 = input2;
        if (input1 != -1) setOutput();
    }


}
