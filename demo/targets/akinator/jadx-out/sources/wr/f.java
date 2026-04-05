package wr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract void apply(e4 e4Var);

        public abstract void fail(m6 m6Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract String getAuthority();

        public i getCallOptions() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public abstract k4 getMethodDescriptor();

        public abstract h5 getSecurityLevel();

        public abstract c getTransportAttrs();
    }

    public abstract void applyRequestMetadata(b bVar, Executor executor, a aVar);

    @Deprecated
    public void thisUsesUnstableApi() {
    }
}
