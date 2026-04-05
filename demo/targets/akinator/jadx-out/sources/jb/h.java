package jb;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import timber.log.Timber;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f69257d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static SQLiteDatabase f69258e;

    /* renamed from: f, reason: collision with root package name */
    public static b f69259f;

    /* renamed from: g, reason: collision with root package name */
    public static h f69260g;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f69261a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f69262b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f69263c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final h sharedInstance() {
            if (h.f69260g == null) {
                h.f69260g = new h();
            }
            h hVar = h.f69260g;
            e0.checkNotNull(hVar);
            return hVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends SQLiteOpenHelper {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(u uVar) {
            }
        }

        static {
            new a(null);
        }

        public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
            super(context, str, cursorFactory, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase pDb) throws SQLException {
            e0.checkNotNullParameter(pDb, "pDb");
            pDb.execSQL("create table if not exists compteurs ( cle char(40) not null, valeur integer(11));");
            pDb.execSQL("create table if not exists valsues ( cle char(40) not null, valeur varchar(255));");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase pDb, int i10, int i11) throws SQLException {
            e0.checkNotNullParameter(pDb, "pDb");
            pDb.execSQL("DROP TABLE IF EXISTS compteurs");
            pDb.execSQL("DROP TABLE IF EXISTS valsues");
            onCreate(pDb);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase pDb, int i10, int i11) throws SQLException {
            e0.checkNotNullParameter(pDb, "pDb");
            onCreate(pDb);
        }
    }

    public h() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        e0.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f69263c = executorServiceNewSingleThreadExecutor;
    }

    public static final h sharedInstance() {
        return f69257d.sharedInstance();
    }

    public final void close() {
        synchronized ("sqliteLock") {
            SQLiteDatabase sQLiteDatabase = f69258e;
            e0.checkNotNull(sQLiteDatabase);
            sQLiteDatabase.close();
        }
    }

    public final void createOrUpdateMetricCompteur(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        this.f69263c.execute(new f(this, key, i10, 0));
    }

    public final void createOrUpdateMetricValeur(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.f69263c.execute(new g(this, key, value, 1));
    }

    public final void deleteValue(String key) {
        e0.checkNotNullParameter(key, "key");
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    String[] strArr = {key};
                    try {
                        SQLiteDatabase sQLiteDatabase = f69258e;
                        e0.checkNotNull(sQLiteDatabase);
                        sQLiteDatabase.delete("valsues", "cle=?", strArr);
                    } catch (Exception e10) {
                        Timber.Forest.tag("MetricsSetAdapter").e(e10, "problem deleteValue", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List<v> getAllMetrics() {
        LinkedList linkedList = new LinkedList();
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    SQLiteDatabase sQLiteDatabase = f69258e;
                    e0.checkNotNull(sQLiteDatabase);
                    Cursor cursorQuery = sQLiteDatabase.query(true, "compteurs", new String[]{"cle", "valeur"}, null, null, null, null, null, null);
                    e0.checkNotNullExpressionValue(cursorQuery, "query(...)");
                    if (cursorQuery.getCount() != 0) {
                        cursorQuery.moveToFirst();
                        while (!cursorQuery.isAfterLast()) {
                            linkedList.add(new v(cursorQuery.getString(0), "" + cursorQuery.getInt(1)));
                            cursorQuery.moveToNext();
                        }
                        cursorQuery.close();
                    }
                    SQLiteDatabase sQLiteDatabase2 = f69258e;
                    e0.checkNotNull(sQLiteDatabase2);
                    Cursor cursorQuery2 = sQLiteDatabase2.query(true, "valsues", new String[]{"cle", "valeur"}, null, null, null, null, null, null);
                    if (cursorQuery2.getCount() != 0) {
                        cursorQuery2.moveToFirst();
                        while (!cursorQuery2.isAfterLast()) {
                            linkedList.add(new v(cursorQuery2.getString(0), cursorQuery2.getString(1)));
                            cursorQuery2.moveToNext();
                        }
                        cursorQuery2.close();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedList;
    }

    public final Set<String> getIdsAlreadyInvite() {
        SharedPreferences sharedPreferences = this.f69261a;
        e0.checkNotNull(sharedPreferences);
        Set<String> stringSet = sharedPreferences.getStringSet("keyId", new HashSet());
        e0.checkNotNull(stringSet);
        return stringSet;
    }

    public final int getMetricCompteur(String key) {
        int i10;
        e0.checkNotNullParameter(key, "key");
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                i10 = 0;
                if (isOpen()) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = f69258e;
                            e0.checkNotNull(sQLiteDatabase);
                            cursorQuery = sQLiteDatabase.query("compteurs", null, "cle = ?;", new String[]{key}, null, null, null);
                            if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                i10 = cursorQuery.getInt(1);
                            }
                        } catch (Exception e10) {
                            Timber.Forest.tag("MetricsSetAdapter").e(e10, "problem getMetricCompteur", new Object[0]);
                            if (cursorQuery != null) {
                            }
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final String getMetricValeur(String key) {
        e0.checkNotNullParameter(key, "key");
        String string = "";
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = f69258e;
                            e0.checkNotNull(sQLiteDatabase);
                            cursorQuery = sQLiteDatabase.query("valsues", null, "cle = ?;", new String[]{key}, null, null, null);
                            if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                            }
                        } catch (Exception e10) {
                            Timber.Forest.tag("MetricsSetAdapter").e(e10, "problem getMetricValeur", new Object[0]);
                            if (cursorQuery != null) {
                            }
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public final long getStartDateOpening() {
        SharedPreferences sharedPreferences = this.f69261a;
        e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getLong("keyFirstTimeOpened", -1L);
    }

    public final void incMetricCompteur(String key) {
        e0.checkNotNullParameter(key, "key");
        createOrUpdateMetricCompteur(key, 1);
    }

    public final void init(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized ("sqliteLock") {
            try {
                if (f69259f == null) {
                    f69259f = new b(applicationContext, "metrics.db", null, 1);
                }
                open();
                if (this.f69261a == null) {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("MetricsSetAdapter", 0);
                    this.f69261a = sharedPreferences;
                    e0.checkNotNull(sharedPreferences);
                    this.f69262b = sharedPreferences.edit();
                }
                if (getStartDateOpening() == -1) {
                    setStartDateOpening(Calendar.getInstance().getTimeInMillis());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void initCompteurIfNotExist(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        this.f69263c.execute(new f(this, key, i10, 1));
    }

    public final void initCompteurToZeroIfNotExist(String key) {
        e0.checkNotNullParameter(key, "key");
        initCompteurIfNotExist(key, 0);
    }

    public final void initValueIfNotExist(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.f69263c.execute(new g(this, key, value, 0));
    }

    public final boolean isOpen() {
        SQLiteDatabase sQLiteDatabase = f69258e;
        if (sQLiteDatabase == null) {
            return false;
        }
        e0.checkNotNull(sQLiteDatabase);
        return sQLiteDatabase.isOpen();
    }

    public final boolean mustIncNbJours() {
        SharedPreferences sharedPreferences = this.f69261a;
        e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getBoolean("keyMustIncNbJours", true);
    }

    public final void open() throws SQLiteException {
        SQLiteDatabase sQLiteDatabase = f69258e;
        if (sQLiteDatabase != null) {
            e0.checkNotNull(sQLiteDatabase);
            if (sQLiteDatabase.isOpen()) {
                return;
            }
        }
        b bVar = f69259f;
        e0.checkNotNull(bVar);
        f69258e = bVar.getWritableDatabase();
    }

    public final void reinitCompteur(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        this.f69263c.execute(new f(this, key, i10, 2));
    }

    public final void setIds(Set<String> stringSet) {
        e0.checkNotNullParameter(stringSet, "stringSet");
        SharedPreferences.Editor editor = this.f69262b;
        e0.checkNotNull(editor);
        editor.putStringSet("keyId", stringSet);
        SharedPreferences.Editor editor2 = this.f69262b;
        e0.checkNotNull(editor2);
        editor2.commit();
    }

    public final void setMustIncNbJours(boolean z10) {
        SharedPreferences.Editor editor = this.f69262b;
        e0.checkNotNull(editor);
        editor.putBoolean("keyMustIncNbJours", z10);
        SharedPreferences.Editor editor2 = this.f69262b;
        e0.checkNotNull(editor2);
        editor2.commit();
    }

    public final void setStartDateOpening(long j10) {
        SharedPreferences.Editor editor = this.f69262b;
        e0.checkNotNull(editor);
        editor.putLong("keyFirstTimeOpened", j10);
        SharedPreferences.Editor editor2 = this.f69262b;
        e0.checkNotNull(editor2);
        editor2.commit();
    }
}
