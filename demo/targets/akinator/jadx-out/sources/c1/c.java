package c1;

import a2.o;
import b1.h;
import b1.m;
import b1.y;
import java.util.Map;
import kv.l;
import kv.p;
import r0.g;
import s0.j;
import tu.e0;
import tu.v;
import uu.c2;
import z.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static j f11733a;

    public static final <R extends m> R creatingSnapshot(m mVar, l lVar, l lVar2, boolean z10, p pVar) {
        Map map;
        j jVar = f11733a;
        if (jVar != null) {
            v vVarMergeObservers = mergeObservers(jVar, mVar, z10, lVar, lVar2);
            a aVar = (a) vVarMergeObservers.getFirst();
            l readObserver = aVar.getReadObserver();
            lVar2 = aVar.getWriteObserver();
            map = (Map) vVarMergeObservers.getSecond();
            lVar = readObserver;
        } else {
            map = null;
        }
        R r10 = (R) pVar.invoke(lVar, lVar2);
        if (jVar != null) {
            dispatchCreatedObservers(jVar, mVar, r10, map);
        }
        return r10;
    }

    public static final void dispatchCreatedObservers(j jVar, m mVar, m mVar2, Map<b, a> map) {
        if (jVar.size() > 0) {
            if (jVar.get(0) != null) {
                throw new ClassCastException();
            }
            if (map == null) {
                throw null;
            }
            map.get(null);
            throw null;
        }
    }

    public static final void dispatchObserverOnApplied(m mVar, o1 o1Var) {
        j jVar = f11733a;
        if (jVar == null || jVar.isEmpty()) {
            return;
        }
        if (o1Var == null || g.wrapIntoSet(o1Var) == null) {
            c2.emptySet();
        }
        if (jVar.size() <= 0) {
            return;
        }
        jVar.get(0).getClass();
        throw new ClassCastException();
    }

    public static final void dispatchObserverOnPreDispose(m mVar) {
        j jVar = f11733a;
        if (jVar == null || jVar.size() <= 0) {
            return;
        }
        jVar.get(0).getClass();
        throw new ClassCastException();
    }

    public static final v mergeObservers(j jVar, m mVar, boolean z10, l lVar, l lVar2) {
        if (jVar.size() <= 0) {
            return e0.to(new a(lVar, lVar2), null);
        }
        jVar.get(0).getClass();
        throw new ClassCastException();
    }

    public static final h observeSnapshots(m.a aVar, b bVar) {
        synchronized (y.getLock()) {
            try {
                j jVarPersistentListOf = f11733a;
                if (jVarPersistentListOf == null) {
                    jVarPersistentListOf = s0.a.persistentListOf();
                }
                f11733a = jVarPersistentListOf.add((Object) bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new o(17);
    }
}
