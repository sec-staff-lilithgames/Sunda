package u0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends uu.s implements s0.f {

    /* renamed from: c, reason: collision with root package name */
    public final d f87499c;

    public n(d dVar) {
        this.f87499c = dVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    @Override // uu.a
    public int getSize() {
        return this.f87499c.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new o(this.f87499c.getNode$runtime());
    }

    public boolean contains(Map.Entry<Object, Object> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        d dVar = this.f87499c;
        Object obj = dVar.get(key);
        return obj != null ? e0.areEqual(obj, entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }
}
