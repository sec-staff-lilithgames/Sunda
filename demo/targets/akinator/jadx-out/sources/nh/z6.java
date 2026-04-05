package nh;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z6 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76811c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76812e;

    public z6(Iterable iterable, int i10) {
        this.f76811c = iterable;
        this.f76812e = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<List<Object>> iterator() {
        return z7.paddedPartition(this.f76811c.iterator(), this.f76812e);
    }
}
