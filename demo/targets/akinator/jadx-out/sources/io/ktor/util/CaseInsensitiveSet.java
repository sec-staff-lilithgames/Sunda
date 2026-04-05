package io.ktor.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import lv.h;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
/* loaded from: classes8.dex */
public final class CaseInsensitiveSet implements Set<String>, h {
    private final CaseInsensitiveMap<Boolean> backingMap;

    public CaseInsensitiveSet() {
        this.backingMap = new CaseInsensitiveMap<>();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends String> elements) {
        e0.checkNotNullParameter(elements, "elements");
        Iterator<? extends String> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.backingMap.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return contains((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.backingMap.keySet().containsAll(elements);
    }

    public int getSize() {
        return this.backingMap.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.backingMap.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.backingMap.keySet().removeAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.backingMap.keySet().retainAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(String element) {
        e0.checkNotNullParameter(element, "element");
        if (this.backingMap.containsKey((Object) element)) {
            return false;
        }
        this.backingMap.put((CaseInsensitiveMap<Boolean>) element, (String) Boolean.TRUE);
        return true;
    }

    public boolean contains(String element) {
        e0.checkNotNullParameter(element, "element");
        return this.backingMap.containsKey((Object) element);
    }

    public boolean remove(String element) {
        e0.checkNotNullParameter(element, "element");
        return e0.areEqual(this.backingMap.remove((Object) element), Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        e0.checkNotNullParameter(array, "array");
        return (T[]) t.toArray(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaseInsensitiveSet(Iterable<String> initial) {
        this();
        e0.checkNotNullParameter(initial, "initial");
        v0.addAll(this, initial);
    }
}
