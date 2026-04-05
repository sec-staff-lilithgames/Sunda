package wr;

import java.util.List;
import wr.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class v5 {
    public static v5 provider() {
        List list;
        x5 defaultRegistry = x5.getDefaultRegistry();
        synchronized (defaultRegistry) {
            list = defaultRegistry.f91189b;
        }
        v5 v5Var = list.isEmpty() ? null : (v5) list.get(0);
        if (v5Var != null) {
            return v5Var;
        }
        throw new n3.a("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
    }

    public abstract j5 a();

    public u5 b(int i10, n5 n5Var) {
        return u5.error("ServerCredentials are unsupported");
    }
}
