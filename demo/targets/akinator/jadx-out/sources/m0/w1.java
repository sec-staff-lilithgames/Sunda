package m0;

import java.util.Map;
import p0.g3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f73851a = p0.o0.compositionLocalOf$default(null, v1.f73847e, 1, null);

    public static final g3 getLocalSelectionRegistrar() {
        return f73851a;
    }

    public static final boolean hasSelection(t1 t1Var, long j10) {
        Map<Long, s> subselections;
        if (t1Var == null || (subselections = t1Var.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(Long.valueOf(j10));
    }
}
