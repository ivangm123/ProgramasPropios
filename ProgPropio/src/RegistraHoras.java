import java.util.Scanner;

/**
 * Programa para registrar horas, incrementar en segundos y mostrar el actualizado
 */
public class RegistraHoras {
    public static void main(String[] args) {
        int hora, minuto, segundo, incremento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Registra la hora (0-23):");
        hora = sc.nextInt();

        System.out.println("Registra el minuto (0-59):");
        minuto = sc.nextInt();

        System.out.println("Registra los segundos (0-59):");
        segundo = sc.nextInt();

        System.out.println("Añade el incremento (en segundos):");
        incremento = sc.nextInt();

        // Convertimos todo a segundos
        int totalSegundos = hora * 3600 + minuto * 60 + segundo + incremento;

        // Calculamos la nueva hora
        int nuevaHora = (totalSegundos / 3600) % 24;
        int nuevoMinuto = (totalSegundos % 3600) / 60;
        int nuevoSegundo = totalSegundos % 60;

        System.out.printf("Hora actualizada: %02d:%02d:%02d\n", nuevaHora, nuevoMinuto, nuevoSegundo);
    }
}
