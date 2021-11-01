package mx.ipn;

import java.util.Random;

public class Arreglos {
    private int[] arreglo;

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getArreglo() {
        return this.arreglo;
    }

    public void generateArreglo() {
        int[] array = new int [12];

        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                array[0] = 2;
            } else if (i == 11) {
                array[11] = 4096;
            } else {
                array[i] = (int) (random.nextDouble() * 4094 + 2);
            }
        }

        this.arreglo = array;
    }
}
