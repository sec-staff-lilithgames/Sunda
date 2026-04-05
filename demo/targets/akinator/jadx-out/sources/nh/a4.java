package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a4 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76084c;

    public a4(Iterable iterable) {
        this.f76084c = iterable;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.concat(z7.transform(this.f76084c.iterator(), new in.c(7)));
    }
}
