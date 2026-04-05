package vd;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ao.q0;
import em.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import md.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements d, wd.c, c {

    /* renamed from: h, reason: collision with root package name */
    public static final jd.e f89217h = jd.e.of("proto");

    /* renamed from: b, reason: collision with root package name */
    public final t f89218b;

    /* renamed from: c, reason: collision with root package name */
    public final xd.a f89219c;

    /* renamed from: e, reason: collision with root package name */
    public final xd.a f89220e;

    /* renamed from: f, reason: collision with root package name */
    public final e f89221f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f89222g;

    public p(xd.a aVar, xd.a aVar2, e eVar, t tVar, ru.a aVar3) {
        this.f89218b = tVar;
        this.f89219c = aVar;
        this.f89220e = aVar2;
        this.f89221f = eVar;
        this.f89222g = aVar3;
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, d0 d0Var) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(d0Var.getBackendName(), String.valueOf(yd.a.toInt(d0Var.getPriority()))));
        if (d0Var.getExtras() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(d0Var.getExtras(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String l(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((m) it.next()).getId());
            if (it.hasNext()) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object m(Cursor cursor, n nVar) {
        try {
            return nVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // vd.d
    public int cleanUp() {
        long time = this.f89219c.getTime() - ((a) this.f89221f).f89205e;
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            String[] strArr = {String.valueOf(time)};
            Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    recordLogEventDropped(cursor.getInt(0), qd.f.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                cursorRawQuery.close();
                int iDelete = sQLiteDatabaseD.delete("events", "timestamp_ms < ?", strArr);
                sQLiteDatabaseD.setTransactionSuccessful();
                return iDelete;
            } catch (Throwable th2) {
                cursorRawQuery.close();
                throw th2;
            }
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    public void clearDb() {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            sQLiteDatabaseD.delete("events", null, new String[0]);
            sQLiteDatabaseD.delete("transport_contexts", null, new String[0]);
            sQLiteDatabaseD.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89218b.close();
    }

    public final SQLiteDatabase d() {
        t tVar = this.f89218b;
        Objects.requireNonNull(tVar);
        xd.a aVar = this.f89220e;
        long time = aVar.getTime();
        while (true) {
            try {
                return tVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.getTime() >= ((a) this.f89221f).f89204d + time) {
                    throw new wd.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // vd.d
    public long getNextCallTime(d0 d0Var) {
        Cursor cursorRawQuery = d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{d0Var.getBackendName(), String.valueOf(yd.a.toInt(d0Var.getPriority()))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public final long h() {
        return d().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // vd.d
    public boolean hasPendingEventsFor(d0 d0Var) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            Long lI = i(sQLiteDatabaseD, d0Var);
            if (lI == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            sQLiteDatabaseD.setTransactionSuccessful();
            sQLiteDatabaseD.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th3) {
            sQLiteDatabaseD.endTransaction();
            throw th3;
        }
    }

    public final Object j(n nVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            Object objApply = nVar.apply(sQLiteDatabaseD);
            sQLiteDatabaseD.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, d0 d0Var, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lI = i(sQLiteDatabase, d0Var);
        if (lI == null) {
            return arrayList;
        }
        m(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lI.toString()}, null, null, null, String.valueOf(i10)), new q0(this, 19, arrayList, d0Var));
        return arrayList;
    }

    @Override // vd.d
    public Iterable<d0> loadActiveContexts() {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            List list = (List) m(sQLiteDatabaseD.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new sn.t(10));
            sQLiteDatabaseD.setTransactionSuccessful();
            sQLiteDatabaseD.endTransaction();
            return list;
        } catch (Throwable th2) {
            sQLiteDatabaseD.endTransaction();
            throw th2;
        }
    }

    @Override // vd.d
    public Iterable<m> loadBatch(d0 d0Var) {
        return (Iterable) j(new ks.s(22, this, d0Var));
    }

    @Override // vd.c
    public qd.b loadClientMetrics() {
        qd.a aVarNewBuilder = qd.b.newBuilder();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            qd.b bVar = (qd.b) m(sQLiteDatabaseD.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new q0(this, 20, map, aVarNewBuilder));
            sQLiteDatabaseD.setTransactionSuccessful();
            return bVar;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    @Override // vd.d
    public m persist(d0 d0Var, md.u uVar) {
        rd.a.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", d0Var.getPriority(), uVar.getTransportName(), d0Var.getBackendName());
        long jLongValue = ((Long) j(new q0(this, 18, uVar, d0Var))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return m.create(jLongValue, d0Var, uVar);
    }

    @Override // vd.d
    public void recordFailure(Iterable<m> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + l(iterable);
            SQLiteDatabase sQLiteDatabaseD = d();
            sQLiteDatabaseD.beginTransaction();
            try {
                sQLiteDatabaseD.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        recordLogEventDropped(cursor.getInt(0), qd.f.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseD.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } finally {
                sQLiteDatabaseD.endTransaction();
            }
        }
    }

    @Override // vd.c
    public void recordLogEventDropped(long j10, qd.f fVar, String str) {
        j(new ks.k(str, fVar, j10, 3));
    }

    @Override // vd.d
    public void recordNextCallTime(d0 d0Var, long j10) {
        j(new o0(d0Var, j10));
    }

    @Override // vd.d
    public void recordSuccess(Iterable<m> iterable) {
        if (iterable.iterator().hasNext()) {
            d().compileStatement("DELETE FROM events WHERE _id in " + l(iterable)).execute();
        }
    }

    @Override // vd.c
    public void resetClientMetrics() {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            sQLiteDatabaseD.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseD.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f89219c.getTime()).execute();
            sQLiteDatabaseD.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    @Override // wd.c
    public <T> T runCriticalSection(wd.b bVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        xd.a aVar = this.f89220e;
        long time = aVar.getTime();
        while (true) {
            try {
                sQLiteDatabaseD.beginTransaction();
                try {
                    T t10 = (T) bVar.execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return t10;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.getTime() >= ((a) this.f89221f).f89204d + time) {
                    throw new wd.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
