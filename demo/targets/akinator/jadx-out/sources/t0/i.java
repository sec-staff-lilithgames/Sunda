package t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f86241e;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f86241e = obj;
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        checkHasNext$runtime();
        setIndex(getIndex() + 1);
        return this.f86241e;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        checkHasPrevious$runtime();
        setIndex(getIndex() - 1);
        return this.f86241e;
    }
}
