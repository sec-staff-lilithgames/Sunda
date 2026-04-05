package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e2 implements Iterator, lv.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(nextShort());
    }

    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Short next() {
        return Short.valueOf(nextShort());
    }
}
