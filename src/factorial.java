public class factorial {
    public static void main(String[] args) {
        int numero, f;
        numero = Integer.parseInt(args[0]);
        f=1;
        for(int i=2;i<=numero;i++){
            f*=i;
            }
        System.out.print(f);
    }
}
