package rv;

import b0.e2;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 implements t, f {

    /* renamed from: a, reason: collision with root package name */
    public final t f85128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85129b;

    public z0(t sequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        this.f85128a = sequence;
        this.f85129b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(e2.h('.', "count must be non-negative, but was ", i10).toString());
        }
    }

    @Override // rv.f
    public t drop(int i10) {
        int i11 = this.f85129b;
        return i10 >= i11 ? y.emptySequence() : new x0(this.f85128a, i10, i11);
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new y0(this);
    }

    @Override // rv.f
    public t take(int i10) {
        return i10 >= this.f85129b ? this : new z0(this.f85128a, i10);
    }
}
