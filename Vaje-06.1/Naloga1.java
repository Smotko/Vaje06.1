import java.util.Random;
class Naloga1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        int sestevek = 0;
        int j = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
            j = i + 1;   
            System.out.println("Stevilo " + j + " = " + a[i]);
            sestevek += a[i];
        }
        int povprecje = sestevek / a.length;
        System.out.println("Skuna vrednost = " + sestevek);
        System.out.println("Povprecje = " + povprecje);
    }
}