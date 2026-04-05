package io.ktor.util.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.a;
import kv.l;
import lv.g;
import nh.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConcurrentMap<Key, Value> implements Map<Key, Value>, g {
    private final ConcurrentHashMap<Key, Value> delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.collections.ConcurrentMap$computeIfAbsent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(1);
            this.$block = aVar;
        }

        @Override // kv.l
        public final Value invoke(Key key) {
            return (Value) this.$block.invoke();
        }
    }

    public ConcurrentMap() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object computeIfAbsent$lambda$0(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    public final Value computeIfAbsent(Key key, a block) {
        e0.checkNotNullParameter(block, "block");
        return this.delegate.computeIfAbsent(key, new a1(new AnonymousClass1(block), 4));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return e0.areEqual(obj, this.delegate);
        }
        return false;
    }

    @Override // java.util.Map
    public Value get(Object obj) {
        return this.delegate.get(obj);
    }

    public Set<Map.Entry<Key, Value>> getEntries() {
        Set<Map.Entry<Key, Value>> setEntrySet = this.delegate.entrySet();
        e0.checkNotNullExpressionValue(setEntrySet, "delegate.entries");
        return setEntrySet;
    }

    public Set<Key> getKeys() {
        Set<Key> setKeySet = this.delegate.keySet();
        e0.checkNotNullExpressionValue(setKeySet, "delegate.keys");
        return setKeySet;
    }

    public int getSize() {
        return this.delegate.size();
    }

    public Collection<Value> getValues() {
        Collection<Value> collectionValues = this.delegate.values();
        e0.checkNotNullExpressionValue(collectionValues, "delegate.values");
        return collectionValues;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Value put(Key key, Value value) {
        return this.delegate.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Key, ? extends Value> from) {
        e0.checkNotNullParameter(from, "from");
        this.delegate.putAll(from);
    }

    @Override // java.util.Map
    public Value remove(Object obj) {
        return this.delegate.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return "ConcurrentMapJvm by " + this.delegate;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    public ConcurrentMap(int i10) {
        this.delegate = new ConcurrentHashMap<>(i10);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.delegate.remove(obj, obj2);
    }

    public /* synthetic */ ConcurrentMap(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 32 : i10);
    }
}
