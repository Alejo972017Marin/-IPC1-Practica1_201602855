package ipcpractica1_201602855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IPCPractica1_201602855 {

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    String txt = "";
    int N1, N2, Tam, c, cont, punt, tot,puntfrut;
    int Imp[][];
    int cordenada[][] = new int[100][2];
    int Frut[][];
    int fila, columna;

    //*******************************************
    public void MenuInicio() {
        System.out.println("\033[34m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[34m&&      Z     ZZZZZ   ZZZZZZ      Z     ZZZZZZ     ZZZZZZZZ    %%");
        System.out.println("\033[34m&&     Z Z    ZZ   Z  Z          Z Z    Z      Z   ZZ          %%");
        System.out.println("\033[34m&&    Z   Z   ZZZZZ   Z         Z   Z   Z       Z  ZZZZZ       %%");
        System.out.println("\033[34m&&   ZZZZZZZ  ZZ  ZZ  Z        ZZZZZZZ  Z      Z   ZZ          %%");
        System.out.println("\033[34m&&  Z       Z ZZ   ZZ ZZZZZZZ Z       Z ZZZZZZ     ZZZZZZZZ    %%");
        System.out.println("\033[34m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[34m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\033[34m@@     1) iniciar partida                                      @@");
        System.out.println("\033[34m@@     2) Jugador                                              @@");
        System.out.println("\033[34m@@     3) Historial                                            @@");
        System.out.println("\033[34m@@     4) Salir                                                @@");
        System.out.println("\033[34m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\033[34m@@     Marque el digito de su eleccion:                        @@");
        System.out.println("\033[34m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Scanner entrada = new Scanner(System.in);
        int menu = 0;
        menu = entrada.nextInt();
        switch (menu) {
            case 1:
                Borde();
                break;
            case 2:
                Datos();
                break;
            case 3:
               
                break;
            case 4:
                Fin();
                System.exit(0);
               
                
        }

    }

    public void Gameover() {

        System.out.println("\033[31m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[31m&& ZZZZZZZ     Z     ZZ     ZZ ZZZZZZZZ    %%");
        System.out.println("\033[31m&& Z          Z Z    ZZ Z Z ZZ ZZ          %%");
        System.out.println("\033[31m&& Z  ZZZZ   Z   Z   ZZ  Z  ZZ ZZZZZ       %%");
        System.out.println("\033[31m&& Z     Z  ZZZZZZZ  ZZ     ZZ ZZ          %%");
        System.out.println("\033[31m&& ZZZZZZZ Z       Z ZZ     ZZ ZZZZZZZZ    %%");
        System.out.println("\033[31m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[31m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[31m&&   ZZZZZZZ Z       Z ZZZZZZZZ ZZZZZ      %%");
        System.out.println("\033[31m&&   Z     Z  Z     Z  ZZ       ZZ   Z     %%");
        System.out.println("\033[31m&&   Z     Z   Z   Z   ZZZZZZ   ZZZZZ      %%");
        System.out.println("\033[31m&&   Z     Z    Z Z    ZZ       ZZ  ZZ     %%");
        System.out.println("\033[31m&&   ZZZZZZZ     Z     ZZZZZZZZ ZZ   ZZ    %%");
        System.out.println("\033[31m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }

    public void Fin(){
        
        System.out.println("\033[34m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\033[34m&& ZZZZZZZ ZZ ZZZ    ZZ    ZZZZZ    ZZZZZZZ ZZ            ZZ ZZ   ZZ ZZZZZZZ ZZZZZZZZ ZZZZZZZZ    %%");
        System.out.println("\033[34m&& ZZ      ZZ ZZ ZZ  ZZ    ZZ   ZZ  ZZ      ZZ            ZZ ZZ   ZZ ZZ      ZZ       ZZ    ZZ    %%");
        System.out.println("\033[34m&& ZZZZ    ZZ ZZ  ZZ ZZ    ZZ    ZZ ZZZZ    ZZ            ZZ ZZ   ZZ ZZZZ    ZZ  ZZZZ ZZ    ZZ    %%");
        System.out.println("\033[34m&& ZZ      ZZ ZZ   ZZZZ    ZZ   ZZ  ZZ      ZZ            ZZ ZZ   ZZ ZZ      ZZ    ZZ ZZ    ZZ    %%");
        System.out.println("\033[34m&& ZZ      ZZ ZZ    ZZZ    ZZZZZ    ZZZZZZZ ZZZZZZZ   ZZZZZZ ZZZZZZZ ZZZZZZZ ZZZZZZZZ ZZZZZZZZ    %%");
        System.out.println("\033[34m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
    }
    public void Datos() {

        
        System.out.println("      @           @@ ");
        System.out.println("     @@@         @@@@  ");
        System.out.println("     @@@         @@@@           ");
        System.out.println("     @@@         @@@@         " );
        System.out.println("     @@@  @@@@@  @@@@@ @@@@   EN LAS VENAS NO CORRE SANGRE          ");
        System.out.println("     @@@@@@@@@@@@@@@@@@@@@      SOLAMENTE ROCK.               ");
        System.out.println("     @@@@@@@@@@@@@@@@@@@                    ");
        System.out.println("      @@@@@@@@@@@@@@           100%         ");
        System.out.println("       @@@@@@@@@@@@            ROCK       ");
        
        System.out.println("Jugador:" + this.txt);
        if (tot > 30) {
            System.out.println("Punteo=" + this.tot);
            System.out.println("*******Eres Brillante******");
        } else if (tot < 30 && tot > 20) {
            System.out.println("Punteo=" + this.tot);
            System.out.println("*******buen juego******");
        } else {
            System.out.println("Punteo=" + this.tot);
            System.out.println("******Perdedor******");
        }

    }
    


    public void Borde() {

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

                        Gameover();
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
                        Gameover();
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
                        Gameover();
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
                        Gameover();
                        break;
                    }
                } else if (Letra.equalsIgnoreCase("e")) {
                    Fin();
                    System.out.println("********************************************");
                    System.out.println("*");
                    System.out.println("* jugador: "+this.txt+"");
                    System.out.println("* Punteo Final:"+ this.tot+"");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("********************************************");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    MenuInicio();

                }
                System.out.println("_________________________________________________________________________________________");

                System.out.println("Puntuacion:" + this.tot + "              Gamer: " + txt);

                System.out.println("_________________________________________________________________________________________");

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
               
                 System.out.println("_________________________________________________________________________________________");

                                  Bitacora();

                System.out.println("_________________________________________________________________________________________");

            }

            //*******************************************************************************************************************
        } //fin del while

    }

    public void Bitacora() {
 

        System.out.println("                                                BITACORA ");
        
        System.out.println("Fruto:"+ "("+fila +","+columna+")" +Math.abs(punt)+"pts");
        
    }

    public static void main(String[] args) {

        IPCPractica1_201602855 Menu = new IPCPractica1_201602855();
        Menu.MenuInicio();
    }

    public void ActualizarTabla() {
        fila = (int) (Math.random() * (N1));
        columna = (int) (Math.random() * (N2));
        Frut = new int[N1][N2];
        Frut[fila][columna] = 9;
        Imp[fila][columna] = Frut[fila][columna];
    }


    public void comparar(int Imp[][], int z, int k) {

        if (Frut[fila][columna] == Imp[z][k]) {
            for (int p = 0; p < 1; p++) {
                punt = (fila / 2) - (columna);
                tot = Math.abs(tot) + Math.abs(punt);
            }

            this.ActualizarTabla();
        }
    }

}
