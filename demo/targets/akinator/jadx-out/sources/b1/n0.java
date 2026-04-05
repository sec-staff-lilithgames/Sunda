package b1;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8657a = new Object();

    public static final <T> boolean attemptUpdate(a1 a1Var, int i10, s0.n nVar) {
        boolean z10;
        synchronized (f8657a) {
            if (a1Var.getModification$runtime() == i10) {
                a1Var.setSet$runtime(nVar);
                z10 = true;
                a1Var.setModification$runtime(a1Var.getModification$runtime() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static final <T> void clearImpl(SnapshotStateSet<T> snapshotStateSet) {
        m current;
        y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        a1 a1Var = (a1) firstStateRecord;
        synchronized (y.getLock()) {
            try {
                current = m.f8651e.getCurrent();
                a1 a1Var2 = (a1) y.writableRecord(a1Var, snapshotStateSet, current);
                synchronized (f8657a) {
                    try {
                        a1Var2.setSet$runtime(s0.a.persistentSetOf());
                        a1Var2.setModification$runtime(a1Var2.getModification$runtime() + 1);
                        kotlin.jvm.internal.b0.finallyStart(1);
                    } catch (Throwable th2) {
                        kotlin.jvm.internal.b0.finallyStart(1);
                        kotlin.jvm.internal.b0.finallyEnd(1);
                        throw th2;
                    }
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th3;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        y.notifyWrite(current, snapshotStateSet);
    }

    public static final <T> boolean conditionalUpdate(SnapshotStateSet<T> snapshotStateSet, kv.l lVar) {
        int modification$runtime;
        s0.n set$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8657a) {
                try {
                    y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    a1 a1Var = (a1) y.current((a1) firstStateRecord);
                    modification$runtime = a1Var.getModification$runtime();
                    set$runtime = a1Var.getSet$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(set$runtime);
            s0.n nVar = (s0.n) lVar.invoke(set$runtime);
            if (kotlin.jvm.internal.e0.areEqual(nVar, set$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            a1 a1Var2 = (a1) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((a1) y.writableRecord(a1Var2, snapshotStateSet, current), modification$runtime, nVar);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateSet);
        } while (!zAttemptUpdate);
        return true;
    }

    public static final <T> a1 getReadable(SnapshotStateSet<T> snapshotStateSet) {
        y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (a1) y.readable((a1) firstStateRecord, snapshotStateSet);
    }

    public static /* synthetic */ void getReadable$annotations(SnapshotStateSet snapshotStateSet) {
    }

    public static final <R, T> R mutate(SnapshotStateSet<T> snapshotStateSet, kv.l lVar) {
        int modification$runtime;
        s0.n set$runtime;
        s0.m mVarBuilder;
        R r10;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8657a) {
                try {
                    y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    a1 a1Var = (a1) y.current((a1) firstStateRecord);
                    modification$runtime = a1Var.getModification$runtime();
                    set$runtime = a1Var.getSet$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            if (set$runtime != null && (mVarBuilder = set$runtime.builder()) != null) {
                r10 = (R) lVar.invoke(mVarBuilder);
                s0.n nVarBuild = mVarBuilder.build();
                if (kotlin.jvm.internal.e0.areEqual(nVarBuild, set$runtime)) {
                    break;
                }
                y0 firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                a1 a1Var2 = (a1) firstStateRecord2;
                synchronized (y.getLock()) {
                    try {
                        current = m.f8651e.getCurrent();
                        zAttemptUpdate = attemptUpdate((a1) y.writableRecord(a1Var2, snapshotStateSet, current), modification$runtime, nVarBuild);
                        kotlin.jvm.internal.b0.finallyStart(1);
                    } catch (Throwable th3) {
                        kotlin.jvm.internal.b0.finallyStart(1);
                        kotlin.jvm.internal.b0.finallyEnd(1);
                        throw th3;
                    }
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                y.notifyWrite(current, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return r10;
    }

    public static final <T> boolean mutateBoolean(SnapshotStateSet<T> snapshotStateSet, kv.l lVar) {
        int modification$runtime;
        s0.n set$runtime;
        s0.m mVarBuilder;
        Object objInvoke;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8657a) {
                y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                a1 a1Var = (a1) y.current((a1) firstStateRecord);
                modification$runtime = a1Var.getModification$runtime();
                set$runtime = a1Var.getSet$runtime();
            }
            if (set$runtime != null && (mVarBuilder = set$runtime.builder()) != null) {
                objInvoke = lVar.invoke(mVarBuilder);
                s0.n nVarBuild = mVarBuilder.build();
                if (kotlin.jvm.internal.e0.areEqual(nVarBuild, set$runtime)) {
                    break;
                }
                y0 firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                a1 a1Var2 = (a1) firstStateRecord2;
                synchronized (y.getLock()) {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((a1) y.writableRecord(a1Var2, snapshotStateSet, current), modification$runtime, nVarBuild);
                }
                y.notifyWrite(current, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final <T> y0 stateRecordWith(SnapshotStateSet<T> snapshotStateSet, s0.n nVar) {
        a1 a1Var = new a1(y.currentSnapshot().getSnapshotId(), nVar);
        if (m.f8651e.isInSnapshot()) {
            a1Var.setNext$runtime(new a1(v.toSnapshotId(1), nVar));
        }
        return a1Var;
    }

    public static final <R, T> R withCurrent(SnapshotStateSet<T> snapshotStateSet, kv.l lVar) {
        y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return (R) lVar.invoke(y.current((a1) firstStateRecord));
    }

    public static final <R, T> R writable(SnapshotStateSet<T> snapshotStateSet, kv.l lVar) {
        m current;
        R r10;
        y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        a1 a1Var = (a1) firstStateRecord;
        synchronized (y.getLock()) {
            try {
                current = m.f8651e.getCurrent();
                r10 = (R) lVar.invoke(y.writableRecord(a1Var, snapshotStateSet, current));
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        y.notifyWrite(current, snapshotStateSet);
        return r10;
    }

    public static final <T> int getModification(SnapshotStateSet<T> snapshotStateSet) {
        y0 firstStateRecord = snapshotStateSet.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, LJjmO.FtDoVR);
        return ((a1) y.current((a1) firstStateRecord)).getModification$runtime();
    }
}
