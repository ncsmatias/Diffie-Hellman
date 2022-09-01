public class Main {
    public static void main (String [] args) {
        long publicKeyP = 11; // valor publico
        long publicKeyG = 9; // valor do alpha combinado

        long keyGenerated1; // chave 1 gerado
        long keyGenerated2; // chave 2 a ser gerada

        DH user1 = new DH(publicKeyP, publicKeyG, 11); // chamada a classe que setara valores a serem calculados
        DH user2 = new DH(publicKeyP, publicKeyG, 2);

        keyGenerated1 = user1.keyGenerated(); //calculando o valor da chave X publica
        keyGenerated2 = user2.keyGenerated();

        if(user1.generatedSecretKey(keyGenerated2) == user2.generatedSecretKey(keyGenerated1)) {
            System.out.println("Chaves iguais");
            System.out.println("User 1: " + user1.generatedSecretKey(keyGenerated2)); // calculo da chave privativa
            System.out.println("User 2: " + user2.generatedSecretKey(keyGenerated1));
        }
        else {
            System.out.println("Chaves incompativeis");
        }
    }
}
