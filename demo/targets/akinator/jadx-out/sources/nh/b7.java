package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76125c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.v0 f76126e;

    public b7(Iterable iterable, mh.v0 v0Var) {
        this.f76125c = iterable;
        this.f76126e = v0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.transform(this.f76125c.iterator(), this.f76126e);
    }
}
