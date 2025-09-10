/*
Crea un programa que:

Pida al usuario la hora de entrada al hotel (hora, minuto).
Pida la hora de salida (hora, minuto).
Calcule cuántas horas y minutos estuvo el huésped en el hotel.
Si la salida es al día siguiente, debe tenerlo en cuenta.

*/


import java.util.Scanner;

public class RegistroEntradaHotel {

    public static void main(String[] args) {

        /* hora de entrada */

        Scanner sc = new Scanner(System.in);
        int hora = 0;
        int minutos = 0;
        System.out.println("Ingrese hora de entrada: ");
        hora =  sc.nextInt();
        System.out.println("Ingrese el minuto");
        minutos = sc.nextInt();

        System.out.println("La hora de entrada es: " + hora + ":" + minutos);



    }

}
