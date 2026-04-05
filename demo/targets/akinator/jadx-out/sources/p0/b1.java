package p0;

import b1.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends b1.x0 implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f80150c;

    /* renamed from: e, reason: collision with root package name */
    public final y4 f80151e;

    /* renamed from: f, reason: collision with root package name */
    public a f80152f = new a(b1.y.currentSnapshot().getSnapshotId());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b1.y0 implements c1 {

        /* renamed from: h, reason: collision with root package name */
        public static final C0759a f80153h = new C0759a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final Object f80154i = new Object();

        /* renamed from: c, reason: collision with root package name */
        public long f80155c;

        /* renamed from: d, reason: collision with root package name */
        public int f80156d;

        /* renamed from: e, reason: collision with root package name */
        public z.c1 f80157e;

        /* renamed from: f, reason: collision with root package name */
        public Object f80158f;

        /* renamed from: g, reason: collision with root package name */
        public int f80159g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: p0.b1$a$a, reason: collision with other inner class name */
        public static final class C0759a {
            public C0759a(kotlin.jvm.internal.u uVar) {
            }

            public final Object getUnset() {
                return a.f80154i;
            }
        }

        public a(long j10) {
            super(j10);
            this.f80157e = z.d1.emptyObjectIntMap();
            this.f80158f = f80154i;
        }

        @Override // b1.y0
        public void assign(b1.y0 y0Var) {
            kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) y0Var;
            setDependencies(aVar.getDependencies());
            this.f80158f = aVar.f80158f;
            this.f80159g = aVar.f80159g;
        }

        @Override // b1.y0
        public b1.y0 create() {
            return create(b1.y.currentSnapshot().getSnapshotId());
        }

        @Override // p0.c1
        public Object getCurrentValue() {
            return this.f80158f;
        }

        @Override // p0.c1
        public z.c1 getDependencies() {
            return this.f80157e;
        }

        public final Object getResult() {
            return this.f80158f;
        }

        public final int getResultHash() {
            return this.f80159g;
        }

        public final long getValidSnapshotId() {
            return this.f80155c;
        }

        public final int getValidSnapshotWriteCount() {
            return this.f80156d;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isValid(p0.d1 r6, b1.m r7) {
            /*
                r5 = this;
                java.lang.Object r0 = b1.y.getLock()
                monitor-enter(r0)
                long r1 = r5.f80155c     // Catch: java.lang.Throwable -> L1c
                long r3 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L1c
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1e
                int r1 = r5.f80156d     // Catch: java.lang.Throwable -> L1c
                int r4 = r7.getWriteCount$runtime()     // Catch: java.lang.Throwable -> L1c
                if (r1 == r4) goto L1a
                goto L1e
            L1a:
                r1 = r3
                goto L1f
            L1c:
                r6 = move-exception
                goto L4d
            L1e:
                r1 = r2
            L1f:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f80158f
                java.lang.Object r4 = p0.b1.a.f80154i
                if (r0 == r4) goto L31
                if (r1 == 0) goto L32
                int r0 = r5.f80159g
                int r6 = r5.readableHash(r6, r7)
                if (r0 != r6) goto L31
                goto L32
            L31:
                r2 = r3
            L32:
                if (r2 == 0) goto L4c
                if (r1 == 0) goto L4c
                java.lang.Object r6 = b1.y.getLock()
                monitor-enter(r6)
                long r0 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L49
                r5.f80155c = r0     // Catch: java.lang.Throwable -> L49
                int r7 = r7.getWriteCount$runtime()     // Catch: java.lang.Throwable -> L49
                r5.f80156d = r7     // Catch: java.lang.Throwable -> L49
                monitor-exit(r6)
                return r2
            L49:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4c:
                return r2
            L4d:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.b1.a.isValid(p0.d1, b1.m):boolean");
        }

        public final int readableHash(d1 d1Var, b1.m mVar) {
            z.c1 dependencies;
            int iIdentityHashCode;
            int i10;
            int i11;
            int i12;
            synchronized (b1.y.getLock()) {
                dependencies = getDependencies();
            }
            int i13 = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            r0.c cVarDerivedStateObservers = z4.derivedStateObservers();
            Object[] objArr = cVarDerivedStateObservers.f83647b;
            int size = cVarDerivedStateObservers.getSize();
            for (int i14 = 0; i14 < size; i14++) {
                ((e1) objArr[i14]).start(d1Var);
            }
            try {
                Object[] objArr2 = dependencies.f96779b;
                int[] iArr = dependencies.f96780c;
                long[] jArr = dependencies.f96778a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    b1.w0 w0Var = (b1.w0) objArr2[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        b1.y0 y0VarCurrent = w0Var instanceof b1 ? ((b1) w0Var).current(mVar) : b1.y.current(w0Var.getFirstStateRecord(), mVar);
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + z0.f0.identityHashCode(y0VarCurrent)) * 31) + Long.hashCode(y0VarCurrent.getSnapshotId$runtime());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i16 = i12;
                                i13 = i11;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 == length) {
                            i13 = iIdentityHashCode;
                            break;
                        }
                        i15++;
                        i13 = i10;
                    }
                }
                iIdentityHashCode = i13;
                Object[] objArr3 = cVarDerivedStateObservers.f83647b;
                int size2 = cVarDerivedStateObservers.getSize();
                for (int i20 = 0; i20 < size2; i20++) {
                    ((e1) objArr3[i20]).done(d1Var);
                }
                return iIdentityHashCode;
            } catch (Throwable th2) {
                Object[] objArr4 = cVarDerivedStateObservers.f83647b;
                int size3 = cVarDerivedStateObservers.getSize();
                for (int i21 = 0; i21 < size3; i21++) {
                    ((e1) objArr4[i21]).done(d1Var);
                }
                throw th2;
            }
        }

        public void setDependencies(z.c1 c1Var) {
            this.f80157e = c1Var;
        }

        public final void setResult(Object obj) {
            this.f80158f = obj;
        }

        public final void setResultHash(int i10) {
            this.f80159g = i10;
        }

        public final void setValidSnapshotId(long j10) {
            this.f80155c = j10;
        }

        public final void setValidSnapshotWriteCount(int i10) {
            this.f80156d = i10;
        }

        @Override // b1.y0
        public b1.y0 create(long j10) {
            return new a(j10);
        }
    }

    public b1(kv.a aVar, y4 y4Var) {
        this.f80150c = aVar;
        this.f80151e = y4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p0.b1.a a(p0.b1.a r22, b1.m r23, boolean r24, kv.a r25) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b1.a(p0.b1$a, b1.m, boolean, kv.a):p0.b1$a");
    }

    public final b1.y0 current(b1.m mVar) {
        return a((a) b1.y.current(this.f80152f, mVar), mVar, false, this.f80150c);
    }

    @Override // p0.d1
    public c1 getCurrentRecord() {
        b1.m current = b1.m.f8651e.getCurrent();
        return a((a) b1.y.current(this.f80152f, current), current, false, this.f80150c);
    }

    public final Object getDebuggerDisplayValue() {
        a aVar = (a) b1.y.current(this.f80152f);
        if (aVar.isValid(this, b1.m.f8651e.getCurrent())) {
            return aVar.getResult();
        }
        return null;
    }

    @Override // b1.x0, b1.w0
    public b1.y0 getFirstStateRecord() {
        return this.f80152f;
    }

    @Override // p0.d1
    public y4 getPolicy() {
        return this.f80151e;
    }

    @Override // p0.d1, p0.v5
    public Object getValue() {
        m.a aVar = b1.m.f8651e;
        kv.l readObserver = aVar.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        b1.m current = aVar.getCurrent();
        return a((a) b1.y.current(this.f80152f, current), current, true, this.f80150c).getResult();
    }

    @Override // b1.x0, b1.w0
    public /* bridge */ /* synthetic */ b1.y0 mergeRecords(b1.y0 y0Var, b1.y0 y0Var2, b1.y0 y0Var3) {
        return super.mergeRecords(y0Var, y0Var2, y0Var3);
    }

    @Override // b1.x0, b1.w0
    public void prependStateRecord(b1.y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f80152f = (a) y0Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        a aVar = (a) b1.y.current(this.f80152f);
        sb2.append(aVar.isValid(this, b1.m.f8651e.getCurrent()) ? String.valueOf(aVar.getResult()) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
