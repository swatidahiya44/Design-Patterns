package FactoryPattern;

import FactoryPattern.OS.OperatingSystem;
import FactoryPattern.factory.OperatingSystemFactory;

public class Main{
    public static void main(String[] args) {
        OperatingSystemFactory obj = new OperatingSystemFactory();
        OperatingSystem myOS = obj.getOS("ios");
        myOS.specs();
    }
}