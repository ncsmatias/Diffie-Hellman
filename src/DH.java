public class DH {
    private long publicKeyP;
    private long publicKeyG;
    private long privateKeyAlpha;

    public DH(long publicKeyP, long publicKeyG, long privateKeyAlpha) {
        this.publicKeyP = publicKeyP;
        this.publicKeyG = publicKeyG;
        this.privateKeyAlpha = privateKeyAlpha;
    }

    public long keyGenerated () {
        return (long) (Math.pow(this.publicKeyG, this.privateKeyAlpha) % publicKeyP);
    }

    public long generatedSecretKey (long keyReceivedX) {
        return (long) (Math.pow(keyReceivedX, this.privateKeyAlpha) % this.publicKeyP); // o calculo é feito a partir do resulta da chave publica elavada ao valor da chave privada modulo pela chave publica
    }

}
