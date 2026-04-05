package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85020a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f85021b;

    public h(t sequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        this.f85020a = sequence;
        this.f85021b = predicate;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new g(this);
    }
}
