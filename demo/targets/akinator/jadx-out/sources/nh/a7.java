package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76091c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.q1 f76092e;

    public a7(Iterable iterable, mh.q1 q1Var) {
        this.f76091c = iterable;
        this.f76092e = q1Var;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.filter(this.f76091c.iterator(), this.f76092e);
    }
}
