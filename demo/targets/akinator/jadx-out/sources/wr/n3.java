package wr;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n3 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static n3 provider() {
        List list;
        q3 defaultRegistry = q3.getDefaultRegistry();
        synchronized (defaultRegistry) {
            list = defaultRegistry.f91104b;
        }
        n3 n3Var = list.isEmpty() ? null : (n3) list.get(0);
        if (n3Var != null) {
            return n3Var;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public abstract Set a();

    public abstract l3 builderForAddress(String str, int i10);

    public abstract l3 builderForTarget(String str);

    public abstract boolean isAvailable();

    public m3 newChannelBuilder(String str, k kVar) {
        return m3.error("ChannelCredentials are unsupported");
    }

    public abstract int priority();
}
