package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 extends ee {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f76276b;

    public g0(h0 h0Var) {
        this.f76276b = h0Var;
    }

    @Override // nh.ee
    public final ud c() {
        return this.f76276b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<td> iterator() {
        return this.f76276b.g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76276b.e();
    }
}
