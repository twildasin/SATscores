package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        // write your code here
        Scanner scores= new Scanner (new File("scores.txt"));
        Scanner sf;

        String lines[] = new String [100000];



        int MaxIndx = -1;
        scores.nextLine();
        scores.useDelimiter("\\t");

        while(scores.hasNext())
        {
            MaxIndx++;
            lines[MaxIndx] = scores.nextLine();
        }

        String names[] = new String[MaxIndx + 1];
        int satMath [] = new int [MaxIndx + 1];
        int satRead [] = new int [MaxIndx + 1];
        int satWrit [] = new int [MaxIndx + 1];


        for(int i = 0; i<=MaxIndx; i++)
        {
            sf = new Scanner(lines[i]);
            sf.useDelimiter("\\t");

            if(sf.hasNext())
                sf.next();

            if(sf.hasNext())
                names[i] = sf.next();

            for(int j = 0; j < 16; j++)
            {
                if(sf.hasNext())
                    sf.next();
            }
                try
                {
                    if(sf.hasNext())
                        satMath[i] = Integer.parseInt(sf.next());
                }
                catch (NumberFormatException e)
                {
                    if(sf.hasNext())
                        sf.next();
                }
                try
                {
                    if(sf.hasNext())
                        satRead[i] = Integer.parseInt(sf.next());
                }
                catch (NumberFormatException e)
                {
                    if(sf.hasNext())
                        sf.next();
                }
                try
                {
                    if(sf.hasNext())
                        satWrit[i] = Integer.parseInt(sf.next());
                }
                catch (NumberFormatException e)
                {
                    if(sf.hasNext())
                        sf.next();
                }

        }


 /*       for(int a: satWrit)
        {
            System.out.println(a);
        }*/

        for(int i = 0; i <= MaxIndx; i++)
        {
            System.out.println("\nSCHOOL: " + names[i] + "\nAVERAGE SAT SCORES:\tMATH-" + satMath[i] + "\tREADING-" + satRead[i] + "\tWRITING-" + satWrit[i]);
        }
        //System.out.println("\033[1mBold\033[0m" + " not Bold");


    }
}