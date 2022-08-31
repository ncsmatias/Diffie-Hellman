public class Main {
    public static void main (String [] args) {
        long publicKeyP = 11;
        long publicKeyG = 9;

        long keyGenerated1;
        long keyGenerated2;

        DH user1 = new DH(publicKeyP, publicKeyG, 11);
        DH user2 = new DH(publicKeyP, publicKeyG, 2);

        keyGenerated1 = user1.keyGenerated();
        keyGenerated2 = user2.keyGenerated();

        if(user1.generatedSecretKey(keyGenerated2) == user2.generatedSecretKey(keyGenerated1)) {
            System.out.println("Chaves iguais");
            System.out.println("User 1: " + user1.generatedSecretKey(keyGenerated2));
            System.out.println("User 2: " + user2.generatedSecretKey(keyGenerated1));
        }
        else {
            System.out.println("Chaves incompativeis");
        }
    }
}
