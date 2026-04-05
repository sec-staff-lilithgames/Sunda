package wj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract f build();

        public abstract a setAuthToken(i iVar);

        public abstract a setFid(String str);

        public abstract a setRefreshToken(String str);

        public abstract a setResponseCode(g gVar);

        public abstract a setUri(String str);
    }

    public static a builder() {
        return new wj.a();
    }

    public abstract i getAuthToken();

    public abstract String getFid();

    public abstract String getRefreshToken();

    public abstract g getResponseCode();

    public abstract String getUri();

    public abstract a toBuilder();
}
