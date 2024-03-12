public class Gate {
    /**
     * Gate object that simulates a nor gate
     * takes two binary input values and uses nor logic gate to create an output
     */
    Gate input1;
    Gate input2;

    int value;


    public void setOutput() {
        if (input1.value == 0 && input2.value == 0) {
            value = 1;
        } else value = 0;

    }


    /***
     * sets value of input1
     * if input 2 is already set then it runs the logic gate and sets the output
     * @param input1 value to be set as input1
     */
    public void setInput1(Gate input1) {
        this.input1 = input1;

    }


    /***
     * sets value of input2
     * if input 1 is already set then it runs the logic gate and sets the output
     * @param input2 value to be set as input2
     */
    public void setInput2(Gate input2) {
        this.input2 = input2;

    }


}
