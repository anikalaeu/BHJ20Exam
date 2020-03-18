package by.belhard.j20.exam.manager.services;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufRdr{


    {

        try (BufferedReader rdr = new BufferedReader( new InputStreamReader( System.in ) )) {


            String inputString = "";

            while (!inputString.equals("exit"))
                inputString = rdr.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals( obj );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
