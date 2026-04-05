package nh;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ci extends ei {
    @Override // nh.ei, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Collection<Object>> iterator() {
        return new bb(this, super.iterator(), 2);
    }
}
