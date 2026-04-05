package tu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f87389b;

    /* renamed from: c, reason: collision with root package name */
    public int f87390c;

    public l0(int[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f87389b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87390c < this.f87389b.length;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return k0.m7055boximpl(m7062nextpVg5ArA());
    }

    /* renamed from: next-pVg5ArA, reason: not valid java name */
    public int m7062nextpVg5ArA() {
        int i10 = this.f87390c;
        int[] iArr = this.f87389b;
        if (i10 >= iArr.length) {
            throw new NoSuchElementException(String.valueOf(this.f87390c));
        }
        this.f87390c = i10 + 1;
        return k0.m7056constructorimpl(iArr[i10]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
