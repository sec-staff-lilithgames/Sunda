package a6;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements x5.c {
    @Override // x5.c
    public x5.b open(String fileName) {
        e0.checkNotNullParameter(fileName, "fileName");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(fileName, (SQLiteDatabase.CursorFactory) null);
        e0.checkNotNull(sQLiteDatabaseOpenOrCreateDatabase);
        return new a(sQLiteDatabaseOpenOrCreateDatabase);
    }
}
