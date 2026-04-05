package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d1 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85001a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.p f85002b;

    public d1(t sequence, kv.p transformer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(transformer, "transformer");
        this.f85001a = sequence;
        this.f85002b = transformer;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new c1(this);
    }
}
