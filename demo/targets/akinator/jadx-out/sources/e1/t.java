package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t f53496b = new t();

    @Override // e1.v
    public boolean all(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return true;
    }

    @Override // e1.v
    public boolean any(kv.l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return false;
    }

    @Override // e1.v
    public <R> R foldIn(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return r10;
    }

    @Override // e1.v
    public <R> R foldOut(R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return r10;
    }

    @Override // e1.v
    public v then(v other) {
        e0.checkNotNullParameter(other, "other");
        return other;
    }

    public String toString() {
        return "Modifier";
    }
}
