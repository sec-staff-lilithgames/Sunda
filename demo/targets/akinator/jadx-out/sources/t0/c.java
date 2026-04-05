package t0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f86220e;

    public c(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f86220e = objArr;
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int index = getIndex();
        setIndex(index + 1);
        return this.f86220e[index];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        return this.f86220e[getIndex()];
    }
}
