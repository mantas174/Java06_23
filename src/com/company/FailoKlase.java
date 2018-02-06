package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class FailoKlase {

    private String _failoVardas = "duomenys.txt";
    private FileReader _in;
    private BufferedReader _bufferis;


    public void failoAtidarymas(){
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        }catch(Exception e){ }

    }
    public void skaitymasIsFailo(){
        failoAtidarymas();

        try {
            String eilute;
            do {
                eilute = _bufferis.readLine();
                if(eilute != null) {
                    System.out.println(eilute);
                }

            }while (eilute != null);

            _in.close();
            _bufferis.close();
        }catch(Exception e){
            System.out.println("skaitymo klaida");
        }
    }
}
