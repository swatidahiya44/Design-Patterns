package FactoryPattern.OS.implementations;

import FactoryPattern.OS.OperatingSystem;

public class ios implements OperatingSystem{

    @Override
    public void specs() {
     System.out.println("ios specs: 64-bit, ARM-based");
    }

    
}
