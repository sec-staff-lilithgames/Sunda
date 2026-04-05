package wr;

import java.net.URI;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p4 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract String getDefaultScheme();

        public abstract p4 newNameResolver(URI uri, n4 n4Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b implements q4 {
        @Override // wr.q4
        @Deprecated
        public final void onAddresses(List<f1> list, wr.c cVar) {
            onResult(s4.newBuilder().setAddresses(list).setAttributes(cVar).build());
        }

        @Override // wr.q4
        public abstract void onError(m6 m6Var);

        public abstract void onResult(s4 s4Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {
        public abstract o4 parseServiceConfig(Map<String, ?> map);
    }

    public abstract String getServiceAuthority();

    public abstract void shutdown();

    public void start(q4 q4Var) {
        if (q4Var instanceof b) {
            start((b) q4Var);
        } else {
            start((b) new l4(q4Var));
        }
    }

    public void start(b bVar) {
        start((q4) bVar);
    }

    public void refresh() {
    }
}
