package io.bidmachine.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.G5;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3870c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final a f59999a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.c$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public C3870c(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    private final Object a(SQLiteDatabase sQLiteDatabase) {
        try {
            int i10 = tu.z.f87419c;
            Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{G5.Q}, null, null, null);
            while (true) {
                try {
                    boolean zMoveToNext = cursorQuery.moveToNext();
                    x0 x0Var = x0.f87415a;
                    if (!zMoveToNext) {
                        gv.d.closeFinally(cursorQuery, null);
                        return tu.z.m7131constructorimpl(x0Var);
                    }
                    try {
                        int i11 = tu.z.f87419c;
                        String string = cursorQuery.getString(0);
                        if (!kotlin.jvm.internal.e0.areEqual(string, "android_metadata") && !kotlin.jvm.internal.e0.areEqual(string, "sqlite_master")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                        tu.z.m7131constructorimpl(x0Var);
                    } catch (Throwable th2) {
                        int i12 = tu.z.f87419c;
                        tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                    }
                } finally {
                }
            }
        } catch (Throwable th3) {
            int i13 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        onCreate(sQLiteDatabase);
    }
}
