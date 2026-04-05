package ax;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b extends ConcurrentHashMap implements a {
    @Override // ax.a
    public void cache(Object obj, Object obj2) {
        put(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, ax.a
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // ax.a
    public Object fetch(Object obj) {
        return get(obj);
    }

    @Override // ax.a
    public Object take(Object obj) {
        return remove(obj);
    }
}
