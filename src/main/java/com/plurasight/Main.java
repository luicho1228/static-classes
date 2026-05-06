package com.plurasight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(NameFormatter.format("Luis","Vasquez"));
        System.out.println(NameFormatter.format("Mr.","Luis","Orlando","Vasquez","Student"));
        System.out.println(NameFormatter.format("Mr. Luis Orlando Vasquez, Engineer"));
        System.out.println(NameFormatter.format("Luis Vasquez"));
    }
}