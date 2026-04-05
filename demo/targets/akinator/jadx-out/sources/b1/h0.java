package b1;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8614a = new Object();

    public static final <T> SnapshotStateList<T> SnapshotStateList(int i10, kv.l lVar) {
        if (i10 == 0) {
            return new SnapshotStateList<>();
        }
        s0.i iVarBuilder = s0.a.persistentListOf().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            iVarBuilder.add(lVar.invoke(Integer.valueOf(i11)));
        }
        return new SnapshotStateList<>(iVarBuilder.build());
    }

    public static final Void access$invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void access$modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final void access$validateRange(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final <T> boolean attemptUpdate(q0 q0Var, int i10, s0.j jVar, boolean z10) {
        boolean z11;
        synchronized (f8614a) {
            try {
                if (q0Var.getModification$runtime() == i10) {
                    q0Var.setList$runtime(jVar);
                    z11 = true;
                    if (z10) {
                        q0Var.setStructuralChange$runtime(q0Var.getStructuralChange$runtime() + 1);
                    }
                    q0Var.setModification$runtime(q0Var.getModification$runtime() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final <T> void clearImpl(SnapshotStateList<T> snapshotStateList) {
        m current;
        y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        q0 q0Var = (q0) firstStateRecord;
        synchronized (y.getLock()) {
            try {
                current = m.f8651e.getCurrent();
                q0 q0Var2 = (q0) y.writableRecord(q0Var, snapshotStateList, current);
                synchronized (f8614a) {
                    try {
                        q0Var2.setList$runtime(s0.a.persistentListOf());
                        q0Var2.setModification$runtime(q0Var2.getModification$runtime() + 1);
                        q0Var2.setStructuralChange$runtime(q0Var2.getStructuralChange$runtime() + 1);
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
        y.notifyWrite(current, snapshotStateList);
    }

    public static final <T> boolean conditionalUpdate(SnapshotStateList<T> snapshotStateList, boolean z10, kv.l lVar) {
        int modification$runtime;
        s0.j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8614a) {
                try {
                    y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    q0 q0Var = (q0) y.current((q0) firstStateRecord);
                    modification$runtime = q0Var.getModification$runtime();
                    list$runtime = q0Var.getList$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.j jVar = (s0.j) lVar.invoke(list$runtime);
            if (kotlin.jvm.internal.e0.areEqual(jVar, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVar, z10);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z10, kv.l lVar, int i10, Object obj) {
        int modification$runtime;
        s0.j list$runtime;
        m current;
        boolean zAttemptUpdate;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (f8614a) {
                try {
                    y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    q0 q0Var = (q0) y.current((q0) firstStateRecord);
                    modification$runtime = q0Var.getModification$runtime();
                    list$runtime = q0Var.getList$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.j jVar = (s0.j) lVar.invoke(list$runtime);
            if (kotlin.jvm.internal.e0.areEqual(jVar, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVar, z10);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return true;
    }

    public static final <T> q0 getReadable(SnapshotStateList<T> snapshotStateList) {
        y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (q0) y.readable((q0) firstStateRecord, snapshotStateList);
    }

    public static final <T> int getStructure(SnapshotStateList<T> snapshotStateList) {
        y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((q0) y.current((q0) firstStateRecord)).getStructuralChange$runtime();
    }

    public static final <R, T> R mutate(SnapshotStateList<T> snapshotStateList, kv.l lVar) {
        int modification$runtime;
        s0.j list$runtime;
        R r10;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8614a) {
                try {
                    y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    q0 q0Var = (q0) y.current((q0) firstStateRecord);
                    modification$runtime = q0Var.getModification$runtime();
                    list$runtime = q0Var.getList$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.i iVarBuilder = list$runtime.builder();
            r10 = (R) lVar.invoke(iVarBuilder);
            s0.j jVarBuild = iVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(jVarBuild, list$runtime)) {
                break;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVarBuild, true);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return r10;
    }

    public static final <T> boolean mutateBoolean(SnapshotStateList<T> snapshotStateList, kv.l lVar) {
        int modification$runtime;
        s0.j list$runtime;
        Object objInvoke;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8614a) {
                y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.i iVarBuilder = list$runtime.builder();
            objInvoke = lVar.invoke(iVarBuilder);
            s0.j jVarBuild = iVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(jVarBuild, list$runtime)) {
                break;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVarBuild, true);
            }
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final <T> y0 stateRecordWith(SnapshotStateList<T> snapshotStateList, s0.j jVar) {
        m mVarCurrentSnapshot = y.currentSnapshot();
        q0 q0Var = new q0(mVarCurrentSnapshot.getSnapshotId(), jVar);
        if (!(mVarCurrentSnapshot instanceof c)) {
            q0Var.setNext$runtime(new q0(v.toSnapshotId(1), jVar));
        }
        return q0Var;
    }

    public static final <T> void update(SnapshotStateList<T> snapshotStateList, boolean z10, kv.l lVar) {
        int modification$runtime;
        s0.j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (f8614a) {
                try {
                    y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    q0 q0Var = (q0) y.current((q0) firstStateRecord);
                    modification$runtime = q0Var.getModification$runtime();
                    list$runtime = q0Var.getList$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.j jVar = (s0.j) lVar.invoke(list$runtime);
            if (kotlin.jvm.internal.e0.areEqual(jVar, list$runtime)) {
                return;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVar, z10);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
    }

    public static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z10, kv.l lVar, int i10, Object obj) {
        int modification$runtime;
        s0.j list$runtime;
        m current;
        boolean zAttemptUpdate;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (f8614a) {
                try {
                    y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    q0 q0Var = (q0) y.current((q0) firstStateRecord);
                    modification$runtime = q0Var.getModification$runtime();
                    list$runtime = q0Var.getList$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(list$runtime);
            s0.j jVar = (s0.j) lVar.invoke(list$runtime);
            if (kotlin.jvm.internal.e0.areEqual(jVar, list$runtime)) {
                return;
            }
            y0 firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAttemptUpdate = attemptUpdate((q0) y.writableRecord(q0Var2, snapshotStateList, current), modification$runtime, jVar, z10);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
    }

    public static final <R, T> R withCurrent(SnapshotStateList<T> snapshotStateList, kv.l lVar) {
        y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return (R) lVar.invoke(y.current((q0) firstStateRecord));
    }

    public static final <R, T> R writable(SnapshotStateList<T> snapshotStateList, kv.l lVar) {
        m current;
        R r10;
        y0 firstStateRecord = snapshotStateList.getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        q0 q0Var = (q0) firstStateRecord;
        synchronized (y.getLock()) {
            try {
                current = m.f8651e.getCurrent();
                r10 = (R) lVar.invoke(y.writableRecord(q0Var, snapshotStateList, current));
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        y.notifyWrite(current, snapshotStateList);
        return r10;
    }

    public static /* synthetic */ void getReadable$annotations(SnapshotStateList snapshotStateList) {
    }
}
