class mainThread{
    public static void main(String a[]){
        Thread t=Thread.currentThread();
        // System.out.println(t);
        t.setName("halulu");
        System.out.println(t);
        // t.setName("lalala");
        // System.out.println(t);

    }
}