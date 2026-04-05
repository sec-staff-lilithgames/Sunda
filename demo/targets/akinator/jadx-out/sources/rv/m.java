package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85041a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f85042b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f85043c;

    public m(t sequence, kv.l transformer, kv.l iterator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.e0.checkNotNullParameter(transformer, "transformer");
        kotlin.jvm.internal.e0.checkNotNullParameter(iterator, "iterator");
        this.f85041a = sequence;
        this.f85042b = transformer;
        this.f85043c = iterator;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new l(this);
    }
}
