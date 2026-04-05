package sv;

import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.u uVar) {
    }

    public final d valueOf(int i10) {
        d dVar = (d) ((Map) d.f86129e.getValue()).get(Integer.valueOf(i10));
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o2.k(i10, "Directionality #", " is not defined."));
    }
}
