// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

/*
InputStream - importar fichero txt XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
PrintStream - guardar datos en un archivo nuevo
Excepciones - las de InputStream XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
HashMap - clave - email, valor - contraseña --> credenciales XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

ArrayList - almacenar datos en un ArrayList --> los bookmarks XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX




 */
package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ProgramMain {

    public static void main(String[] args) throws IOException{

        // 1. Importar un disclaimer

            InputStream fileIn = new FileInputStream("Disclaimer.txt");

        // 2. Crear un Hashmap con credenciales de login de usuarios
        HashMap<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("fran@gmail.com", "iIDOh3f");
        loginCredentials.put("lucia@hotmail.com", "85Jfi3J");
        loginCredentials.put("pepe@outlook.com", "3392jDn");

        // 3. Extraer del Hashmap solo las direcciones de correo de usuario a un mailing list
        ArrayList<String> mailingList = new ArrayList<>(5);
        mailingList.addAll(loginCredentials.keySet());

        // 4. Exportar el mailing list junto con el Disclaimer a un archivo .txt

            PrintStream fileOut = new PrintStream("Mailing List.txt");

            byte[] datos = fileIn.readAllBytes();
            for(byte dato: datos) {
                fileOut.println((char)dato);
            }

            for(String email: mailingList) {
                fileOut.println(email);
            }
            fileOut.close();
    }
}

