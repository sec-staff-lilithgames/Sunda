package io.ktor.util.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import lv.h;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConcurrentSetKt {

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.collections.ConcurrentSetKt$ConcurrentSet$1, reason: invalid class name */
    public static final class AnonymousClass1<Key> implements Set<Key>, h {
        private final ConcurrentMap<Key, x0> delegate = new ConcurrentMap<>(0, 1, null);

        @Override // java.util.Set, java.util.Collection
        public boolean add(Key element) {
            e0.checkNotNullParameter(element, "element");
            if (this.delegate.containsKey(element)) {
                return false;
            }
            this.delegate.put(element, x0.f87415a);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Key> elements) {
            e0.checkNotNullParameter(elements, "elements");
            Collection<? extends Key> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!add(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.delegate.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.delegate.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            e0.checkNotNullParameter(elements, "elements");
            return elements.containsAll(this.delegate.keySet());
        }

        public int getSize() {
            return this.delegate.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.delegate.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Key> iterator() {
            return this.delegate.keySet().iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return (obj == null || this.delegate.remove(obj) == null) ? false : true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            e0.checkNotNullParameter(elements, "elements");
            Collection<? extends Object> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!remove(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            e0.checkNotNullParameter(elements, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Key key : this.delegate.keySet()) {
                if (!elements.contains(key)) {
                    linkedHashSet.add(key);
                }
            }
            return removeAll(linkedHashSet);
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
        public <T> T[] toArray(T[] array) {
            e0.checkNotNullParameter(array, "array");
            return (T[]) t.toArray(this, array);
        }
    }

    public static final <Key> Set<Key> ConcurrentSet() {
        return new AnonymousClass1();
    }
}
