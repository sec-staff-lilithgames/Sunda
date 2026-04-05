package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract j0 build();

        public abstract a setPrivacyContext(n0 n0Var);

        public abstract a setProductIdOrigin(k0 k0Var);
    }

    public static a builder() {
        return new r();
    }

    public abstract n0 getPrivacyContext();

    public abstract k0 getProductIdOrigin();
}
