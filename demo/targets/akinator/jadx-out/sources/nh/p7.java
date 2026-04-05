package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p7 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76554c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f76555e;

    public p7(int i10, Iterator it) {
        this.f76554c = i10;
        this.f76555e = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76553b < this.f76554c && this.f76555e.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76553b++;
        return this.f76555e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f76555e.remove();
    }
}
