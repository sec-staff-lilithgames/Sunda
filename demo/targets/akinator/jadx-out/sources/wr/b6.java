package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b6 extends p6 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract b6 newServerStreamTracer(String str, e4 e4Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract c getAttributes();

        public abstract String getAuthority();

        public abstract k4 getMethodDescriptor();
    }

    @Deprecated
    public void serverCallStarted(k5 k5Var) {
    }

    public void serverCallStarted(b bVar) {
        serverCallStarted(new c6(bVar));
    }

    public u0 filterContext(u0 u0Var) {
        return u0Var;
    }
}
