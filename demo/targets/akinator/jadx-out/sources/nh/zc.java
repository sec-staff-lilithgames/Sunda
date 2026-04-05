package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class zc extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad f76823b;

    public zc(ad adVar) {
        this.f76823b = adVar;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76823b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
        fc fcVar = this.f76823b.f76100f;
        Set<Object> setKeySet = fcVar.keySet();
        Objects.requireNonNull(fcVar);
        return new o7(setKeySet.iterator(), new ep.r(fcVar, 3), 1);
    }

    @Override // nh.xa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        this.f76823b.f76100f.keySet().remove(entry.getKey());
        return true;
    }
}
