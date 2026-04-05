package t0;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.e0;
import p0.a3;
import qv.v;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f86222c;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f86223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86224f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86225g;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f86222c = objArr;
        this.f86223e = objArr2;
        this.f86224f = i10;
        this.f86225g = i11;
        if (!(size() > 32)) {
            a3.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        y0.a.m8013assert(size() - l.rootSize(size()) <= v.coerceAtMost(objArr2.length, 32));
    }

    public static Object[] a(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] objArrCopyOf;
        int iIndexSegment = l.indexSegment(i11, i10);
        if (i10 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            f0.copyInto(objArr, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            dVar.setValue(objArr[31]);
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iIndexSegment];
        e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = a((Object[]) obj2, i12, i11, obj, dVar);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || objArrCopyOf2[iIndexSegment] == null) {
                break;
            }
            Object obj3 = objArr[iIndexSegment];
            e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iIndexSegment] = a((Object[]) obj3, i12, 0, dVar.getValue(), dVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] c(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrC;
        int iIndexSegment = l.indexSegment(i11, i10);
        if (i10 == 5) {
            dVar.setValue(objArr[iIndexSegment]);
            objArrC = null;
        } else {
            Object obj = objArr[iIndexSegment];
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrC = c((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrC == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iIndexSegment] = objArrC;
        return objArrCopyOf;
    }

    public static Object[] i(Object[] objArr, int i10, int i11, Object obj) {
        int iIndexSegment = l.indexSegment(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iIndexSegment];
        e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iIndexSegment] = i((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    public final e b(Object obj, Object[] objArr, int i10) {
        int size = size() - h();
        Object[] objArr2 = this.f86223e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            f0.copyInto(objArr2, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, size() + 1, this.f86225g);
        }
        Object obj2 = objArr2[31];
        f0.copyInto(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return d(objArr, objArrCopyOf, l.presizedBufferWith(obj2));
    }

    public final e d(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f86225g;
        if (size <= (1 << i10)) {
            return new e(e(objArr, objArr2, i10), objArr3, size() + 1, i10);
        }
        int i11 = i10 + 5;
        return new e(e(l.presizedBufferWith(objArr), objArr2, i11), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] e(java.lang.Object[] r4, java.lang.Object[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = t0.l.indexSegment(r0, r6)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r6 != r1) goto L21
            r4[r0] = r5
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r6 = r6 - r1
            java.lang.Object[] r5 = r3.e(r2, r5, r6)
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.e.e(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    public final Object[] f(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrCopyOf;
        int iIndexSegment = l.indexSegment(i11, i10);
        if (i10 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            f0.copyInto(objArr, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = dVar.getValue();
            dVar.setValue(objArr[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = objArr[31] == null ? l.indexSegment(h() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iIndexSegment + 1;
        if (i13 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIndexSegment2] = f((Object[]) obj, i12, 0, dVar);
                if (iIndexSegment2 == i13) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = f((Object[]) obj2, i12, i11, dVar);
        return objArrCopyOf2;
    }

    public final b g(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        y0.a.m8013assert(i12 < size);
        if (size != 1) {
            Object[] objArr2 = this.f86223e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            int i13 = size - 1;
            if (i12 < i13) {
                f0.copyInto(objArr2, objArrCopyOf, i12, i12 + 1, size);
            }
            objArrCopyOf[i13] = null;
            return new e(objArr, objArrCopyOf, (i10 + size) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                e0.checkNotNullExpressionValue(objArr, "copyOf(...)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrC = c(objArr, i11, i10 - 1, dVar);
        e0.checkNotNull(objArrC);
        Object value = dVar.getValue();
        e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) value;
        if (objArrC[1] != null) {
            return new e(objArrC, objArr3, i10, i11);
        }
        Object obj = objArrC[0];
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr3, i10, i11 - 5);
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        Object[] objArr;
        y0.d.checkElementIndex$runtime(i10, size());
        if (h() <= i10) {
            objArr = this.f86223e;
        } else {
            objArr = this.f86222c;
            for (int i11 = this.f86225g; i11 > 0; i11 -= 5) {
                Object obj = objArr[l.indexSegment(i10, i11)];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f86224f;
    }

    public final int h() {
        return l.rootSize(size());
    }

    @Override // uu.g, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        y0.d.checkPositionIndex$runtime(i10, size());
        return new g(this.f86222c, this.f86223e, i10, size(), (this.f86225g / 5) + 1);
    }

    @Override // t0.b, s0.j
    public s0.j removeAt(int i10) {
        y0.d.checkElementIndex$runtime(i10, size());
        int iH = h();
        Object[] objArr = this.f86222c;
        int i11 = this.f86225g;
        return i10 >= iH ? g(objArr, iH, i11, i10 - iH) : g(f(objArr, i11, i10, new d(this.f86223e[0])), iH, i11, 0);
    }

    @Override // t0.b, uu.g, java.util.List, s0.j
    public s0.j set(int i10, Object obj) {
        y0.d.checkElementIndex$runtime(i10, size());
        int iH = h();
        Object[] objArr = this.f86222c;
        Object[] objArr2 = this.f86223e;
        int i11 = this.f86225g;
        if (iH > i10) {
            return new e(i(objArr, i11, i10, obj), objArr2, size(), i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(objArr, objArrCopyOf, size(), i11);
    }

    @Override // t0.b, java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j add(Object obj) {
        int size = size() - h();
        Object[] objArr = this.f86222c;
        Object[] objArr2 = this.f86223e;
        if (size >= 32) {
            return d(objArr, objArr2, l.presizedBufferWith(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = obj;
        return new e(objArr, objArrCopyOf, size() + 1, this.f86225g);
    }

    @Override // t0.b, s0.j, s0.h
    public s0.j removeAll(kv.l lVar) {
        f fVarBuilder = builder();
        fVarBuilder.removeAllWithPredicate(lVar);
        return fVarBuilder.build();
    }

    @Override // t0.b, s0.j, s0.h
    public f builder() {
        return new f(this, this.f86222c, this.f86223e, this.f86225g);
    }

    @Override // t0.b, java.util.List, s0.j
    public s0.j add(int i10, Object obj) {
        y0.d.checkPositionIndex$runtime(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int iH = h();
        Object[] objArr = this.f86222c;
        if (i10 >= iH) {
            return b(obj, objArr, i10 - iH);
        }
        d dVar = new d(null);
        return b(dVar.getValue(), a(objArr, this.f86225g, i10, obj, dVar), 0);
    }
}
