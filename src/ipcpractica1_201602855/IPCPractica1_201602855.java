/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcpractica1_201602855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IPCPractica1_201602855 {

    
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    String txt = "";

    public void Borde() {

        System.out.println("Introdusca su nombre");
        try {
            txt = buffer.readLine();

        } catch (IOException e) {
        };

        Scanner Dimencion = new Scanner(System.in);
        int N1, N2, Tam, c;

        System.out.println("Ingrece las dimenciones de su tablero");

        N1 = Dimencion.nextInt();
        N2 = Dimencion.nextInt();

        int Snake[][] = new int[N1][N2];
        System.out.println("Introdusca el tamaño de su Snake");
        Tam = Dimencion.nextInt();
        Scanner let = new Scanner(System.in);
        String Letra;
        int b;

        while (true) {

            System.out.println("");

            System.out.println("_________________________________________________________________________________________");

            System.out.println("                                Gamer: " + txt);

            System.out.println("_________________________________________________________________________________________");

            //**********************************************************************************************************
            //**********************************************************************************************************
            int fila = (int) (Math.random() * (N1));
            int columna = (int) (Math.random() * (N2));

            int Imp[][] = new int[N1][N2];

            for (int i = 1; i < N1; i++) {
                for (int j = 1; j < N1; j++) {

                }

            }

            b = 5;
            for (int i = 0; i < Tam; i++) {
                Imp[4][b] = 8;
                b++;
            }

            int Frut[][] = new int[N1][N2];

            for (int i = 1; i < N1; i++) {
                for (int j = 1; j < N1; j++) {

                    Frut[fila][columna] = 9;

                }

            }

            Imp[fila][columna] = Frut[fila][columna];

            //****************************************************************************************************************
            int k = b;
            int z = 4;
            System.out.println("");
            System.out.println("");
            System.out.println("");

            while (true) {

                Letra = let.nextLine();

                if (Letra.equalsIgnoreCase("d")) {
                    k++;

                    c = 8;

                    if (Imp[z][k] != 8) {
                        Imp[z][k - 1] = 0;
                        Imp[z][k] = c;
                    } else {
                        System.out.println("Game Over");
                        break;
                    }

                } else if (Letra.equalsIgnoreCase("s")) {
                    z++;
                    c = 8;

                    if (Imp[z][k] != 8) {
                        Imp[z - 1][k] = 0;
                        Imp[z][k] = c;

                    } else {
                        System.out.println("Game over");
                        break;
                    }

                } else if (Letra.equalsIgnoreCase("a")) {
                    k--;
                    c = 8;
                    if (Imp[z][k] != 8) {
                        Imp[z][k + 1] = 0;
                        Imp[z][k] = c;
                    } else {
                        System.out.println("Game Over");
                        break;
                    }

                } else if (Letra.equalsIgnoreCase("w")) {
                    z--;

                    c = 8;
                    if (Imp[z][k] != 8) {
                        Imp[z + 1][k] = 0;
                        Imp[z][k] = c;
                    } else {
                        System.out.println("Game Over");
                        break;
                    }

                }
                
                
                if (Imp[z][k]==9) {


                    Frut[fila][columna] = 9;

                }
                
                

                for (int i = 0; i < N1; i++) {
                    for (int j = 0; j < N2; j++) {

                        if (i == 0 || i == (N1 - 1)) {
                            System.out.print("" + "*" + " ");

                        } else if (j == 0 || j == (N2 - 1)) {
                            System.out.print("" + "*" + " ");

                        } else if (Imp[i][j] != 0) {
                            System.out.print("" + Imp[i][j] + " ");

                        } else {
                            System.out.print("" + " " + " ");
                        }

                    }
                    System.out.println(" ");
                }
                System.out.println(" ");

            }
            
            

            //*******************************************************************************************************************
        }//fin del whilw

        //*********
    }

    public void Bitacora() {
        System.out.println("______________________________________________________________________________________________");

        System.out.println("                                                BITACORA ");

        System.out.println("");

        System.out.println("");
    }

    public static void main(String[] args) {
 
        IPCPractica1_201602855 Bordes = new IPCPractica1_201602855();
        Bordes.Borde();

        IPCPractica1_201602855 Bit = new IPCPractica1_201602855();
        Bit.Bitacora();

    }
    
}
