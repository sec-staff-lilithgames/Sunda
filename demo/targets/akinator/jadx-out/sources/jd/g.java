package jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract g build();

        public abstract a setExperimentIdsClear(byte[] bArr);

        public abstract a setExperimentIdsEncrypted(byte[] bArr);

        public abstract a setPseudonymousId(String str);
    }

    public static a builder() {
        return new b();
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract String getPseudonymousId();
}
