package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface v {
    boolean all(kv.l lVar);

    boolean any(kv.l lVar);

    <R> R foldIn(R r10, kv.p pVar);

    <R> R foldOut(R r10, kv.p pVar);

    default v then(v other) {
        e0.checkNotNullParameter(other, "other");
        return other == t.f53496b ? this : new g(this, other);
    }
}
