package b1;

import b0.e2;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f8623f;

    /* renamed from: g, reason: collision with root package name */
    public int f8624g;

    public k(long j10, u uVar, kv.l lVar) {
        super(j10, uVar, (kotlin.jvm.internal.u) null);
        this.f8623f = lVar;
        this.f8624g = 1;
    }

    @Override // b1.m
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        mo111nestedDeactivated$runtime(this);
        super.dispose();
        c1.c.dispatchObserverOnPreDispose(this);
    }

    @Override // b1.m
    public z.v0 getModified$runtime() {
        return null;
    }

    @Override // b1.m
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public kv.l getReadObserver() {
        return this.f8623f;
    }

    @Override // b1.m
    public boolean getReadOnly() {
        return true;
    }

    @Override // b1.m
    public kv.l getWriteObserver$runtime() {
        return null;
    }

    @Override // b1.m
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // b1.m
    /* renamed from: nestedActivated$runtime */
    public void mo110nestedActivated$runtime(m mVar) {
        this.f8624g++;
    }

    @Override // b1.m
    /* renamed from: nestedDeactivated$runtime */
    public void mo111nestedDeactivated$runtime(m mVar) {
        int i10 = this.f8624g - 1;
        this.f8624g = i10;
        if (i10 == 0) {
            closeAndReleasePinning$runtime();
        }
    }

    @Override // b1.m
    /* renamed from: recordModified$runtime */
    public void mo112recordModified$runtime(w0 w0Var) {
        y.access$reportReadonlySnapshotWrite();
        throw new tu.k();
    }

    public void setModified$runtime(z.v0 v0Var) {
        throw e2.u();
    }

    @Override // b1.m
    public m takeNestedSnapshot(kv.l lVar) {
        y.access$validateOpen(this);
        s0.j jVar = c1.c.f11733a;
        Map map = null;
        if (jVar != null) {
            tu.v vVarMergeObservers = c1.c.mergeObservers(jVar, this, true, lVar, null);
            c1.a aVar = (c1.a) vVarMergeObservers.getFirst();
            kv.l readObserver = aVar.getReadObserver();
            aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar = readObserver;
        }
        g gVar = new g(getSnapshotId(), getInvalid$runtime(), y.c(lVar, getReadObserver()), this);
        if (jVar != null) {
            c1.c.dispatchCreatedObservers(jVar, this, gVar, map);
        }
        return gVar;
    }

    @Override // b1.m
    public m getRoot() {
        return this;
    }

    @Override // b1.m
    public void notifyObjectsInitialized$runtime() {
    }
}
