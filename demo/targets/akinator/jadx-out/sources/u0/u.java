package u0;

import java.util.Iterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f87510b = t.f87502e.getEMPTY$runtime().getBuffer$runtime();

    /* renamed from: c, reason: collision with root package name */
    public int f87511c;

    /* renamed from: e, reason: collision with root package name */
    public int f87512e;

    public final Object currentKey() {
        y0.a.m8013assert(hasNextKey());
        return this.f87510b[this.f87512e];
    }

    public final t currentNode() {
        y0.a.m8013assert(hasNextNode());
        Object obj = this.f87510b[this.f87512e];
        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.f87512e < this.f87511c;
    }

    public final boolean hasNextNode() {
        y0.a.m8013assert(this.f87512e >= this.f87511c);
        return this.f87512e < this.f87510b.length;
    }

    public final void moveToNextKey() {
        y0.a.m8013assert(hasNextKey());
        this.f87512e += 2;
    }

    public final void moveToNextNode() {
        y0.a.m8013assert(hasNextNode());
        this.f87512e++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i10, int i11) {
        this.f87510b = objArr;
        this.f87511c = i10;
        this.f87512e = i11;
    }

    public final void reset(Object[] objArr, int i10) {
        reset(objArr, i10, 0);
    }
}
