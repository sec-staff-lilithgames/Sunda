package vw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l3 extends LinkedHashMap implements Iterable {
    public i3 get(int i10) {
        return getAll().get(i10);
    }

    public List<i3> getAll() {
        Collection<V> collectionValues = values();
        return !collectionValues.isEmpty() ? new ArrayList(collectionValues) : Collections.EMPTY_LIST;
    }

    @Override // java.lang.Iterable
    public Iterator<i3> iterator() {
        return values().iterator();
    }
}
