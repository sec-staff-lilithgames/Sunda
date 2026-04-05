package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 implements t, f {

    /* renamed from: a, reason: collision with root package name */
    public final t f85112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85114c;

    public x0(t sequence, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        this.f85112a = sequence;
        this.f85113b = i10;
        this.f85114c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "startIndex should be non-negative, but is ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(a.b.e(i11, "endIndex should be non-negative, but is ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // rv.f
    public t drop(int i10) {
        int i11 = this.f85114c;
        int i12 = this.f85113b;
        return i10 >= i11 - i12 ? y.emptySequence() : new x0(this.f85112a, i12 + i10, i11);
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new w0(this);
    }

    @Override // rv.f
    public t take(int i10) {
        int i11 = this.f85114c;
        int i12 = this.f85113b;
        return i10 >= i11 - i12 ? this : new x0(this.f85112a, i12, i10 + i12);
    }
}
