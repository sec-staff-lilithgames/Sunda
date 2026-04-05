package ax;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c extends LinkedHashMap implements a {

    /* renamed from: b, reason: collision with root package name */
    public final int f8313b;

    public c() {
        this(50000);
    }

    @Override // ax.a
    public void cache(Object obj, Object obj2) {
        put(obj, obj2);
    }

    @Override // ax.a
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // ax.a
    public Object fetch(Object obj) {
        return get(obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f8313b;
    }

    @Override // ax.a
    public Object take(Object obj) {
        return remove(obj);
    }

    public c(int i10) {
        this.f8313b = i10;
    }
}
