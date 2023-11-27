public class esercizio23di2 {
    public static void main(String[] args) {
        char a = '9';
        revision(a);
    }
    static void revision(char a){
        if (Character.isDigit(a)){
            System.out.println("el caracter es un numero");
        } else {
            throw new ArithmeticException("el caracter no es un numero");
        }
    }
}
