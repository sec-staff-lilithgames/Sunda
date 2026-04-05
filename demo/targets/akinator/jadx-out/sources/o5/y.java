package o5;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f77793a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f77794b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f77795c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f77796d;

    /* renamed from: e, reason: collision with root package name */
    public final j2 f77797e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f77798f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f77799g;

    /* renamed from: h, reason: collision with root package name */
    public t5.a f77800h;

    /* renamed from: i, reason: collision with root package name */
    public final x f77801i;

    /* renamed from: j, reason: collision with root package name */
    public final x f77802j;

    /* renamed from: k, reason: collision with root package name */
    public final w f77803k;

    /* renamed from: l, reason: collision with root package name */
    public Intent f77804l;

    /* renamed from: m, reason: collision with root package name */
    public f0 f77805m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f77806n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f77807a;

        public b(String[] tables) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
            this.f77807a = tables;
        }

        public final String[] getTables$room_runtime_release() {
            return this.f77807a;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o5.x] */
    /* JADX WARN: Type inference failed for: r2v5, types: [o5.x] */
    public y(y0 database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.e0.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewTables, "viewTables");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        this.f77793a = database;
        this.f77794b = shadowTablesMap;
        this.f77795c = viewTables;
        this.f77796d = tableNames;
        j2 j2Var = new j2(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable$room_runtime_release(), new a0(1, this, y.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.f77797e = j2Var;
        this.f77798f = new LinkedHashMap();
        this.f77799g = new ReentrantLock();
        final int i10 = 0;
        this.f77801i = new kv.a(this) { // from class: o5.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f77778c;

            {
                this.f77778c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        t5.a aVar = this.f77778c.f77800h;
                        if (aVar != null) {
                            aVar.incrementCountAndEnsureDbIsOpen();
                        }
                        return tu.x0.f87415a;
                    case 1:
                        t5.a aVar2 = this.f77778c.f77800h;
                        if (aVar2 != null) {
                            aVar2.decrementCountAndScheduleClose();
                        }
                        return tu.x0.f87415a;
                    default:
                        y yVar = this.f77778c;
                        return Boolean.valueOf(!yVar.f77793a.inCompatibilityMode$room_runtime_release() || yVar.f77793a.isOpenInternal());
                }
            }
        };
        final int i11 = 1;
        this.f77802j = new kv.a(this) { // from class: o5.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f77778c;

            {
                this.f77778c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        t5.a aVar = this.f77778c.f77800h;
                        if (aVar != null) {
                            aVar.incrementCountAndEnsureDbIsOpen();
                        }
                        return tu.x0.f87415a;
                    case 1:
                        t5.a aVar2 = this.f77778c.f77800h;
                        if (aVar2 != null) {
                            aVar2.decrementCountAndScheduleClose();
                        }
                        return tu.x0.f87415a;
                    default:
                        y yVar = this.f77778c;
                        return Boolean.valueOf(!yVar.f77793a.inCompatibilityMode$room_runtime_release() || yVar.f77793a.isOpenInternal());
                }
            }
        };
        this.f77803k = new w(database);
        this.f77806n = new Object();
        final int i12 = 2;
        j2Var.setOnAllowRefresh$room_runtime_release(new kv.a(this) { // from class: o5.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f77778c;

            {
                this.f77778c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        t5.a aVar = this.f77778c.f77800h;
                        if (aVar != null) {
                            aVar.incrementCountAndEnsureDbIsOpen();
                        }
                        return tu.x0.f87415a;
                    case 1:
                        t5.a aVar2 = this.f77778c.f77800h;
                        if (aVar2 != null) {
                            aVar2.decrementCountAndScheduleClose();
                        }
                        return tu.x0.f87415a;
                    default:
                        y yVar = this.f77778c;
                        return Boolean.valueOf(!yVar.f77793a.inCompatibilityMode$room_runtime_release() || yVar.f77793a.isOpenInternal());
                }
            }
        });
    }

    public static final void access$notifyInvalidatedObservers(y yVar, Set set) {
        ReentrantLock reentrantLock = yVar.f77799g;
        reentrantLock.lock();
        try {
            List list = uu.y0.toList(yVar.f77798f.values());
            reentrantLock.unlock();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((q0) it.next()).notifyByTableIds$room_runtime_release(set);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final void access$onAutoCloseCallback(y yVar) {
        synchronized (yVar.f77806n) {
            try {
                f0 f0Var = yVar.f77805m;
                if (f0Var != null) {
                    ReentrantLock reentrantLock = yVar.f77799g;
                    reentrantLock.lock();
                    try {
                        List list = uu.y0.toList(yVar.f77798f.keySet());
                        reentrantLock.unlock();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (!((b) obj).isRemote$room_runtime_release()) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            f0Var.stop();
                        }
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                yVar.f77797e.resetSync$room_runtime_release();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static /* synthetic */ Flow createFlow$default(y yVar, String[] strArr, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return yVar.createFlow(strArr, z10);
    }

    public final boolean a(b bVar) {
        LinkedHashMap linkedHashMap = this.f77798f;
        String[] tables$room_runtime_release = bVar.getTables$room_runtime_release();
        j2 j2Var = this.f77797e;
        tu.v vVarValidateTableNames$room_runtime_release = j2Var.validateTableNames$room_runtime_release(tables$room_runtime_release);
        String[] strArr = (String[]) vVarValidateTableNames$room_runtime_release.component1();
        int[] iArr = (int[]) vVarValidateTableNames$room_runtime_release.component2();
        q0 q0Var = new q0(bVar, iArr, strArr);
        ReentrantLock reentrantLock = this.f77799g;
        reentrantLock.lock();
        try {
            q0 q0Var2 = linkedHashMap.containsKey(bVar) ? (q0) uu.p1.getValue(linkedHashMap, bVar) : (q0) linkedHashMap.put(bVar, q0Var);
            reentrantLock.unlock();
            return q0Var2 == null && j2Var.onObserverAdded$room_runtime_release(iArr);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void addObserver(b observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        if (a(observer)) {
            q5.b0.runBlockingUninterruptible(new z(this, null));
        }
    }

    public final void addRemoteObserver$room_runtime_release(b observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        if (!observer.isRemote$room_runtime_release()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        a(observer);
    }

    public void addWeakObserver(b observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        addObserver(new z2(this, observer));
    }

    public final Flow<Set<String>> createFlow(String... tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        return createFlow$default(this, tables, false, 2, null);
    }

    @tu.f
    public <T> androidx.lifecycle.l1 createLiveData(String[] tableNames, Callable<T> computeFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, (Callable) computeFunction);
    }

    public final y0 getDatabase$room_runtime_release() {
        return this.f77793a;
    }

    public final String[] getTableNames$room_runtime_release() {
        return this.f77796d;
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f77804l = serviceIntent;
        this.f77805m = new f0(context, name, this);
    }

    public final void internalInit$room_runtime_release(x5.b connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        this.f77797e.configureConnection(connection);
        synchronized (this.f77806n) {
            try {
                f0 f0Var = this.f77805m;
                if (f0Var != null) {
                    Intent intent = this.f77804l;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    f0Var.start(intent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime_release(Set<String> tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        ReentrantLock reentrantLock = this.f77799g;
        reentrantLock.lock();
        try {
            List<q0> list = uu.y0.toList(this.f77798f.values());
            reentrantLock.unlock();
            for (q0 q0Var : list) {
                if (!q0Var.getObserver$room_runtime_release().isRemote$room_runtime_release()) {
                    q0Var.notifyByTableNames$room_runtime_release(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Object refresh(String[] strArr, zu.d<? super Boolean> dVar) {
        return this.f77797e.refreshInvalidation$room_runtime_release(strArr, this.f77801i, this.f77802j, dVar);
    }

    public final void refreshAsync() {
        this.f77797e.refreshInvalidationAsync$room_runtime_release(this.f77801i, this.f77802j);
    }

    public void refreshVersionsAsync() {
        this.f77797e.refreshInvalidationAsync$room_runtime_release(this.f77801i, this.f77802j);
    }

    public void refreshVersionsSync() {
        q5.b0.runBlockingUninterruptible(new b0(this, null));
    }

    public void removeObserver(b observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        ReentrantLock reentrantLock = this.f77799g;
        reentrantLock.lock();
        try {
            q0 q0Var = (q0) this.f77798f.remove(observer);
            if (q0Var == null || !this.f77797e.onObserverRemoved$room_runtime_release(q0Var.getTableIds$room_runtime_release())) {
                return;
            }
            q5.b0.runBlockingUninterruptible(new c0(this, null));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setAutoCloser$room_runtime_release(t5.a autoCloser) {
        kotlin.jvm.internal.e0.checkNotNullParameter(autoCloser, "autoCloser");
        this.f77800h = autoCloser;
        autoCloser.setAutoCloseCallback(new d0(0, this, y.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0));
    }

    public final void stop$room_runtime_release() {
        f0 f0Var = this.f77805m;
        if (f0Var != null) {
            f0Var.stop();
        }
    }

    public final Object sync$room_runtime_release(zu.d<? super tu.x0> dVar) {
        Object objSyncTriggers$room_runtime_release;
        y0 y0Var = this.f77793a;
        boolean zInCompatibilityMode$room_runtime_release = y0Var.inCompatibilityMode$room_runtime_release();
        tu.x0 x0Var = tu.x0.f87415a;
        return ((!zInCompatibilityMode$room_runtime_release || y0Var.isOpenInternal()) && (objSyncTriggers$room_runtime_release = this.f77797e.syncTriggers$room_runtime_release(dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objSyncTriggers$room_runtime_release : x0Var;
    }

    public final void syncBlocking$room_runtime_release() {
        q5.b0.runBlockingUninterruptible(new e0(this, null));
    }

    public final Flow<Set<String>> createFlow(String[] tables, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        j2 j2Var = this.f77797e;
        tu.v vVarValidateTableNames$room_runtime_release = j2Var.validateTableNames$room_runtime_release(tables);
        String[] strArr = (String[]) vVarValidateTableNames$room_runtime_release.component1();
        Flow<Set<String>> flowCreateFlow$room_runtime_release = j2Var.createFlow$room_runtime_release(strArr, (int[]) vVarValidateTableNames$room_runtime_release.component2(), z10);
        f0 f0Var = this.f77805m;
        Flow<Set<String>> flowCreateFlow = f0Var != null ? f0Var.createFlow(strArr) : null;
        return flowCreateFlow != null ? FlowKt.merge(flowCreateFlow$room_runtime_release, flowCreateFlow) : flowCreateFlow$room_runtime_release;
    }

    public <T> androidx.lifecycle.l1 createLiveData(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(computeFunction, "computeFunction");
        this.f77797e.validateTableNames$room_runtime_release(tableNames);
        return this.f77803k.create(tableNames, z10, computeFunction);
    }

    public final <T> androidx.lifecycle.l1 createLiveData(String[] tableNames, boolean z10, kv.l computeFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(computeFunction, "computeFunction");
        this.f77797e.validateTableNames$room_runtime_release(tableNames);
        return this.f77803k.create(tableNames, z10, computeFunction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public y(y0 database, String... tableNames) {
        this(database, uu.p1.emptyMap(), uu.p1.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
    }
}
