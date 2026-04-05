package b1;

import b0.e2;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h1;
import p0.a3;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f8628a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8630c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.a f8631d;

    /* renamed from: e, reason: collision with root package name */
    public final aw.f f8632e;

    /* renamed from: h, reason: collision with root package name */
    public h f8635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8636i;

    /* renamed from: j, reason: collision with root package name */
    public a f8637j;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8629b = new AtomicReference(null);

    /* renamed from: f, reason: collision with root package name */
    public final r0.c f8633f = new r0.c(new a[16], 0);

    /* renamed from: g, reason: collision with root package name */
    public final Object f8634g = new Object();

    /* renamed from: k, reason: collision with root package name */
    public long f8638k = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final kv.l f8639a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8640b;

        /* renamed from: c, reason: collision with root package name */
        public z.s0 f8641c;

        /* renamed from: j, reason: collision with root package name */
        public int f8648j;

        /* renamed from: d, reason: collision with root package name */
        public int f8642d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final z.u0 f8643e = r0.h.m6004constructorimpl$default(null, 1, null);

        /* renamed from: f, reason: collision with root package name */
        public final z.u0 f8644f = new z.u0(0, 1, null);

        /* renamed from: g, reason: collision with root package name */
        public final z.v0 f8645g = new z.v0(0, 1, null);

        /* renamed from: h, reason: collision with root package name */
        public final r0.c f8646h = new r0.c(new p0.d1[16], 0);

        /* renamed from: i, reason: collision with root package name */
        public final k0 f8647i = new k0(this);

        /* renamed from: k, reason: collision with root package name */
        public final z.u0 f8649k = r0.h.m6004constructorimpl$default(null, 1, null);

        /* renamed from: l, reason: collision with root package name */
        public final HashMap f8650l = new HashMap();

        public a(kv.l lVar) {
            this.f8639a = lVar;
        }

        public final void a(Object obj, int i10, Object obj2, z.s0 s0Var) {
            int i11;
            int i12;
            int i13;
            if (this.f8648j > 0) {
                return;
            }
            int iPut = s0Var.put(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof p0.d1) || iPut == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                p0.c1 currentRecord = ((p0.d1) obj).getCurrentRecord();
                this.f8650l.put(obj, currentRecord.getCurrentValue());
                z.c1 dependencies = currentRecord.getDependencies();
                z.u0 u0Var = this.f8649k;
                r0.h.m6013removeScopeimpl(u0Var, obj);
                Object[] objArr = dependencies.f96779b;
                long[] jArr = dependencies.f96778a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    i13 = i14;
                                    w0 w0Var = (w0) objArr[(i15 << 3) + i17];
                                    if (w0Var instanceof x0) {
                                        ((x0) w0Var).m127recordReadInh_f27i8$runtime(j.m117constructorimpl(i13));
                                    }
                                    r0.h.m5998addimpl(u0Var, w0Var, obj);
                                } else {
                                    i13 = i14;
                                }
                                j10 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iPut == i12) {
                if (obj instanceof x0) {
                    ((x0) obj).m127recordReadInh_f27i8$runtime(j.m117constructorimpl(i11));
                }
                r0.h.m5998addimpl(this.f8643e, obj, obj2);
            }
        }

        public final void b(Object obj, Object obj2) {
            z.u0 u0Var = this.f8643e;
            r0.h.m6011removeimpl(u0Var, obj2, obj);
            if (!(obj2 instanceof p0.d1) || r0.h.m6005containsimpl(u0Var, obj2)) {
                return;
            }
            r0.h.m6013removeScopeimpl(this.f8649k, obj2);
            this.f8650l.remove(obj2);
        }

        public final void clear() {
            r0.h.m6002clearimpl(this.f8643e);
            this.f8644f.clear();
            r0.h.m6002clearimpl(this.f8649k);
            this.f8650l.clear();
        }

        public final void clearScopeObservations(Object obj) {
            z.s0 s0Var = (z.s0) this.f8644f.remove(obj);
            if (s0Var == null) {
                return;
            }
            Object[] objArr = s0Var.f96779b;
            int[] iArr = s0Var.f96780c;
            long[] jArr = s0Var.f96778a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            b(obj, obj2);
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

        public final p0.e1 getDerivedStateObserver() {
            return this.f8647i;
        }

        public final kv.l getOnChanged() {
            return this.f8639a;
        }

        public final boolean hasScopeObservations() {
            return this.f8644f.isNotEmpty();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyInvalidatedScopes() {
            /*
                r15 = this;
                z.v0 r0 = r15.f8645g
                java.lang.Object[] r1 = r0.f96888b
                long[] r2 = r0.f96887a
                int r3 = r2.length
                int r3 = r3 + (-2)
                if (r3 < 0) goto L47
                r4 = 0
                r5 = r4
            Ld:
                r6 = r2[r5]
                long r8 = ~r6
                r10 = 7
                long r8 = r8 << r10
                long r8 = r8 & r6
                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r8 = r8 & r10
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L42
                int r8 = r5 - r3
                int r8 = ~r8
                int r8 = r8 >>> 31
                r9 = 8
                int r8 = 8 - r8
                r10 = r4
            L27:
                if (r10 >= r8) goto L40
                r11 = 255(0xff, double:1.26E-321)
                long r11 = r11 & r6
                r13 = 128(0x80, double:6.3E-322)
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 >= 0) goto L3c
                int r11 = r5 << 3
                int r11 = r11 + r10
                r11 = r1[r11]
                kv.l r12 = r15.f8639a
                r12.invoke(r11)
            L3c:
                long r6 = r6 >> r9
                int r10 = r10 + 1
                goto L27
            L40:
                if (r8 != r9) goto L47
            L42:
                if (r5 == r3) goto L47
                int r5 = r5 + 1
                goto Ld
            L47:
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.l0.a.notifyInvalidatedScopes():void");
        }

        public final void observe(Object obj, kv.l lVar, kv.a aVar) {
            boolean z10;
            int i10;
            int i11;
            Object obj2 = this.f8640b;
            z.s0 s0Var = this.f8641c;
            int i12 = this.f8642d;
            this.f8640b = obj;
            this.f8641c = (z.s0) this.f8644f.get(obj);
            if (this.f8642d == -1) {
                this.f8642d = Long.hashCode(y.currentSnapshot().getSnapshotId());
            }
            k0 k0Var = this.f8647i;
            r0.c cVarDerivedStateObservers = z4.derivedStateObservers();
            boolean z11 = true;
            try {
                cVarDerivedStateObservers.add(k0Var);
                m.f8651e.observe(lVar, null, aVar);
                cVarDerivedStateObservers.removeAt(cVarDerivedStateObservers.getSize() - 1);
                Object obj3 = this.f8640b;
                kotlin.jvm.internal.e0.checkNotNull(obj3);
                int i13 = this.f8642d;
                z.s0 s0Var2 = this.f8641c;
                if (s0Var2 != null) {
                    long[] jArr = s0Var2.f96778a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                z10 = z11;
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        i11 = i15;
                                        Object obj4 = s0Var2.f96779b[i18];
                                        i10 = i17;
                                        boolean z12 = s0Var2.f96780c[i18] != i13 ? z10 : false;
                                        if (z12) {
                                            b(obj3, obj4);
                                        }
                                        if (z12) {
                                            s0Var2.removeValueAt(i18);
                                        }
                                    } else {
                                        i10 = i17;
                                        i11 = i15;
                                    }
                                    j10 >>= i11;
                                    i17 = i10 + 1;
                                    i15 = i11;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                            } else {
                                z10 = z11;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                            z11 = z10;
                        }
                    }
                }
                this.f8640b = obj2;
                this.f8641c = s0Var;
                this.f8642d = i12;
            } catch (Throwable th2) {
                cVarDerivedStateObservers.removeAt(cVarDerivedStateObservers.getSize() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0284 A[PHI: r22
          0x0284: PHI (r22v39 boolean) = (r22v38 boolean), (r22v40 boolean) binds: [B:108:0x025c, B:116:0x0282] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:178:0x03d3 A[PHI: r22
          0x03d3: PHI (r22v21 boolean) = (r22v20 boolean), (r22v22 boolean) binds: [B:167:0x03a2, B:177:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0493 A[PHI: r22
          0x0493: PHI (r22v11 boolean) = (r22v10 boolean), (r22v12 boolean) binds: [B:205:0x046b, B:213:0x0491] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x04a2  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0140 A[PHI: r22
          0x0140: PHI (r22v56 boolean) = (r22v55 boolean), (r22v57 boolean) binds: [B:47:0x0115, B:56:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0213 A[PHI: r22
          0x0213: PHI (r22v46 boolean) = (r22v45 boolean), (r22v47 boolean) binds: [B:84:0x01eb, B:92:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0222  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> r44) {
            /*
                Method dump skipped, instructions count: 1325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.l0.a.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.f8640b;
            kotlin.jvm.internal.e0.checkNotNull(obj2);
            int i10 = this.f8642d;
            z.s0 s0Var = this.f8641c;
            if (s0Var == null) {
                s0Var = new z.s0(0, 1, null);
                this.f8641c = s0Var;
                this.f8644f.set(obj2, s0Var);
            }
            a(obj, i10, obj2, s0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void removeScopeIf(kv.l r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.l0.a.removeScopeIf(kv.l):void");
        }

        public final void rereadDerivedState(p0.d1 d1Var) {
            long[] jArr;
            long[] jArr2;
            int i10;
            z.s0 s0Var;
            int iHashCode = Long.hashCode(y.currentSnapshot().getSnapshotId());
            Object obj = this.f8643e.get(d1Var);
            if (obj == null) {
                return;
            }
            boolean z10 = obj instanceof z.v0;
            z.u0 u0Var = this.f8644f;
            if (!z10) {
                z.s0 s0Var2 = (z.s0) u0Var.get(obj);
                if (s0Var2 == null) {
                    s0Var2 = new z.s0(0, 1, null);
                    u0Var.set(obj, s0Var2);
                }
                a(d1Var, iHashCode, obj, s0Var2);
                return;
            }
            z.v0 v0Var = (z.v0) obj;
            Object[] objArr = v0Var.f96888b;
            long[] jArr3 = v0Var.f96887a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            i10 = i12;
                            Object obj2 = objArr[(i11 << 3) + i14];
                            z.s0 s0Var3 = (z.s0) u0Var.get(obj2);
                            jArr2 = jArr3;
                            if (s0Var3 == null) {
                                s0Var = new z.s0(0, 1, null);
                                u0Var.set(obj2, s0Var);
                            } else {
                                s0Var = s0Var3;
                            }
                            a(d1Var, iHashCode, obj2, s0Var);
                        } else {
                            jArr2 = jArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    public l0(kv.l lVar) {
        this.f8628a = lVar;
        int i10 = 1;
        this.f8631d = new a1.a(this, i10);
        this.f8632e = new aw.f(this, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z10;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (this.f8634g) {
            z10 = this.f8630c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f8629b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        p0.d0.composeRuntimeError("Unexpected notification");
                        throw new tu.k();
                    }
                    List list2 = (List) obj;
                    Set<? extends Object> set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f8634g) {
                r0.c cVar = this.f8633f;
                Object[] objArr = cVar.f83647b;
                int size = cVar.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    z11 = ((a) objArr[i10]).recordInvalidation(set) || z11;
                }
            }
        }
    }

    public final void clear(Object obj) {
        synchronized (this.f8634g) {
            try {
                r0.c cVar = this.f8633f;
                int size = cVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = (a) cVar.f83647b[i11];
                    aVar.clearScopeObservations(obj);
                    if (!aVar.hasScopeObservations()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = cVar.f83647b;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = size - i10;
                uu.f0.fill(cVar.f83647b, (Object) null, i12, size);
                cVar.setSize(i12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clearIf(kv.l lVar) {
        synchronized (this.f8634g) {
            try {
                r0.c cVar = this.f8633f;
                int size = cVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = (a) cVar.f83647b[i11];
                    aVar.removeScopeIf(lVar);
                    if (!aVar.hasScopeObservations()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = cVar.f83647b;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = size - i10;
                uu.f0.fill(cVar.f83647b, (Object) null, i12, size);
                cVar.setSize(i12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void notifyChanges(Set<? extends Object> set, m mVar) {
        this.f8631d.invoke(set, mVar);
    }

    public final <T> void observeReads(T t10, kv.l lVar, kv.a aVar) {
        Object obj;
        a aVar2;
        synchronized (this.f8634g) {
            r0.c cVar = this.f8633f;
            Object[] objArr = cVar.f83647b;
            int size = cVar.getSize();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = objArr[i10];
                if (((a) obj).getOnChanged() == lVar) {
                    break;
                } else {
                    i10++;
                }
            }
            aVar2 = (a) obj;
            if (aVar2 == null) {
                kotlin.jvm.internal.e0.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                aVar2 = new a((kv.l) h1.beforeCheckcastToFunctionOfArity(lVar, 1));
                cVar.add(aVar2);
            }
        }
        boolean z10 = this.f8636i;
        a aVar3 = this.f8637j;
        long j10 = this.f8638k;
        if (j10 != -1 && j10 != z0.i0.currentThreadId()) {
            StringBuilder sbR = e2.r(j10, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbR.append(z0.i0.currentThreadId());
            sbR.append(", name=");
            sbR.append(z0.i0.currentThreadName());
            sbR.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            a3.throwIllegalArgumentException(sbR.toString());
        }
        try {
            this.f8636i = false;
            this.f8637j = aVar2;
            this.f8638k = z0.i0.currentThreadId();
            aVar2.observe(t10, this.f8632e, aVar);
        } finally {
            this.f8637j = aVar3;
            this.f8636i = z10;
            this.f8638k = j10;
        }
    }

    public final void start() {
        this.f8635h = m.f8651e.registerApplyObserver(this.f8631d);
    }

    public final void stop() {
        h hVar = this.f8635h;
        if (hVar != null) {
            hVar.dispose();
        }
    }

    @tu.f
    public final void withNoObservations(kv.a aVar) {
        boolean z10 = this.f8636i;
        this.f8636i = true;
        try {
            aVar.invoke();
        } finally {
            this.f8636i = z10;
        }
    }

    public final void clear() {
        synchronized (this.f8634g) {
            r0.c cVar = this.f8633f;
            Object[] objArr = cVar.f83647b;
            int size = cVar.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) objArr[i10]).clear();
            }
        }
    }
}
