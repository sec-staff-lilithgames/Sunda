package z5;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f97533a = new b();

    public final void execPerConnectionSQL(SQLiteDatabase sQLiteDatabase, String sql, Object[] objArr) throws SQLException {
        e0.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        e0.checkNotNullParameter(sql, "sql");
        sQLiteDatabase.execPerConnectionSQL(sql, objArr);
    }
}
