package b1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends m {

    /* renamed from: f, reason: collision with root package name */
    public final m f8601f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8602g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8603h;

    /* renamed from: i, reason: collision with root package name */
    public kv.l f8604i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8605j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f8606k;

    public e1(m mVar, kv.l lVar, boolean z10, boolean z11) {
        kv.l readObserver;
        super(y.access$getINVALID_SNAPSHOT$p(), u.f8690g.getEMPTY(), (kotlin.jvm.internal.u) null);
        this.f8601f = mVar;
        this.f8602g = z10;
        this.f8603h = z11;
        this.f8604i = y.access$mergedReadObserver(lVar, (mVar == null || (readObserver = mVar.getReadObserver()) == null) ? y.f8711j.getReadObserver() : readObserver, z10);
        this.f8605j = z0.i0.currentThreadId();
        this.f8606k = this;
    }

    public final m a() {
        m mVar = this.f8601f;
        return mVar == null ? y.f8711j : mVar;
    }

    @Override // b1.m
    public void dispose() {
        m mVar;
        setDisposed$runtime(true);
        if (!this.f8603h || (mVar = this.f8601f) == null) {
            return;
        }
        mVar.dispose();
    }

    @Override // b1.m
    public u getInvalid$runtime() {
        return a().getInvalid$runtime();
    }

    @Override // b1.m
    public z.v0 getModified$runtime() {
        return a().getModified$runtime();
    }

    @Override // b1.m
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public kv.l getReadObserver() {
        return this.f8604i;
    }

    @Override // b1.m
    public boolean getReadOnly() {
        return a().getReadOnly();
    }

    @Override // b1.m
    public m getRoot() {
        return this.f8606k;
    }

    @Override // b1.m
    public long getSnapshotId() {
        return a().getSnapshotId();
    }

    public final long getThreadId$runtime() {
        return this.f8605j;
    }

    @Override // b1.m
    public kv.l getWriteObserver$runtime() {
        return null;
    }

    @Override // b1.m
    public boolean hasPendingChanges() {
        return a().hasPendingChanges();
    }

    @Override // b1.m
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo110nestedActivated$runtime(m mVar) {
        throw e2.u();
    }

    @Override // b1.m
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo111nestedDeactivated$runtime(m mVar) {
        throw e2.u();
    }

    @Override // b1.m
    public void notifyObjectsInitialized$runtime() {
        a().notifyObjectsInitialized$runtime();
    }

    @Override // b1.m
    /* renamed from: recordModified$runtime */
    public void mo112recordModified$runtime(w0 w0Var) {
        a().mo112recordModified$runtime(w0Var);
    }

    @Override // b1.m
    public void setInvalid$runtime(u uVar) {
        throw e2.u();
    }

    public void setModified$runtime(z.v0 v0Var) {
        throw e2.u();
    }

    public void setReadObserver$runtime(kv.l lVar) {
        this.f8604i = lVar;
    }

    @Override // b1.m
    public void setSnapshotId$runtime(long j10) {
        throw e2.u();
    }

    @Override // b1.m
    public m takeNestedSnapshot(kv.l lVar) {
        kv.l lVarC = y.c(lVar, getReadObserver());
        return !this.f8602g ? y.access$createTransparentSnapshotWithNoParentReadObserver(a().takeNestedSnapshot(null), lVarC, true) : a().takeNestedSnapshot(lVarC);
    }
}
