package b1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends e {

    /* renamed from: p, reason: collision with root package name */
    public final e f8583p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f8584q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8585r;

    /* renamed from: s, reason: collision with root package name */
    public kv.l f8586s;

    /* renamed from: t, reason: collision with root package name */
    public kv.l f8587t;

    /* renamed from: u, reason: collision with root package name */
    public final long f8588u;

    public d1(e eVar, kv.l lVar, kv.l lVar2, boolean z10, boolean z11) {
        kv.l writeObserver$runtime;
        kv.l readObserver;
        super(y.access$getINVALID_SNAPSHOT$p(), u.f8690g.getEMPTY(), y.access$mergedReadObserver(lVar, (eVar == null || (readObserver = eVar.getReadObserver()) == null) ? y.f8711j.getReadObserver() : readObserver, z10), y.access$mergedWriteObserver(lVar2, (eVar == null || (writeObserver$runtime = eVar.getWriteObserver$runtime()) == null) ? y.f8711j.getWriteObserver$runtime() : writeObserver$runtime));
        this.f8583p = eVar;
        this.f8584q = z10;
        this.f8585r = z11;
        this.f8586s = super.getReadObserver();
        this.f8587t = super.getWriteObserver$runtime();
        this.f8588u = z0.i0.currentThreadId();
    }

    public final e a() {
        e eVar = this.f8583p;
        return eVar == null ? y.f8711j : eVar;
    }

    @Override // b1.e
    public o apply() {
        return a().apply();
    }

    @Override // b1.e, b1.m
    public void dispose() {
        e eVar;
        setDisposed$runtime(true);
        if (!this.f8585r || (eVar = this.f8583p) == null) {
            return;
        }
        eVar.dispose();
    }

    @Override // b1.m
    public u getInvalid$runtime() {
        return a().getInvalid$runtime();
    }

    @Override // b1.e, b1.m
    public z.v0 getModified$runtime() {
        return a().getModified$runtime();
    }

    @Override // b1.e, b1.m
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public kv.l getReadObserver() {
        return this.f8586s;
    }

    @Override // b1.e, b1.m
    public boolean getReadOnly() {
        return a().getReadOnly();
    }

    @Override // b1.m
    public long getSnapshotId() {
        return a().getSnapshotId();
    }

    public final long getThreadId$runtime() {
        return this.f8588u;
    }

    @Override // b1.e, b1.m
    public int getWriteCount$runtime() {
        return a().getWriteCount$runtime();
    }

    @Override // b1.e, b1.m
    public kv.l getWriteObserver$runtime() {
        return this.f8587t;
    }

    @Override // b1.e, b1.m
    public boolean hasPendingChanges() {
        return a().hasPendingChanges();
    }

    @Override // b1.e, b1.m
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo110nestedActivated$runtime(m mVar) {
        throw e2.u();
    }

    @Override // b1.e, b1.m
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo111nestedDeactivated$runtime(m mVar) {
        throw e2.u();
    }

    @Override // b1.e, b1.m
    public void notifyObjectsInitialized$runtime() {
        a().notifyObjectsInitialized$runtime();
    }

    @Override // b1.e, b1.m
    /* renamed from: recordModified$runtime */
    public void mo112recordModified$runtime(w0 w0Var) {
        a().mo112recordModified$runtime(w0Var);
    }

    @Override // b1.m
    public void setInvalid$runtime(u uVar) {
        throw e2.u();
    }

    @Override // b1.e
    public void setModified$runtime(z.v0 v0Var) {
        throw e2.u();
    }

    public void setReadObserver$runtime(kv.l lVar) {
        this.f8586s = lVar;
    }

    @Override // b1.m
    public void setSnapshotId$runtime(long j10) {
        throw e2.u();
    }

    @Override // b1.e, b1.m
    public void setWriteCount$runtime(int i10) {
        a().setWriteCount$runtime(i10);
    }

    public void setWriteObserver$runtime(kv.l lVar) {
        this.f8587t = lVar;
    }

    @Override // b1.e
    public e takeNestedMutableSnapshot(kv.l lVar, kv.l lVar2) {
        kv.l lVarC = y.c(lVar, getReadObserver());
        kv.l lVarAccess$mergedWriteObserver = y.access$mergedWriteObserver(lVar2, getWriteObserver$runtime());
        return !this.f8584q ? new d1(a().takeNestedMutableSnapshot(null, lVarAccess$mergedWriteObserver), lVarC, lVarAccess$mergedWriteObserver, false, true) : a().takeNestedMutableSnapshot(lVarC, lVarAccess$mergedWriteObserver);
    }

    @Override // b1.e, b1.m
    public m takeNestedSnapshot(kv.l lVar) {
        kv.l lVarC = y.c(lVar, getReadObserver());
        return !this.f8584q ? y.access$createTransparentSnapshotWithNoParentReadObserver(a().takeNestedSnapshot(null), lVarC, true) : a().takeNestedSnapshot(lVarC);
    }
}
