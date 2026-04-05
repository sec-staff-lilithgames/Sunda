package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends uu.j1 {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f71831b;

    /* renamed from: c, reason: collision with root package name */
    public int f71832c;

    public g(int[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71831b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71832c < this.f71831b.length;
    }

    @Override // uu.j1
    public int nextInt() {
        try {
            int[] iArr = this.f71831b;
            int i10 = this.f71832c;
            this.f71832c = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71832c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
