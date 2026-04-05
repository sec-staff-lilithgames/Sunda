package nh;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y6 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76786c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76787e;

    public y6(Iterable iterable, int i10) {
        this.f76786c = iterable;
        this.f76787e = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<List<Object>> iterator() {
        return z7.partition(this.f76786c.iterator(), this.f76787e);
    }
}
