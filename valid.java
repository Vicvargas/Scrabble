package validacion;


import java.io.*;

import java.util.Scanner;

public class valid {

private static BufferedReader br;

public static void main(String[] args) throws FileNotFoundException {
    File fichero = new File ("C:\\Users\\adminportatil\\eclipse-workspace\\ADInicio\\Ficheros\\datos.txt");

    Scanner sc=new Scanner(System.in);
    String respuesta;

    try {
        do {
            br = new BufferedReader(new FileReader(fichero));
            System.out.println("Introduco un nombre que quieras buscar: ");
            respuesta="Persona: "+sc.nextLine();

            String linea="";
            while ((linea= br.readLine())!=null) {

                if(linea.equalsIgnoreCase(respuesta)) {
                    System.out.println(linea);

                    for(int i=0;i<2;i++) {
                        System.out.println(br.readLine());
                    }   
                    break;

                }else {
                    System.out.println("El nombre introducido no existe.");

                    break;
                }

            }

            do {
                System.out.println("¿Quieres introducir otro nombre?");
                respuesta=sc.nextLine();

            }while(respuesta.equalsIgnoreCase("si")==false&&respuesta.equalsIgnoreCase("no")==false);


        }while(respuesta.equalsIgnoreCase("si"));
    } catch (IOException e) {

        System.out.println("Error");
    }
}
}
