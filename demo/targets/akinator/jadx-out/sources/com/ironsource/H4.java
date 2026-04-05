package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34568a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f34569b = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(H4 h42, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h42.a(z10, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean z10, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        kotlin.jvm.internal.e0.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f34569b) {
            try {
                if (z10) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readableDatabase;
    }
}
