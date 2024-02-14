public class Gate {
    int input1;
    int input2;

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

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }


}
