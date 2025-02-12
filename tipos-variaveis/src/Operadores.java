public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        boolean verdadeiro = !false;
        System.out.println(verdadeiro == true ? "verdadeiro" : "falso");
        String[] relacionais = { "!=", "==", ">", "<", ">=", "<=" };
        String[] logicos = { "&&", "||" };

        String nome1 = "Jonas";
        String nome2 = new String("Jonas");
        System.out.println(nome1.equals(nome2));
    }
}
