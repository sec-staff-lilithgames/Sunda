package b1;

import b0.e2;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8578p = 0;

    public c(long j10, u uVar) {
        super(j10, uVar, null, new a1.o(1));
    }

    @Override // b1.e
    public o apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // b1.e, b1.m
    public void dispose() {
        synchronized (y.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
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
        y.a(y.f8702a);
    }

    @Override // b1.e
    public e takeNestedMutableSnapshot(kv.l lVar, kv.l lVar2) {
        kv.l lVar3;
        Map map;
        s0.j jVar = c1.c.f11733a;
        if (jVar != null) {
            tu.v vVarMergeObservers = c1.c.mergeObservers(jVar, null, false, lVar, lVar2);
            c1.a aVar = (c1.a) vVarMergeObservers.getFirst();
            kv.l readObserver = aVar.getReadObserver();
            kv.l writeObserver = aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar = readObserver;
            lVar3 = writeObserver;
        } else {
            lVar3 = lVar2;
            map = null;
        }
        e eVar = (e) y.access$takeNewSnapshot(new a(lVar, lVar3));
        if (jVar != null) {
            c1.c.dispatchCreatedObservers(jVar, null, eVar, map);
        }
        return eVar;
    }

    @Override // b1.e, b1.m
    public m takeNestedSnapshot(kv.l lVar) {
        Map map;
        s0.j jVar = c1.c.f11733a;
        if (jVar != null) {
            tu.v vVarMergeObservers = c1.c.mergeObservers(jVar, null, true, lVar, null);
            c1.a aVar = (c1.a) vVarMergeObservers.getFirst();
            kv.l readObserver = aVar.getReadObserver();
            aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        k kVar = (k) y.access$takeNewSnapshot(new b(lVar));
        if (jVar != null) {
            c1.c.dispatchCreatedObservers(jVar, null, kVar, map);
        }
        return kVar;
    }
}
