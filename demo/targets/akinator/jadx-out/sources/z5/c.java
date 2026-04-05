package z5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;
import tu.s;
import y5.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements y5.c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f97534c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f97535e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f97536f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    public static final o f97537g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f97538h;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f97539b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final Method access$getBeginTransactionMethod(a aVar) {
            aVar.getClass();
            return (Method) c.f97538h.getValue();
        }

        public static final Method access$getGetThreadSessionMethod(a aVar) {
            aVar.getClass();
            return (Method) c.f97537g.getValue();
        }
    }

    static {
        s sVar = s.f87405e;
        f97537g = q.lazy(sVar, (kv.a) new i.f(16));
        f97538h = q.lazy(sVar, (kv.a) new i.f(17));
    }

    public c(SQLiteDatabase delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f97539b = delegate;
    }

    public final void a(SQLiteTransactionListener sQLiteTransactionListener) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a aVar = f97534c;
        if (a.access$getBeginTransactionMethod(aVar) == null || a.access$getGetThreadSessionMethod(aVar) == null) {
            if (sQLiteTransactionListener != null) {
                beginTransactionWithListener(sQLiteTransactionListener);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method methodAccess$getBeginTransactionMethod = a.access$getBeginTransactionMethod(aVar);
        e0.checkNotNull(methodAccess$getBeginTransactionMethod);
        Method methodAccess$getGetThreadSessionMethod = a.access$getGetThreadSessionMethod(aVar);
        e0.checkNotNull(methodAccess$getGetThreadSessionMethod);
        Object objInvoke = methodAccess$getGetThreadSessionMethod.invoke(this.f97539b, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodAccess$getBeginTransactionMethod.invoke(objInvoke, 0, sQLiteTransactionListener, 0, null);
    }

    @Override // y5.c
    public void beginTransaction() {
        this.f97539b.beginTransaction();
    }

    @Override // y5.c
    public void beginTransactionNonExclusive() {
        this.f97539b.beginTransactionNonExclusive();
    }

    @Override // y5.c
    public void beginTransactionReadOnly() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a(null);
    }

    @Override // y5.c
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        e0.checkNotNullParameter(transactionListener, "transactionListener");
        this.f97539b.beginTransactionWithListener(transactionListener);
    }

    @Override // y5.c
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        e0.checkNotNullParameter(transactionListener, "transactionListener");
        this.f97539b.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // y5.c
    public void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(transactionListener, "transactionListener");
        a(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f97539b.close();
    }

    @Override // y5.c
    public j compileStatement(String sql) throws SQLException {
        e0.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f97539b.compileStatement(sql);
        e0.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new i(sQLiteStatementCompileStatement);
    }

    @Override // y5.c
    public int delete(String table, String str, Object[] objArr) throws SQLException {
        e0.checkNotNullParameter(table, "table");
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        j jVarCompileStatement = compileStatement(sb2.toString());
        y5.a.f94071e.bind(jVarCompileStatement, objArr);
        return jVarCompileStatement.executeUpdateDelete();
    }

    @Override // y5.c
    public void disableWriteAheadLogging() {
        this.f97539b.disableWriteAheadLogging();
    }

    @Override // y5.c
    public boolean enableWriteAheadLogging() {
        return this.f97539b.enableWriteAheadLogging();
    }

    @Override // y5.c
    public void endTransaction() {
        this.f97539b.endTransaction();
    }

    @Override // y5.c
    public void execPerConnectionSQL(String sql, Object[] objArr) throws SQLException {
        e0.checkNotNullParameter(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            throw new UnsupportedOperationException(a.b.e(i10, "execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: "));
        }
        b.f97533a.execPerConnectionSQL(this.f97539b, sql, objArr);
    }

    @Override // y5.c
    public void execSQL(String sql) throws SQLException {
        e0.checkNotNullParameter(sql, "sql");
        this.f97539b.execSQL(sql);
    }

    @Override // y5.c
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f97539b.getAttachedDbs();
    }

    @Override // y5.c
    public long getMaximumSize() {
        return this.f97539b.getMaximumSize();
    }

    @Override // y5.c
    public long getPageSize() {
        return this.f97539b.getPageSize();
    }

    @Override // y5.c
    public String getPath() {
        return this.f97539b.getPath();
    }

    @Override // y5.c
    public int getVersion() {
        return this.f97539b.getVersion();
    }

    @Override // y5.c
    public boolean inTransaction() {
        return this.f97539b.inTransaction();
    }

    @Override // y5.c
    public long insert(String table, int i10, ContentValues values) throws SQLException {
        e0.checkNotNullParameter(table, "table");
        e0.checkNotNullParameter(values, "values");
        return this.f97539b.insertWithOnConflict(table, null, values, i10);
    }

    @Override // y5.c
    public boolean isDatabaseIntegrityOk() {
        return this.f97539b.isDatabaseIntegrityOk();
    }

    @Override // y5.c
    public boolean isDbLockedByCurrentThread() {
        return this.f97539b.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(SQLiteDatabase sqLiteDatabase) {
        e0.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return e0.areEqual(this.f97539b, sqLiteDatabase);
    }

    @Override // y5.c
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // y5.c
    public boolean isOpen() {
        return this.f97539b.isOpen();
    }

    @Override // y5.c
    public boolean isReadOnly() {
        return this.f97539b.isReadOnly();
    }

    @Override // y5.c
    public boolean isWriteAheadLoggingEnabled() {
        return this.f97539b.isWriteAheadLoggingEnabled();
    }

    @Override // y5.c
    public boolean needUpgrade(int i10) {
        return this.f97539b.needUpgrade(i10);
    }

    @Override // y5.c
    public Cursor query(String query) {
        e0.checkNotNullParameter(query, "query");
        return query(new y5.a(query));
    }

    @Override // y5.c
    public void setForeignKeyConstraintsEnabled(boolean z10) {
        this.f97539b.setForeignKeyConstraintsEnabled(z10);
    }

    @Override // y5.c
    public void setLocale(Locale locale) {
        e0.checkNotNullParameter(locale, "locale");
        this.f97539b.setLocale(locale);
    }

    @Override // y5.c
    public void setMaxSqlCacheSize(int i10) {
        this.f97539b.setMaxSqlCacheSize(i10);
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m8103setMaximumSize(long j10) {
        this.f97539b.setMaximumSize(j10);
    }

    @Override // y5.c
    public void setPageSize(long j10) {
        this.f97539b.setPageSize(j10);
    }

    @Override // y5.c
    public void setTransactionSuccessful() {
        this.f97539b.setTransactionSuccessful();
    }

    @Override // y5.c
    public void setVersion(int i10) {
        this.f97539b.setVersion(i10);
    }

    @Override // y5.c
    public int update(String table, int i10, ContentValues values, String str, Object[] objArr) throws SQLException {
        e0.checkNotNullParameter(table, "table");
        e0.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f97535e[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        j jVarCompileStatement = compileStatement(sb2.toString());
        y5.a.f94071e.bind(jVarCompileStatement, objArr2);
        return jVarCompileStatement.executeUpdateDelete();
    }

    @Override // y5.c
    public boolean yieldIfContendedSafely() {
        return this.f97539b.yieldIfContendedSafely();
    }

    @Override // y5.c
    public void execSQL(String sql, Object[] bindArgs) throws SQLException {
        e0.checkNotNullParameter(sql, "sql");
        e0.checkNotNullParameter(bindArgs, "bindArgs");
        this.f97539b.execSQL(sql, bindArgs);
    }

    @Override // y5.c
    public Cursor query(String query, Object[] bindArgs) {
        e0.checkNotNullParameter(query, "query");
        e0.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new y5.a(query, bindArgs));
    }

    @Override // y5.c
    public long setMaximumSize(long j10) {
        SQLiteDatabase sQLiteDatabase = this.f97539b;
        sQLiteDatabase.setMaximumSize(j10);
        return sQLiteDatabase.getMaximumSize();
    }

    @Override // y5.c
    public boolean yieldIfContendedSafely(long j10) {
        return this.f97539b.yieldIfContendedSafely(j10);
    }

    @Override // y5.c
    public Cursor query(y5.i query) {
        e0.checkNotNullParameter(query, "query");
        Cursor cursorRawQueryWithFactory = this.f97539b.rawQueryWithFactory(new a6.d(new z5.a(query), 2), query.getSql(), f97536f, null);
        e0.checkNotNullExpressionValue(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // y5.c
    public Cursor query(y5.i query, CancellationSignal cancellationSignal) {
        e0.checkNotNullParameter(query, "query");
        a6.d dVar = new a6.d(query, 1);
        String sql = query.getSql();
        e0.checkNotNull(cancellationSignal);
        Cursor cursorRawQueryWithFactory = this.f97539b.rawQueryWithFactory(dVar, sql, f97536f, null, cancellationSignal);
        e0.checkNotNullExpressionValue(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }
}
