package org.japo.java.lib;

//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
public class UtilesArrays {

    public static void mostrarArray(String lista[], String mensaje) {
        for (String lista1 : lista) {
            System.out.printf("%s%s\n", mensaje, lista1);
        }
    }

    public static void mostrarArray(int lista[], String mensaje) {
        for (int lista1 : lista) {
            System.out.printf("%s%d\n", mensaje, lista1);
        }
    }
    
    public static void mostrarArray(char lista[], String mensaje) {
        for (char lista1 : lista) {
            System.out.printf("%s%c\n", mensaje, lista1);
        }
    }

    public static void mostrarArrayListString(java.util.ArrayList<String> lista, String mensaje) {

        java.util.Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.printf("%s%s\n", mensaje, it.next());
        }

//         for (int i = 0; i < lista.size(); i++) {
//            System.out.printf("%s ...: %s\n", mensaje, lista.get(i));
//        }
    }

    public static void mostrarArrayListInt(java.util.ArrayList<Integer> lista, String mensaje) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s%d\n", mensaje, lista.get(i));
        }
    }

    public static void mostrarListString(java.util.List<String> lista, String mensaje) {

        java.util.Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.printf("%s%s\n", mensaje, it.next());
        }

    }

    public static void desordenarArrayInt(int lista[]) {
        java.util.Random rnd = new java.util.Random();

        for (int i = 0; i < lista.length; i++) {
            int aux = lista[i];
            int posicion = rnd.nextInt(lista.length);
            lista[i] = lista[posicion];
            lista[posicion] = aux;
        }
    }

    public static int compararListasArrayString(String[] lista1, String[] lista2) {
        int aciertos = 0;

        for (String numApu : lista1) {
            for (String numSor : lista2) {
                if (numApu.equals(numSor)) {
                    aciertos++;
                }
            }
        }
        System.out.printf("Aciertos ...: %d\n", aciertos);

        return aciertos;
    }

    public static int obtenerPosicionMaximoArray(int[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] < lista[i]) {
                posMax = i;
            }
        }

        return posMax;
    }

    public static double obtenerPosicionMaximoArray(double[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] < lista[i]) {
                posMax = i;
            }
        }

        return posMax;
    }

    public static int obtenerPosicionMinimoArray(int[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] > lista[i]) {
                posMax = i;
            }
        }

        return posMax;
    }

    public static double obtenerPosicionMinimoArray(double[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] > lista[i]) {
                posMax = i;
            }
        }

        return posMax;
    }

    public static int obtenerValorMaximoArray(int[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] < lista[i]) {
                posMax = i;
            }
        }

        return lista[posMax];
    }

    public static double obtenerValorMaximoArray(double[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] < lista[i]) {
                posMax = i;
            }
        }

        return lista[posMax];
    }

    public static int obtenerValorMinimoArray(int[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] > lista[i]) {
                posMax = i;
            }
        }

        return lista[posMax];
    }

    public static double obtenerValorMinimoArray(double[] lista) {
        int posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[posMax] > lista[i]) {
                posMax = i;
            }
        }

        return lista[posMax];
    }

}
