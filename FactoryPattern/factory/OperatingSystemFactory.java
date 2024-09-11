package FactoryPattern.factory;

import FactoryPattern.OS.OperatingSystem;
import FactoryPattern.OS.implementations.android;
import FactoryPattern.OS.implementations.ios;

public class OperatingSystemFactory {
    public OperatingSystem getOS(String str){
        if(str.equals("android")){
            return new android();
        }
        else{
            return new ios();
        }
    }

}
