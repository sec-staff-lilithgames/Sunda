package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface u extends v {
    @Override // e1.v
    default boolean all(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(this)).booleanValue();
    }

    @Override // e1.v
    default boolean any(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(this)).booleanValue();
    }

    @Override // e1.v
    default <R> R foldIn(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) operation.invoke(r10, this);
    }

    @Override // e1.v
    default <R> R foldOut(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) operation.invoke(this, r10);
    }

    @Override // e1.v
    /* bridge */ /* synthetic */ default v then(v vVar) {
        return super.then(vVar);
    }
}
