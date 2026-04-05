package t0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: e, reason: collision with root package name */
    public int f86245e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f86246f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86247g;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f86245e = i12;
        Object[] objArr2 = new Object[i12];
        this.f86246f = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f86247g = r52;
        objArr2[0] = objArr;
        b(i10 - r52, 1);
    }

    public final Object a() {
        int index = getIndex() & 31;
        Object obj = this.f86246f[this.f86245e - 1];
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[index];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f86245e - i11) * 5;
        while (i11 < this.f86245e) {
            Object[] objArr = this.f86246f;
            Object obj = objArr[i11 - 1];
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[l.indexSegment(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (l.indexSegment(getIndex(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(getIndex(), ((this.f86245e - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.f86247g = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.f86247g) {
            this.f86247g = false;
            return a();
        }
        c(31);
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime(Object[] objArr, int i10, int i11, int i12) {
        setIndex(i10);
        setSize(i11);
        this.f86245e = i12;
        if (this.f86246f.length < i12) {
            this.f86246f = new Object[i12];
        }
        this.f86246f[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f86247g = r02;
        b(i10 - r02, 1);
    }
}
