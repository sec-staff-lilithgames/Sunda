package mh;

import java.util.AbstractList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f74586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74587c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74588e;

    public b1(Object[] objArr, Object obj, Object obj2) {
        this.f74586b = objArr;
        this.f74587c = obj;
        this.f74588e = obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        if (i10 == 0) {
            return this.f74587c;
        }
        if (i10 == 1) {
            return this.f74588e;
        }
        return this.f74586b[i10 - 2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74586b.length + 2;
    }
}
