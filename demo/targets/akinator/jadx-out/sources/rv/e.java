package rv;

import b0.e2;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements t, f {

    /* renamed from: a, reason: collision with root package name */
    public final t f85003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85004b;

    public e(t sequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        this.f85003a = sequence;
        this.f85004b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(e2.h('.', "count must be non-negative, but was ", i10).toString());
        }
    }

    @Override // rv.f
    public t drop(int i10) {
        int i11 = this.f85004b + i10;
        return i11 < 0 ? new e(this, i10) : new e(this.f85003a, i11);
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new d(this);
    }

    @Override // rv.f
    public t take(int i10) {
        int i11 = this.f85004b;
        int i12 = i11 + i10;
        return i12 < 0 ? new z0(this, i10) : new x0(this.f85003a, i11, i12);
    }
}
