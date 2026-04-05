package s5;

import kotlin.jvm.internal.e0;
import tu.u;
import y5.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f85471a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85472b;

    public b(int i10, int i11) {
        this.f85471a = i10;
        this.f85472b = i11;
    }

    public void migrate(c db2) {
        e0.checkNotNullParameter(db2, "db");
        throw new u("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(x5.b connection) {
        e0.checkNotNullParameter(connection, "connection");
        if (connection instanceof r5.a) {
            migrate(((r5.a) connection).getDb());
            return;
        }
        throw new u("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
