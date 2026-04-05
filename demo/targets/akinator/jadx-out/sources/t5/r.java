package t5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.lifecycle.b3;
import androidx.lifecycle.c3;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import f.j0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import p0.g2;
import p0.j3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements y5.g, o5.m {

    /* renamed from: b, reason: collision with root package name */
    public final y5.g f86359b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.a f86360c;

    /* renamed from: e, reason: collision with root package name */
    public final a f86361e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class a implements y5.c {

        /* renamed from: b, reason: collision with root package name */
        public final t5.a f86362b;

        public a(t5.a autoCloser) {
            e0.checkNotNullParameter(autoCloser, "autoCloser");
            this.f86362b = autoCloser;
        }

        @Override // y5.c
        public void beginTransaction() {
            t5.a aVar = this.f86362b;
            try {
                aVar.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public void beginTransactionNonExclusive() {
            t5.a aVar = this.f86362b;
            try {
                aVar.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public /* bridge */ /* synthetic */ void beginTransactionReadOnly() {
            super.beginTransactionReadOnly();
        }

        @Override // y5.c
        public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
            e0.checkNotNullParameter(transactionListener, "transactionListener");
            t5.a aVar = this.f86362b;
            try {
                aVar.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
            e0.checkNotNullParameter(transactionListener, "transactionListener");
            t5.a aVar = this.f86362b;
            try {
                aVar.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public /* bridge */ /* synthetic */ void beginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) {
            super.beginTransactionWithListenerReadOnly(sQLiteTransactionListener);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f86362b.closeDatabaseIfOpen();
        }

        @Override // y5.c
        public y5.j compileStatement(String sql) {
            e0.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f86362b);
        }

        @Override // y5.c
        public int delete(String table, String str, Object[] objArr) {
            e0.checkNotNullParameter(table, "table");
            return ((Number) this.f86362b.executeRefCountingFunction(new b3(table, 3, str, objArr))).intValue();
        }

        @Override // y5.c
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // y5.c
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // y5.c
        public void endTransaction() {
            t5.a aVar = this.f86362b;
            try {
                y5.c delegateDatabase$room_runtime_release = aVar.getDelegateDatabase$room_runtime_release();
                e0.checkNotNull(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                aVar.decrementCountAndScheduleClose();
            }
        }

        @Override // y5.c
        public /* bridge */ /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
            super.execPerConnectionSQL(str, objArr);
        }

        @Override // y5.c
        public void execSQL(String sql) throws SQLException {
            e0.checkNotNullParameter(sql, "sql");
            this.f86362b.executeRefCountingFunction(new ba.d(sql, 11));
        }

        @Override // y5.c
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f86362b.executeRefCountingFunction(f.f86347b);
        }

        @Override // y5.c
        public long getMaximumSize() {
            return ((Number) this.f86362b.executeRefCountingFunction(l.f86353b)).longValue();
        }

        @Override // y5.c
        public long getPageSize() {
            return ((Number) this.f86362b.executeRefCountingFunction(m.f86354b)).longValue();
        }

        @Override // y5.c
        public String getPath() {
            return (String) this.f86362b.executeRefCountingFunction(n.f86355b);
        }

        @Override // y5.c
        public int getVersion() {
            return ((Number) this.f86362b.executeRefCountingFunction(o.f86356b)).intValue();
        }

        @Override // y5.c
        public boolean inTransaction() {
            t5.a aVar = this.f86362b;
            if (aVar.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) aVar.executeRefCountingFunction(g.f86348b)).booleanValue();
        }

        @Override // y5.c
        public long insert(String table, int i10, ContentValues values) throws SQLException {
            e0.checkNotNullParameter(table, "table");
            e0.checkNotNullParameter(values, "values");
            return ((Number) this.f86362b.executeRefCountingFunction(new j3(table, i10, values, 2))).longValue();
        }

        @Override // y5.c
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.f86362b.executeRefCountingFunction(h.f86349b)).booleanValue();
        }

        @Override // y5.c
        public boolean isDbLockedByCurrentThread() {
            t5.a aVar = this.f86362b;
            if (aVar.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) aVar.executeRefCountingFunction(i.f86350b)).booleanValue();
        }

        @Override // y5.c
        public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return super.isExecPerConnectionSQLSupported();
        }

        @Override // y5.c
        public boolean isOpen() {
            y5.c delegateDatabase$room_runtime_release = this.f86362b.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                return delegateDatabase$room_runtime_release.isOpen();
            }
            return false;
        }

        @Override // y5.c
        public boolean isReadOnly() {
            return ((Boolean) this.f86362b.executeRefCountingFunction(j.f86351b)).booleanValue();
        }

        @Override // y5.c
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f86362b.executeRefCountingFunction(k.f86352b)).booleanValue();
        }

        @Override // y5.c
        public boolean needUpgrade(int i10) {
            return ((Boolean) this.f86362b.executeRefCountingFunction(new rv.e0(i10, 3))).booleanValue();
        }

        public final void pokeOpen() {
            this.f86362b.executeRefCountingFunction(new j0(26));
        }

        @Override // y5.c
        public Cursor query(String query) {
            t5.a aVar = this.f86362b;
            e0.checkNotNullParameter(query, "query");
            try {
                return new c(aVar.incrementCountAndEnsureDbIsOpen().query(query), aVar);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public void setForeignKeyConstraintsEnabled(final boolean z10) {
            this.f86362b.executeRefCountingFunction(new kv.l() { // from class: t5.e
                @Override // kv.l
                public final Object invoke(Object obj) {
                    y5.c cVar = (y5.c) obj;
                    e0.checkNotNullParameter(cVar, PtLatqAYjEFT.ETEdHBiWWzpcD);
                    cVar.setForeignKeyConstraintsEnabled(z10);
                    return x0.f87415a;
                }
            });
        }

        @Override // y5.c
        public void setLocale(Locale locale) {
            e0.checkNotNullParameter(locale, "locale");
            this.f86362b.executeRefCountingFunction(new g2(locale, 12));
        }

        @Override // y5.c
        public void setMaxSqlCacheSize(int i10) {
            this.f86362b.executeRefCountingFunction(new rv.e0(i10, 1));
        }

        @Override // y5.c
        public long setMaximumSize(long j10) {
            return ((Number) this.f86362b.executeRefCountingFunction(new com.moloco.sdk.acm.http.g(j10, 2))).longValue();
        }

        @Override // y5.c
        public void setPageSize(long j10) {
            this.f86362b.executeRefCountingFunction(new com.moloco.sdk.acm.http.g(j10, 3));
        }

        @Override // y5.c
        public void setTransactionSuccessful() {
            y5.c delegateDatabase$room_runtime_release = this.f86362b.getDelegateDatabase$room_runtime_release();
            e0.checkNotNull(delegateDatabase$room_runtime_release);
            delegateDatabase$room_runtime_release.setTransactionSuccessful();
        }

        @Override // y5.c
        public void setVersion(int i10) {
            this.f86362b.executeRefCountingFunction(new rv.e0(i10, 2));
        }

        @Override // y5.c
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.f86362b.executeRefCountingFunction(p.f86357b)).booleanValue();
        }

        @Override // y5.c
        public void execSQL(String sql, Object[] bindArgs) throws SQLException {
            e0.checkNotNullParameter(sql, "sql");
            e0.checkNotNullParameter(bindArgs, "bindArgs");
            this.f86362b.executeRefCountingFunction(new c3(20, sql, bindArgs));
        }

        @Override // y5.c
        public int update(final String str, final int i10, final ContentValues values, final String str2, final Object[] objArr) {
            e0.checkNotNullParameter(str, gjnZrsdA.iOvnNCDMvPgT);
            e0.checkNotNullParameter(values, "values");
            return ((Number) this.f86362b.executeRefCountingFunction(new kv.l() { // from class: t5.d
                @Override // kv.l
                public final Object invoke(Object obj) {
                    y5.c db2 = (y5.c) obj;
                    e0.checkNotNullParameter(db2, "db");
                    return Integer.valueOf(db2.update(str, i10, values, str2, objArr));
                }
            })).intValue();
        }

        @Override // y5.c
        public boolean yieldIfContendedSafely(long j10) {
            return ((Boolean) this.f86362b.executeRefCountingFunction(q.f86358b)).booleanValue();
        }

        @Override // y5.c
        public Cursor query(String query, Object[] bindArgs) {
            t5.a aVar = this.f86362b;
            e0.checkNotNullParameter(query, "query");
            e0.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new c(aVar.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), aVar);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public Cursor query(y5.i query) {
            t5.a aVar = this.f86362b;
            e0.checkNotNullParameter(query, "query");
            try {
                return new c(aVar.incrementCountAndEnsureDbIsOpen().query(query), aVar);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // y5.c
        public Cursor query(y5.i query, CancellationSignal cancellationSignal) {
            t5.a aVar = this.f86362b;
            e0.checkNotNullParameter(query, "query");
            try {
                return new c(aVar.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), aVar);
            } catch (Throwable th2) {
                aVar.decrementCountAndScheduleClose();
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements y5.j {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f86363j = 0;

        /* renamed from: b, reason: collision with root package name */
        public final String f86364b;

        /* renamed from: c, reason: collision with root package name */
        public final t5.a f86365c;

        /* renamed from: e, reason: collision with root package name */
        public int[] f86366e;

        /* renamed from: f, reason: collision with root package name */
        public long[] f86367f;

        /* renamed from: g, reason: collision with root package name */
        public double[] f86368g;

        /* renamed from: h, reason: collision with root package name */
        public String[] f86369h;

        /* renamed from: i, reason: collision with root package name */
        public byte[][] f86370i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }
        }

        static {
            new a(null);
        }

        public b(String sql, t5.a autoCloser) {
            e0.checkNotNullParameter(sql, "sql");
            e0.checkNotNullParameter(autoCloser, "autoCloser");
            this.f86364b = sql;
            this.f86365c = autoCloser;
            this.f86366e = new int[0];
            this.f86367f = new long[0];
            this.f86368g = new double[0];
            this.f86369h = new String[0];
            this.f86370i = new byte[0][];
        }

        public final void a(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f86366e;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.f86366e = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f86367f;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.f86367f = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f86368g;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    e0.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.f86368g = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f86369h;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f86369h = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f86370i;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                e0.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.f86370i = (byte[][]) objArrCopyOf2;
            }
        }

        public final Object b(kv.l lVar) {
            return this.f86365c.executeRefCountingFunction(new c3(21, this, lVar));
        }

        @Override // y5.j, y5.h
        public void bindBlob(int i10, byte[] value) {
            e0.checkNotNullParameter(value, "value");
            a(4, i10);
            this.f86366e[i10] = 4;
            this.f86370i[i10] = value;
        }

        @Override // y5.j, y5.h
        public void bindDouble(int i10, double d10) {
            a(2, i10);
            this.f86366e[i10] = 2;
            this.f86368g[i10] = d10;
        }

        @Override // y5.j, y5.h
        public void bindLong(int i10, long j10) {
            a(1, i10);
            this.f86366e[i10] = 1;
            this.f86367f[i10] = j10;
        }

        @Override // y5.j, y5.h
        public void bindNull(int i10) {
            a(5, i10);
            this.f86366e[i10] = 5;
        }

        @Override // y5.j, y5.h
        public void bindString(int i10, String value) {
            e0.checkNotNullParameter(value, "value");
            a(3, i10);
            this.f86366e[i10] = 3;
            this.f86369h[i10] = value;
        }

        @Override // y5.j, y5.h
        public void clearBindings() {
            this.f86366e = new int[0];
            this.f86367f = new long[0];
            this.f86368g = new double[0];
            this.f86369h = new String[0];
            this.f86370i = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            clearBindings();
        }

        @Override // y5.j
        public void execute() {
            b(new s(1));
        }

        @Override // y5.j
        public long executeInsert() {
            return ((Number) b(new s(0))).longValue();
        }

        @Override // y5.j
        public int executeUpdateDelete() {
            return ((Number) b(new j0(29))).intValue();
        }

        @Override // y5.j
        public long simpleQueryForLong() {
            return ((Number) b(new j0(27))).longValue();
        }

        @Override // y5.j
        public String simpleQueryForString() {
            return (String) b(new j0(28));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Cursor {

        /* renamed from: b, reason: collision with root package name */
        public final Cursor f86371b;

        /* renamed from: c, reason: collision with root package name */
        public final t5.a f86372c;

        public c(Cursor delegate, t5.a autoCloser) {
            e0.checkNotNullParameter(delegate, "delegate");
            e0.checkNotNullParameter(autoCloser, "autoCloser");
            this.f86371b = delegate;
            this.f86372c = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f86371b.close();
            this.f86372c.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f86371b.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @tu.f
        public void deactivate() {
            this.f86371b.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f86371b.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f86371b.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f86371b.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f86371b.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f86371b.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f86371b.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f86371b.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f86371b.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f86371b.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f86371b.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f86371b.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f86371b.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.f86371b.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f86371b.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f86371b.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f86371b.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f86371b.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f86371b.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f86371b.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f86371b.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f86371b.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f86371b.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f86371b.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f86371b.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f86371b.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f86371b.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f86371b.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f86371b.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f86371b.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f86371b.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f86371b.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f86371b.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @tu.f
        public boolean requery() {
            return this.f86371b.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f86371b.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            this.f86371b.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f86371b.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f86371b.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f86371b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public r(y5.g delegate, t5.a autoCloser) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(autoCloser, "autoCloser");
        this.f86359b = delegate;
        this.f86360c = autoCloser;
        this.f86361e = new a(autoCloser);
        autoCloser.initOpenHelper(getDelegate());
    }

    @Override // y5.g, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86361e.close();
    }

    public final t5.a getAutoCloser$room_runtime_release() {
        return this.f86360c;
    }

    @Override // y5.g
    public String getDatabaseName() {
        return this.f86359b.getDatabaseName();
    }

    @Override // o5.m
    public y5.g getDelegate() {
        return this.f86359b;
    }

    @Override // y5.g
    public y5.c getReadableDatabase() {
        a aVar = this.f86361e;
        aVar.pokeOpen();
        return aVar;
    }

    @Override // y5.g
    public y5.c getWritableDatabase() {
        a aVar = this.f86361e;
        aVar.pokeOpen();
        return aVar;
    }

    @Override // y5.g
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f86359b.setWriteAheadLoggingEnabled(z10);
    }
}
