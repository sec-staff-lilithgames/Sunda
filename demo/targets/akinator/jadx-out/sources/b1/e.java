package b1;

import b1.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p0.a3;
import z.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends m {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f8589o;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f8590f;

    /* renamed from: g, reason: collision with root package name */
    public final kv.l f8591g;

    /* renamed from: h, reason: collision with root package name */
    public int f8592h;

    /* renamed from: i, reason: collision with root package name */
    public z.v0 f8593i;

    /* renamed from: j, reason: collision with root package name */
    public List f8594j;

    /* renamed from: k, reason: collision with root package name */
    public u f8595k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f8596l;

    /* renamed from: m, reason: collision with root package name */
    public int f8597m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8598n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f8589o = new int[0];
    }

    public e(long j10, u uVar, kv.l lVar, kv.l lVar2) {
        super(j10, uVar, (kotlin.jvm.internal.u) null);
        this.f8590f = lVar;
        this.f8591g = lVar2;
        this.f8595k = u.f8690g.getEMPTY();
        this.f8596l = f8589o;
        this.f8597m = 1;
    }

    public static /* synthetic */ e takeNestedMutableSnapshot$default(e eVar, kv.l lVar, kv.l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        return eVar.takeNestedMutableSnapshot(lVar, lVar2);
    }

    public final <T> T advance$runtime(kv.a aVar) {
        long j10;
        recordPrevious$runtime(getSnapshotId());
        T t10 = (T) aVar.invoke();
        if (getApplied$runtime() || getDisposed$runtime()) {
            return t10;
        }
        long snapshotId = getSnapshotId();
        synchronized (y.getLock()) {
            try {
                long j11 = y.f8706e;
                j10 = 1;
                y.f8706e += j10;
                setSnapshotId$runtime(j11);
                y.f8705d = y.f8705d.set(getSnapshotId());
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        setInvalid$runtime(y.addRange(getInvalid$runtime(), snapshotId + j10, getSnapshotId()));
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1.o apply() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.apply():b1.o");
    }

    @Override // b1.m
    public void closeLocked$runtime() {
        y.f8705d = y.f8705d.clear(getSnapshotId()).andNot(this.f8595k);
    }

    @Override // b1.m
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        super.dispose();
        mo111nestedDeactivated$runtime(this);
        c1.c.dispatchObserverOnPreDispose(this);
    }

    public final boolean getApplied$runtime() {
        return this.f8598n;
    }

    public final List<w0> getMerged$runtime() {
        return this.f8594j;
    }

    @Override // b1.m
    public z.v0 getModified$runtime() {
        return this.f8593i;
    }

    public final u getPreviousIds$runtime() {
        return this.f8595k;
    }

    public final int[] getPreviousPinnedSnapshots$runtime() {
        return this.f8596l;
    }

    @Override // b1.m
    /* renamed from: getReadObserver$runtime */
    public kv.l getReadObserver() {
        return this.f8590f;
    }

    @Override // b1.m
    public boolean getReadOnly() {
        return false;
    }

    @Override // b1.m
    public int getWriteCount$runtime() {
        return this.f8592h;
    }

    @Override // b1.m
    public kv.l getWriteObserver$runtime() {
        return this.f8591g;
    }

    @Override // b1.m
    public boolean hasPendingChanges() {
        z.v0 modified$runtime = getModified$runtime();
        return modified$runtime != null && modified$runtime.isNotEmpty();
    }

    public final o innerApplyLocked$runtime(long j10, z.v0 v0Var, Map<y0, ? extends y0> map, u uVar) {
        u uVar2;
        Object[] objArr;
        long[] jArr;
        u uVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j11;
        int i11;
        y0 y0VarMergeRecords;
        u uVarOr = getInvalid$runtime().set(getSnapshotId()).or(this.f8595k);
        Object[] objArr3 = v0Var.f96888b;
        long[] jArr3 = v0Var.f96887a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List listPlus = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j12 = jArr3[i12];
                List arrayList2 = listPlus;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            i10 = i13;
                            w0 w0Var = (w0) objArr3[(i12 << 3) + i15];
                            objArr2 = objArr3;
                            y0 firstStateRecord = w0Var.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            y0 y0VarF = y.f(firstStateRecord, j10, uVar);
                            if (y0VarF == null) {
                                j11 = j12;
                            } else {
                                j11 = j12;
                                y0 y0VarF2 = y.f(firstStateRecord, getSnapshotId(), uVarOr);
                                if (y0VarF2 != null && y0VarF2.getSnapshotId$runtime() != v.toSnapshotId(1) && !kotlin.jvm.internal.e0.areEqual(y0VarF, y0VarF2)) {
                                    i11 = i15;
                                    uVar3 = uVarOr;
                                    y0 y0VarF3 = y.f(firstStateRecord, getSnapshotId(), getInvalid$runtime());
                                    if (y0VarF3 == null) {
                                        y.access$readError();
                                        throw new tu.k();
                                    }
                                    if (map == null || (y0VarMergeRecords = map.get(y0VarF)) == null) {
                                        y0VarMergeRecords = w0Var.mergeRecords(y0VarF2, y0VarF, y0VarF3);
                                    }
                                    if (y0VarMergeRecords == null) {
                                        return new o.a(this);
                                    }
                                    if (!kotlin.jvm.internal.e0.areEqual(y0VarMergeRecords, y0VarF3)) {
                                        if (kotlin.jvm.internal.e0.areEqual(y0VarMergeRecords, y0VarF)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(tu.e0.to(w0Var, y0VarF.create(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            List list = arrayList2;
                                            list.add(w0Var);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!kotlin.jvm.internal.e0.areEqual(y0VarMergeRecords, y0VarF2) ? tu.e0.to(w0Var, y0VarMergeRecords) : tu.e0.to(w0Var, y0VarF2.create(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            uVar3 = uVarOr;
                            i11 = i15;
                            arrayList = arrayList3;
                        } else {
                            uVar3 = uVarOr;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j11 = j12;
                            i11 = i15;
                        }
                        j12 = j11 >> i10;
                        i15 = i11 + 1;
                        objArr3 = objArr2;
                        i13 = i10;
                        jArr3 = jArr2;
                        uVarOr = uVar3;
                    }
                    uVar2 = uVarOr;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i14 != i13) {
                        listPlus = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    uVar2 = uVarOr;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listPlus = arrayList2;
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                uVarOr = uVar2;
            }
        }
        if (arrayList != null) {
            advance$runtime();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                tu.v vVar = (tu.v) arrayList.get(i16);
                w0 w0Var2 = (w0) vVar.component1();
                y0 y0Var = (y0) vVar.component2();
                y0Var.setSnapshotId$runtime(j10);
                synchronized (y.getLock()) {
                    y0Var.setNext$runtime(w0Var2.getFirstStateRecord());
                    w0Var2.prependStateRecord(y0Var);
                }
            }
        }
        if (listPlus != null) {
            int size2 = listPlus.size();
            for (int i17 = 0; i17 < size2; i17++) {
                v0Var.remove((w0) listPlus.get(i17));
            }
            List list2 = this.f8594j;
            if (list2 != null) {
                listPlus = uu.y0.plus((Collection) list2, (Iterable) listPlus);
            }
            this.f8594j = listPlus;
        }
        return p.f8662a;
    }

    @Override // b1.m
    /* renamed from: nestedActivated$runtime */
    public void mo110nestedActivated$runtime(m mVar) {
        this.f8597m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    @Override // b1.m
    /* renamed from: nestedDeactivated$runtime */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo111nestedDeactivated$runtime(b1.m r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f8597m
            r2 = 0
            if (r1 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r2
        La:
            if (r1 != 0) goto L11
            java.lang.String r1 = "no pending nested snapshots"
            p0.a3.throwIllegalArgumentException(r1)
        L11:
            int r1 = r0.f8597m
            int r1 = r1 + (-1)
            r0.f8597m = r1
            if (r1 != 0) goto La2
            boolean r1 = r0.f8598n
            if (r1 != 0) goto La2
            z.v0 r1 = r0.getModified$runtime()
            if (r1 == 0) goto L9f
            boolean r3 = r0.f8598n
            if (r3 == 0) goto L2c
            java.lang.String r3 = "Unsupported operation on a snapshot that has been applied"
            p0.a3.throwIllegalStateException(r3)
        L2c:
            r3 = 0
            r0.setModified$runtime(r3)
            long r3 = r0.getSnapshotId()
            java.lang.Object[] r5 = r1.f96888b
            long[] r1 = r1.f96887a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L9f
            r7 = r2
        L3e:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L9a
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L58:
            if (r12 >= r10) goto L98
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L94
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r5[r13]
            b1.w0 r13 = (b1.w0) r13
            b1.y0 r13 = r13.getFirstStateRecord()
        L6e:
            if (r13 == 0) goto L94
            long r14 = r13.getSnapshotId$runtime()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L88
            b1.u r14 = r0.f8595k
            long r15 = r13.getSnapshotId$runtime()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = uu.y0.contains(r14, r15)
            if (r14 == 0) goto L8f
        L88:
            long r14 = b1.y.access$getINVALID_SNAPSHOT$p()
            r13.setSnapshotId$runtime(r14)
        L8f:
            b1.y0 r13 = r13.getNext$runtime()
            goto L6e
        L94:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L58
        L98:
            if (r10 != r11) goto L9f
        L9a:
            if (r7 == r6) goto L9f
            int r7 = r7 + 1
            goto L3e
        L9f:
            r0.closeAndReleasePinning$runtime()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.mo111nestedDeactivated$runtime(b1.m):void");
    }

    @Override // b1.m
    public void notifyObjectsInitialized$runtime() {
        if (this.f8598n || getDisposed$runtime()) {
            return;
        }
        advance$runtime();
    }

    @Override // b1.m
    /* renamed from: recordModified$runtime */
    public void mo112recordModified$runtime(w0 w0Var) {
        z.v0 modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            modified$runtime = p1.mutableScatterSetOf();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.add(w0Var);
    }

    public final void recordPrevious$runtime(long j10) {
        synchronized (y.getLock()) {
            this.f8595k = this.f8595k.set(j10);
        }
    }

    public final void recordPreviousList$runtime(u uVar) {
        synchronized (y.getLock()) {
            this.f8595k = this.f8595k.or(uVar);
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime(int i10) {
        if (i10 >= 0) {
            this.f8596l = uu.f0.plus(this.f8596l, i10);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f8596l;
        if (iArr2.length != 0) {
            iArr = uu.f0.plus(iArr2, iArr);
        }
        this.f8596l = iArr;
    }

    @Override // b1.m
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        int length = this.f8596l.length;
        for (int i10 = 0; i10 < length; i10++) {
            y.releasePinningLocked(this.f8596l[i10]);
        }
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    public final void setApplied$runtime(boolean z10) {
        this.f8598n = z10;
    }

    public final void setMerged$runtime(List<? extends w0> list) {
        this.f8594j = list;
    }

    public void setModified$runtime(z.v0 v0Var) {
        this.f8593i = v0Var;
    }

    public final void setPreviousIds$runtime(u uVar) {
        this.f8595k = uVar;
    }

    public final void setPreviousPinnedSnapshots$runtime(int[] iArr) {
        this.f8596l = iArr;
    }

    @Override // b1.m
    public void setWriteCount$runtime(int i10) {
        this.f8592h = i10;
    }

    public e takeNestedMutableSnapshot(kv.l lVar, kv.l lVar2) throws Throwable {
        Map map;
        validateNotDisposed$runtime();
        if (this.f8598n && this.f8655d < 0) {
            a3.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        s0.j jVar = c1.c.f11733a;
        if (jVar != null) {
            tu.v vVarMergeObservers = c1.c.mergeObservers(jVar, this, false, lVar, lVar2);
            c1.a aVar = (c1.a) vVarMergeObservers.getFirst();
            kv.l readObserver = aVar.getReadObserver();
            lVar2 = aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (y.getLock()) {
            try {
                long j10 = y.f8706e;
                long j11 = 1;
                y.f8706e += j11;
                y.f8705d = y.f8705d.set(j10);
                u invalid$runtime = getInvalid$runtime();
                setInvalid$runtime(invalid$runtime.set(j10));
                try {
                    f fVar = new f(j10, y.addRange(invalid$runtime, getSnapshotId() + j11, j10), y.c(lVar, getReadObserver()), y.access$mergedWriteObserver(lVar2, getWriteObserver$runtime()), this);
                    if (!getApplied$runtime() && !getDisposed$runtime()) {
                        long snapshotId = getSnapshotId();
                        synchronized (y.getLock()) {
                            long j12 = y.f8706e;
                            y.f8706e += j11;
                            setSnapshotId$runtime(j12);
                            y.f8705d = y.f8705d.set(getSnapshotId());
                        }
                        setInvalid$runtime(y.addRange(getInvalid$runtime(), snapshotId + j11, getSnapshotId()));
                    }
                    if (jVar != null) {
                        c1.c.dispatchCreatedObservers(jVar, this, fVar, map);
                    }
                    return fVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // b1.m
    public m takeNestedSnapshot(kv.l lVar) {
        long j10;
        g gVar;
        validateNotDisposed$runtime();
        if (this.f8598n && this.f8655d < 0) {
            a3.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        long snapshotId = getSnapshotId();
        Map map = null;
        e eVar = this instanceof c ? null : this;
        s0.j jVar = c1.c.f11733a;
        kv.l lVar2 = lVar;
        if (jVar != null) {
            tu.v vVarMergeObservers = c1.c.mergeObservers(jVar, eVar, true, lVar2, null);
            c1.a aVar = (c1.a) vVarMergeObservers.getFirst();
            kv.l readObserver = aVar.getReadObserver();
            aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar2 = readObserver;
        }
        Map map2 = map;
        recordPrevious$runtime(getSnapshotId());
        synchronized (y.getLock()) {
            long j11 = y.f8706e;
            j10 = 1;
            y.f8706e += j10;
            y.f8705d = y.f8705d.set(j11);
            gVar = new g(j11, y.addRange(getInvalid$runtime(), snapshotId + j10, j11), y.c(lVar2, getReadObserver()), this);
        }
        if (!getApplied$runtime() && !getDisposed$runtime()) {
            long snapshotId2 = getSnapshotId();
            synchronized (y.getLock()) {
                long j12 = y.f8706e;
                y.f8706e += j10;
                setSnapshotId$runtime(j12);
                y.f8705d = y.f8705d.set(getSnapshotId());
            }
            setInvalid$runtime(y.addRange(getInvalid$runtime(), snapshotId2 + j10, getSnapshotId()));
        }
        if (jVar != null) {
            c1.c.dispatchCreatedObservers(jVar, eVar, gVar, map2);
        }
        return gVar;
    }

    public final void advance$runtime() {
        long j10;
        recordPrevious$runtime(getSnapshotId());
        if (getApplied$runtime() || getDisposed$runtime()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (y.getLock()) {
            long j11 = y.f8706e;
            j10 = 1;
            y.f8706e += j10;
            setSnapshotId$runtime(j11);
            y.f8705d = y.f8705d.set(getSnapshotId());
        }
        setInvalid$runtime(y.addRange(getInvalid$runtime(), snapshotId + j10, getSnapshotId()));
    }

    @Override // b1.m
    public m getRoot() {
        return this;
    }
}
