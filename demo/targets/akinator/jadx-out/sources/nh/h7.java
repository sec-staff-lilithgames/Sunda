package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f76323c;

    public h7(Iterable iterable) {
        this.f76323c = iterable;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.unmodifiableIterator(this.f76323c.iterator());
    }

    @Override // nh.d4
    public String toString() {
        return this.f76323c.toString();
    }
}
