package androidx.work.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n6.b;
import o5.s0;
import o5.y0;
import o6.c;
import o6.c1;
import o6.f;
import o6.g;
import o6.h;
import o6.i;
import o6.j;
import o6.k;
import o6.l;
import o6.m;
import o6.n;
import o6.o;
import o6.q;
import v6.c0;
import v6.p0;
import v6.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class WorkDatabase extends y0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f7491m = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final WorkDatabase create(Context context, Executor queryExecutor, b clock, boolean z10) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(queryExecutor, "queryExecutor");
            e0.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (z10 ? s0.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries() : s0.databaseBuilder(context, WorkDatabase.class, "androidx.work.workdb").openHelperFactory(new o6.e0(context))).setQueryExecutor(queryExecutor).addCallback(new c(clock)).addMigrations(j.f77930c).addMigrations(new q(context, 2, 3)).addMigrations(k.f77934c).addMigrations(l.f77939c).addMigrations(new q(context, 5, 6)).addMigrations(m.f77944c).addMigrations(n.f77947c).addMigrations(o.f77950c).addMigrations(new c1(context)).addMigrations(new q(context, 10, 11)).addMigrations(f.f77887c).addMigrations(g.f77891c).addMigrations(h.f77897c).addMigrations(i.f77927c).addMigrations(new q(context, 21, 22)).fallbackToDestructiveMigration(true).build();
        }
    }

    public static final WorkDatabase create(Context context, Executor executor, b bVar, boolean z10) {
        return f7491m.create(context, executor, bVar, z10);
    }

    public abstract v6.b dependencyDao();

    public abstract v6.f preferenceDao();

    public abstract v6.i rawWorkInfoDao();

    public abstract v6.o systemIdInfoDao();

    public abstract v6.u workNameDao();

    public abstract y workProgressDao();

    public abstract c0 workSpecDao();

    public abstract p0 workTagDao();
}
