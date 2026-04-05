package uu;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Enumeration f88778b;

    public r0(Enumeration enumeration) {
        this.f88778b = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88778b.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f88778b.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
