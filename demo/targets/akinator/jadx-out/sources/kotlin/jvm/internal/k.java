package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends uu.k1 {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f71843b;

    /* renamed from: c, reason: collision with root package name */
    public int f71844c;

    public k(long[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71843b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71844c < this.f71843b.length;
    }

    @Override // uu.k1
    public long nextLong() {
        try {
            long[] jArr = this.f71843b;
            int i10 = this.f71844c;
            this.f71844c = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71844c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
