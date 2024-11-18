package Lesson_5;

public class Task {
    static final int size = 100000000;
    static final int threadVal = 20;

    public static void main(String[] args) {
        oneThread();
        multiThread();
    }

    public static void oneThread() {
        final float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void multiThread() {
        System.out.println("ololo");
        Thread[] threads = new Thread[threadVal];
        float array[] = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        int ost = array.length % threadVal;
        long a = System.currentTimeMillis();
        int arrayLengths[] = new int[threadVal];
        for (int i = 0; i < arrayLengths.length; i++) {
            arrayLengths[i] = (ost > 0) ? array.length / threadVal + 1 : array.length / threadVal;
            ost--;
        }
        float croppedArrays[][] = new float[threadVal][];
        for (int i = 0; i < croppedArrays.length; i++) {
            int finalI = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    croppedArrays[finalI] = new float[arrayLengths[finalI]];
                    int shift = 0;
                    if (finalI != 0) {
                        for (int j = 0; j < finalI; j++) {
                            shift = shift + arrayLengths[j];
                        }
                    }
                    System.arraycopy(array, shift, croppedArrays[finalI], 0, croppedArrays[finalI].length);
                    for (int j = 0; j < croppedArrays[finalI].length; j++) {
                        croppedArrays[finalI][j] = (float) (croppedArrays[finalI][j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
                    }
                }
            });
            threads[finalI].start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int shift = 0;
        for (int i = 0; i < croppedArrays.length; i++) {
            System.arraycopy(croppedArrays[i], 0, array, shift, croppedArrays[i].length);
            shift += croppedArrays[i].length;
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
