/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung4;

import java.util.ArrayList;

/**
 *
 * @author lreisinger18
 */
public class Main {
    public static void main(String[] args) {
        DividerCheck dc = new DividerCheck();
        ArrayList <Integer> numbers = dc.readFile("numbers.csv");
        System.out.println("Test: ");
    }
}