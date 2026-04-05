package nh;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class mb extends AbstractMap {
    public abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator itA = a();
        mh.p1.checkNotNull(itA);
        while (itA.hasNext()) {
            itA.next();
            itA.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<Map.Entry<Object, Object>> entrySet() {
        return new lb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public abstract int size();
}
