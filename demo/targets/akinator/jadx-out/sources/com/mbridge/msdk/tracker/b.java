package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final String f43883a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.f43883a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f43902i, this.f43883a));
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "create table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f43903j, this.f43883a));
            sQLiteDatabase.execSQL(String.format(i.f43902i, this.f43883a));
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "downgrade table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f43903j, this.f43883a));
            sQLiteDatabase.execSQL(String.format(i.f43902i, this.f43883a));
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "upgrade table error", e10);
            }
        }
    }
}
