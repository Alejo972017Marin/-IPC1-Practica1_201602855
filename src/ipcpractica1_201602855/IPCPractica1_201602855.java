package ipcpractica1_201602855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IPCPractica1_201602855 {

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    String txt = "";
    int N1, N2, Tam, c,cont,punt;
    int Imp[][];
    int cordenada[][]=new int[100][2];
    int Frut[][];
    int fila, columna;
    
    //*******************************************
        public  void MenuInicio(){
       System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
       System.out.println("&&      z     ZZZZZ   ZZZZZZ      Z     ZZZZZZ     ZZZZZZZZ    %%");
       System.out.println("&&     Z Z    ZZ   Z  Z          Z Z    Z      Z   ZZ          %%");
       System.out.println("&&    Z   Z   ZZZZZ   Z         Z   Z   Z       Z  ZZZZZ       %%");
       System.out.println("&&   ZZZZZZZ  ZZ  ZZ  Z        ZZZZZZZ  Z      Z   ZZ          %%");
       System.out.println("&&  Z       Z ZZ   ZZ ZZZZZZZ Z       Z ZZZZZZ     ZZZZZZZZ    %%");
       System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("@@     1) iniciar el juego                                     @@");
       System.out.println("@@     2) Punteos                                              @@");
       System.out.println("@@     3) Creditos                                             @@");
       System.out.println("@@     4) Salir                                                @@");
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("@@     Marque el digito de su eleccion:                        @@");
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       Scanner entrada = new Scanner(System.in);
       int menu =0;
       menu = entrada.nextInt();
       switch(menu){
           case 1:
               Borde();
               break;
           case 2:
               
           case 3:
               
               break;
           case 4:
               System.out.println("salir");
       }
        
    }
    
    
    
    
    //*******************************************
    
    
    
    
    
    

    public  void Borde() {

        System.out.println("Introdusca su nombre");
        try {
            txt = buffer.readLine();

        } catch (IOException e) {
        };
        Scanner Dimencion = new Scanner(System.in);

        System.out.println("Ingrece las dimenciones de su tablero");

        N1 = Dimencion.nextInt();
        N2 = Dimencion.nextInt();

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
            Imp = new int[N1][N2];
            for (int i = 1; i < N1; i++) {
                for (int j = 1; j < N1; j++) {

                }

            }

            b = 5;
            for (int i = 0; i < Tam; i++) {
                Imp[4][b] = 8;
                b++;
            }
            this.ActualizarTabla(); //fruto

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
                    this.comparar(Imp, z, k);
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
                    this.comparar(Imp, z, k);
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
                    this.comparar(Imp, z, k);
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
                    this.comparar(Imp, z, k);
                    c = 8;
                    if (Imp[z][k] != 8) {
                        Imp[z + 1][k] = 0;
                        Imp[z][k] = c;
                    } else {
                        System.out.println("Game Over");
                        break;
                    }

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

        IPCPractica1_201602855 Menu = new IPCPractica1_201602855();
        Menu.MenuInicio();

        IPCPractica1_201602855 Bit = new IPCPractica1_201602855();
        Bit.Bitacora();

    }

    public void ActualizarTabla() {
        fila = (int) (Math.random() * (N1));
        columna = (int) (Math.random() * (N2));
        Frut = new int[N1][N2];
        Frut[fila][columna] = 9;
        Imp[fila][columna] = Frut[fila][columna];
    }
    //agregado

    
    public void comparar(int Imp[][], int z, int k){
        if(Frut[fila][columna]==Imp[z][k]){
            this.ActualizarTabla();
        }
    }

}
