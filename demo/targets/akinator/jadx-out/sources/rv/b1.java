package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f84985a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f84986b;

    public b1(t sequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        this.f84985a = sequence;
        this.f84986b = predicate;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new a1(this);
    }
}
