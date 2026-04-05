package wj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class i {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract i build();

        public abstract a setResponseCode(j jVar);

        public abstract a setToken(String str);

        public abstract a setTokenExpirationTimestamp(long j10);
    }

    public static a builder() {
        return new c().setTokenExpirationTimestamp(0L);
    }

    public abstract j getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract a toBuilder();
}
