package io.ktor.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import kv.l;
import lv.c;
import lv.h;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DelegatingMutableSet<From, To> implements Set<To>, h {
    private final l convert;
    private final l convertTo;
    private final Set<From> delegate;
    private final int size;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.DelegatingMutableSet$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<To>, c {
        private final Iterator<From> delegateIterator;
        final /* synthetic */ DelegatingMutableSet<From, To> this$0;

        public AnonymousClass1(DelegatingMutableSet<From, To> delegatingMutableSet) {
            this.this$0 = delegatingMutableSet;
            this.delegateIterator = ((DelegatingMutableSet) delegatingMutableSet).delegate.iterator();
        }

        public final Iterator<From> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.Iterator
        public To next() {
            return (To) ((DelegatingMutableSet) this.this$0).convertTo.invoke(this.delegateIterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.delegateIterator.remove();
        }
    }

    public DelegatingMutableSet(Set<From> delegate, l convertTo, l convert) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(convertTo, "convertTo");
        e0.checkNotNullParameter(convert, "convert");
        this.delegate = delegate;
        this.convertTo = convertTo;
        this.convert = convert;
        this.size = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to2) {
        return this.delegate.add(this.convert.invoke(to2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends To> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.delegate.addAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.delegate.contains(this.convert.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.delegate.containsAll(convert(elements));
    }

    public Collection<From> convert(Collection<? extends To> collection) {
        e0.checkNotNullParameter(collection, "<this>");
        Collection<? extends To> collection2 = collection;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.convert.invoke(it.next()));
        }
        return arrayList;
    }

    public Collection<To> convertTo(Collection<? extends From> collection) {
        e0.checkNotNullParameter(collection, "<this>");
        Collection<? extends From> collection2 = collection;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.convertTo.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<To> collectionConvertTo = convertTo(this.delegate);
            if (((Set) obj).containsAll(collectionConvertTo) && collectionConvertTo.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<To> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.delegate.remove(this.convert.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.delegate.removeAll(convert(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.delegate.retainAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    public String toString() {
        return convertTo(this.delegate).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        e0.checkNotNullParameter(array, "array");
        return (T[]) t.toArray(this, array);
    }
}
