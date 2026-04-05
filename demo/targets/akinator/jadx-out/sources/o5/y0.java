package o5;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y0 {
    public static final c Companion = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public CoroutineScope f77808a;

    /* renamed from: b, reason: collision with root package name */
    public zu.m f77809b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f77810c;

    /* renamed from: d, reason: collision with root package name */
    public e2 f77811d;

    /* renamed from: e, reason: collision with root package name */
    public u0 f77812e;

    /* renamed from: f, reason: collision with root package name */
    public y f77813f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77815h;

    /* renamed from: i, reason: collision with root package name */
    public t5.a f77816i;

    /* renamed from: g, reason: collision with root package name */
    public final p5.a f77814g = new p5.a(new b1(0, this, y0.class, "onClosed", "onClosed()V", 0));

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f77817j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f77818k = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    public boolean f77819l = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        public Callable A;
        public x5.c B;
        public zu.m C;
        public boolean D;

        /* renamed from: a, reason: collision with root package name */
        public final KClass f77820a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f77821b;

        /* renamed from: c, reason: collision with root package name */
        public final String f77822c;

        /* renamed from: d, reason: collision with root package name */
        public final kv.a f77823d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f77824e;

        /* renamed from: f, reason: collision with root package name */
        public e f77825f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f77826g;

        /* renamed from: h, reason: collision with root package name */
        public zu.m f77827h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f77828i;

        /* renamed from: j, reason: collision with root package name */
        public Executor f77829j;

        /* renamed from: k, reason: collision with root package name */
        public Executor f77830k;

        /* renamed from: l, reason: collision with root package name */
        public y5.f f77831l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f77832m;

        /* renamed from: n, reason: collision with root package name */
        public z0 f77833n;

        /* renamed from: o, reason: collision with root package name */
        public Intent f77834o;

        /* renamed from: p, reason: collision with root package name */
        public long f77835p;

        /* renamed from: q, reason: collision with root package name */
        public TimeUnit f77836q;

        /* renamed from: r, reason: collision with root package name */
        public final d f77837r;

        /* renamed from: s, reason: collision with root package name */
        public final LinkedHashSet f77838s;

        /* renamed from: t, reason: collision with root package name */
        public final LinkedHashSet f77839t;

        /* renamed from: u, reason: collision with root package name */
        public final ArrayList f77840u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f77841v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f77842w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f77843x;

        /* renamed from: y, reason: collision with root package name */
        public String f77844y;

        /* renamed from: z, reason: collision with root package name */
        public File f77845z;

        public a(KClass<y0> klass, String str, kv.a aVar, Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            this.f77824e = new ArrayList();
            this.f77828i = new ArrayList();
            this.f77833n = z0.f77853b;
            this.f77835p = -1L;
            this.f77837r = new d();
            this.f77838s = new LinkedHashSet();
            this.f77839t = new LinkedHashSet();
            this.f77840u = new ArrayList();
            this.f77841v = true;
            this.D = true;
            this.f77820a = klass;
            this.f77821b = context;
            this.f77822c = str;
            this.f77823d = aVar;
        }

        public a addAutoMigrationSpec(s5.a autoMigrationSpec) {
            kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.f77840u.add(autoMigrationSpec);
            return this;
        }

        public a addCallback(b callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            this.f77824e.add(callback);
            return this;
        }

        public a addMigrations(s5.b... migrations) {
            kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
            for (s5.b bVar : migrations) {
                Integer numValueOf = Integer.valueOf(bVar.f85471a);
                LinkedHashSet linkedHashSet = this.f77839t;
                linkedHashSet.add(numValueOf);
                linkedHashSet.add(Integer.valueOf(bVar.f85472b));
            }
            this.f77837r.addMigrations((s5.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a addTypeConverter(Object typeConverter) {
            kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
            this.f77828i.add(typeConverter);
            return this;
        }

        public a allowMainThreadQueries() {
            this.f77832m = true;
            return this;
        }

        public y0 build() {
            y5.f wVar;
            y5.f fVar;
            y0 y0Var;
            Executor executor = this.f77829j;
            if (executor == null && this.f77830k == null) {
                Executor iOThreadExecutor = r.a.getIOThreadExecutor();
                this.f77830k = iOThreadExecutor;
                this.f77829j = iOThreadExecutor;
            } else if (executor != null && this.f77830k == null) {
                this.f77830k = executor;
            } else if (executor == null) {
                this.f77829j = this.f77830k;
            }
            LinkedHashSet linkedHashSet = this.f77839t;
            LinkedHashSet linkedHashSet2 = this.f77838s;
            f1.validateMigrationsNotRequired(linkedHashSet, linkedHashSet2);
            x5.c cVar = this.B;
            if (cVar == null && this.f77831l == null) {
                wVar = new z5.g();
            } else if (cVar == null) {
                wVar = this.f77831l;
            } else {
                if (this.f77831l != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                wVar = null;
            }
            boolean z10 = this.f77835p > 0;
            boolean z11 = (this.f77844y == null && this.f77845z == null && this.A == null) ? false : true;
            if (wVar != null) {
                String str = this.f77822c;
                if (z10) {
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f77835p;
                    TimeUnit timeUnit = this.f77836q;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    wVar = new t5.t(wVar, new t5.a(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str2 = this.f77844y;
                    int i10 = str2 == null ? 0 : 1;
                    File file = this.f77845z;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.A;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    wVar = new t5.w(str2, file, callable, wVar);
                }
                fVar = wVar;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            boolean z12 = this.f77832m;
            z0 z0Var = this.f77833n;
            Context context = this.f77821b;
            z0 z0VarResolve$room_runtime_release = z0Var.resolve$room_runtime_release(context);
            Executor executor2 = this.f77829j;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f77830k;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            l lVar = new l(context, this.f77822c, fVar, this.f77837r, this.f77824e, z12, z0VarResolve$room_runtime_release, executor2, executor3, this.f77834o, this.f77841v, this.f77842w, linkedHashSet2, this.f77844y, this.f77845z, this.A, this.f77825f, this.f77828i, this.f77840u, this.f77843x, this.B, this.C);
            lVar.setUseTempTrackingTable$room_runtime_release(this.D);
            kv.a aVar = this.f77823d;
            if (aVar == null || (y0Var = (y0) aVar.invoke()) == null) {
                y0Var = (y0) u5.l.findAndInstantiateDatabaseImpl$default(jv.a.getJavaClass(this.f77820a), null, 2, null);
            }
            y0Var.init(lVar);
            return y0Var;
        }

        public a createFromAsset(String databaseFilePath) {
            kotlin.jvm.internal.e0.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.f77844y = databaseFilePath;
            return this;
        }

        public a createFromFile(File databaseFile) {
            kotlin.jvm.internal.e0.checkNotNullParameter(databaseFile, "databaseFile");
            this.f77845z = databaseFile;
            return this;
        }

        public a createFromInputStream(Callable<InputStream> inputStreamCallable) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.A = inputStreamCallable;
            return this;
        }

        public a enableMultiInstanceInvalidation() {
            this.f77834o = this.f77822c != null ? new Intent(this.f77821b, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @tu.f
        public a fallbackToDestructiveMigration() {
            this.f77841v = false;
            this.f77842w = true;
            return this;
        }

        @tu.f
        public a fallbackToDestructiveMigrationFrom(int... startVersions) {
            kotlin.jvm.internal.e0.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.f77838s.add(Integer.valueOf(i10));
            }
            return this;
        }

        @tu.f
        public a fallbackToDestructiveMigrationOnDowngrade() {
            this.f77841v = true;
            this.f77842w = true;
            return this;
        }

        public a openHelperFactory(y5.f fVar) {
            this.f77831l = fVar;
            return this;
        }

        public a setAutoCloseTimeout(long j10, TimeUnit autoCloseTimeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j10 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.f77835p = j10;
            this.f77836q = autoCloseTimeUnit;
            return this;
        }

        public final a setDriver(x5.c driver) {
            kotlin.jvm.internal.e0.checkNotNullParameter(driver, "driver");
            this.B = driver;
            return this;
        }

        public final a setInMemoryTrackingMode(boolean z10) {
            this.D = z10;
            return this;
        }

        public a setJournalMode(z0 journalMode) {
            kotlin.jvm.internal.e0.checkNotNullParameter(journalMode, "journalMode");
            this.f77833n = journalMode;
            return this;
        }

        public a setMultiInstanceInvalidationServiceIntent(Intent invalidationServiceIntent) {
            kotlin.jvm.internal.e0.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.f77822c == null) {
                invalidationServiceIntent = null;
            }
            this.f77834o = invalidationServiceIntent;
            return this;
        }

        public a setQueryCallback(a1 queryCallback, Executor executor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(queryCallback, "queryCallback");
            kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
            this.f77826g = executor;
            this.f77827h = null;
            return this;
        }

        public final a setQueryCoroutineContext(zu.m context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            if (this.f77829j != null || this.f77830k != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            }
            if (context.get(zu.f.f98853b) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
            }
            this.C = context;
            return this;
        }

        public a setQueryExecutor(Executor executor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
            if (this.C != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.f77829j = executor;
            return this;
        }

        public a setTransactionExecutor(Executor executor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
            if (this.C != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.f77830k = executor;
            return this;
        }

        public a createFromAsset(String databaseFilePath, e callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            this.f77825f = callback;
            this.f77844y = databaseFilePath;
            return this;
        }

        public a createFromFile(File databaseFile, e callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(databaseFile, "databaseFile");
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            this.f77825f = callback;
            this.f77845z = databaseFile;
            return this;
        }

        public a createFromInputStream(Callable<InputStream> inputStreamCallable, e callback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
            this.f77825f = callback;
            this.A = inputStreamCallable;
            return this;
        }

        public final a fallbackToDestructiveMigration(boolean z10) {
            this.f77841v = false;
            this.f77842w = true;
            this.f77843x = z10;
            return this;
        }

        public a fallbackToDestructiveMigrationFrom(boolean z10, int... startVersions) {
            kotlin.jvm.internal.e0.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.f77838s.add(Integer.valueOf(i10));
            }
            this.f77843x = z10;
            return this;
        }

        public final a fallbackToDestructiveMigrationOnDowngrade(boolean z10) {
            this.f77841v = true;
            this.f77842w = true;
            this.f77843x = z10;
            return this;
        }

        public final a setQueryCallback(zu.m context, a1 queryCallback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(queryCallback, "queryCallback");
            this.f77826g = null;
            this.f77827h = context;
            return this;
        }

        public a(Context context, Class<y0> klass, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
            this.f77824e = new ArrayList();
            this.f77828i = new ArrayList();
            this.f77833n = z0.f77853b;
            this.f77835p = -1L;
            this.f77837r = new d();
            this.f77838s = new LinkedHashSet();
            this.f77839t = new LinkedHashSet();
            this.f77840u = new ArrayList();
            this.f77841v = true;
            this.D = true;
            this.f77820a = jv.a.getKotlinClass(klass);
            this.f77821b = context;
            this.f77822c = str;
            this.f77823d = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public void onCreate(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }

        public void onDestructiveMigration(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }

        public void onOpen(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }

        public void onCreate(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            if (connection instanceof r5.a) {
                onCreate(((r5.a) connection).getDb());
            }
        }

        public void onDestructiveMigration(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            if (connection instanceof r5.a) {
                onDestructiveMigration(((r5.a) connection).getDb());
            }
        }

        public void onOpen(x5.b connection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            if (connection instanceof r5.a) {
                onOpen(((r5.a) connection).getDb());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public c(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f77846a = new LinkedHashMap();

        public void addMigrations(List<? extends s5.b> migrations) {
            kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((s5.b) it.next());
            }
        }

        public final boolean contains(int i10, int i11) {
            return u5.n.contains(this, i10, i11);
        }

        public List<s5.b> findMigrationPath(int i10, int i11) {
            return u5.n.findMigrationPath(this, i10, i11);
        }

        public Map<Integer, Map<Integer, s5.b>> getMigrations() {
            return this.f77846a;
        }

        public final tu.v getSortedDescendingNodes$room_runtime_release(int i10) {
            TreeMap treeMap = (TreeMap) this.f77846a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return tu.e0.to(treeMap, treeMap.descendingKeySet());
        }

        public final tu.v getSortedNodes$room_runtime_release(int i10) {
            TreeMap treeMap = (TreeMap) this.f77846a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return tu.e0.to(treeMap, treeMap.keySet());
        }

        public final void addMigration(s5.b migration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(migration, "migration");
            int i10 = migration.f85471a;
            int i11 = migration.f85472b;
            Integer numValueOf = Integer.valueOf(i10);
            LinkedHashMap linkedHashMap = this.f77846a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(duhsDlGWdBkekB.TsXBHeMlsUKHS, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void addMigrations(s5.b... migrations) {
            kotlin.jvm.internal.e0.checkNotNullParameter(migrations, "migrations");
            for (s5.b bVar : migrations) {
                addMigration(bVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e {
        public void onOpenPrepackagedDatabase(y5.c db2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        }
    }

    public static final void access$onClosed(y0 y0Var) {
        CoroutineScope coroutineScope = y0Var.f77808a;
        u0 u0Var = null;
        if (coroutineScope == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        y0Var.getInvalidationTracker().stop$room_runtime_release();
        u0 u0Var2 = y0Var.f77812e;
        if (u0Var2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
        } else {
            u0Var = u0Var2;
        }
        u0Var.close();
    }

    public static /* synthetic */ Cursor query$default(y0 y0Var, y5.i iVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return y0Var.query(iVar, cancellationSignal);
    }

    public final void addTypeConverter$room_runtime_release(KClass<?> kclass, Object converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(kclass, "kclass");
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        this.f77818k.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.f77815h && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.f77817j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @tu.f
    public void beginTransaction() {
        assertNotMainThread();
        t5.a aVar = this.f77816i;
        if (aVar == null) {
            d();
        } else {
            aVar.executeRefCountingFunction(new w0(this, 2));
        }
    }

    public LinkedHashMap c() {
        Set<Map.Entry> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kotlinClass = jv.a.getKotlinClass(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(jv.a.getKotlinClass((Class) it.next()));
            }
            tu.v vVar = tu.e0.to(kotlinClass, arrayList);
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    public abstract void clearAllTables();

    public void close() {
        this.f77814g.close$room_runtime_release();
    }

    public y5.j compileStatement(String sql) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    public List<s5.b> createAutoMigrations(Map<KClass<? extends s5.a>, ? extends s5.a> autoMigrationSpecs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(uu.o1.mapCapacity(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(jv.a.getJavaClass((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final u0 createConnectionManager$room_runtime_release(l configuration) {
        r1 r1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        try {
            s1 s1VarCreateOpenDelegate = createOpenDelegate();
            kotlin.jvm.internal.e0.checkNotNull(s1VarCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            r1Var = (r1) s1VarCreateOpenDelegate;
        } catch (tu.u unused) {
            r1Var = null;
        }
        return r1Var == null ? new u0(configuration, new w0(this, 1)) : new u0(configuration, r1Var);
    }

    public abstract y createInvalidationTracker();

    public s1 createOpenDelegate() {
        throw new tu.u(null, 1, null);
    }

    public y5.g createOpenHelper(l config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        throw new tu.u(null, 1, null);
    }

    public final void d() {
        assertNotMainThread();
        y5.c writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime_release();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public final Object e(kv.a aVar) {
        if (!inCompatibilityMode$room_runtime_release()) {
            return u5.c.performBlocking(this, false, true, new x0(0, aVar));
        }
        beginTransaction();
        try {
            Object objInvoke = aVar.invoke();
            setTransactionSuccessful();
            return objInvoke;
        } finally {
            endTransaction();
        }
    }

    @tu.f
    public void endTransaction() {
        t5.a aVar = this.f77816i;
        if (aVar != null) {
            aVar.executeRefCountingFunction(new w0(this, 0));
            return;
        }
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    @tu.f
    public List<s5.b> getAutoMigrations(Map<Class<? extends s5.a>, s5.a> autoMigrationSpecs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return uu.p0.emptyList();
    }

    public final p5.a getCloseBarrier$room_runtime_release() {
        return this.f77814g;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.f77808a;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public y getInvalidationTracker() {
        y yVar = this.f77813f;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalTracker");
        return null;
    }

    public y5.g getOpenHelper() {
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        y5.g supportOpenHelper$room_runtime_release = u0Var.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final zu.m getQueryContext() {
        CoroutineScope coroutineScope = this.f77808a;
        if (coroutineScope == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        return coroutineScope.getCoroutineContext();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.f77810c;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Set<KClass<? extends s5.a>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends s5.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(jv.a.getKotlinClass((Class) it.next()));
        }
        return uu.y0.toSet(arrayList);
    }

    @tu.f
    public Set<Class<? extends s5.a>> getRequiredAutoMigrationSpecs() {
        return uu.c2.emptySet();
    }

    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return c();
    }

    public Map getRequiredTypeConverters() {
        return uu.p1.emptyMap();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.f77817j;
    }

    public final zu.m getTransactionContext$room_runtime_release() {
        zu.m mVar = this.f77809b;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("transactionContext");
        return null;
    }

    public Executor getTransactionExecutor() {
        e2 e2Var = this.f77811d;
        if (e2Var != null) {
            return e2Var;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @tu.f
    public <T> T getTypeConverter(Class<T> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        return (T) this.f77818k.get(jv.a.getKotlinClass(klass));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.f77819l;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        return u0Var.getSupportOpenHelper$room_runtime_release() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    public void init(l configuration) {
        zu.m coroutineContext;
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        boolean useTempTrackingTable$room_runtime_release = configuration.getUseTempTrackingTable$room_runtime_release();
        String str = configuration.f77622b;
        Intent intent = configuration.f77630j;
        this.f77819l = useTempTrackingTable$room_runtime_release;
        this.f77812e = createConnectionManager$room_runtime_release(configuration);
        this.f77813f = createInvalidationTracker();
        f1.validateAutoMigrations(this, configuration);
        f1.validateTypeConverters(this, configuration);
        zu.m mVar = configuration.f77642v;
        CoroutineScope coroutineScope = null;
        if (mVar != null) {
            zu.k kVar = mVar.get(zu.f.f98853b);
            kotlin.jvm.internal.e0.checkNotNull(kVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) kVar;
            Executor executorAsExecutor = ExecutorsKt.asExecutor(coroutineDispatcher);
            this.f77810c = executorAsExecutor;
            if (executorAsExecutor == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executorAsExecutor = null;
            }
            this.f77811d = new e2(executorAsExecutor);
            this.f77808a = CoroutineScopeKt.CoroutineScope(mVar.plus(SupervisorKt.SupervisorJob((Job) mVar.get(Job.Key))));
            if (inCompatibilityMode$room_runtime_release()) {
                CoroutineScope coroutineScope2 = this.f77808a;
                if (coroutineScope2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
                    coroutineScope2 = null;
                }
                coroutineContext = coroutineScope2.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
            } else {
                CoroutineScope coroutineScope3 = this.f77808a;
                if (coroutineScope3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
                    coroutineScope3 = null;
                }
                coroutineContext = coroutineScope3.getCoroutineContext();
            }
            this.f77809b = coroutineContext;
        } else {
            this.f77810c = configuration.f77628h;
            this.f77811d = new e2(configuration.f77629i);
            Executor executor = this.f77810c;
            if (executor == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            this.f77808a = CoroutineScope;
            if (CoroutineScope == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
                CoroutineScope = null;
            }
            zu.m coroutineContext2 = CoroutineScope.getCoroutineContext();
            e2 e2Var = this.f77811d;
            if (e2Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                e2Var = null;
            }
            this.f77809b = coroutineContext2.plus(ExecutorsKt.from(e2Var));
        }
        this.f77815h = configuration.f77626f;
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        y5.g supportOpenHelper$room_runtime_release = u0Var.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            while (!(supportOpenHelper$room_runtime_release instanceof t5.v)) {
                if (!(supportOpenHelper$room_runtime_release instanceof m)) {
                    supportOpenHelper$room_runtime_release = null;
                    break;
                }
                supportOpenHelper$room_runtime_release = ((m) supportOpenHelper$room_runtime_release).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release = null;
            break;
        }
        t5.v vVar = (t5.v) supportOpenHelper$room_runtime_release;
        if (vVar != null) {
            vVar.setDatabaseConfiguration(configuration);
        }
        u0 u0Var2 = this.f77812e;
        if (u0Var2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var2 = null;
        }
        y5.g supportOpenHelper$room_runtime_release2 = u0Var2.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release2 != null) {
            while (!(supportOpenHelper$room_runtime_release2 instanceof t5.r)) {
                if (!(supportOpenHelper$room_runtime_release2 instanceof m)) {
                    supportOpenHelper$room_runtime_release2 = null;
                    break;
                }
                supportOpenHelper$room_runtime_release2 = ((m) supportOpenHelper$room_runtime_release2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release2 = null;
            break;
        }
        t5.r rVar = (t5.r) supportOpenHelper$room_runtime_release2;
        if (rVar != null) {
            this.f77816i = rVar.getAutoCloser$room_runtime_release();
            t5.a autoCloser$room_runtime_release = rVar.getAutoCloser$room_runtime_release();
            CoroutineScope coroutineScope4 = this.f77808a;
            if (coroutineScope4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("coroutineScope");
            } else {
                coroutineScope = coroutineScope4;
            }
            autoCloser$room_runtime_release.initCoroutineScope(coroutineScope);
            getInvalidationTracker().setAutoCloser$room_runtime_release(rVar.getAutoCloser$room_runtime_release());
        }
        if (intent != null) {
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().initMultiInstanceInvalidation$room_runtime_release(configuration.f77621a, str, intent);
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        t5.a aVar = this.f77816i;
        if (aVar != null) {
            return aVar.isActive();
        }
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        return u0Var.isSupportDatabaseOpen();
    }

    public final boolean isOpenInternal() {
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        return u0Var.isSupportDatabaseOpen();
    }

    public final Cursor query(y5.i query) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
        e(new a1.e(body, 26));
    }

    @tu.f
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.f77819l = z10;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z10, kv.p pVar, zu.d<? super R> dVar) {
        u0 u0Var = this.f77812e;
        if (u0Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
            u0Var = null;
        }
        return u0Var.useConnection(z10, pVar, dVar);
    }

    public final <T> T getTypeConverter(KClass<T> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        T t10 = (T) this.f77818k.get(klass);
        kotlin.jvm.internal.e0.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t10;
    }

    public Cursor query(String query, Object[] objArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new y5.a(query, objArr));
    }

    public <V> V runInTransaction(Callable<V> body) {
        kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
        return (V) e(new a1.e(body, 27));
    }

    public Cursor query(y5.i query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }
}
