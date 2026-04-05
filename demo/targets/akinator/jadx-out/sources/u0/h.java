package u0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public final f f87495b;

    public h(f fVar) {
        this.f87495b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f87495b.clear();
    }

    @Override // u0.a
    public boolean containsEntry(Map.Entry<Object, Object> entry) {
        Object key = entry.getKey();
        f fVar = this.f87495b;
        Object obj = fVar.get(key);
        return obj != null ? e0.areEqual(obj, entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // uu.q
    public int getSize() {
        return this.f87495b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new i(this.f87495b);
    }

    @Override // u0.a
    public boolean removeEntry(Map.Entry<Object, Object> entry) {
        return this.f87495b.remove(entry.getKey(), entry.getValue());
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Object, Object> entry) {
        throw new UnsupportedOperationException();
    }
}
