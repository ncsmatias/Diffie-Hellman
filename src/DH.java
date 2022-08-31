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
        return (long) (Math.pow(keyReceivedX, this.privateKeyAlpha) % this.publicKeyP);
    }

    public long getPublicKeyP() {
        return publicKeyP;
    }

    public void setPublicKeyP(long publicKeyP) {
        this.publicKeyP = publicKeyP;
    }

    public long getPublicKeyG() {
        return publicKeyG;
    }

    public void setPublicKeyG(long publicKeyG) {
        this.publicKeyG = publicKeyG;
    }

    public long getPrivateKeyAlpha() {
        return privateKeyAlpha;
    }

    public void setPrivateKeyAlpha(long privateKeyAlpha) {
        this.privateKeyAlpha = privateKeyAlpha;
    }
}
