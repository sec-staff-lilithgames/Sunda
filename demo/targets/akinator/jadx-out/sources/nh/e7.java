package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76209c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76210e;

    public e7(Iterable iterable, int i10) {
        this.f76209c = iterable;
        this.f76210e = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.limit(this.f76209c.iterator(), this.f76210e);
    }
}
