package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c4 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable[] f76150c;

    public c4(Iterable[] iterableArr) {
        this.f76150c = iterableArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Iterable[] iterableArr = this.f76150c;
        return z7.concat(new b4(iterableArr.length, iterableArr));
    }
}
