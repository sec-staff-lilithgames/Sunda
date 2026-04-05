package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f85084a;

    /* renamed from: b, reason: collision with root package name */
    public final t f85085b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.p f85086c;

    public s(t sequence1, t sequence2, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence1, "sequence1");
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence2, "sequence2");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        this.f85084a = sequence1;
        this.f85085b = sequence2;
        this.f85086c = transform;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new r(this);
    }
}
