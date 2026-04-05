package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f71835b;

    /* renamed from: c, reason: collision with root package name */
    public int f71836c;

    public h(Object[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71835b = array;
    }

    public final Object[] getArray() {
        return this.f71835b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71836c < this.f71835b.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f71835b;
            int i10 = this.f71836c;
            this.f71836c = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71836c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
