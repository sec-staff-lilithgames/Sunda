package nh;

import java.util.Iterator;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76255c;

    public f7(Iterable iterable) {
        this.f76255c = iterable;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Iterable iterable = this.f76255c;
        return iterable instanceof Queue ? new p2((Queue) iterable) : z7.consumingIterator(iterable.iterator());
    }

    @Override // nh.d4
    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}
