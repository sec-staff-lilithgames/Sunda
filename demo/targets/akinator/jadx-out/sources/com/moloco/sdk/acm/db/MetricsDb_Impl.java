package com.moloco.sdk.acm.db;

import android.database.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import o5.l;
import o5.t1;
import o5.y;
import o5.y0;
import u5.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MetricsDb_Impl extends MetricsDb {

    /* renamed from: o, reason: collision with root package name */
    public volatile g f45512o;

    public static /* synthetic */ List a(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List b(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List c(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List d(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List e(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List f(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List g(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List h(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    public static /* synthetic */ List i(MetricsDb_Impl metricsDb_Impl) {
        metricsDb_Impl.getClass();
        return null;
    }

    @Override // o5.y0
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        y5.c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // o5.y0
    public y createInvalidationTracker() {
        return new y(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // o5.y0
    public y5.g createOpenHelper(l lVar) {
        return lVar.f77623c.create(y5.e.builder(lVar.f77621a).name(lVar.f77622b).callback(new t1(lVar, new a(1), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693")).build());
    }

    @Override // o5.y0
    public List<s5.b> getAutoMigrations(Map<Class<? extends s5.a>, s5.a> map) {
        return Arrays.asList(new s5.b[0]);
    }

    @Override // o5.y0
    public Set<Class<? extends s5.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // o5.y0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(e.class, g.c());
        return map;
    }

    public static /* synthetic */ y5.c a(MetricsDb_Impl metricsDb_Impl, y5.c cVar) {
        metricsDb_Impl.getClass();
        return cVar;
    }

    public static void b(MetricsDb_Impl metricsDb_Impl, y5.c db2) {
        metricsDb_Impl.getClass();
        e0.checkNotNullParameter(db2, "db");
        r5.a connection = new r5.a(db2);
        e0.checkNotNullParameter(connection, "connection");
        metricsDb_Impl.getInvalidationTracker().internalInit$room_runtime_release(connection);
    }

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public e b() {
        g gVar;
        if (this.f45512o != null) {
            return this.f45512o;
        }
        synchronized (this) {
            try {
                if (this.f45512o == null) {
                    this.f45512o = new g(this);
                }
                gVar = this.f45512o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends t1.b {
        public a(int i10) {
            super(i10);
        }

        @Override // o5.t1.b
        public void createAllTables(y5.c cVar) throws SQLException {
            cVar.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
            cVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
        }

        @Override // o5.t1.b
        public void dropAllTables(y5.c cVar) throws SQLException {
            cVar.execSQL("DROP TABLE IF EXISTS `events`");
            MetricsDb_Impl metricsDb_Impl = MetricsDb_Impl.this;
            if (MetricsDb_Impl.a(metricsDb_Impl) != null) {
                int size = MetricsDb_Impl.b(metricsDb_Impl).size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((y0.b) MetricsDb_Impl.d(metricsDb_Impl).get(i10)).onDestructiveMigration(cVar);
                }
            }
        }

        @Override // o5.t1.b
        public void onCreate(y5.c cVar) {
            MetricsDb_Impl metricsDb_Impl = MetricsDb_Impl.this;
            if (MetricsDb_Impl.e(metricsDb_Impl) != null) {
                int size = MetricsDb_Impl.f(metricsDb_Impl).size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((y0.b) MetricsDb_Impl.g(metricsDb_Impl).get(i10)).onCreate(cVar);
                }
            }
        }

        @Override // o5.t1.b
        public void onOpen(y5.c cVar) {
            MetricsDb_Impl metricsDb_Impl = MetricsDb_Impl.this;
            MetricsDb_Impl.a(metricsDb_Impl, cVar);
            MetricsDb_Impl.b(metricsDb_Impl, cVar);
            if (MetricsDb_Impl.h(metricsDb_Impl) != null) {
                int size = MetricsDb_Impl.i(metricsDb_Impl).size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((y0.b) MetricsDb_Impl.c(metricsDb_Impl).get(i10)).onOpen(cVar);
                }
            }
        }

        @Override // o5.t1.b
        public void onPreMigrate(y5.c cVar) {
            u5.c.dropFtsSyncTriggers(cVar);
        }

        @Override // o5.t1.b
        public t1.c onValidateSchema(y5.c cVar) {
            HashMap map = new HashMap(6);
            map.put("id", new z.a("id", "INTEGER", true, 1, null, 1));
            map.put("name", new z.a("name", "TEXT", true, 0, null, 1));
            map.put("timestamp", new z.a("timestamp", "INTEGER", true, 0, null, 1));
            map.put("eventType", new z.a("eventType", "TEXT", true, 0, null, 1));
            map.put("data", new z.a("data", "INTEGER", false, 0, null, 1));
            map.put("tags", new z.a("tags", "TEXT", true, 0, null, 1));
            z zVar = new z("events", map, new HashSet(0), new HashSet(0));
            z zVar2 = z.read(cVar, "events");
            if (zVar.equals(zVar2)) {
                return new t1.c(true, null);
            }
            return new t1.c(false, "events(com.moloco.sdk.acm.db.EventEntity).\n Expected:\n" + zVar + "\n Found:\n" + zVar2);
        }

        @Override // o5.t1.b
        public void onPostMigrate(y5.c cVar) {
        }
    }
}
