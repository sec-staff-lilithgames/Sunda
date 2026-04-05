package t0;

import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f86235e;

    /* renamed from: f, reason: collision with root package name */
    public final k f86236f;

    public g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f86235e = objArr2;
        int iRootSize = l.rootSize(i11);
        this.f86236f = new k(objArr, v.coerceAtMost(i10, iRootSize), iRootSize, i12);
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        checkHasNext$runtime();
        k kVar = this.f86236f;
        if (kVar.hasNext()) {
            setIndex(getIndex() + 1);
            return kVar.next();
        }
        int index = getIndex();
        setIndex(index + 1);
        return this.f86235e[index - kVar.getSize()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        checkHasPrevious$runtime();
        int index = getIndex();
        k kVar = this.f86236f;
        if (index <= kVar.getSize()) {
            setIndex(getIndex() - 1);
            return kVar.previous();
        }
        setIndex(getIndex() - 1);
        return this.f86235e[getIndex() - kVar.getSize()];
    }
}
