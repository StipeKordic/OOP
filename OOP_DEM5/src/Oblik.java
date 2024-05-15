public abstract class Oblik {
    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();

    public void printInfo(){
        String s = String.format("Površina je %.2f, a opseg je %.2f", izracunajPovrsinu(), izracunajOpseg());
        System.out.println(s);
    }

    public static void usporediPovrsinu(Oblik oblik1, Oblik oblik2){
        double povrsina1 = oblik1.izracunajPovrsinu();
        double povrsina2 = oblik2.izracunajPovrsinu();

        if (povrsina1 > povrsina2){
            System.out.println("Prvi oblik ima veću površinu");
        } else if (povrsina2 >povrsina1) {
            System.out.println("Drugi oblik ima veću površinu");
        }else{
            System.out.println("Površine su im jednake.");
        }
    }
}
