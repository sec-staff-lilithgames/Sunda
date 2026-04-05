package com.moloco.sdk.acm.db;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import o5.c2;
import o5.f1;
import o5.k;
import o5.p;
import o5.w1;
import o5.y0;
import tu.x0;
import u5.y;
import y5.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements com.moloco.sdk.acm.db.e {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f45534a;

    /* renamed from: b, reason: collision with root package name */
    public final a f45535b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.a f45536c = new com.moloco.sdk.acm.db.a();

    /* renamed from: d, reason: collision with root package name */
    public final b f45537d;

    /* renamed from: e, reason: collision with root package name */
    public final c f45538e;

    /* renamed from: f, reason: collision with root package name */
    public final d f45539f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p {
        public a(y0 y0Var) {
            super(y0Var);
        }

        @Override // o5.c2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // o5.p
        public void bind(j jVar, com.moloco.sdk.acm.db.b bVar) {
            jVar.bindLong(1, bVar.i());
            if (bVar.j() == null) {
                jVar.bindNull(2);
            } else {
                jVar.bindString(2, bVar.j());
            }
            jVar.bindLong(3, bVar.l());
            g gVar = g.this;
            String strA = gVar.f45536c.a(bVar.h());
            if (strA == null) {
                jVar.bindNull(4);
            } else {
                jVar.bindString(4, strA);
            }
            if (bVar.g() == null) {
                jVar.bindNull(5);
            } else {
                jVar.bindLong(5, bVar.g().longValue());
            }
            String strA2 = gVar.f45536c.a(bVar.k());
            if (strA2 == null) {
                jVar.bindNull(6);
            } else {
                jVar.bindString(6, strA2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends p {
        public b(y0 y0Var) {
            super(y0Var);
        }

        @Override // o5.c2
        public String createQuery() {
            return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // o5.p
        public void bind(j jVar, com.moloco.sdk.acm.db.b bVar) {
            jVar.bindLong(1, bVar.i());
            if (bVar.j() == null) {
                jVar.bindNull(2);
            } else {
                jVar.bindString(2, bVar.j());
            }
            jVar.bindLong(3, bVar.l());
            g gVar = g.this;
            String strA = gVar.f45536c.a(bVar.h());
            if (strA == null) {
                jVar.bindNull(4);
            } else {
                jVar.bindString(4, strA);
            }
            if (bVar.g() == null) {
                jVar.bindNull(5);
            } else {
                jVar.bindLong(5, bVar.g().longValue());
            }
            String strA2 = gVar.f45536c.a(bVar.k());
            if (strA2 == null) {
                jVar.bindNull(6);
            } else {
                jVar.bindString(6, strA2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends c2 {
        public c(g gVar, y0 y0Var) {
            super(y0Var);
        }

        @Override // o5.c2
        public String createQuery() {
            return "DELETE FROM events";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends c2 {
        public d(g gVar, y0 y0Var) {
            super(y0Var);
        }

        @Override // o5.c2
        public String createQuery() {
            return "DELETE FROM sqlite_sequence WHERE name='events'";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Callable {
        public e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 call() throws Exception {
            g gVar = g.this;
            j jVarAcquire = gVar.f45538e.acquire();
            gVar.f45534a.beginTransaction();
            try {
                jVarAcquire.executeUpdateDelete();
                gVar.f45534a.setTransactionSuccessful();
                return x0.f87415a;
            } finally {
                gVar.f45534a.endTransaction();
                gVar.f45538e.release(jVarAcquire);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Callable {
        public f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 call() throws Exception {
            g gVar = g.this;
            j jVarAcquire = gVar.f45539f.acquire();
            gVar.f45534a.beginTransaction();
            try {
                jVarAcquire.executeUpdateDelete();
                gVar.f45534a.setTransactionSuccessful();
                return x0.f87415a;
            } finally {
                gVar.f45534a.endTransaction();
                gVar.f45539f.release(jVarAcquire);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.acm.db.g$g, reason: collision with other inner class name */
    public class CallableC0361g implements Callable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f45544b;

        public CallableC0361g(List list) {
            this.f45544b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 call() throws Exception {
            StringBuilder sbNewStringBuilder = y.newStringBuilder();
            sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
            List list = this.f45544b;
            y.appendPlaceholders(sbNewStringBuilder, list.size());
            sbNewStringBuilder.append(")");
            String string = sbNewStringBuilder.toString();
            g gVar = g.this;
            j jVarCompileStatement = gVar.f45534a.compileStatement(string);
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                jVarCompileStatement.bindLong(i10, ((Long) it.next()).longValue());
                i10++;
            }
            gVar.f45534a.beginTransaction();
            try {
                jVarCompileStatement.executeUpdateDelete();
                gVar.f45534a.setTransactionSuccessful();
                return x0.f87415a;
            } finally {
                gVar.f45534a.endTransaction();
            }
        }
    }

    public g(y0 y0Var) {
        this.f45534a = y0Var;
        this.f45535b = new a(y0Var);
        this.f45537d = new b(y0Var);
        this.f45538e = new c(this, y0Var);
        this.f45539f = new d(this, y0Var);
    }

    public final /* synthetic */ Object e(zu.d dVar) {
        return com.moloco.sdk.acm.db.d.a(this, dVar);
    }

    public final /* synthetic */ Object f(zu.d dVar) {
        return com.moloco.sdk.acm.db.d.b(this, dVar);
    }

    @Override // com.moloco.sdk.acm.db.e
    public long a(com.moloco.sdk.acm.db.b bVar) {
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        y0Var.beginTransaction();
        try {
            long jInsertAndReturnId = this.f45535b.insertAndReturnId(bVar);
            y0Var.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            y0Var.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public List<Long> b(List<com.moloco.sdk.acm.db.b> list) {
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        y0Var.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.f45537d.insertAndReturnIdsList(list);
            y0Var.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            y0Var.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public Object c(zu.d<? super x0> dVar) {
        return f1.withTransaction(this.f45534a, new com.moloco.sdk.acm.db.f(this, 1), dVar);
    }

    @Override // com.moloco.sdk.acm.db.e
    public Object d(zu.d<? super x0> dVar) {
        return k.execute(this.f45534a, true, new f(), dVar);
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.moloco.sdk.acm.db.e
    public List<Long> a(List<com.moloco.sdk.acm.db.b> list) {
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        y0Var.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.f45535b.insertAndReturnIdsList(list);
            y0Var.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            y0Var.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public Object b(zu.d<? super x0> dVar) {
        return k.execute(this.f45534a, true, new e(), dVar);
    }

    @Override // com.moloco.sdk.acm.db.e
    public List<com.moloco.sdk.acm.db.b> b() {
        com.moloco.sdk.acm.db.a aVar = this.f45536c;
        w1 w1VarAcquire = w1.acquire("SELECT * FROM events LIMIT 900", 0);
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = u5.c.query(y0Var, w1VarAcquire, false, null);
        try {
            int columnIndexOrThrow = u5.b.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = u5.b.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = u5.b.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow4 = u5.b.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow5 = u5.b.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = u5.b.getColumnIndexOrThrow(cursorQuery, "tags");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), aVar.a(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5)), aVar.b(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            w1VarAcquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public Object a(zu.d<? super List<com.moloco.sdk.acm.db.b>> dVar) {
        return f1.withTransaction(this.f45534a, new com.moloco.sdk.acm.db.f(this, 0), dVar);
    }

    @Override // com.moloco.sdk.acm.db.e
    public com.moloco.sdk.acm.db.b a(long j10) {
        com.moloco.sdk.acm.db.a aVar = this.f45536c;
        w1 w1VarAcquire = w1.acquire("SELECT * FROM events WHERE id = ?", 1);
        w1VarAcquire.bindLong(1, j10);
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        com.moloco.sdk.acm.db.b bVar = null;
        String string = null;
        Cursor cursorQuery = u5.c.query(y0Var, w1VarAcquire, false, null);
        try {
            int columnIndexOrThrow = u5.b.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = u5.b.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = u5.b.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow4 = u5.b.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow5 = u5.b.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = u5.b.getColumnIndexOrThrow(cursorQuery, "tags");
            if (cursorQuery.moveToFirst()) {
                long j11 = cursorQuery.getLong(columnIndexOrThrow);
                String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                long j12 = cursorQuery.getLong(columnIndexOrThrow3);
                com.moloco.sdk.acm.db.c cVarA = aVar.a(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                if (!cursorQuery.isNull(columnIndexOrThrow6)) {
                    string = cursorQuery.getString(columnIndexOrThrow6);
                }
                bVar = new com.moloco.sdk.acm.db.b(j11, string2, j12, cVarA, lValueOf, aVar.b(string));
            }
            return bVar;
        } finally {
            cursorQuery.close();
            w1VarAcquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public List<com.moloco.sdk.acm.db.b> a() {
        com.moloco.sdk.acm.db.a aVar = this.f45536c;
        w1 w1VarAcquire = w1.acquire("SELECT * FROM events", 0);
        y0 y0Var = this.f45534a;
        y0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = u5.c.query(y0Var, w1VarAcquire, false, null);
        try {
            int columnIndexOrThrow = u5.b.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = u5.b.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = u5.b.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow4 = u5.b.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow5 = u5.b.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = u5.b.getColumnIndexOrThrow(cursorQuery, "tags");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), aVar.a(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5)), aVar.b(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            w1VarAcquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.e
    public Object a(List<Long> list, zu.d<? super x0> dVar) {
        return k.execute(this.f45534a, true, new CallableC0361g(list), dVar);
    }
}
