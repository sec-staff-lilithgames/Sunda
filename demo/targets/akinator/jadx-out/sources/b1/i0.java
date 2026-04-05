package b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements w0, Map, lv.g {

    /* renamed from: b, reason: collision with root package name */
    public a f8615b;

    /* renamed from: c, reason: collision with root package name */
    public final z f8616c;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f8617e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f8618f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends y0 {

        /* renamed from: c, reason: collision with root package name */
        public s0.l f8619c;

        /* renamed from: d, reason: collision with root package name */
        public int f8620d;

        public a(long j10, s0.l lVar) {
            super(j10);
            this.f8619c = lVar;
        }

        @Override // b1.y0
        public void assign(y0 y0Var) {
            kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) y0Var;
            synchronized (j0.f8622a) {
                this.f8619c = aVar.f8619c;
                this.f8620d = aVar.f8620d;
            }
        }

        @Override // b1.y0
        public y0 create() {
            return new a(y.currentSnapshot().getSnapshotId(), this.f8619c);
        }

        public final s0.l getMap$runtime() {
            return this.f8619c;
        }

        public final int getModification$runtime() {
            return this.f8620d;
        }

        public final void setMap$runtime(s0.l lVar) {
            this.f8619c = lVar;
        }

        public final void setModification$runtime(int i10) {
            this.f8620d = i10;
        }

        @Override // b1.y0
        public y0 create(long j10) {
            return new a(j10, this.f8619c);
        }
    }

    public i0() {
        s0.l lVarPersistentHashMapOf = s0.a.persistentHashMapOf();
        m mVarCurrentSnapshot = y.currentSnapshot();
        a aVar = new a(mVarCurrentSnapshot.getSnapshotId(), lVarPersistentHashMapOf);
        if (!(mVarCurrentSnapshot instanceof c)) {
            aVar.setNext$runtime(new a(v.toSnapshotId(1), lVarPersistentHashMapOf));
        }
        this.f8615b = aVar;
        this.f8616c = new z(this);
        this.f8617e = new a0(this);
        this.f8618f = new c0(this);
    }

    public static final boolean access$attemptUpdate(i0 i0Var, a aVar, int i10, s0.l lVar) {
        boolean z10;
        i0Var.getClass();
        synchronized (j0.f8622a) {
            if (aVar.getModification$runtime() == i10) {
                aVar.setMap$runtime(lVar);
                z10 = true;
                aVar.setModification$runtime(aVar.getModification$runtime() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean all$runtime(kv.l lVar) {
        Iterator it = ((s0.f) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it.hasNext()) {
            if (!((Boolean) lVar.invoke((Map.Entry) it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime(kv.l lVar) {
        Iterator it = ((s0.f) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke((Map.Entry) it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        m current;
        y0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) y.current((a) firstStateRecord);
        aVar.getMap$runtime();
        s0.l lVarPersistentHashMapOf = s0.a.persistentHashMapOf();
        if (lVarPersistentHashMapOf != aVar.getMap$runtime()) {
            y0 firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                a aVar3 = (a) y.writableRecord(aVar2, this, current);
                synchronized (j0.f8622a) {
                    aVar3.setMap$runtime(lVarPersistentHashMapOf);
                    aVar3.setModification$runtime(aVar3.getModification$runtime() + 1);
                }
            }
            y.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime().getMap$runtime().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime().getMap$runtime().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getReadable$runtime().getMap$runtime().get(obj);
    }

    public final Map<Object, Object> getDebuggerDisplayValue() {
        y0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((a) y.current((a) firstStateRecord)).getMap$runtime();
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        return this.f8616c;
    }

    @Override // b1.w0
    public y0 getFirstStateRecord() {
        return this.f8615b;
    }

    public Set<Object> getKeys() {
        return this.f8617e;
    }

    public final int getModification$runtime() {
        return getReadable$runtime().getModification$runtime();
    }

    public final a getReadable$runtime() {
        y0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) y.readable((a) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime().getMap$runtime().size();
    }

    public Collection<Object> getValues() {
        return this.f8618f;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime().getMap$runtime().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // b1.w0
    public /* bridge */ /* synthetic */ y0 mergeRecords(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        return super.mergeRecords(y0Var, y0Var2, y0Var3);
    }

    @Override // b1.w0
    public void prependStateRecord(y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f8615b = (a) y0Var;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        s0.l map$runtime;
        int modification$runtime;
        Object objPut;
        m current;
        boolean zAccess$attemptUpdate;
        do {
            synchronized (j0.f8622a) {
                y0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) y.current((a) firstStateRecord);
                map$runtime = aVar.getMap$runtime();
                modification$runtime = aVar.getModification$runtime();
            }
            kotlin.jvm.internal.e0.checkNotNull(map$runtime);
            s0.k kVarBuilder = map$runtime.builder();
            objPut = kVarBuilder.put(obj, obj2);
            s0.l lVarBuild = kVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(lVarBuild, map$runtime)) {
                break;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAccess$attemptUpdate = access$attemptUpdate(this, (a) y.writableRecord(aVar2, this, current), modification$runtime, lVarBuild);
            }
            y.notifyWrite(current, this);
        } while (!zAccess$attemptUpdate);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        s0.l map$runtime;
        int modification$runtime;
        m current;
        boolean zAccess$attemptUpdate;
        do {
            synchronized (j0.f8622a) {
                y0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) y.current((a) firstStateRecord);
                map$runtime = aVar.getMap$runtime();
                modification$runtime = aVar.getModification$runtime();
            }
            kotlin.jvm.internal.e0.checkNotNull(map$runtime);
            s0.k kVarBuilder = map$runtime.builder();
            kVarBuilder.putAll(map);
            s0.l lVarBuild = kVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(lVarBuild, map$runtime)) {
                return;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAccess$attemptUpdate = access$attemptUpdate(this, (a) y.writableRecord(aVar2, this, current), modification$runtime, lVarBuild);
            }
            y.notifyWrite(current, this);
        } while (!zAccess$attemptUpdate);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        s0.l map$runtime;
        int modification$runtime;
        Object objRemove;
        m current;
        boolean zAccess$attemptUpdate;
        do {
            synchronized (j0.f8622a) {
                y0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) y.current((a) firstStateRecord);
                map$runtime = aVar.getMap$runtime();
                modification$runtime = aVar.getModification$runtime();
            }
            kotlin.jvm.internal.e0.checkNotNull(map$runtime);
            s0.k kVarBuilder = map$runtime.builder();
            objRemove = kVarBuilder.remove(obj);
            s0.l lVarBuild = kVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(lVarBuild, map$runtime)) {
                break;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAccess$attemptUpdate = access$attemptUpdate(this, (a) y.writableRecord(aVar2, this, current), modification$runtime, lVarBuild);
            }
            y.notifyWrite(current, this);
        } while (!zAccess$attemptUpdate);
        return objRemove;
    }

    public final boolean removeIf$runtime(kv.l lVar) {
        s0.l map$runtime;
        int modification$runtime;
        m current;
        boolean zAccess$attemptUpdate;
        boolean z10 = false;
        do {
            synchronized (j0.f8622a) {
                try {
                    y0 firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) y.current((a) firstStateRecord);
                    map$runtime = aVar.getMap$runtime();
                    modification$runtime = aVar.getModification$runtime();
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            kotlin.jvm.internal.e0.checkNotNull(map$runtime);
            s0.k kVarBuilder = map$runtime.builder();
            for (Map.Entry<Object, Object> entry : entrySet()) {
                if (((Boolean) lVar.invoke(entry)).booleanValue()) {
                    kVarBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            s0.l lVarBuild = kVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(lVarBuild, map$runtime)) {
                break;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (y.getLock()) {
                try {
                    current = m.f8651e.getCurrent();
                    zAccess$attemptUpdate = access$attemptUpdate(this, (a) y.writableRecord(aVar2, this, current), modification$runtime, lVarBuild);
                    kotlin.jvm.internal.b0.finallyStart(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.b0.finallyStart(1);
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            y.notifyWrite(current, this);
        } while (!zAccess$attemptUpdate);
        return z10;
    }

    public final boolean removeValue$runtime(Object obj) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.e0.areEqual(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map<Object, Object> toMap() {
        return getReadable$runtime().getMap$runtime();
    }

    public String toString() {
        y0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) y.current((a) firstStateRecord)).getMap$runtime() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime$annotations() {
    }
}
