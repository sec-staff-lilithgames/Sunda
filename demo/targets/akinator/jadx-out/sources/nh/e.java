package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f76196b;

    public e(g gVar) {
        this.f76196b = gVar;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76196b;
    }

    @Override // nh.xa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Set setEntrySet = this.f76196b.f76274f.entrySet();
        mh.p1.checkNotNull(setEntrySet);
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
        return new f(this.f76196b);
    }

    @Override // nh.xa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        w wVar = this.f76196b.f76275g;
        Object key = entry.getKey();
        Map map = wVar.f76726h;
        mh.p1.checkNotNull(map);
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        wVar.f76727i -= size;
        return true;
    }
}
