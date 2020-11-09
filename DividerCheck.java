/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lreisinger18
 */
public class DividerCheck {

    public ArrayList<Integer> readFile(String fileName)
    {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            ArrayList <Integer> numbers = new ArrayList<>();
            while((line = br.readLine())!= null)
            {
                String [] splittedLine = line.split(":");

                for(int i = 0; i < splittedLine.length; i++)
                {
                    try {
                        Integer number = Integer.parseInt(splittedLine[i]);
                        numbers.add(number);
                    }
                    catch(NumberFormatException ex)
                    {
                        continue;
                    }
                }

            }
            return numbers;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DividerCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DividerCheck.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DividerCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}