package p0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements y0, m4, m3, u0, q2, d1.s {
    public kv.p A;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f80260b;

    /* renamed from: c, reason: collision with root package name */
    public final d f80261c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f80262e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f80263f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f80264g;

    /* renamed from: h, reason: collision with root package name */
    public final s4 f80265h;

    /* renamed from: i, reason: collision with root package name */
    public final z.u0 f80266i;

    /* renamed from: j, reason: collision with root package name */
    public final z.v0 f80267j;

    /* renamed from: k, reason: collision with root package name */
    public final z.v0 f80268k;

    /* renamed from: l, reason: collision with root package name */
    public final z.u0 f80269l;

    /* renamed from: m, reason: collision with root package name */
    public final q0.a f80270m;

    /* renamed from: n, reason: collision with root package name */
    public final q0.a f80271n;

    /* renamed from: o, reason: collision with root package name */
    public final z.u0 f80272o;

    /* renamed from: p, reason: collision with root package name */
    public z.u0 f80273p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80274q;

    /* renamed from: r, reason: collision with root package name */
    public u2 f80275r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f80276s;

    /* renamed from: t, reason: collision with root package name */
    public int f80277t;

    /* renamed from: u, reason: collision with root package name */
    public final r0 f80278u;

    /* renamed from: v, reason: collision with root package name */
    public final z0.c0 f80279v;

    /* renamed from: w, reason: collision with root package name */
    public final z f80280w;

    /* renamed from: x, reason: collision with root package name */
    public final zu.m f80281x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f80282y;

    /* renamed from: z, reason: collision with root package name */
    public int f80283z;

    public j0(f0 f0Var, d dVar, zu.m mVar) {
        this.f80260b = f0Var;
        this.f80261c = dVar;
        kotlin.jvm.internal.u uVar = null;
        this.f80262e = new AtomicReference(null);
        this.f80263f = new Object();
        int i10 = 0;
        int i11 = 1;
        Set<Object> setAsMutableSet = new z.v0(i10, i11, uVar).asMutableSet();
        this.f80264g = setAsMutableSet;
        s4 s4Var = new s4();
        if (f0Var.getCollectingCallByInformation$runtime()) {
            s4Var.collectCalledByInformation();
        }
        if (f0Var.getCollectingSourceInformation$runtime()) {
            s4Var.collectSourceInformation();
        }
        this.f80265h = s4Var;
        this.f80266i = r0.h.m6004constructorimpl$default(null, 1, null);
        this.f80267j = new z.v0(i10, i11, uVar);
        this.f80268k = new z.v0(i10, i11, uVar);
        this.f80269l = r0.h.m6004constructorimpl$default(null, 1, null);
        q0.a aVar = new q0.a();
        this.f80270m = aVar;
        q0.a aVar2 = new q0.a();
        this.f80271n = aVar2;
        this.f80272o = r0.h.m6004constructorimpl$default(null, 1, null);
        this.f80273p = r0.h.m6004constructorimpl$default(null, 1, null);
        r0 r0Var = new r0(null, false, f0Var, 3, null);
        this.f80278u = r0Var;
        this.f80279v = new z0.c0();
        z zVar = new z(dVar, f0Var, s4Var, setAsMutableSet, aVar, aVar2, r0Var, this);
        f0Var.registerComposer$runtime(zVar);
        this.f80280w = zVar;
        this.f80281x = mVar;
        this.f80282y = f0Var instanceof n3;
        this.A = m.f80332a.getLambda$954879418$runtime();
    }

    public static void m(s4 s4Var) {
        Object[] slots = s4Var.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            k3 k3Var = obj instanceof k3 ? (k3) obj : null;
            if (k3Var != null) {
                arrayList.add(k3Var);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k3 k3Var2 = (k3) arrayList.get(i10);
            b anchor = k3Var2.getAnchor();
            if (anchor != null && !s4Var.slotsOf$runtime(anchor.toIndexFor(s4Var)).contains(k3Var2)) {
                a3.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + k3Var2 + " encountered, scope found at " + uu.k0.indexOf((k3[]) s4Var.getSlots(), k3Var2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            z.u0 r2 = r0.f80266i
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L9e
            boolean r3 = r2 instanceof z.v0
            z.v0 r4 = r0.f80267j
            z.v0 r5 = r0.f80268k
            z.u0 r6 = r0.f80272o
            if (r3 == 0) goto L7f
            z.v0 r2 = (z.v0) r2
            java.lang.Object[] r3 = r2.f96888b
            long[] r2 = r2.f96887a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9e
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7a
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L77
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6e
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            p0.k3 r15 = (p0.k3) r15
            boolean r16 = r0.h.m6011removeimpl(r6, r1, r15)
            if (r16 != 0) goto L6e
            p0.t1 r8 = r15.invalidateForResult(r1)
            r17 = r13
            p0.t1 r13 = p0.t1.f80476b
            if (r8 == r13) goto L70
            boolean r8 = r15.isConditional()
            if (r8 == 0) goto L6a
            if (r21 != 0) goto L6a
            r5.add(r15)
            goto L70
        L6a:
            r4.add(r15)
            goto L70
        L6e:
            r17 = r13
        L70:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L77:
            r8 = r13
            if (r12 != r8) goto L9e
        L7a:
            if (r9 == r7) goto L9e
            int r9 = r9 + 1
            goto L22
        L7f:
            p0.k3 r2 = (p0.k3) r2
            boolean r3 = r0.h.m6011removeimpl(r6, r1, r2)
            if (r3 != 0) goto L9e
            p0.t1 r1 = r2.invalidateForResult(r1)
            p0.t1 r3 = p0.t1.f80476b
            if (r1 == r3) goto L9e
            boolean r1 = r2.isConditional()
            if (r1 == 0) goto L9b
            if (r21 != 0) goto L9b
            r5.add(r2)
            return
        L9b:
            r4.add(r2)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.a(java.lang.Object, boolean):void");
    }

    @Override // p0.y0
    public void abandonChanges() {
        this.f80262e.set(null);
        this.f80270m.clear();
        this.f80271n.clear();
        Set<j4> set = this.f80264g;
        if (set.isEmpty()) {
            return;
        }
        z0.c0 c0Var = this.f80279v;
        try {
            c0Var.prepare(set, this.f80280w.getErrorContext$runtime());
            c0Var.dispatchAbandons();
        } finally {
            c0Var.clear();
        }
    }

    @Override // p0.y0
    public void applyChanges() {
        synchronized (this.f80263f) {
            try {
                c(this.f80270m);
                h();
            } catch (Throwable th2) {
                try {
                    if (!this.f80264g.isEmpty()) {
                        z0.c0 c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                        } catch (Throwable th3) {
                            c0Var.clear();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    abandonChanges();
                    throw th4;
                }
            }
        }
    }

    @Override // p0.y0
    public void applyLateChanges() {
        synchronized (this.f80263f) {
            try {
                if (this.f80271n.isNotEmpty()) {
                    c(this.f80271n);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f80264g.isEmpty()) {
                        z0.c0 c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                        } catch (Throwable th3) {
                            c0Var.clear();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185 A[EDGE_INSN: B:73:0x0185->B:224:0x0124 BREAK  A[LOOP:13: B:63:0x0153->B:74:0x0187]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.b(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(q0.a r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.c(q0.a):void");
    }

    @Override // p0.y0
    public void changesApplied() {
        z0.c0 c0Var;
        synchronized (this.f80263f) {
            try {
                this.f80280w.changesApplied$runtime();
                if (!this.f80264g.isEmpty()) {
                    c0Var = this.f80279v;
                    try {
                        c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                        c0Var.dispatchAbandons();
                        c0Var.clear();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f80264g.isEmpty()) {
                        c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // p0.y0
    public void composeContent(kv.p pVar) {
        try {
            synchronized (this.f80263f) {
                g();
                z.u0 u0Var = this.f80273p;
                this.f80273p = r0.h.m6004constructorimpl$default(null, 1, null);
                try {
                    this.f80280w.m5857composeContentZbOJvo$runtime(u0Var, pVar, null);
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f80264g.isEmpty()) {
                    z0.c0 c0Var = this.f80279v;
                    try {
                        c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                        c0Var.dispatchAbandons();
                        c0Var.clear();
                    } catch (Throwable th3) {
                        c0Var.clear();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                abandonChanges();
                throw th4;
            }
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.f80280w.stacksSize$runtime();
    }

    public final void d() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zIsEmpty;
        long[] jArr3;
        int i12;
        int i13;
        z.u0 u0Var = this.f80269l;
        long[] jArr4 = u0Var.f96865a;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = u0Var.f96866b[i18];
                            Object obj2 = u0Var.f96867c[i18];
                            if (obj2 instanceof z.v0) {
                                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                z.v0 v0Var = (z.v0) obj2;
                                Object[] objArr = v0Var.f96888b;
                                long[] jArr5 = v0Var.f96887a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!r0.h.m6005containsimpl(this.f80266i, (d1) objArr[i24])) {
                                                        v0Var.removeElementAt(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zIsEmpty = v0Var.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zIsEmpty = !r0.h.m6005containsimpl(this.f80266i, (d1) obj2);
                            }
                            if (zIsEmpty) {
                                u0Var.removeValueAt(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        z.v0 v0Var2 = this.f80268k;
        if (!v0Var2.isNotEmpty()) {
            return;
        }
        Object[] objArr2 = v0Var2.f96888b;
        long[] jArr6 = v0Var2.f96887a;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((k3) objArr2[i28]).isConditional()) {
                            v0Var2.removeElementAt(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    @Override // p0.m4, p0.q2
    public void deactivate() {
        synchronized (this.f80263f) {
            try {
                if (!(this.f80275r == null)) {
                    a3.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.f80265h.getGroupsSize() > 0;
                if (z10 || !this.f80264g.isEmpty()) {
                    z0.j0 j0Var = z0.j0.f97136a;
                    Object objBeginSection = j0Var.beginSection("Compose:deactivate");
                    try {
                        z0.c0 c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            if (z10) {
                                this.f80261c.onBeginChanges();
                                v4 v4VarOpenWriter = this.f80265h.openWriter();
                                try {
                                    d0.deactivateCurrentGroup(v4VarOpenWriter, this.f80279v);
                                    v4VarOpenWriter.close(true);
                                    this.f80261c.onEndChanges();
                                    c0Var.dispatchRememberObservers();
                                } catch (Throwable th2) {
                                    v4VarOpenWriter.close(false);
                                    throw th2;
                                }
                            }
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                            j0Var.endSection(objBeginSection);
                        } catch (Throwable th3) {
                            c0Var.clear();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        z0.j0.f97136a.endSection(objBeginSection);
                        throw th4;
                    }
                }
                r0.h.m6002clearimpl(this.f80266i);
                r0.h.m6002clearimpl(this.f80269l);
                r0.h.m6002clearimpl(this.f80273p);
                this.f80270m.clear();
                this.f80271n.clear();
                this.f80280w.deactivate$runtime();
                this.f80283z = 1;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // p0.y0
    public <R> R delegateInvalidations(y0 y0Var, int i10, kv.a aVar) {
        if (y0Var == null || kotlin.jvm.internal.e0.areEqual(y0Var, this) || i10 < 0) {
            return (R) aVar.invoke();
        }
        this.f80276s = (j0) y0Var;
        this.f80277t = i10;
        try {
            return (R) aVar.invoke();
        } finally {
            this.f80276s = null;
            this.f80277t = 0;
        }
    }

    @Override // p0.y0, p0.e0
    public void dispose() {
        synchronized (this.f80263f) {
            try {
                if (this.f80280w.isComposing$runtime()) {
                    a3.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f80283z != 3) {
                    this.f80283z = 3;
                    this.A = m.f80332a.getLambda$1918065384$runtime();
                    q0.a deferredChanges$runtime = this.f80280w.getDeferredChanges$runtime();
                    if (deferredChanges$runtime != null) {
                        c(deferredChanges$runtime);
                    }
                    boolean z10 = this.f80265h.getGroupsSize() > 0;
                    if (z10 || !this.f80264g.isEmpty()) {
                        z0.c0 c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            if (z10) {
                                this.f80261c.onBeginChanges();
                                v4 v4VarOpenWriter = this.f80265h.openWriter();
                                try {
                                    d0.removeCurrentGroup(v4VarOpenWriter, this.f80279v);
                                    v4VarOpenWriter.close(true);
                                    this.f80261c.clear();
                                    this.f80261c.onEndChanges();
                                    c0Var.dispatchRememberObservers();
                                } catch (Throwable th2) {
                                    v4VarOpenWriter.close(false);
                                    throw th2;
                                }
                            }
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                        } catch (Throwable th3) {
                            c0Var.clear();
                            throw th3;
                        }
                    }
                    this.f80280w.dispose$runtime();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f80260b.unregisterComposition$runtime(this);
    }

    @Override // p0.y0
    public void disposeUnusedMovableContent(h2 h2Var) {
        z0.c0 c0Var = this.f80279v;
        try {
            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
            v4 v4VarOpenWriter = h2Var.getSlotTable$runtime().openWriter();
            try {
                d0.removeCurrentGroup(v4VarOpenWriter, c0Var);
                v4VarOpenWriter.close(true);
                c0Var.dispatchRememberObservers();
            } catch (Throwable th2) {
                v4VarOpenWriter.close(false);
                throw th2;
            }
        } finally {
            c0Var.clear();
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f80263f) {
            z10 = true;
            if (this.f80283z != 1) {
                z10 = false;
            }
            if (z10) {
                this.f80283z = 0;
            }
        }
        return z10;
    }

    public final List<tu.v> extractInvalidationsOf$runtime(b bVar) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        int i11;
        boolean zIsEmpty;
        Object obj;
        long j12;
        Object obj2;
        int i12;
        j0 j0Var = this;
        if (r0.h.m6009getSizeimpl(j0Var.f80273p) <= 0) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        z.u0 u0Var = j0Var.f80273p;
        long[] jArr3 = u0Var.f96865a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr3[i13];
                char c11 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j13 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            c10 = c11;
                            Object obj3 = u0Var.f96866b[i17];
                            j11 = j14;
                            Object obj4 = u0Var.f96867c[i17];
                            kotlin.jvm.internal.e0.checkNotNull(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            boolean z10 = obj4 instanceof z.v0;
                            int i18 = i14;
                            s4 s4Var = j0Var.f80265h;
                            if (z10) {
                                kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                z.v0 v0Var = (z.v0) obj4;
                                Object[] objArr = v0Var.f96888b;
                                long[] jArr4 = v0Var.f96887a;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j13;
                                    int i19 = 0;
                                    while (true) {
                                        long j15 = jArr4[i19];
                                        Object[] objArr2 = objArr;
                                        i10 = i16;
                                        if ((((~j15) << c10) & j15 & j11) != j11) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j15 & 255) < 128) {
                                                    j12 = j15;
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj5 = objArr2[i22];
                                                    obj2 = obj3;
                                                    k3 k3Var = (k3) obj2;
                                                    i12 = i21;
                                                    b anchor = k3Var.getAnchor();
                                                    if (anchor != null && s4Var.inGroup(bVar, anchor)) {
                                                        arrayList.add(tu.e0.to(k3Var, obj5));
                                                        v0Var.removeElementAt(i22);
                                                    }
                                                } else {
                                                    j12 = j15;
                                                    obj2 = obj3;
                                                    i12 = i21;
                                                }
                                                j15 = j12 >> i18;
                                                i21 = i12 + 1;
                                                obj3 = obj2;
                                            }
                                            obj = obj3;
                                            if (i20 != i18) {
                                                break;
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i16 = i10;
                                        objArr = objArr2;
                                        obj3 = obj;
                                        i18 = 8;
                                    }
                                } else {
                                    j10 = j13;
                                    i10 = i16;
                                }
                                zIsEmpty = v0Var.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                j10 = j13;
                                i10 = i16;
                                kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                k3 k3Var2 = (k3) obj3;
                                b anchor2 = k3Var2.getAnchor();
                                if (anchor2 == null || !s4Var.inGroup(bVar, anchor2)) {
                                    zIsEmpty = false;
                                } else {
                                    arrayList.add(tu.e0.to(k3Var2, obj4));
                                    zIsEmpty = true;
                                }
                            }
                            if (zIsEmpty) {
                                u0Var.removeValueAt(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            j10 = j13;
                            c10 = c11;
                            j11 = j14;
                            i10 = i16;
                            i11 = i14;
                        }
                        i16 = i10 + 1;
                        i14 = i11;
                        j13 = j10 >> i11;
                        j0Var = this;
                        c11 = c10;
                        j14 = j11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                j0Var = this;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    public final u2 f(boolean z10, kv.p pVar) {
        if (this.f80275r != null) {
            a3.throwIllegalStateException("A pausable composition is in progress");
        }
        u2 u2Var = new u2(this, this.f80260b, this.f80280w, this.f80264g, pVar, z10, this.f80261c, this.f80263f);
        this.f80275r = u2Var;
        return u2Var;
    }

    public final void g() {
        Object obj = k0.f80293a;
        AtomicReference atomicReference = this.f80262e;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (kotlin.jvm.internal.e0.areEqual(andSet, k0.f80293a)) {
                d0.composeRuntimeError("pending composition has not been applied");
                throw new tu.k();
            }
            if (andSet instanceof Set) {
                b((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                d0.composeRuntimeError("corrupt pendingModifications drain: " + atomicReference);
                throw new tu.k();
            }
            for (Set set : (Set[]) andSet) {
                b(set, true);
            }
        }
    }

    @Override // p0.y0
    public p4 getAndSetShouldPauseCallback(p4 p4Var) {
        return null;
    }

    public final kv.p getComposable() {
        return this.A;
    }

    public final z getComposer$runtime() {
        return this.f80280w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p0.u0
    public <T> T getCompositionService(t0 t0Var) {
        if (kotlin.jvm.internal.e0.areEqual(t0Var, k0.getObservableCompositionServiceKey())) {
            return this;
        }
        return null;
    }

    public final List<k3> getConditionalScopes$runtime() {
        return uu.y0.toList(this.f80268k.asSet());
    }

    public final Set<Object> getDerivedStateDependencies$runtime() {
        return this.f80269l.asMap().keySet();
    }

    @Override // p0.y0, p0.e0
    public boolean getHasInvalidations() {
        boolean z10;
        synchronized (this.f80263f) {
            z10 = r0.h.m6009getSizeimpl(this.f80273p) > 0;
        }
        return z10;
    }

    @Override // p0.y0
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.f80263f) {
            hasPendingChanges$runtime = this.f80280w.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    public final Set<Object> getObservedObjects$runtime() {
        return this.f80266i.asMap().keySet();
    }

    public final r0 getObserverHolder$runtime() {
        return this.f80278u;
    }

    public final f0 getParent() {
        return this.f80260b;
    }

    public final boolean getPendingInvalidScopes$runtime() {
        return this.f80274q;
    }

    public final zu.m getRecomposeContext() {
        zu.m mVar = this.f80281x;
        return mVar == null ? this.f80260b.getRecomposeCoroutineContext$runtime() : mVar;
    }

    public final s4 getSlotTable$runtime() {
        return this.f80265h;
    }

    public final void h() {
        AtomicReference atomicReference = this.f80262e;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.e0.areEqual(andSet, k0.f80293a)) {
            return;
        }
        if (andSet instanceof Set) {
            b((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                b(set, false);
            }
            return;
        }
        if (andSet == null) {
            d0.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new tu.k();
        }
        d0.composeRuntimeError("corrupt pendingModifications drain: " + atomicReference);
        throw new tu.k();
    }

    public final void i() {
        Set setEmptySet = uu.c2.emptySet();
        AtomicReference atomicReference = this.f80262e;
        Object andSet = atomicReference.getAndSet(setEmptySet);
        if (kotlin.jvm.internal.e0.areEqual(andSet, k0.f80293a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            b((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            d0.composeRuntimeError("corrupt pendingModifications drain: " + atomicReference);
            throw new tu.k();
        }
        for (Set set : (Set[]) andSet) {
            b(set, false);
        }
    }

    @Override // p0.y0
    public void insertMovableContent(List<tu.v> list) {
        Set<j4> set = this.f80264g;
        z zVar = this.f80280w;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!kotlin.jvm.internal.e0.areEqual(((i2) list.get(i10).getFirst()).getComposition$runtime(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        try {
            zVar.insertMovableContentReferences(list);
        } catch (Throwable th2) {
            try {
                if (!set.isEmpty()) {
                    z0.c0 c0Var = this.f80279v;
                    try {
                        c0Var.prepare(set, zVar.getErrorContext$runtime());
                        c0Var.dispatchAbandons();
                        c0Var.clear();
                    } catch (Throwable th3) {
                        c0Var.clear();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                abandonChanges();
                throw th4;
            }
        }
    }

    @Override // p0.m3
    public t1 invalidate(k3 k3Var, Object obj) {
        j0 j0Var;
        if (k3Var.getDefaultsInScope()) {
            k3Var.setDefaultsInvalid(true);
        }
        b anchor = k3Var.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return t1.f80476b;
        }
        if (!this.f80265h.ownsAnchor(anchor)) {
            synchronized (this.f80263f) {
                j0Var = this.f80276s;
            }
            return (j0Var != null && j0Var.isComposing() && j0Var.f80280w.tryImminentInvalidation$runtime(k3Var, obj)) ? t1.f80479f : t1.f80476b;
        }
        if (!k3Var.getCanRecompose()) {
            return t1.f80476b;
        }
        t1 t1VarK = k(k3Var, anchor, obj);
        if (t1VarK != t1.f80476b) {
            this.f80278u.current();
        }
        return t1VarK;
    }

    @Override // p0.y0
    public void invalidateAll() {
        synchronized (this.f80263f) {
            try {
                for (Object obj : this.f80265h.getSlots()) {
                    k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                    if (k3Var != null) {
                        k3Var.invalidate();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i10) {
        List<k3> listInvalidateGroupsWithKey$runtime;
        synchronized (this.f80263f) {
            listInvalidateGroupsWithKey$runtime = this.f80265h.invalidateGroupsWithKey$runtime(i10);
        }
        if (listInvalidateGroupsWithKey$runtime != null) {
            int size = listInvalidateGroupsWithKey$runtime.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (listInvalidateGroupsWithKey$runtime.get(i11).invalidateForResult(null) != t1.f80476b) {
                }
            }
            return;
        }
        if (this.f80280w.forceRecomposeScopes$runtime()) {
            this.f80260b.invalidate$runtime(this);
        }
    }

    @Override // p0.y0
    public boolean isComposing() {
        return this.f80280w.isComposing$runtime();
    }

    @Override // p0.y0, p0.e0
    public boolean isDisposed() {
        return this.f80283z == 3;
    }

    public final boolean isRoot() {
        return this.f80282y;
    }

    public final void j() {
        int i10 = this.f80283z;
        if (i10 != 0) {
            a3.throwIllegalStateException(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f80275r == null) {
            return;
        }
        a3.throwIllegalStateException("A pausable composition is in progress");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3 A[Catch: all -> 0x001e, EDGE_INSN: B:69:0x00b3->B:54:0x00b3 BREAK  A[LOOP:0: B:36:0x006a->B:50:0x00ab], EDGE_INSN: B:70:0x00b3->B:54:0x00b3 BREAK  A[LOOP:0: B:36:0x006a->B:50:0x00ab], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:21:0x0036, B:25:0x003c, B:26:0x0045, B:28:0x0049, B:29:0x0052, B:31:0x005a, B:33:0x005e, B:36:0x006a, B:38:0x007a, B:40:0x0086, B:42:0x0090, B:46:0x009f, B:50:0x00ab, B:51:0x00ae, B:54:0x00b3), top: B:67:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p0.t1 k(p0.k3 r21, p0.b r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.k(p0.k3, p0.b, java.lang.Object):p0.t1");
    }

    public final void l(Object obj) {
        Object obj2 = this.f80266i.get(obj);
        if (obj2 == null) {
            return;
        }
        boolean z10 = obj2 instanceof z.v0;
        z.u0 u0Var = this.f80272o;
        if (!z10) {
            k3 k3Var = (k3) obj2;
            if (k3Var.invalidateForResult(obj) == t1.f80479f) {
                r0.h.m5998addimpl(u0Var, obj, k3Var);
                return;
            }
            return;
        }
        z.v0 v0Var = (z.v0) obj2;
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
                        k3 k3Var2 = (k3) objArr[(i10 << 3) + i12];
                        if (k3Var2.invalidateForResult(obj) == t1.f80479f) {
                            r0.h.m5998addimpl(u0Var, obj, k3Var2);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // p0.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof r0.f
            z.u0 r3 = r0.f80269l
            z.u0 r4 = r0.f80266i
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L60
            r0.f r1 = (r0.f) r1
            z.o1 r1 = r1.getSet$runtime()
            java.lang.Object[] r2 = r1.f96888b
            long[] r1 = r1.f96887a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r8 = r5
        L1e:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L38:
            if (r13 >= r11) goto L59
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L55
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r0.h.m6005containsimpl(r4, r14)
            if (r15 != 0) goto L54
            boolean r14 = r0.h.m6005containsimpl(r3, r14)
            if (r14 == 0) goto L55
        L54:
            return r6
        L55:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L59:
            if (r11 != r12) goto L7d
        L5b:
            if (r8 == r7) goto L7d
            int r8 = r8 + 1
            goto L1e
        L60:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()
            boolean r7 = r0.h.m6005containsimpl(r4, r2)
            if (r7 != 0) goto L7c
            boolean r2 = r0.h.m6005containsimpl(r3, r2)
            if (r2 == 0) goto L66
        L7c:
            return r6
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime(z.o1 o1Var) {
        this.f80275r = null;
        if (o1Var != null) {
            this.f80279v.ignoreForgotten(o1Var);
            this.f80283z = 2;
        }
    }

    @Override // p0.y0
    public void prepareCompose(kv.a aVar) {
        this.f80280w.prepareCompose$runtime(aVar);
    }

    @Override // p0.y0
    public boolean recompose() {
        synchronized (this.f80263f) {
            u2 u2Var = this.f80275r;
            if (u2Var != null && !u2Var.isRecomposing$runtime()) {
                u2Var.markIncomplete$runtime();
                return false;
            }
            g();
            try {
                z.u0 u0Var = this.f80273p;
                this.f80273p = r0.h.m6004constructorimpl$default(null, 1, null);
                try {
                    boolean zM5858recomposeaFTiNEg$runtime = this.f80280w.m5858recomposeaFTiNEg$runtime(u0Var, null);
                    if (!zM5858recomposeaFTiNEg$runtime) {
                        h();
                    }
                    return zM5858recomposeaFTiNEg$runtime;
                } catch (Throwable th2) {
                    this.f80273p = u0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f80264g.isEmpty()) {
                        z0.c0 c0Var = this.f80279v;
                        try {
                            c0Var.prepare(this.f80264g, this.f80280w.getErrorContext$runtime());
                            c0Var.dispatchAbandons();
                            c0Var.clear();
                        } catch (Throwable th4) {
                            c0Var.clear();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    abandonChanges();
                    throw th5;
                }
            }
        }
    }

    @Override // p0.m3
    public void recomposeScopeReleased(k3 k3Var) {
        this.f80274q = true;
        this.f80278u.current();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set[]] */
    @Override // p0.y0
    public void recordModificationsOf(Set<? extends Object> set) {
        Set<? extends Object> setPlus;
        while (true) {
            Object obj = this.f80262e.get();
            if (obj == null || kotlin.jvm.internal.e0.areEqual(obj, k0.f80293a)) {
                setPlus = set;
            } else if (obj instanceof Set) {
                setPlus = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f80262e).toString());
                }
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setPlus = uu.f0.plus((Set<? extends Object>[]) obj, set);
            }
            AtomicReference atomicReference = this.f80262e;
            while (!atomicReference.compareAndSet(obj, setPlus)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f80263f) {
                    h();
                }
                return;
            }
            return;
        }
    }

    @Override // p0.y0, p0.m3
    public void recordReadOf(Object obj) {
        k3 currentRecomposeScope$runtime;
        int i10;
        int i11;
        z zVar = this.f80280w;
        if (zVar.getAreChildrenComposing$runtime() || (currentRecomposeScope$runtime = zVar.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        int i12 = 1;
        currentRecomposeScope$runtime.setUsed(true);
        boolean zRecordRead = currentRecomposeScope$runtime.recordRead(obj);
        this.f80278u.current();
        if (zRecordRead) {
            return;
        }
        if (obj instanceof b1.x0) {
            ((b1.x0) obj).m127recordReadInh_f27i8$runtime(b1.j.m117constructorimpl(1));
        }
        r0.h.m5998addimpl(this.f80266i, obj, currentRecomposeScope$runtime);
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            c1 currentRecord = d1Var.getCurrentRecord();
            z.u0 u0Var = this.f80269l;
            r0.h.m6013removeScopeimpl(u0Var, obj);
            z.c1 dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.f96779b;
            long[] jArr = dependencies.f96778a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr[i13];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        i10 = i12;
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j10 & 255) < 128) {
                                b1.w0 w0Var = (b1.w0) objArr[(i13 << 3) + i16];
                                i11 = i14;
                                if (w0Var instanceof b1.x0) {
                                    ((b1.x0) w0Var).m127recordReadInh_f27i8$runtime(b1.j.m117constructorimpl(i10));
                                }
                                r0.h.m5998addimpl(u0Var, w0Var, obj);
                            } else {
                                i11 = i14;
                            }
                            j10 >>= i11;
                            i16++;
                            i14 = i11;
                        }
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    i12 = i10;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(d1Var, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // p0.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordWriteOf(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f80263f
            monitor-enter(r0)
            r14.l(r15)     // Catch: java.lang.Throwable -> L4f
            z.u0 r1 = r14.f80269l     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.get(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof z.v0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            z.v0 r15 = (z.v0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f96888b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f96887a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            p0.d1 r10 = (p0.d1) r10     // Catch: java.lang.Throwable -> L4f
            r14.l(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            p0.d1 r15 = (p0.d1) r15     // Catch: java.lang.Throwable -> L4f
            r14.l(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime(d1 d1Var) {
        if (r0.h.m6005containsimpl(this.f80266i, d1Var)) {
            return;
        }
        r0.h.m6013removeScopeimpl(this.f80269l, d1Var);
    }

    public final void removeObservation$runtime(Object obj, k3 k3Var) {
        r0.h.m6011removeimpl(this.f80266i, obj, k3Var);
    }

    public final void setComposable(kv.p pVar) {
        this.A = pVar;
    }

    @Override // p0.y0, p0.e0
    public void setContent(kv.p pVar) {
        boolean zE = e();
        j();
        f0 f0Var = this.f80260b;
        if (!zE) {
            this.A = pVar;
            f0Var.composeInitial$runtime(this, pVar);
            return;
        }
        z zVar = this.f80280w;
        zVar.startReuseFromRoot();
        this.A = pVar;
        f0Var.composeInitial$runtime(this, pVar);
        zVar.endReuseFromRoot();
    }

    @Override // p0.m4, p0.q2
    public void setContentWithReuse(kv.p pVar) {
        e();
        j();
        z zVar = this.f80280w;
        zVar.startReuseFromRoot();
        this.A = pVar;
        this.f80260b.composeInitial$runtime(this, pVar);
        zVar.endReuseFromRoot();
    }

    @Override // d1.s
    public d1.l setObserver(d1.k kVar) {
        synchronized (this.f80263f) {
            this.f80278u.setObserver(kVar);
            this.f80278u.setRoot(true);
        }
        return new i0(this);
    }

    @Override // p0.q2
    public t2 setPausableContent(kv.p pVar) {
        return f(e(), pVar);
    }

    @Override // p0.q2
    public t2 setPausableContentWithReuse(kv.p pVar) {
        e();
        j();
        return f(true, pVar);
    }

    public final void setPendingInvalidScopes$runtime(boolean z10) {
        this.f80274q = z10;
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.f80263f) {
            i();
            z.u0 u0Var = this.f80273p;
            this.f80273p = r0.h.m6004constructorimpl$default(null, 1, null);
            try {
                this.f80280w.m5859updateComposerInvalidationsRY85e9Y(u0Var);
            } finally {
            }
        }
    }

    @Override // p0.y0
    public void verifyConsistent() {
        synchronized (this.f80263f) {
            if (!isComposing()) {
                this.f80280w.verifyConsistent$runtime();
                this.f80265h.verifyWellFormed();
                m(this.f80265h);
            }
        }
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime$annotations() {
    }

    public /* synthetic */ j0(f0 f0Var, d dVar, zu.m mVar, int i10, kotlin.jvm.internal.u uVar) {
        this(f0Var, dVar, (i10 & 4) != 0 ? null : mVar);
    }
}
