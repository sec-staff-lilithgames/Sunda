package b1;

import java.util.Collection;
import p0.a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8651e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public u f8652a;

    /* renamed from: b, reason: collision with root package name */
    public long f8653b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8654c;

    /* renamed from: d, reason: collision with root package name */
    public int f8655d;

    public m(long j10, u uVar, kotlin.jvm.internal.u uVar2) {
        this.f8652a = uVar;
        this.f8653b = j10;
        this.f8655d = j10 != y.access$getINVALID_SNAPSHOT$p() ? y.trackPinning(j10, getInvalid$runtime()) : -1;
    }

    public static /* synthetic */ m takeNestedSnapshot$default(m mVar, kv.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return mVar.takeNestedSnapshot(lVar);
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (y.getLock()) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
        }
    }

    public void closeLocked$runtime() {
        y.f8705d = y.f8705d.clear(getSnapshotId());
    }

    public void dispose() {
        this.f8654c = true;
        synchronized (y.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
    }

    public final <T> T enter(kv.a aVar) {
        m mVarMakeCurrent = makeCurrent();
        try {
            return (T) aVar.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            restoreCurrent(mVarMakeCurrent);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public final boolean getDisposed$runtime() {
        return this.f8654c;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public u getInvalid$runtime() {
        return this.f8652a;
    }

    public abstract z.v0 getModified$runtime();

    public abstract kv.l getReadObserver();

    public abstract boolean getReadOnly();

    public abstract m getRoot();

    public long getSnapshotId() {
        return this.f8653b;
    }

    public int getWriteCount$runtime() {
        return 0;
    }

    public abstract kv.l getWriteObserver$runtime();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime() {
        return this.f8655d >= 0;
    }

    public m makeCurrent() {
        m mVar = (m) y.f8703b.get();
        y.f8703b.set(this);
        return mVar;
    }

    /* renamed from: nestedActivated$runtime */
    public abstract void mo110nestedActivated$runtime(m mVar);

    /* renamed from: nestedDeactivated$runtime */
    public abstract void mo111nestedDeactivated$runtime(m mVar);

    public abstract void notifyObjectsInitialized$runtime();

    /* renamed from: recordModified$runtime */
    public abstract void mo112recordModified$runtime(w0 w0Var);

    public final void releasePinnedSnapshotLocked$runtime() {
        int i10 = this.f8655d;
        if (i10 >= 0) {
            y.releasePinningLocked(i10);
            this.f8655d = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public void restoreCurrent(m mVar) {
        y.f8703b.set(mVar);
    }

    public final void setDisposed$runtime(boolean z10) {
        this.f8654c = z10;
    }

    public void setInvalid$runtime(u uVar) {
        this.f8652a = uVar;
    }

    public void setSnapshotId$runtime(long j10) {
        this.f8653b = j10;
    }

    public void setWriteCount$runtime(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract m takeNestedSnapshot(kv.l lVar);

    public final int takeoverPinnedSnapshot$runtime() {
        int i10 = this.f8655d;
        this.f8655d = -1;
        return i10;
    }

    public final m unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(m mVar) {
        if (!(y.f8703b.get() == this)) {
            a3.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(mVar);
    }

    public final void validateNotDisposed$runtime() {
        if (this.f8654c) {
            a3.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public /* synthetic */ m(int i10, u uVar, kotlin.jvm.internal.u uVar2) {
        this(v.toSnapshotId(i10), uVar, (kotlin.jvm.internal.u) null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ Object observe$default(a aVar, kv.l lVar, kv.l lVar2, kv.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return aVar.observe(lVar, lVar2, aVar2);
        }

        public static /* synthetic */ e takeMutableSnapshot$default(a aVar, kv.l lVar, kv.l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return aVar.takeMutableSnapshot(lVar, lVar2);
        }

        public static /* synthetic */ m takeSnapshot$default(a aVar, kv.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            return aVar.takeSnapshot(lVar);
        }

        public final m createNonObservableSnapshot() {
            m mVar = (m) y.f8703b.get();
            boolean z10 = mVar instanceof e;
            if (z10 || mVar == null) {
                return new d1(z10 ? (e) mVar : null, null, null, false, false);
            }
            return new e1(mVar, null, false, false);
        }

        public final m getCurrent() {
            return y.currentSnapshot();
        }

        public final m getCurrentThreadSnapshot() {
            return (m) y.f8703b.get();
        }

        public final <T> T global(kv.a aVar) {
            m mVarRemoveCurrent = removeCurrent();
            try {
                return (T) aVar.invoke();
            } finally {
                kotlin.jvm.internal.b0.finallyStart(1);
                restoreCurrent(mVarRemoveCurrent);
                kotlin.jvm.internal.b0.finallyEnd(1);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            return y.f8713l.get() > 0;
        }

        public final boolean isInSnapshot() {
            return y.f8703b.get() != null;
        }

        public final m makeCurrentNonObservable(m mVar) {
            m d1Var;
            if (mVar instanceof d1) {
                d1 d1Var2 = (d1) mVar;
                if (d1Var2.getThreadId$runtime() == z0.i0.currentThreadId()) {
                    d1Var2.setReadObserver$runtime(null);
                    return mVar;
                }
            }
            if (mVar instanceof e1) {
                e1 e1Var = (e1) mVar;
                if (e1Var.getThreadId$runtime() == z0.i0.currentThreadId()) {
                    e1Var.setReadObserver$runtime(null);
                    return mVar;
                }
            }
            a1.o oVar = y.f8702a;
            boolean z10 = mVar instanceof e;
            if (z10 || mVar == null) {
                d1Var = new d1(z10 ? (e) mVar : null, null, null, false, false);
            } else {
                d1Var = new e1(mVar, null, false, false);
            }
            d1Var.makeCurrent();
            return d1Var;
        }

        public final void notifyObjectsInitialized() {
            y.currentSnapshot().notifyObjectsInitialized$runtime();
        }

        public final <T> T observe(kv.l lVar, kv.l lVar2, kv.a aVar) {
            m d1Var;
            if (lVar == null && lVar2 == null) {
                return (T) aVar.invoke();
            }
            m mVar = (m) y.f8703b.get();
            if (mVar instanceof d1) {
                d1 d1Var2 = (d1) mVar;
                if (d1Var2.getThreadId$runtime() == z0.i0.currentThreadId()) {
                    kv.l readObserver$runtime = d1Var2.getReadObserver();
                    kv.l writeObserver$runtime = d1Var2.getWriteObserver$runtime();
                    try {
                        ((d1) mVar).setReadObserver$runtime(y.c(lVar, readObserver$runtime));
                        ((d1) mVar).setWriteObserver$runtime(y.access$mergedWriteObserver(lVar2, writeObserver$runtime));
                        return (T) aVar.invoke();
                    } finally {
                        d1Var2.setReadObserver$runtime(readObserver$runtime);
                        d1Var2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (mVar == null || (mVar instanceof e)) {
                d1Var = new d1(mVar instanceof e ? (e) mVar : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return (T) aVar.invoke();
                }
                d1Var = mVar.takeNestedSnapshot(lVar);
            }
            try {
                m mVarMakeCurrent = d1Var.makeCurrent();
                try {
                    T t10 = (T) aVar.invoke();
                    d1Var.restoreCurrent(mVarMakeCurrent);
                    d1Var.dispose();
                    return t10;
                } catch (Throwable th2) {
                    d1Var.restoreCurrent(mVarMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                d1Var.dispose();
                throw th3;
            }
        }

        public final int openSnapshotCount() {
            return uu.y0.toList(y.f8705d).size();
        }

        public final h registerApplyObserver(kv.p pVar) {
            y.a(y.f8702a);
            synchronized (y.getLock()) {
                y.f8709h = uu.y0.plus((Collection<? extends kv.p>) y.f8709h, pVar);
            }
            return new af.g(pVar, 3);
        }

        public final h registerGlobalWriteObserver(kv.l lVar) {
            synchronized (y.getLock()) {
                y.f8710i = uu.y0.plus((Collection<? extends kv.l>) y.f8710i, lVar);
            }
            y.a(y.f8702a);
            return new l(0, lVar);
        }

        public final m removeCurrent() {
            m mVar = (m) y.f8703b.get();
            if (mVar != null) {
                y.f8703b.set(null);
            }
            return mVar;
        }

        public final void restoreCurrent(m mVar) {
            if (mVar != null) {
                y.f8703b.set(mVar);
            }
        }

        public final void restoreNonObservable(m mVar, m mVar2, kv.l lVar) {
            if (mVar != mVar2) {
                mVar2.restoreCurrent(mVar);
                mVar2.dispose();
            } else if (mVar instanceof d1) {
                ((d1) mVar).setReadObserver$runtime(lVar);
            } else if (mVar instanceof e1) {
                ((e1) mVar).setReadObserver$runtime(lVar);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + mVar).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean zHasPendingChanges;
            synchronized (y.getLock()) {
                zHasPendingChanges = y.f8711j.hasPendingChanges();
            }
            if (zHasPendingChanges) {
                y.a(y.f8702a);
            }
        }

        public final e takeMutableSnapshot(kv.l lVar, kv.l lVar2) {
            e eVarTakeNestedMutableSnapshot;
            m mVarCurrentSnapshot = y.currentSnapshot();
            e eVar = mVarCurrentSnapshot instanceof e ? (e) mVarCurrentSnapshot : null;
            if (eVar == null || (eVarTakeNestedMutableSnapshot = eVar.takeNestedMutableSnapshot(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return eVarTakeNestedMutableSnapshot;
        }

        public final m takeSnapshot(kv.l lVar) {
            return y.currentSnapshot().takeNestedSnapshot(lVar);
        }

        public final <R> R withMutableSnapshot(kv.a aVar) {
            e eVarTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                m mVarMakeCurrent = eVarTakeMutableSnapshot$default.makeCurrent();
                try {
                    R r10 = (R) aVar.invoke();
                    kotlin.jvm.internal.b0.finallyStart(1);
                    eVarTakeMutableSnapshot$default.apply().check();
                    eVarTakeMutableSnapshot$default.dispose();
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    return r10;
                } finally {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    eVarTakeMutableSnapshot$default.restoreCurrent(mVarMakeCurrent);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(kv.a aVar) {
            m currentThreadSnapshot = getCurrentThreadSnapshot();
            kv.l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            m mVarMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) aVar.invoke();
            } finally {
                kotlin.jvm.internal.b0.finallyStart(1);
                restoreNonObservable(currentThreadSnapshot, mVarMakeCurrentNonObservable, readObserver);
                kotlin.jvm.internal.b0.finallyEnd(1);
            }
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }
    }

    @tu.f
    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }
}
