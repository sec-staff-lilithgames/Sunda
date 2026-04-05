package z5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o6.v0;
import tu.o;
import tu.q;
import tu.t;
import z5.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d implements y5.g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f97540b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97541c;

    /* renamed from: e, reason: collision with root package name */
    public final y5.d f97542e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97543f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97544g;

    /* renamed from: h, reason: collision with root package name */
    public final o f97545h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97546i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public z5.c f97547a;

        public b(z5.c cVar) {
            this.f97547a = cVar;
        }

        public final z5.c getDb() {
            return this.f97547a;
        }

        public final void setDb(z5.c cVar) {
            this.f97547a = cVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: j, reason: collision with root package name */
        public static final b f97548j = new b(null);

        /* renamed from: b, reason: collision with root package name */
        public final Context f97549b;

        /* renamed from: c, reason: collision with root package name */
        public final b f97550c;

        /* renamed from: e, reason: collision with root package name */
        public final y5.d f97551e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f97552f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f97553g;

        /* renamed from: h, reason: collision with root package name */
        public final b6.a f97554h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f97555i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends RuntimeException {

            /* renamed from: b, reason: collision with root package name */
            public final f f97556b;

            /* renamed from: c, reason: collision with root package name */
            public final Throwable f97557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f callbackName, Throwable cause) {
                super(cause);
                e0.checkNotNullParameter(callbackName, "callbackName");
                e0.checkNotNullParameter(cause, "cause");
                this.f97556b = callbackName;
                this.f97557c = cause;
            }

            public final f getCallbackName() {
                return this.f97556b;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f97557c;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b {
            public b(u uVar) {
            }

            public final z5.c getWrappedDb(b refHolder, SQLiteDatabase sqLiteDatabase) {
                e0.checkNotNullParameter(refHolder, "refHolder");
                e0.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                z5.c db2 = refHolder.getDb();
                if (db2 != null && db2.isDelegate(sqLiteDatabase)) {
                    return db2;
                }
                z5.c cVar = new z5.c(sqLiteDatabase);
                refHolder.setDb(cVar);
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final y5.d callback, boolean z10) {
            super(context, str, null, callback.f94074a, new DatabaseErrorHandler() { // from class: z5.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b bVar = d.c.f97548j;
                    e0.checkNotNull(sQLiteDatabase);
                    callback.onCorruption(bVar.getWrappedDb(dbRef, sQLiteDatabase));
                }
            });
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(dbRef, "dbRef");
            e0.checkNotNullParameter(callback, "callback");
            this.f97549b = context;
            this.f97550c = dbRef;
            this.f97551e = callback;
            this.f97552f = z10;
            this.f97554h = new b6.a(str == null ? w0.i.c("toString(...)") : str, context.getCacheDir(), false);
        }

        public final SQLiteDatabase a(boolean z10) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f97555i;
            Context context = this.f97549b;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z10) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    e0.checkNotNull(writableDatabase);
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                e0.checkNotNull(readableDatabase3);
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z10) {
                        readableDatabase2 = getWritableDatabase();
                        e0.checkNotNull(readableDatabase2);
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        e0.checkNotNull(readableDatabase2);
                    }
                    return readableDatabase2;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int iOrdinal = aVar.getCallbackName().ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            throw cause;
                        }
                        if (iOrdinal != 4) {
                            throw new t();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f97552f) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z10) {
                            readableDatabase = getWritableDatabase();
                            e0.checkNotNull(readableDatabase);
                        } else {
                            readableDatabase = getReadableDatabase();
                            e0.checkNotNull(readableDatabase);
                        }
                        return readableDatabase;
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() throws IOException {
            b6.a aVar = this.f97554h;
            try {
                b6.a.lock$default(aVar, false, 1, null);
                super.close();
                this.f97550c.setDb(null);
                this.f97555i = false;
            } finally {
                aVar.unlock();
            }
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.f97552f;
        }

        public final y5.d getCallback() {
            return this.f97551e;
        }

        public final Context getContext() {
            return this.f97549b;
        }

        public final b getDbRef() {
            return this.f97550c;
        }

        public final y5.c getSupportDatabase(boolean z10) throws IOException {
            b6.a aVar = this.f97554h;
            try {
                aVar.lock((this.f97555i || getDatabaseName() == null) ? false : true);
                this.f97553g = false;
                SQLiteDatabase sQLiteDatabaseA = a(z10);
                if (!this.f97553g) {
                    z5.c wrappedDb = getWrappedDb(sQLiteDatabaseA);
                    aVar.unlock();
                    return wrappedDb;
                }
                close();
                y5.c supportDatabase = getSupportDatabase(z10);
                aVar.unlock();
                return supportDatabase;
            } catch (Throwable th2) {
                aVar.unlock();
                throw th2;
            }
        }

        public final z5.c getWrappedDb(SQLiteDatabase sqLiteDatabase) {
            e0.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f97548j.getWrappedDb(this.f97550c, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            e0.checkNotNullParameter(db2, "db");
            boolean z10 = this.f97553g;
            y5.d dVar = this.f97551e;
            if (!z10 && dVar.f94074a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                dVar.onConfigure(getWrappedDb(db2));
            } catch (Throwable th2) {
                throw new a(f.f97560b, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            e0.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f97551e.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(f.f97561c, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            e0.checkNotNullParameter(db2, "db");
            this.f97553g = true;
            try {
                this.f97551e.onDowngrade(getWrappedDb(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(f.f97563f, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            e0.checkNotNullParameter(db2, "db");
            if (!this.f97553g) {
                try {
                    this.f97551e.onOpen(getWrappedDb(db2));
                } catch (Throwable th2) {
                    throw new a(f.f97564g, th2);
                }
            }
            this.f97555i = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            e0.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f97553g = true;
            try {
                this.f97551e.onUpgrade(getWrappedDb(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(f.f97562e, th2);
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, y5.d callback) {
        this(context, str, callback, false, false, 24, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(callback, "callback");
    }

    @Override // y5.g, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        o oVar = this.f97545h;
        if (oVar.isInitialized()) {
            ((c) oVar.getValue()).close();
        }
    }

    @Override // y5.g
    public String getDatabaseName() {
        return this.f97541c;
    }

    @Override // y5.g
    public y5.c getReadableDatabase() {
        return ((c) this.f97545h.getValue()).getSupportDatabase(false);
    }

    @Override // y5.g
    public y5.c getWritableDatabase() {
        return ((c) this.f97545h.getValue()).getSupportDatabase(true);
    }

    @Override // y5.g
    public void setWriteAheadLoggingEnabled(boolean z10) {
        o oVar = this.f97545h;
        if (oVar.isInitialized()) {
            ((c) oVar.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f97546i = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, y5.d dVar, boolean z10) {
        this(context, str, dVar, z10, false, 16, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dVar, OcvDtWCQ.kPOLUmkQ);
    }

    public d(Context context, String str, y5.d callback, boolean z10, boolean z11) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(callback, "callback");
        this.f97540b = context;
        this.f97541c = str;
        this.f97542e = callback;
        this.f97543f = z10;
        this.f97544g = z11;
        this.f97545h = q.lazy(new v0(this, 17));
    }

    public /* synthetic */ d(Context context, String str, y5.d dVar, boolean z10, boolean z11, int i10, u uVar) {
        this(context, str, dVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
