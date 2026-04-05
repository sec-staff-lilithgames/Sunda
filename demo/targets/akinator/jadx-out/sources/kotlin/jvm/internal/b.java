package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends uu.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f71814b;

    /* renamed from: c, reason: collision with root package name */
    public int f71815c;

    public b(boolean[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71814b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71815c < this.f71814b.length;
    }

    @Override // uu.l0
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f71814b;
            int i10 = this.f71815c;
            this.f71815c = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71815c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
