package w0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends uu.s implements s0.f {

    /* renamed from: c, reason: collision with root package name */
    public final c f90309c;

    public m(c cVar) {
        this.f90309c = cVar;
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
        return this.f90309c.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new n(this.f90309c);
    }

    public boolean contains(Map.Entry<Object, Object> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        c cVar = this.f90309c;
        Object obj = cVar.get(key);
        return obj != null ? e0.areEqual(obj, entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
    }
}
