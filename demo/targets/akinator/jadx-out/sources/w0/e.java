package w0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends u0.a {

    /* renamed from: b, reason: collision with root package name */
    public final d f90297b;

    public e(d dVar) {
        this.f90297b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f90297b.clear();
    }

    @Override // u0.a
    public boolean containsEntry(Map.Entry<Object, Object> entry) {
        Object key = entry.getKey();
        d dVar = this.f90297b;
        Object obj = dVar.get(key);
        return obj != null ? e0.areEqual(obj, entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    @Override // uu.q
    public int getSize() {
        return this.f90297b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new f(this.f90297b);
    }

    @Override // u0.a
    public boolean removeEntry(Map.Entry<Object, Object> entry) {
        return this.f90297b.remove(entry.getKey(), entry.getValue());
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Object, Object> entry) {
        throw new UnsupportedOperationException();
    }
}
