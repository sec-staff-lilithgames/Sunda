package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l0 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public Object f76433b;

    public l0(Comparable comparable) {
        this.f76433b = comparable;
    }

    public abstract Comparable a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76433b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f76433b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f76433b = a(obj);
        return obj;
    }
}
