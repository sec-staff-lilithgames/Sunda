package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x6 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76758c;

    public x6(Iterable iterable) {
        this.f76758c = iterable;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.cycle(this.f76758c);
    }

    @Override // nh.d4
    public String toString() {
        return this.f76758c.toString() + " (cycled)";
    }
}
