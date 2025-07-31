package org.example;

//Local Variables:
//localDecimal = 100
//localHex = 255
//localBinary = 13
//localOctal = 12
//localLong = 10000000
//localString = Every step I take gets me closer to my goal.
//
//Instance Variables:
//instanceBinary = 45
//instanceOctal = 58
//instanceDouble = 1234.95
//
//Static Variable:
//staticHex = 6699
//staticByte = 1
//statingString = Progress, not perfection.

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.outputLocalVars();

        InstanceVarDemo varDemoOne = new InstanceVarDemo();
        InstanceVarDemo varDemoTwo = new InstanceVarDemo();

        varDemoOne.instanceBinary = 0b101101;
        varDemoTwo.instanceDouble = 1234.95;
        varDemoOne.instanceOctal = 0_72;
        System.out.println("\nInstance Variables:\ninstanceBinary = "+varDemoOne.instanceBinary);
        System.out.println("instanceOctal = "+varDemoOne.instanceOctal);
        System.out.println("instanceDouble = "+varDemoTwo.instanceDouble);

       StaticVarDemo.staticHex =  0x92D;
       StaticVarDemo.staticByte = 1;
       StaticVarDemo.staticString = "Progress, not perfection.";
        System.out.println("\nStatic Variables:\nstaticHex = "+StaticVarDemo.staticHex);
        System.out.println("staticByte = "+StaticVarDemo.staticByte);
        System.out.println("staticString = "+StaticVarDemo.staticString);


    }

    void outputLocalVars(){
        int localDecimal = 100;
        System.out.println("\nLocal Variables:\nlocalDecimal = "+localDecimal);
        int localHex = 0xFF;
        System.out.println("localHex = "+localHex);
        int localBinary = 0b1101;
        System.out.println("localBinary = "+localBinary);
        int localOctal = 0_14;
        System.out.println("localOctal = "+localOctal);
        long localLong = 10_000_000L;
        System.out.println("localLong = "+localLong);
        String localString = "Every step I take gets me closer to my goal.";
        System.out.println("localString = "+localString);
    }
}