package z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 implements Set, lv.h {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f96883b;

    public n0(u0 parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        this.f96883b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f96883b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f96883b.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f96883b.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f96883b.f96869e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f96883b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new m0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r12 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r20
            if (r0 == 0) goto L9
            int r2 = r0.hashCode()
            goto La
        L9:
            r2 = 0
        La:
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            r4 = r19
            z.u0 r5 = r4.f96883b
            int r6 = r5.f96868d
            int r2 = r2 >>> 7
            r2 = r2 & r6
            r7 = 0
        L1d:
            long[] r8 = r5.f96865a
            int r9 = r2 >> 3
            r10 = r2 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r3
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L49:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L6b
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r2
            r12 = r12 & r6
            r18 = 0
            java.lang.Object[] r1 = r5.f96866b
            r1 = r1[r12]
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r0)
            if (r1 == 0) goto L64
            goto L77
        L64:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L49
        L6b:
            r18 = 0
            long r10 = ~r8
            r1 = 6
            long r10 = r10 << r1
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r1 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 == 0) goto L7e
            r12 = -1
        L77:
            if (r12 < 0) goto L7d
            r5.removeValueAt(r12)
            return r13
        L7d:
            return r18
        L7e:
            int r7 = r7 + 8
            int r2 = r2 + r7
            r2 = r2 & r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n0.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        u0 u0Var = this.f96883b;
        long[] jArr = u0Var.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (uu.y0.contains(elements, u0Var.f96866b[i13])) {
                            u0Var.removeValueAt(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        u0 u0Var = this.f96883b;
        long[] jArr = u0Var.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!uu.y0.contains(elements, u0Var.f96866b[i13])) {
                            u0Var.removeValueAt(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }
}
