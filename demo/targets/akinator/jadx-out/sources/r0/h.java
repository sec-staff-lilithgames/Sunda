package r0;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import z.m1;
import z.u0;
import z.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f83667a;

    public /* synthetic */ h(u0 u0Var) {
        this.f83667a = u0Var;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m5998addimpl(u0 u0Var, Object obj, Object obj2) {
        int iFindInsertIndex = u0Var.findInsertIndex(obj);
        int i10 = 0;
        int i11 = 1;
        boolean z10 = iFindInsertIndex < 0;
        u uVar = null;
        Object obj3 = z10 ? null : u0Var.f96867c[iFindInsertIndex];
        if (obj3 != null) {
            if (obj3 instanceof v0) {
                e0.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((v0) obj3).add(obj2);
            } else if (obj3 != obj2) {
                v0 v0Var = new v0(i10, i11, uVar);
                e0.checkNotNull(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                v0Var.add(obj3);
                v0Var.add(obj2);
                obj2 = v0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            u0Var.f96867c[iFindInsertIndex] = obj2;
            return;
        }
        int i12 = ~iFindInsertIndex;
        u0Var.f96866b[i12] = obj;
        u0Var.f96867c[i12] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m5999anyScopeOfimpl(z.u0 r13, java.lang.Object r14, kv.l r15) {
        /*
            java.lang.Object r13 = r13.get(r14)
            r14 = 0
            if (r13 == 0) goto L67
            boolean r0 = r13 instanceof z.v0
            r1 = 1
            if (r0 == 0) goto L5a
            z.v0 r13 = (z.v0) r13
            java.lang.Object[] r0 = r13.f96888b
            long[] r13 = r13.f96887a
            int r2 = r13.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L67
            r3 = r14
        L18:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L55
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r14
        L32:
            if (r8 >= r6) goto L53
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4f
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            java.lang.Object r9 = r15.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4f
            return r1
        L4f:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L32
        L53:
            if (r6 != r7) goto L67
        L55:
            if (r3 == r2) goto L67
            int r3 = r3 + 1
            goto L18
        L5a:
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L67
            return r1
        L67:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h.m5999anyScopeOfimpl(z.u0, java.lang.Object, kv.l):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* renamed from: asMap-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.Object, java.util.Set<java.lang.Object>> m6000asMapimpl(z.u0 r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object[] r1 = r15.f96866b
            java.lang.Object[] r2 = r15.f96867c
            long[] r15 = r15.f96865a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6e
            r4 = 0
            r5 = r4
        L12:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L69
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L67
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L63
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            java.lang.String r13 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.e0.checkNotNull(r12, r13)
            boolean r13 = r11 instanceof z.v0
            if (r13 == 0) goto L53
            java.lang.String r13 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            kotlin.jvm.internal.e0.checkNotNull(r11, r13)
            z.v0 r11 = (z.v0) r11
            java.util.Set r11 = r11.asSet()
            goto L60
        L53:
            java.lang.String r13 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.e0.checkNotNull(r11, r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.Set r11 = uu.c2.mutableSetOf(r11)
        L60:
            r0.put(r12, r11)
        L63:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L67:
            if (r8 != r9) goto L6e
        L69:
            if (r5 == r3) goto L6e
            int r5 = r5 + 1
            goto L12
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h.m6000asMapimpl(z.u0):java.util.Map");
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h m6001boximpl(u0 u0Var) {
        return new h(u0Var);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m6002clearimpl(u0 u0Var) {
        u0Var.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ u0 m6004constructorimpl$default(u0 u0Var, int i10, u uVar) {
        if ((i10 & 1) != 0) {
            u0Var = m1.mutableScatterMapOf();
        }
        return m6003constructorimpl(u0Var);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m6005containsimpl(u0 u0Var, Object obj) {
        return u0Var.containsKey(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6006equalsimpl(u0 u0Var, Object obj) {
        return (obj instanceof h) && e0.areEqual(u0Var, ((h) obj).m6017unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6007equalsimpl0(u0 u0Var, u0 u0Var2) {
        return e0.areEqual(u0Var, u0Var2);
    }

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m6008forEachScopeOfimpl(u0 u0Var, Object obj, l lVar) {
        Object obj2 = u0Var.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof v0)) {
            lVar.invoke(obj2);
            return;
        }
        v0 v0Var = (v0) obj2;
        Object[] objArr = v0Var.f96888b;
        long[] jArr = v0Var.f96887a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        lVar.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m6009getSizeimpl(u0 u0Var) {
        return u0Var.getSize();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6010hashCodeimpl(u0 u0Var) {
        return u0Var.hashCode();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m6011removeimpl(u0 u0Var, Object obj, Object obj2) {
        Object obj3 = u0Var.get(obj);
        if (obj3 == null) {
            return false;
        }
        if (!(obj3 instanceof v0)) {
            if (!e0.areEqual(obj3, obj2)) {
                return false;
            }
            u0Var.remove(obj);
            return true;
        }
        v0 v0Var = (v0) obj3;
        boolean zRemove = v0Var.remove(obj2);
        if (zRemove && v0Var.isEmpty()) {
            u0Var.remove(obj);
        }
        return zRemove;
    }

    /* renamed from: removeIf-impl, reason: not valid java name */
    public static final void m6012removeIfimpl(u0 u0Var, p pVar) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        int i11;
        boolean zBooleanValue;
        long[] jArr3;
        long j12;
        long[] jArr4 = u0Var.f96865a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j13 = jArr4[i12];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j13 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c10 = c11;
                        Object obj = u0Var.f96866b[i16];
                        j11 = j14;
                        Object obj2 = u0Var.f96867c[i16];
                        e0.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                        if (obj2 instanceof v0) {
                            e0.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            v0 v0Var = (v0) obj2;
                            Object[] objArr = v0Var.f96888b;
                            long[] jArr5 = v0Var.f96887a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                j10 = j13;
                                int i17 = i13;
                                int i18 = 0;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    Object[] objArr2 = objArr;
                                    i10 = i15;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j15 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i21 = (i18 << 3) + i20;
                                                j12 = j15;
                                                if (((Boolean) pVar.invoke(obj, objArr2[i21])).booleanValue()) {
                                                    v0Var.removeElementAt(i21);
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                j12 = j15;
                                            }
                                            j15 = j12 >> i17;
                                            i20++;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i19 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    i15 = i10;
                                    objArr = objArr2;
                                    jArr4 = jArr2;
                                    i17 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j10 = j13;
                                i10 = i15;
                            }
                            zBooleanValue = v0Var.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j10 = j13;
                            i10 = i15;
                            e0.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = ((Boolean) pVar.invoke(obj, obj2)).booleanValue();
                        }
                        if (zBooleanValue) {
                            u0Var.removeValueAt(i16);
                        }
                        i11 = 8;
                    } else {
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i15;
                        i11 = i13;
                    }
                    j13 = j10 >> i11;
                    i15 = i10 + 1;
                    i13 = i11;
                    c11 = c10;
                    j14 = j11;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr4 = jArr;
        }
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m6013removeScopeimpl(u0 u0Var, Object obj) {
        boolean zIsEmpty;
        long[] jArr = u0Var.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = u0Var.f96866b[i13];
                        Object obj3 = u0Var.f96867c[i13];
                        if (obj3 instanceof v0) {
                            e0.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            v0 v0Var = (v0) obj3;
                            v0Var.remove(obj);
                            zIsEmpty = v0Var.isEmpty();
                        } else {
                            zIsEmpty = obj3 == obj;
                        }
                        if (zIsEmpty) {
                            u0Var.removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m6014removeScopeIfimpl(u0 u0Var, l lVar) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zBooleanValue;
        v0 v0Var;
        long[] jArr3;
        int i11;
        v0 v0Var2;
        long[] jArr4 = u0Var.f96865a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr4[i12];
            char c11 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j12 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c10 = c11;
                        Object obj = u0Var.f96866b[i16];
                        Object obj2 = u0Var.f96867c[i16];
                        j11 = j13;
                        if (obj2 instanceof v0) {
                            e0.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            v0 v0Var3 = (v0) obj2;
                            Object[] objArr = v0Var3.f96888b;
                            long[] jArr5 = v0Var3.f96887a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i17 = i13;
                                v0 v0Var4 = v0Var3;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr5[i18];
                                    j10 = j12;
                                    if ((((~j14) << c10) & j14 & j11) != j11) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j14 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i21 = (i18 << 3) + i20;
                                                i11 = i20;
                                                if (((Boolean) lVar.invoke(objArr[i21])).booleanValue()) {
                                                    v0Var2 = v0Var4;
                                                    v0Var2.removeElementAt(i21);
                                                }
                                                j14 >>= i17;
                                                v0Var4 = v0Var2;
                                                i20 = i11 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i11 = i20;
                                            }
                                            v0Var2 = v0Var4;
                                            j14 >>= i17;
                                            v0Var4 = v0Var2;
                                            i20 = i11 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        v0Var = v0Var4;
                                        if (i19 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        v0Var = v0Var4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    v0Var4 = v0Var;
                                    j12 = j10;
                                    jArr4 = jArr2;
                                    i17 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j10 = j12;
                                v0Var = v0Var3;
                            }
                            zBooleanValue = v0Var.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j10 = j12;
                            e0.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = ((Boolean) lVar.invoke(obj2)).booleanValue();
                        }
                        if (zBooleanValue) {
                            u0Var.removeValueAt(i16);
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr4;
                        j10 = j12;
                        c10 = c11;
                        j11 = j13;
                        i10 = i13;
                    }
                    j12 = j10 >> i10;
                    i15++;
                    i13 = i10;
                    c11 = c10;
                    j13 = j11;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m6015setimpl(u0 u0Var, Object obj, Object obj2) {
        u0Var.set(obj, obj2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6016toStringimpl(u0 u0Var) {
        return "ScopeMap(map=" + u0Var + ')';
    }

    public boolean equals(Object obj) {
        return m6006equalsimpl(this.f83667a, obj);
    }

    public final u0 getMap() {
        return this.f83667a;
    }

    public int hashCode() {
        return m6010hashCodeimpl(this.f83667a);
    }

    public String toString() {
        return m6016toStringimpl(this.f83667a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ u0 m6017unboximpl() {
        return this.f83667a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> u0 m6003constructorimpl(u0 u0Var) {
        return u0Var;
    }
}
