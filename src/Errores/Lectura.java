package Errores;

public class Lectura {

    public static int Lint(String txt) {
        int res = 0;
        int id = 0;
        try {
            id = Integer.parseInt(txt);
            res = 1;
        } catch (NumberFormatException e) {

        }
        return res;
    }

    public static int LFloat(String txt) {
        int res = 0;
        float id = 0;
        try {
            id = Float.parseFloat(txt);
            res = 1;
        } catch (NumberFormatException e) {

        }
        return res;
    }

    public static int Lcorreo(String txt, String tipo) {

        int res = 0;
        if (txt.matches("[0-9a-zA-Z]+(@)" + tipo + "(.com)")) {
            res = 1;
        }
        return res;
    }

    public static int Ltext(String txt) {
        int res = 0;
        if (txt.matches("^[a-zA-Z\\s]+$")) {
            res = 1;
        }
        return res;
    }

    public static int Ltelefono(String txt) {

        int res = 0;
        if (txt.matches("\\d{10}")) {
            res = 1;
        }
        return res;
    }

    public static int LContraseña(String txt) {

        int res = 0;
        if (txt.matches(".+")) {
            res = 1;
        }
        return res;
    }

    public static int LeerTarjeta(String txt) {
        int res = 0;
        if (txt.matches("\\d{16}")) {
            res = 1;
        }
        return res;
    }

    public static int Leercvv(String txt) {
        int res = 0;
        if (txt.matches("\\d{3}")) {
            res = 1;
        }
        return res;
    }

    public static int validarFecha(String fecha) {
        // Expresión regular para validar el formato mes/año (por ejemplo: 12/2024)
        String regex = "^(0?[1-9]|1[0-2])/(\\d{4})$";

        // Verificar si la fecha coincide con la expresión regular
        if (fecha.matches(regex)) {
            // Extraer el mes y el año
            String[] partes = fecha.split("/");
            int mes = Integer.parseInt(partes[0]);
            int anio = Integer.parseInt(partes[1]);

            // Verificar si el mes está dentro del rango 1-12 y el año es válido
            if (mes >= 1 && mes <= 12 && anio >= 0) {
                return 1; // La fecha es válida
            }
        }

        return 0; // La fecha no cumple con el formato o los criterios de validez
    }

}
