package wr;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y3 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final z3 f91199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91200c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e4 f91201e;

    public y3(e4 e4Var, z3 z3Var, int i10) {
        this.f91201e = e4Var;
        this.f91199b = z3Var;
        this.f91200c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return new x3(this);
    }
}
