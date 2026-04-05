package o5;

import java.util.Iterator;
import java.util.List;
import o5.r1;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f77491a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f77492b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: o5.a$a, reason: collision with other inner class name */
    public static final class C0752a {
        public C0752a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements x5.c {

        /* renamed from: a, reason: collision with root package name */
        public final x5.c f77493a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f77494b;

        public b(a aVar, x5.c actual) {
            kotlin.jvm.internal.e0.checkNotNullParameter(actual, "actual");
            this.f77494b = aVar;
            this.f77493a = actual;
        }

        @Override // x5.c
        public x5.b open(String fileName) {
            kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
            a aVar = this.f77494b;
            String strResolveFileName$room_runtime_release = aVar.resolveFileName$room_runtime_release(fileName);
            return (x5.b) new p5.b(strResolveFileName$room_runtime_release, (aVar.f77491a || aVar.f77492b || kotlin.jvm.internal.e0.areEqual(strResolveFileName$room_runtime_release, ":memory:")) ? false : true).withLock(new com.moloco.sdk.internal.ilrd.j(aVar, 2, this, strResolveFileName$room_runtime_release), new o5.b(strResolveFileName$room_runtime_release));
        }
    }

    static {
        new C0752a(null);
    }

    public static void a(x5.b bVar) throws Exception {
        x5.d dVarPrepare = bVar.prepare("PRAGMA busy_timeout");
        try {
            dVarPrepare.step();
            long j10 = dVarPrepare.getLong(0);
            iv.a.closeFinally(dVarPrepare, null);
            if (j10 < 3000) {
                x5.a.execSQL(bVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                iv.a.closeFinally(dVarPrepare, th2);
                throw th3;
            }
        }
    }

    public static final void access$configurationConnection(a aVar, x5.b bVar) throws Exception {
        if (aVar.c().f77627g == z0.f77855e) {
            x5.a.execSQL(bVar, "PRAGMA synchronous = NORMAL");
        } else {
            x5.a.execSQL(bVar, "PRAGMA synchronous = FULL");
        }
        a(bVar);
        aVar.d().onOpen(bVar);
    }

    public static final void access$configureDatabase(a aVar, x5.b bVar) throws Exception {
        Object objM7131constructorimpl;
        z0 z0Var = aVar.c().f77627g;
        z0 z0Var2 = z0.f77855e;
        if (z0Var == z0Var2) {
            x5.a.execSQL(bVar, "PRAGMA journal_mode = WAL");
        } else {
            x5.a.execSQL(bVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar.c().f77627g == z0Var2) {
            x5.a.execSQL(bVar, "PRAGMA synchronous = NORMAL");
        } else {
            x5.a.execSQL(bVar, "PRAGMA synchronous = FULL");
        }
        a(bVar);
        x5.d dVarPrepare = bVar.prepare("PRAGMA user_version");
        try {
            dVarPrepare.step();
            int i10 = (int) dVarPrepare.getLong(0);
            iv.a.closeFinally(dVarPrepare, null);
            if (i10 != aVar.d().getVersion()) {
                x5.a.execSQL(bVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    int i11 = tu.z.f87419c;
                    if (i10 == 0) {
                        aVar.e(bVar);
                    } else {
                        aVar.f(bVar, i10, aVar.d().getVersion());
                    }
                    x5.a.execSQL(bVar, "PRAGMA user_version = " + aVar.d().getVersion());
                    objM7131constructorimpl = tu.z.m7131constructorimpl(tu.x0.f87415a);
                } catch (Throwable th2) {
                    int i12 = tu.z.f87419c;
                    objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                }
                if (tu.z.m7137isSuccessimpl(objM7131constructorimpl)) {
                    x5.a.execSQL(bVar, "END TRANSACTION");
                }
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                if (thM7134exceptionOrNullimpl != null) {
                    x5.a.execSQL(bVar, "ROLLBACK TRANSACTION");
                    throw thM7134exceptionOrNullimpl;
                }
            }
            aVar.g(bVar);
        } finally {
        }
    }

    public abstract List b();

    public abstract l c();

    public abstract r1 d();

    public final void e(x5.b connection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.d dVarPrepare = connection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (dVarPrepare.step()) {
                if (dVarPrepare.getLong(0) == 0) {
                    z10 = true;
                }
            }
            iv.a.closeFinally(dVarPrepare, null);
            d().createAllTables(connection);
            if (!z10) {
                r1.a aVarOnValidateSchema = d().onValidateSchema(connection);
                if (!aVarOnValidateSchema.f77704a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarOnValidateSchema.f77705b).toString());
                }
            }
            h(connection);
            d().onCreate(connection);
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((y0.b) it.next()).onCreate(connection);
            }
        } finally {
        }
    }

    public final void f(x5.b connection, int i10, int i11) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        List<s5.b> listFindMigrationPath = u5.n.findMigrationPath(c().f77624d, i10, i11);
        if (listFindMigrationPath != null) {
            d().onPreMigrate(connection);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((s5.b) it.next()).migrate(connection);
            }
            r1.a aVarOnValidateSchema = d().onValidateSchema(connection);
            if (!aVarOnValidateSchema.f77704a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + aVarOnValidateSchema.f77705b).toString());
            }
            d().onPostMigrate(connection);
            h(connection);
            return;
        }
        if (u5.n.isMigrationRequired(c(), i10, i11)) {
            throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c().f77640t) {
            x5.d dVarPrepare = connection.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listCreateListBuilder = uu.o0.createListBuilder();
                while (dVarPrepare.step()) {
                    String text = dVarPrepare.getText(0);
                    if (!sv.k0.startsWith$default(text, "sqlite_", false, 2, null) && !kotlin.jvm.internal.e0.areEqual(text, "android_metadata")) {
                        listCreateListBuilder.add(tu.e0.to(text, Boolean.valueOf(kotlin.jvm.internal.e0.areEqual(dVarPrepare.getText(1), "view"))));
                    }
                }
                List<tu.v> listBuild = uu.o0.build(listCreateListBuilder);
                iv.a.closeFinally(dVarPrepare, null);
                for (tu.v vVar : listBuild) {
                    String str = (String) vVar.component1();
                    if (((Boolean) vVar.component2()).booleanValue()) {
                        x5.a.execSQL(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        x5.a.execSQL(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            d().dropAllTables(connection);
        }
        Iterator it2 = b().iterator();
        while (it2.hasNext()) {
            ((y0.b) it2.next()).onDestructiveMigration(connection);
        }
        d().createAllTables(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(x5.b r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.a.g(x5.b):void");
    }

    public final void h(x5.b bVar) throws Exception {
        x5.a.execSQL(bVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        x5.a.execSQL(bVar, q1.createInsertQuery(d().getIdentityHash()));
    }

    public String resolveFileName$room_runtime_release(String fileName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
        return fileName;
    }

    public abstract <R> Object useConnection(boolean z10, kv.p pVar, zu.d<? super R> dVar);
}
