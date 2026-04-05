package com.google.protobuf.kotlin;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import lv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UnmodifiableMapEntries<K, V> extends UnmodifiableCollection<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>> {
    private final Set<Map.Entry<K, V>> delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Map.Entry<? extends K, ? extends V>>, a {
        private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
        final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            this.$itr = it;
            this.$$delegate_0 = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$$delegate_0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return new UnmodifiableMapEntry(this.$itr.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(Set<? extends Map.Entry<? extends K, ? extends V>> delegate) {
        super(delegate);
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<? extends Object, ? extends Object>) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new AnonymousClass1(this.delegate.iterator());
    }

    public /* bridge */ boolean contains(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains((UnmodifiableMapEntries<K, V>) entry);
    }
}
