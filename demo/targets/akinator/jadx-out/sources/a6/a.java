package a6;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements x5.b {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f4072b;

    public a(SQLiteDatabase db2) {
        e0.checkNotNullParameter(db2, "db");
        this.f4072b = db2;
    }

    @Override // x5.b, java.lang.AutoCloseable
    public void close() {
        this.f4072b.close();
    }

    public final SQLiteDatabase getDb() {
        return this.f4072b;
    }

    @Override // x5.b
    public x5.d prepare(String sql) {
        e0.checkNotNullParameter(sql, "sql");
        SQLiteDatabase sQLiteDatabase = this.f4072b;
        if (sQLiteDatabase.isOpen()) {
            return c.f4073f.create(sQLiteDatabase, sql);
        }
        throw o2.x(21, "connection is closed");
    }
}
