package nh;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76292c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Comparator f76293e;

    public g7(Iterable iterable, Comparator comparator) {
        this.f76292c = iterable;
        this.f76293e = comparator;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.mergeSorted(i7.transform(this.f76292c, new in.c(7)), this.f76293e);
    }
}
