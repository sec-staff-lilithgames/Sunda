package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterable[] f76120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(int i10, Iterable[] iterableArr) {
        super(i10, 0);
        this.f76120e = iterableArr;
    }

    @Override // nh.a
    public Iterator<Object> get(int i10) {
        return this.f76120e[i10].iterator();
    }
}
