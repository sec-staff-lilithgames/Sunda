package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract r0 build();

        public abstract a setMobileSubtype(s0 s0Var);

        public abstract a setNetworkType(t0 t0Var);
    }

    public static a builder() {
        return new e0();
    }

    public abstract s0 getMobileSubtype();

    public abstract t0 getNetworkType();
}
