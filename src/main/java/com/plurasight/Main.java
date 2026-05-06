package com.plurasight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nameFormatter = NameFormatter.format("Luis","Vasquez");
        nameFormatter = NameFormatter.format("Mr. Luis Orlando Vasquez, Engineer");
        System.out.print(nameFormatter);
    }
}