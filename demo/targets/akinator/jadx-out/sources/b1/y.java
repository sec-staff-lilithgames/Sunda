package b1;

import b1.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.o f8702a = new a1.o(2);

    /* renamed from: b, reason: collision with root package name */
    public static final z0.d0 f8703b = new z0.d0();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8704c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static u f8705d;

    /* renamed from: e, reason: collision with root package name */
    public static long f8706e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f8707f;

    /* renamed from: g, reason: collision with root package name */
    public static final o0 f8708g;

    /* renamed from: h, reason: collision with root package name */
    public static List f8709h;

    /* renamed from: i, reason: collision with root package name */
    public static List f8710i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f8711j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f8712k;

    /* renamed from: l, reason: collision with root package name */
    public static final z0.a f8713l;

    static {
        s sVar = u.f8690g;
        f8705d = sVar.getEMPTY();
        long j10 = 1;
        f8706e = v.toSnapshotId(1) + j10;
        f8707f = new q();
        f8708g = new o0();
        f8709h = uu.p0.emptyList();
        f8710i = uu.p0.emptyList();
        long j11 = f8706e;
        f8706e = j10 + j11;
        c cVar = new c(j11, sVar.getEMPTY());
        f8705d = f8705d.set(cVar.getSnapshotId());
        f8711j = cVar;
        f8712k = cVar;
        f8713l = new z0.a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kv.l r15) {
        /*
            b1.c r0 = b1.y.f8711j
            java.lang.Object r1 = getLock()
            monitor-enter(r1)
            z.v0 r2 = r0.getModified$runtime()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            z0.a r3 = b1.y.f8713l     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto La7
        L17:
            java.lang.Object r15 = g(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L4a
            r3 = -1
            java.util.List r4 = b1.y.f8709h     // Catch: java.lang.Throwable -> L3c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L3c
            r6 = r1
        L2a:
            if (r6 >= r5) goto L3e
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L3c
            kv.p r7 = (kv.p) r7     // Catch: java.lang.Throwable -> L3c
            java.util.Set r8 = r0.g.wrapIntoSet(r2)     // Catch: java.lang.Throwable -> L3c
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 + 1
            goto L2a
        L3c:
            r15 = move-exception
            goto L44
        L3e:
            z0.a r0 = b1.y.f8713l
            r0.add(r3)
            goto L4a
        L44:
            z0.a r0 = b1.y.f8713l
            r0.add(r3)
            throw r15
        L4a:
            java.lang.Object r0 = getLock()
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto La3
            java.lang.Object[] r3 = r2.f96888b     // Catch: java.lang.Throwable -> L96
            long[] r2 = r2.f96887a     // Catch: java.lang.Throwable -> L96
            int r4 = r2.length     // Catch: java.lang.Throwable -> L96
            int r4 = r4 + (-2)
            if (r4 < 0) goto La3
            r5 = r1
        L5e:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L96
            long r8 = ~r6     // Catch: java.lang.Throwable -> L96
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L9e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L96
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L78:
            if (r10 >= r8) goto L9c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L98
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L96
            b1.w0 r11 = (b1.w0) r11     // Catch: java.lang.Throwable -> L96
            boolean r12 = d(r11)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L98
            b1.o0 r12 = b1.y.f8708g     // Catch: java.lang.Throwable -> L96
            r12.add(r11)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r15 = move-exception
            goto La5
        L98:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L78
        L9c:
            if (r8 != r9) goto La3
        L9e:
            if (r5 == r4) goto La3
            int r5 = r5 + 1
            goto L5e
        La3:
            monitor-exit(r0)
            return r15
        La5:
            monitor-exit(r0)
            throw r15
        La7:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.y.a(kv.l):java.lang.Object");
    }

    public static final m access$createTransparentSnapshotWithNoParentReadObserver(m mVar, kv.l lVar, boolean z10) {
        boolean z11 = mVar instanceof e;
        if (z11 || mVar == null) {
            return new d1(z11 ? (e) mVar : null, lVar, null, false, z10);
        }
        return new e1(mVar, lVar, false, z10);
    }

    public static final /* synthetic */ long access$getINVALID_SNAPSHOT$p() {
        return 0L;
    }

    public static final kv.l access$mergedReadObserver(kv.l lVar, kv.l lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new w(lVar, lVar2, 0);
    }

    public static final kv.l access$mergedWriteObserver(kv.l lVar, kv.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new w(lVar, lVar2, 1);
    }

    public static final Map access$optimisticMerges(long j10, e eVar, u uVar) {
        long[] jArr;
        u uVar2;
        long[] jArr2;
        u uVar3;
        int i10;
        long j11 = j10;
        z.v0 modified$runtime = eVar.getModified$runtime();
        if (modified$runtime != null) {
            u uVarOr = eVar.getInvalid$runtime().set(eVar.getSnapshotId()).or(eVar.getPreviousIds$runtime());
            Object[] objArr = modified$runtime.f96888b;
            long[] jArr3 = modified$runtime.f96887a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j12 = jArr3[i11];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((255 & j12) < 128) {
                                w0 w0Var = (w0) objArr[(i11 << 3) + i14];
                                y0 firstStateRecord = w0Var.getFirstStateRecord();
                                i10 = i12;
                                y0 y0VarF = f(firstStateRecord, j11, uVar);
                                if (y0VarF == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    y0 y0VarF2 = f(firstStateRecord, j11, uVarOr);
                                    if (y0VarF2 != null && !kotlin.jvm.internal.e0.areEqual(y0VarF, y0VarF2)) {
                                        uVar3 = uVarOr;
                                        y0 y0VarF3 = f(firstStateRecord, eVar.getSnapshotId(), eVar.getInvalid$runtime());
                                        if (y0VarF3 == null) {
                                            e();
                                            throw null;
                                        }
                                        y0 y0VarMergeRecords = w0Var.mergeRecords(y0VarF2, y0VarF, y0VarF3);
                                        if (y0VarMergeRecords == null) {
                                            return null;
                                        }
                                        if (map == null) {
                                            map = new HashMap();
                                        }
                                        map.put(y0VarF, y0VarMergeRecords);
                                        map = map;
                                    }
                                }
                                uVar3 = uVarOr;
                            } else {
                                jArr2 = jArr3;
                                uVar3 = uVarOr;
                                i10 = i12;
                            }
                            j12 >>= i10;
                            i14++;
                            j11 = j10;
                            i12 = i10;
                            jArr3 = jArr2;
                            uVarOr = uVar3;
                        }
                        jArr = jArr3;
                        uVar2 = uVarOr;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        uVar2 = uVarOr;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    j11 = j10;
                    jArr3 = jArr;
                    uVarOr = uVar2;
                }
            }
        }
        return null;
    }

    public static final void access$processForUnusedRecordsLocked(w0 w0Var) {
        if (d(w0Var)) {
            f8708g.add(w0Var);
        }
    }

    public static final /* synthetic */ Void access$readError() {
        e();
        throw null;
    }

    public static final Void access$reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final m access$takeNewSnapshot(kv.l lVar) {
        return (m) a(new x(0, lVar));
    }

    public static final void access$validateOpen(m mVar) {
        long jLowestOrDefault;
        if (f8705d.get(mVar.getSnapshotId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(mVar.getSnapshotId());
        sb2.append(", disposed=");
        sb2.append(mVar.getDisposed$runtime());
        sb2.append(", applied=");
        e eVar = mVar instanceof e ? (e) mVar : null;
        sb2.append(eVar != null ? Boolean.valueOf(eVar.getApplied$runtime()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (getLock()) {
            jLowestOrDefault = f8707f.lowestOrDefault(-1L);
        }
        sb2.append(jLowestOrDefault);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final u addRange(u uVar, long j10, long j11) {
        while (kotlin.jvm.internal.e0.compare(j10, j11) < 0) {
            uVar = uVar.set(j10);
            j10++;
        }
        return uVar;
    }

    public static final void b() {
        o0 o0Var = f8708g;
        int size$runtime = o0Var.getSize$runtime();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime) {
                break;
            }
            z0.l0 l0Var = o0Var.getValues$runtime()[i10];
            Object obj = l0Var != null ? l0Var.get() : null;
            if (obj != null && d((w0) obj)) {
                if (i11 != i10) {
                    o0Var.getValues$runtime()[i11] = l0Var;
                    o0Var.getHashes$runtime()[i11] = o0Var.getHashes$runtime()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime; i12++) {
            o0Var.getValues$runtime()[i12] = null;
            o0Var.getHashes$runtime()[i12] = 0;
        }
        if (i11 != size$runtime) {
            o0Var.setSize$runtime(i11);
        }
    }

    public static kv.l c(kv.l lVar, kv.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new w(lVar, lVar2, 0);
    }

    public static final <T extends y0> T current(T t10, m mVar) {
        T t11;
        T t12 = (T) f(t10, mVar.getSnapshotId(), mVar.getInvalid$runtime());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) f(t10, mVar.getSnapshotId(), mVar.getInvalid$runtime());
        }
        if (t11 != null) {
            return t11;
        }
        e();
        throw null;
    }

    public static final m currentSnapshot() {
        m mVar = (m) f8703b.get();
        return mVar == null ? f8711j : mVar;
    }

    public static final boolean d(w0 w0Var) {
        y0 y0Var;
        long jLowestOrDefault = f8707f.lowestOrDefault(f8706e);
        y0 y0Var2 = null;
        y0 firstStateRecord = null;
        int i10 = 0;
        for (y0 firstStateRecord2 = w0Var.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime()) {
            long snapshotId$runtime = firstStateRecord2.getSnapshotId$runtime();
            if (snapshotId$runtime != 0) {
                if (kotlin.jvm.internal.e0.compare(snapshotId$runtime, jLowestOrDefault) >= 0) {
                    i10++;
                } else if (y0Var2 == null) {
                    i10++;
                    y0Var2 = firstStateRecord2;
                } else {
                    if (kotlin.jvm.internal.e0.compare(firstStateRecord2.getSnapshotId$runtime(), y0Var2.getSnapshotId$runtime()) < 0) {
                        y0Var = y0Var2;
                        y0Var2 = firstStateRecord2;
                    } else {
                        y0Var = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = w0Var.getFirstStateRecord();
                        y0 y0Var3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = y0Var3;
                                break;
                            }
                            if (kotlin.jvm.internal.e0.compare(firstStateRecord.getSnapshotId$runtime(), jLowestOrDefault) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.e0.compare(y0Var3.getSnapshotId$runtime(), firstStateRecord.getSnapshotId$runtime()) < 0) {
                                y0Var3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext$runtime();
                        }
                    }
                    y0Var2.setSnapshotId$runtime(0L);
                    y0Var2.assign(firstStateRecord);
                    y0Var2 = y0Var;
                }
            }
        }
        return i10 > 1;
    }

    public static final void e() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final y0 f(y0 y0Var, long j10, u uVar) {
        y0 y0Var2 = null;
        while (y0Var != null) {
            long snapshotId$runtime = y0Var.getSnapshotId$runtime();
            if (snapshotId$runtime != 0 && kotlin.jvm.internal.e0.compare(snapshotId$runtime, j10) <= 0 && !uVar.get(snapshotId$runtime) && (y0Var2 == null || kotlin.jvm.internal.e0.compare(y0Var2.getSnapshotId$runtime(), y0Var.getSnapshotId$runtime()) < 0)) {
                y0Var2 = y0Var;
            }
            y0Var = y0Var.getNext$runtime();
        }
        if (y0Var2 != null) {
            return y0Var2;
        }
        return null;
    }

    public static final Object g(c cVar, kv.l lVar) {
        long snapshotId = cVar.getSnapshotId();
        Object objInvoke = lVar.invoke(f8705d.clear(snapshotId));
        long j10 = f8706e;
        f8706e = 1 + j10;
        f8705d = f8705d.clear(snapshotId);
        cVar.setSnapshotId$runtime(j10);
        cVar.setInvalid$runtime(f8705d);
        cVar.setWriteCount$runtime(0);
        cVar.setModified$runtime(null);
        cVar.releasePinnedSnapshotLocked$runtime();
        f8705d = f8705d.set(j10);
        return objInvoke;
    }

    public static final Object getLock() {
        return f8704c;
    }

    public static final m getSnapshotInitializer() {
        return f8712k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r4 = (T) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends b1.y0> T newOverwritableRecordLocked(T r10, b1.w0 r11) {
        /*
            b1.y0 r0 = r11.getFirstStateRecord()
            b1.q r1 = b1.y.f8707f
            long r2 = b1.y.f8706e
            long r1 = r1.lowestOrDefault(r2)
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            b1.s r3 = b1.u.f8690g
            b1.u r3 = r3.getEMPTY()
            r4 = 0
            r5 = r4
        L17:
            if (r0 == 0) goto L53
            long r6 = r0.getSnapshotId$runtime()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L24
            goto L4a
        L24:
            long r6 = r0.getSnapshotId$runtime()
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = kotlin.jvm.internal.e0.compare(r6, r1)
            if (r8 > 0) goto L4e
            boolean r6 = r3.get(r6)
            if (r6 != 0) goto L4e
            if (r5 != 0) goto L3c
            r5 = r0
            goto L4e
        L3c:
            long r1 = r0.getSnapshotId$runtime()
            long r3 = r5.getSnapshotId$runtime()
            int r1 = kotlin.jvm.internal.e0.compare(r1, r3)
            if (r1 >= 0) goto L4c
        L4a:
            r4 = r0
            goto L53
        L4c:
            r4 = r5
            goto L53
        L4e:
            b1.y0 r0 = r0.getNext$runtime()
            goto L17
        L53:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 == 0) goto L5e
            r4.setSnapshotId$runtime(r0)
            return r4
        L5e:
            b1.y0 r10 = r10.create(r0)
            b1.y0 r0 = r11.getFirstStateRecord()
            r10.setNext$runtime(r0)
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked"
            kotlin.jvm.internal.e0.checkNotNull(r10, r0)
            r11.prependStateRecord(r10)
            kotlin.jvm.internal.e0.checkNotNull(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.y.newOverwritableRecordLocked(b1.y0, b1.w0):b1.y0");
    }

    public static final <T extends y0> T newWritableRecord(T t10, w0 w0Var, m mVar) {
        T t11;
        synchronized (getLock()) {
            t11 = (T) newOverwritableRecordLocked(t10, w0Var);
            t11.assign(t10);
            t11.setSnapshotId$runtime(mVar.getSnapshotId());
        }
        return t11;
    }

    public static final void notifyWrite(m mVar, w0 w0Var) {
        mVar.setWriteCount$runtime(mVar.getWriteCount$runtime() + 1);
        kv.l writeObserver$runtime = mVar.getWriteObserver$runtime();
        if (writeObserver$runtime != null) {
            writeObserver$runtime.invoke(w0Var);
        }
    }

    public static final <T extends y0, R> R overwritable(T t10, w0 w0Var, T t11, kv.l lVar) {
        m current;
        R r10;
        synchronized (getLock()) {
            try {
                current = m.f8651e.getCurrent();
                r10 = (R) lVar.invoke(overwritableRecord(t10, w0Var, current, t11));
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        notifyWrite(current, w0Var);
        return r10;
    }

    public static final <T extends y0> T overwritableRecord(T t10, w0 w0Var, m mVar, T t11) {
        T t12;
        if (mVar.getReadOnly()) {
            mVar.mo112recordModified$runtime(w0Var);
        }
        long snapshotId = mVar.getSnapshotId();
        if (t11.getSnapshotId$runtime() == snapshotId) {
            return t11;
        }
        synchronized (getLock()) {
            t12 = (T) newOverwritableRecordLocked(t10, w0Var);
        }
        t12.setSnapshotId$runtime(snapshotId);
        if (t11.getSnapshotId$runtime() != v.toSnapshotId(1)) {
            mVar.mo112recordModified$runtime(w0Var);
        }
        return t12;
    }

    public static final <T extends y0> T readable(T t10, w0 w0Var) {
        T t11;
        m.a aVar = m.f8651e;
        m current = aVar.getCurrent();
        kv.l readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(w0Var);
        }
        T t12 = (T) f(t10, current.getSnapshotId(), current.getInvalid$runtime());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            m current2 = aVar.getCurrent();
            y0 firstStateRecord = w0Var.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) f(firstStateRecord, current2.getSnapshotId(), current2.getInvalid$runtime());
            if (t11 == null) {
                e();
                throw null;
            }
        }
        return t11;
    }

    public static final void releasePinningLocked(int i10) {
        f8707f.remove(i10);
    }

    public static final <T> T sync(kv.a aVar) {
        T t10;
        synchronized (getLock()) {
            try {
                t10 = (T) aVar.invoke();
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        return t10;
    }

    public static final int trackPinning(long j10, u uVar) {
        int iAdd;
        long jLowest = uVar.lowest(j10);
        synchronized (getLock()) {
            iAdd = f8707f.add(jLowest);
        }
        return iAdd;
    }

    public static final <T extends y0, R> R withCurrent(T t10, kv.l lVar) {
        return (R) lVar.invoke(current(t10));
    }

    public static final <T extends y0, R> R writable(T t10, w0 w0Var, m mVar, kv.l lVar) {
        R r10;
        synchronized (getLock()) {
            try {
                r10 = (R) lVar.invoke(writableRecord(t10, w0Var, mVar));
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        notifyWrite(mVar, w0Var);
        return r10;
    }

    public static final <T extends y0> T writableRecord(T t10, w0 w0Var, m mVar) {
        T t11;
        if (mVar.getReadOnly()) {
            mVar.mo112recordModified$runtime(w0Var);
        }
        long snapshotId = mVar.getSnapshotId();
        T t12 = (T) f(t10, snapshotId, mVar.getInvalid$runtime());
        if (t12 == null) {
            e();
            throw null;
        }
        if (t12.getSnapshotId$runtime() == mVar.getSnapshotId()) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) f(w0Var.getFirstStateRecord(), snapshotId, mVar.getInvalid$runtime());
            if (t11 == null) {
                e();
                throw null;
            }
            if (t11.getSnapshotId$runtime() != snapshotId) {
                y0 y0VarNewOverwritableRecordLocked = newOverwritableRecordLocked(t11, w0Var);
                y0VarNewOverwritableRecordLocked.assign(t11);
                y0VarNewOverwritableRecordLocked.setSnapshotId$runtime(mVar.getSnapshotId());
                t11 = (T) y0VarNewOverwritableRecordLocked;
            }
        }
        kotlin.jvm.internal.e0.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.getSnapshotId$runtime() != v.toSnapshotId(1)) {
            mVar.mo112recordModified$runtime(w0Var);
        }
        return t11;
    }

    public static final <T extends y0, R> R writable(T t10, w0 w0Var, kv.l lVar) {
        m current;
        R r10;
        synchronized (getLock()) {
            try {
                current = m.f8651e.getCurrent();
                r10 = (R) lVar.invoke(writableRecord(t10, w0Var, current));
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        notifyWrite(current, w0Var);
        return r10;
    }

    public static final <T extends y0> T current(T t10) {
        T t11;
        m.a aVar = m.f8651e;
        m current = aVar.getCurrent();
        T t12 = (T) f(t10, current.getSnapshotId(), current.getInvalid$runtime());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            m current2 = aVar.getCurrent();
            t11 = (T) f(t10, current2.getSnapshotId(), current2.getInvalid$runtime());
        }
        if (t11 != null) {
            return t11;
        }
        e();
        throw null;
    }

    public static final <T extends y0> T readable(T t10, w0 w0Var, m mVar) {
        T t11;
        kv.l readObserver = mVar.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(w0Var);
        }
        T t12 = (T) f(t10, mVar.getSnapshotId(), mVar.getInvalid$runtime());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            m current = m.f8651e.getCurrent();
            y0 firstStateRecord = w0Var.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) f(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime());
            if (t11 == null) {
                e();
                throw null;
            }
        }
        return t11;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }
}
