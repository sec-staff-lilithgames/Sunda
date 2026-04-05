package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76789c;

    public y7(Object obj) {
        this.f76788b = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f76789c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f76789c) {
            throw new NoSuchElementException();
        }
        this.f76789c = true;
        return this.f76788b;
    }
}
