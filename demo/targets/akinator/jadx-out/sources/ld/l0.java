package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract l0 build();

        public abstract a setClearBlob(byte[] bArr);

        public abstract a setEncryptedBlob(byte[] bArr);
    }

    public static a builder() {
        return new t();
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();
}
