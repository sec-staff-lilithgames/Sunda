package y5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    default void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) {
        e0.checkNotNullParameter(transactionListener, "transactionListener");
        beginTransactionWithListener(transactionListener);
    }

    j compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(String sql, Object[] objArr) {
        e0.checkNotNullParameter(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(String str) throws SQLException;

    void execSQL(String str, Object[] objArr) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i10, ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i10);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    Cursor query(i iVar);

    Cursor query(i iVar, CancellationSignal cancellationSignal);

    void setForeignKeyConstraintsEnabled(boolean z10);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i10);

    long setMaximumSize(long j10);

    void setPageSize(long j10);

    void setTransactionSuccessful();

    void setVersion(int i10);

    int update(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j10);
}
