package nh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i3 extends dc {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3 f76349f;

    public i3(n3 n3Var) {
        this.f76349f = n3Var;
    }

    @Override // nh.dc
    public final Set a() {
        return new f3(this);
    }

    @Override // nh.dc
    public final Collection b() {
        return new h3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f76349f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // nh.dc
    public final Set createKeySet() {
        return new g3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> get(Object obj) {
        n3 n3Var = this.f76349f;
        Collection<Object> collection = n3Var.f76492h.asMap().get(obj);
        if (collection == null) {
            return null;
        }
        Collection<Object> collectionG = n3.g(collection, new m3(n3Var, obj));
        if (collectionG.isEmpty()) {
            return null;
        }
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> remove(Object obj) {
        n3 n3Var = this.f76349f;
        fc fcVar = n3Var.f76492h;
        Collection<Object> collection = fcVar.asMap().get(obj);
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (n3Var.f76493i.apply(ec.immutableEntry(obj, next))) {
                it.remove();
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return fcVar instanceof sf ? Collections.unmodifiableSet(new LinkedHashSet(arrayList)) : Collections.unmodifiableList(arrayList);
    }
}
