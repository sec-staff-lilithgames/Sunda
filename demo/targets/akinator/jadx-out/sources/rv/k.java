package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85030a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85031b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f85032c;

    public k(t sequence, boolean z10, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        this.f85030a = sequence;
        this.f85031b = z10;
        this.f85032c = predicate;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new j(this);
    }

    public /* synthetic */ k(t tVar, boolean z10, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(tVar, (i10 & 2) != 0 ? true : z10, lVar);
    }
}
