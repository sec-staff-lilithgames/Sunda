package r0;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import kv.l;
import qv.m;
import qv.v;
import uu.f0;
import z.f1;
import z.g1;
import z.t0;
import z.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f83646a;

    public /* synthetic */ b(u0 u0Var) {
        this.f83646a = u0Var;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m5979addimpl(u0 u0Var, Object obj, Object obj2) {
        int iFindInsertIndex = u0Var.findInsertIndex(obj);
        boolean z10 = iFindInsertIndex < 0;
        Object obj3 = z10 ? null : u0Var.f96867c[iFindInsertIndex];
        h1.isMutableList(obj3);
        if (obj3 != null) {
            if (obj3 instanceof t0) {
                e0.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                t0 t0Var = (t0) obj3;
                t0Var.add(obj2);
                obj2 = t0Var;
            } else {
                obj2 = g1.mutableObjectListOf(obj3, obj2);
            }
        }
        if (!z10) {
            u0Var.f96867c[iFindInsertIndex] = obj2;
            return;
        }
        int i10 = ~iFindInsertIndex;
        u0Var.f96866b[i10] = obj;
        u0Var.f96867c[i10] = obj2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m5980boximpl(u0 u0Var) {
        return new b(u0Var);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m5981clearimpl(u0 u0Var) {
        u0Var.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ u0 m5983constructorimpl$default(u0 u0Var, int i10, u uVar) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            u0Var = new u0(0, i11, null);
        }
        return m5982constructorimpl(u0Var);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m5984containsimpl(u0 u0Var, Object obj) {
        return u0Var.contains(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5985equalsimpl(u0 u0Var, Object obj) {
        return (obj instanceof b) && e0.areEqual(u0Var, ((b) obj).m5997unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5986equalsimpl0(u0 u0Var, u0 u0Var2) {
        return e0.areEqual(u0Var, u0Var2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m5987forEachValueimpl(u0 u0Var, Object obj, l lVar) {
        Object obj2 = u0Var.get(obj);
        if (obj2 != null) {
            if (!(obj2 instanceof t0)) {
                lVar.invoke(obj2);
                return;
            }
            f1 f1Var = (f1) obj2;
            Object[] objArr = f1Var.f96812a;
            int i10 = f1Var.f96813b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj3 = objArr[i11];
                e0.checkNotNull(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                lVar.invoke(obj3);
            }
        }
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final f1 m5988getimpl(u0 u0Var, Object obj) {
        Object obj2 = u0Var.get(obj);
        return obj2 == null ? g1.emptyObjectList() : obj2 instanceof t0 ? (f1) obj2 : g1.objectListOf(obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5989hashCodeimpl(u0 u0Var) {
        return u0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5990isEmptyimpl(u0 u0Var) {
        return u0Var.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m5991isNotEmptyimpl(u0 u0Var) {
        return u0Var.isNotEmpty();
    }

    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final Object m5992removeFirstimpl(u0 u0Var, Object obj) {
        Object obj2 = u0Var.get(obj);
        if (obj2 == null) {
            return null;
        }
        if (!(obj2 instanceof t0)) {
            u0Var.remove(obj);
            return obj2;
        }
        t0 t0Var = (t0) obj2;
        Object objRemoveAt = t0Var.removeAt(0);
        if (t0Var.isEmpty()) {
            u0Var.remove(obj);
        }
        if (t0Var.getSize() == 1) {
            u0Var.set(obj, t0Var.first());
        }
        return objRemoveAt;
    }

    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final Object m5993removeLastimpl(u0 u0Var, Object obj) {
        Object obj2 = u0Var.get(obj);
        if (obj2 == null) {
            return null;
        }
        if (!(obj2 instanceof t0)) {
            u0Var.remove(obj);
            return obj2;
        }
        t0 t0Var = (t0) obj2;
        Object objRemoveLast = a.removeLast(t0Var);
        e0.checkNotNull(objRemoveLast, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (t0Var.isEmpty()) {
            u0Var.remove(obj);
        }
        if (t0Var.getSize() == 1) {
            u0Var.set(obj, t0Var.first());
        }
        return objRemoveLast;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m5994removeValueIfimpl(u0 u0Var, Object obj, l lVar) {
        Object obj2 = u0Var.get(obj);
        if (obj2 != null) {
            if (!(obj2 instanceof t0)) {
                if (((Boolean) lVar.invoke(obj2)).booleanValue()) {
                    u0Var.remove(obj);
                    return;
                }
                return;
            }
            t0 t0Var = (t0) obj2;
            int i10 = t0Var.f96813b;
            Object[] objArr = t0Var.f96812a;
            int i11 = 0;
            m mVarUntil = v.until(0, i10);
            int first = mVarUntil.getFirst();
            int last = mVarUntil.getLast();
            if (first <= last) {
                while (true) {
                    objArr[first - i11] = objArr[first];
                    if (((Boolean) lVar.invoke(objArr[first])).booleanValue()) {
                        i11++;
                    }
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            f0.fill(objArr, (Object) null, i10 - i11, i10);
            t0Var.f96813b -= i11;
            if (t0Var.isEmpty()) {
                u0Var.remove(obj);
            }
            if (t0Var.getSize() == 0) {
                u0Var.set(obj, t0Var.first());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5995toStringimpl(u0 u0Var) {
        return "MultiValueMap(map=" + u0Var + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z.f1 m5996valuesimpl(z.u0 r14) {
        /*
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lb
            z.f1 r14 = z.g1.emptyObjectList()
            return r14
        Lb:
            z.t0 r0 = new z.t0
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object[] r1 = r14.f96867c
            long[] r14 = r14.f96865a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L64
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L62
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof z.t0
            if (r11 == 0) goto L56
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            kotlin.jvm.internal.e0.checkNotNull(r10, r11)
            z.t0 r10 = (z.t0) r10
            r0.addAll(r10)
            goto L5e
        L56:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.e0.checkNotNull(r10, r11)
            r0.add(r10)
        L5e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L62:
            if (r7 != r8) goto L69
        L64:
            if (r4 == r3) goto L69
            int r4 = r4 + 1
            goto L1d
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.m5996valuesimpl(z.u0):z.f1");
    }

    public boolean equals(Object obj) {
        return m5985equalsimpl(this.f83646a, obj);
    }

    public int hashCode() {
        return m5989hashCodeimpl(this.f83646a);
    }

    public String toString() {
        return m5995toStringimpl(this.f83646a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ u0 m5997unboximpl() {
        return this.f83646a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> u0 m5982constructorimpl(u0 u0Var) {
        return u0Var;
    }
}
