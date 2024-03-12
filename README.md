# Project 1

Simulating a Combinational Logic Circuit


## Authors

- [Tasha Furey](https://github.com/tfurey96)


## Documentation

Input file format
``` 
    A   
    I O
    I O...
```
```
I = input of a wire (can be an input or an output of a gate)
    If an input format as I input number
    if input is gate output format as G gatenumber 
O = output of wire (can be an output of a gate or the output)
```

Gate numbering is

```
1  2  3  4
5  6  7  8
9 10 11 12
 
```
Example Input file
```
    2 
    I 0 G 1
    I 1 G 2
    G 0  O1
```
This creates 3 wires:
One from input 0 to gate 0 input 1
one from input 1 to gate 0 input 2
One from gate 0 output to output 1



## Run Locally

Clone the project

```bash
  git clone https://github.com/tfurey96/cosc321-project1
```
```Open
  Open in your choice of java ide and Run
```
