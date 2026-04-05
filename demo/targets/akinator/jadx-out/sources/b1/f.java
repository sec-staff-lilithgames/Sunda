package b1;

import b1.o;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: p, reason: collision with root package name */
    public final e f8607p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8608q;

    public f(long j10, u uVar, kv.l lVar, kv.l lVar2, e eVar) {
        super(j10, uVar, lVar, lVar2);
        this.f8607p = eVar;
        eVar.mo110nestedActivated$runtime(this);
    }

    @Override // b1.e
    public o apply() throws Throwable {
        f fVar;
        if (this.f8607p.getApplied$runtime() || this.f8607p.getDisposed$runtime()) {
            return new o.a(this);
        }
        z.v0 modified$runtime = getModified$runtime();
        long snapshotId = getSnapshotId();
        Map<y0, ? extends y0> mapAccess$optimisticMerges = modified$runtime != null ? y.access$optimisticMerges(this.f8607p.getSnapshotId(), this, this.f8607p.getInvalid$runtime()) : null;
        synchronized (y.getLock()) {
            try {
                y.access$validateOpen(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (modified$runtime == null || modified$runtime.getSize() == 0) {
                    fVar = this;
                    closeAndReleasePinning$runtime();
                } else {
                    fVar = this;
                    o oVarInnerApplyLocked$runtime = fVar.innerApplyLocked$runtime(this.f8607p.getSnapshotId(), modified$runtime, mapAccess$optimisticMerges, this.f8607p.getInvalid$runtime());
                    if (!kotlin.jvm.internal.e0.areEqual(oVarInnerApplyLocked$runtime, p.f8662a)) {
                        return oVarInnerApplyLocked$runtime;
                    }
                    z.v0 modified$runtime2 = fVar.f8607p.getModified$runtime();
                    if (modified$runtime2 != null) {
                        modified$runtime2.addAll(modified$runtime);
                    } else {
                        fVar.f8607p.setModified$runtime(modified$runtime);
                        setModified$runtime(null);
                    }
                }
                if (kotlin.jvm.internal.e0.compare(fVar.f8607p.getSnapshotId(), snapshotId) < 0) {
                    fVar.f8607p.advance$runtime();
                }
                e eVar = fVar.f8607p;
                eVar.setInvalid$runtime(eVar.getInvalid$runtime().clear(snapshotId).andNot(getPreviousIds$runtime()));
                fVar.f8607p.recordPrevious$runtime(snapshotId);
                fVar.f8607p.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
                fVar.f8607p.recordPreviousList$runtime(getPreviousIds$runtime());
                fVar.f8607p.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots$runtime());
                setApplied$runtime(true);
                if (!fVar.f8608q) {
                    fVar.f8608q = true;
                    fVar.f8607p.mo111nestedDeactivated$runtime(this);
                }
                c1.c.dispatchObserverOnApplied(this, modified$runtime);
                return p.f8662a;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // b1.e, b1.m
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        super.dispose();
        if (this.f8608q) {
            return;
        }
        this.f8608q = true;
        this.f8607p.mo111nestedDeactivated$runtime(this);
    }

    public final e getParent() {
        return this.f8607p;
    }

    @Override // b1.e, b1.m
    public m getRoot() {
        return this.f8607p.getRoot();
    }
}
