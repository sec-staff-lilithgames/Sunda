package v0;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f88842a = e.f88837d.getEMPTY$runtime().getBuffer();

    /* renamed from: b, reason: collision with root package name */
    public int f88843b;

    public static /* synthetic */ void reset$default(f fVar, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        fVar.reset(objArr, i10);
    }

    public final Object currentElement() {
        y0.a.m8013assert(hasNextElement());
        return this.f88842a[this.f88843b];
    }

    public final e currentNode() {
        y0.a.m8013assert(hasNextNode());
        Object obj = this.f88842a[this.f88843b];
        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (e) obj;
    }

    public final boolean hasNextCell() {
        return this.f88843b < this.f88842a.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.f88842a[this.f88843b] instanceof e);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.f88842a[this.f88843b] instanceof e);
    }

    public final void moveToNextCell() {
        y0.a.m8013assert(hasNextCell());
        this.f88843b++;
    }

    public final Object nextElement() {
        y0.a.m8013assert(hasNextElement());
        Object[] objArr = this.f88842a;
        int i10 = this.f88843b;
        this.f88843b = i10 + 1;
        return objArr[i10];
    }

    public final void reset(Object[] objArr, int i10) {
        this.f88842a = objArr;
        this.f88843b = i10;
    }
}
