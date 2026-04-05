package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f76580b;

    public q7(Iterator it) {
        this.f76580b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76580b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Iterator it = this.f76580b;
        Object next = it.next();
        it.remove();
        return next;
    }

    public String toString() {
        return "Iterators.consumingIterator(...)";
    }
}
