package tu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final short[] f87410b;

    /* renamed from: c, reason: collision with root package name */
    public int f87411c;

    public u0(short[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f87410b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87411c < this.f87410b.length;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return t0.m7105boximpl(m7112nextMh2AYeg());
    }

    /* renamed from: next-Mh2AYeg, reason: not valid java name */
    public short m7112nextMh2AYeg() {
        int i10 = this.f87411c;
        short[] sArr = this.f87410b;
        if (i10 >= sArr.length) {
            throw new NoSuchElementException(String.valueOf(this.f87411c));
        }
        this.f87411c = i10 + 1;
        return t0.m7106constructorimpl(sArr[i10]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
