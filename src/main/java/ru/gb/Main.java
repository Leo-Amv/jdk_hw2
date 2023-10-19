package ru.gb;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new BackendDev();
        Developer dev2 = new FrontendDev();
        if (dev1 instanceof BackendDev){
            ((BackendDev) dev1).developAPI();
        }
        if (dev2 instanceof FrontendDev){
            ((FrontendDev) dev2).developGUI();
        }

    }
}