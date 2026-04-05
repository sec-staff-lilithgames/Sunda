package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85013a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f85014b;

    public f1(t sequence, kv.l transformer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(transformer, "transformer");
        this.f85013a = sequence;
        this.f85014b = transformer;
    }

    public final <E> t flatten$kotlin_stdlib(kv.l iterator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterator, "iterator");
        return new m(this.f85013a, this.f85014b, iterator);
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new e1(this);
    }
}
