package z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements Set, lv.h {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f96818b;

    public g0(u0 parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        this.f96818b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<Object, Object>> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f96818b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (kotlin.jvm.internal.h1.isMutableMapEntry(obj)) {
            return contains((Map.Entry<Object, Object>) obj);
        }
        return false;
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
            Map.Entry entry = (Map.Entry) it.next();
            if (!kotlin.jvm.internal.e0.areEqual(this.f96818b.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f96818b.f96869e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f96818b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new f0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (kotlin.jvm.internal.h1.isMutableMapEntry(obj)) {
            return remove((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        u0 u0Var = this.f96818b;
        long[] jArr = u0Var.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Iterator<? extends Object> it = elements.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            i10 = i12;
                            if (kotlin.jvm.internal.e0.areEqual(entry.getKey(), u0Var.f96866b[i15]) && kotlin.jvm.internal.e0.areEqual(entry.getValue(), u0Var.f96867c[i15])) {
                                u0Var.removeValueAt(i15);
                                z10 = true;
                                break;
                            }
                            i12 = i10;
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return z10;
                }
            }
            if (i11 == length) {
                return z10;
            }
            i11++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        u0 u0Var = this.f96818b;
        long[] jArr = u0Var.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = i12;
                                u0Var.removeValueAt(i15);
                                z10 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            i10 = i12;
                            if (!kotlin.jvm.internal.e0.areEqual(entry.getKey(), u0Var.f96866b[i15]) || !kotlin.jvm.internal.e0.areEqual(entry.getValue(), u0Var.f96867c[i15])) {
                                i12 = i10;
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return z10;
                }
            }
            if (i11 == length) {
                return z10;
            }
            i11++;
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
    public boolean add(Map.Entry<Object, Object> element) {
        kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(Map.Entry<Object, Object> element) {
        kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
        return kotlin.jvm.internal.e0.areEqual(this.f96818b.get(element.getKey()), element.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((r2 & ((~r2) << 6)) & r11) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.util.Map.Entry<java.lang.Object, java.lang.Object> r22) {
        /*
            r21 = this;
            java.lang.String r0 = "element"
            r1 = r22
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.getKey()
            if (r0 == 0) goto L12
            int r3 = r0.hashCode()
            goto L13
        L12:
            r3 = 0
        L13:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            r5 = r21
            z.u0 r6 = r5.f96818b
            int r7 = r6.f96868d
            int r3 = r3 >>> 7
            r3 = r3 & r7
            r8 = 0
        L26:
            long[] r9 = r6.f96865a
            int r10 = r3 >> 3
            r11 = r3 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r3
            r15 = 0
            long r2 = (long) r11
            long r2 = -r2
            r11 = 63
            long r2 = r2 >> r11
            long r2 = r2 & r9
            long r2 = r2 | r12
            long r9 = (long) r4
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r2
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L55:
            r17 = 0
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 == 0) goto L79
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r16 + r13
            r13 = r13 & r7
            r19 = r11
            java.lang.Object[] r11 = r6.f96866b
            r11 = r11[r13]
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r0)
            if (r11 == 0) goto L71
            goto L86
        L71:
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            r11 = r19
            goto L55
        L79:
            r19 = r11
            long r9 = ~r2
            r11 = 6
            long r9 = r9 << r11
            long r2 = r2 & r9
            long r2 = r2 & r19
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 == 0) goto L9b
            r13 = -1
        L86:
            if (r13 < 0) goto L9a
            java.lang.Object[] r0 = r6.f96867c
            r0 = r0[r13]
            java.lang.Object r1 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
            if (r0 == 0) goto L9a
            r6.removeValueAt(r13)
            return r14
        L9a:
            return r15
        L9b:
            int r8 = r8 + 8
            int r3 = r16 + r8
            r3 = r3 & r7
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g0.remove(java.util.Map$Entry):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }
}
